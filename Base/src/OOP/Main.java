package Base.src.OOP;


public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("huixiong", 1);
        System.out.println(s1.getName());
        s1.setName("刘德华");
        System.out.println(s1.getName());
    }
}