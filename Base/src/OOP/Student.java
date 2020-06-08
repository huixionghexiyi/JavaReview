package Base.src.OOP;

public class Student {
    private String name;
    private Integer age;// 1 male,0 female

    public Student() {
    }

    public Student(String name) {
        this.name = name;
    }

    public Student(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        Student s = (Student) obj;
        if (this.name == s.name) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return this.name + "--" + this.age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

}