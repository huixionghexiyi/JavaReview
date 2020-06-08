package Base.src.Reflect;

public class Student implements Person {
    public String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("Student run");

    }

    @Override
    public String getName() {
        return this.name;
    }

}