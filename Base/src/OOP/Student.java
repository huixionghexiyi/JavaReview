package Base.src.OOP;

public class Student {
    private String name;
    private Integer gender;// 1 male,0 female

    public Student() {
    }

    public Student(String name) {
        this.name = name;
    }

    public Student(String name, Integer gender) {
        this.name = name;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }
}