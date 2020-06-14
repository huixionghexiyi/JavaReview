package Base.src.web;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class Server {
    public static void main(final String[] args) throws IOException {
        final ServerSocket ss = new ServerSocket(8080);
        System.out.println("server is running.");
        for (;;) {
            final Socket sock = ss.accept();
            System.out.println("connected from" + sock.getRemoteSocketAddress());
            final Thread t = new Handler(sock);
            t.start();
        }
    }
}

class Handler extends Thread {
    Socket sock;

    public Handler(final Socket sock) {
        this.sock = sock;
    }

    public void run() {
        try (InputStream input = this.sock.getInputStream()) {
            try (OutputStream output = this.sock.getOutputStream()) {
                handle(input, output);
            }
        } catch (final Exception e) {
            try {
                this.sock.close();
            } catch (final IOException ioe) {
            }
            System.out.println("client disconted.");
        }
    }

    /**
     * 处理http请求，然后响应
     *
     * @param input
     * @param output
     * @throws IOException
     */
    private void handle(final InputStream input, final OutputStream output) throws IOException {
        final BufferedReader reader = new BufferedReader(new InputStreamReader(input, StandardCharsets.UTF_8));
        final BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(output, StandardCharsets.UTF_8));
        // 读取HTTP请求：
        boolean requestOK = false;
        final String first = reader.readLine();
        if (first.startsWith("GET / HTTP/1.")) {
            requestOK = true;
        }
        for (;;) {
            final String header = reader.readLine();
            if (header.isEmpty()) {
                break;
            }
            System.out.println(header);
        }
        System.out.println(requestOK ? "Response OK" : "Response Error");
        if (!requestOK) {
            writer.write("404 Not Found\r\n");
            writer.write("Content-Lenth: 0\r\n");
            writer.write("\r\n");
            writer.flush();
        } else {
            final String data = "<html><body><h1>Hello, world!</h1></body></html>";
            final int length = data.getBytes(StandardCharsets.UTF_8).length;
            writer.write("HTTP/1.0 200 OK\r\n");
            writer.write("Connection: close\r\n");
            writer.write("Content-Type: text/html\r\n");
            writer.write("Content-Length: " + length + "\r\n");
            writer.write("\r\n"); // 空行标识Header和Body的分隔
            writer.write(data);
            writer.flush();
        }
    }
}