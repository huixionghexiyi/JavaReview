package Base.src;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Props {
    /**
     * java配置文件读取，使用Properties类，默认配置文件名为 .properties
     * 
     * @param args
     * @throws IOException
     * @throws FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        Properties props = new Properties();
        props.load(Props.class.getClassLoader().getResourceAsStream("setting.properties"));
        String name = props.getProperty("name");
        System.out.println(name);
    }
}