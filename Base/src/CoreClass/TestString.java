package Base.src.CoreClass;

public class TestString {
    public static void main(String[] args) {
        String str = new String(new char[] { 'a', 'b', 'c' });// abc
        str = str.toUpperCase();// ABC
        String s1 = "hello";
        String s2 = "Hello".toLowerCase();
        System.out.println(s1);
    }
}