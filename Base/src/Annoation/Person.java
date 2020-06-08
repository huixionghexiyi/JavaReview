package Base.src.Annoation;

import java.lang.reflect.Field;

public class Person {
    @Range(min = 1, max = 8)
    public String name;
    @Range(min = 1, max = 100)
    public Integer age;

    public Person(String name, Integer age) throws IllegalArgumentException, IllegalAccessException {
        this.name = name;
        this.age = age;
        check(this);
    }

    void check(Person person) throws IllegalArgumentException, IllegalAccessException {
        System.out.println("begin....");
        for (Field field : person.getClass().getFields()) {
            Range r = field.getAnnotation(Range.class);
            System.out.println("field name is:" + field.getName());
            System.out.println(r);
            if (r != null) {
                Object val = field.get(person);
                if (val instanceof String) {
                    String s = (String) val;
                    if (s.length() < r.min() || s.length() > r.max()) {
                        throw new IllegalArgumentException(
                                field.getName() + "`s length must be between" + r.min() + " and " + r.max());
                    }
                } else if (val instanceof Integer) {
                    Integer i = (Integer) val;
                    if (i < r.min() || i > r.max()) {
                        throw new IllegalArgumentException(
                                field.getName() + " must be between" + r.min() + " and " + r.max());
                    }
                }
            }
        }
        System.out.println("end...");
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