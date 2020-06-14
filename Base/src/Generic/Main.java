package Base.src.Generic;
public class Main {
    public static void main(String[] args) {
        // 自定义泛型类
        Bag<String> b = new Bag<>("first", "second");
        System.out.println(b.getFirst());
        // 静态方法使用泛型
        Bag.magic("m");
        
    }

    enum Color {
        RED, GREEN;
    }
}