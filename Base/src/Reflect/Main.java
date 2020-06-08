package Base.src.Reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class Main {
    public static void main(final String[] args) throws Exception {
        Student s1 = new Student("huixiong");
        Class<?> stu = Class.forName("Base.src.Reflect.Student");
        System.out.println(stu.getName());
        Field f = stu.getField("name");
        int g = f.getModifiers();
        Modifier.isPublic(g); // true
        String s = (String) f.get(s1);// huixiong
        
    }
}