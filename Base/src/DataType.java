package Base.src;

/**
 * 8种基本数据类型的声明
 */
public class DataType {
    public static void main(String[] args) throws Exception {
        /**
         * 基本数据类型:
         * 
         * byte(8 bit) short(2 byte) int(4 byte) long(8 byte)
         * 
         * float(4 byte) double(8byte)
         * 
         * char(2 byte)
         * 
         * boolean(2 byte)
         */
        byte b = 122;// -128~127
        short s = 32767;// -32768 ~ 32767
        int i = 2_147_483_647; // -2147483648 ~ 2147483647 ,可以使用下划线不影响编译
        long l = 9223372036854775807L; // -9223372036854775808 ~ 9223372036854775807
        float f = 1.4f; //
        double d = 3.5; //
        char c = 'A'; //
        boolean bool = true;
        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
        System.out.println(c);
        System.out.println(bool);
        System.out.println("其他进制的数表示int：===");
        int i1 = 0xfff; // 16进制表示
        int i2 = 0b111; // 2 进制表示
        System.out.println(i1);
        System.out.println(i2);
        System.out.println("科学计数法表示浮点数：===");
        float f1 = 3.14e37f;// 表示float
        double f2 = 3.14e-27f; // 表示double
        System.out.println(f1);
        System.out.println(f2);
        // 引用类型
        String str = "this is a sentence";
        System.out.println(str);
        // 其他技巧
        boolean bool2 = 3 > 2; // 将一个计算结果赋值给boolean类型
        System.out.println(bool2);
    }
}