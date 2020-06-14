package Base.src.Reflect;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;

import Base.src.Annoation.Human;

public class Main {
    public static void main(final String[] args) throws Exception {
        Student s1 = new Student("huixiong");
        Class<?> stu = Class.forName("Base.src.Reflect.Student");
        System.out.println(stu.getName());
        Field f = stu.getField("name");
        int g = f.getModifiers();
        Modifier.isPublic(g); // true
        String s = (String) f.get(s1);// huixiong
        // 动态代理
        InvocationHandler handle = new InvocationHandler() {

            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                if (method.getName().equals("run")) {
                    System.out.println("Let`s run! " + args[0] + " ," + args[1]);
                }
                return null;
            }
        };
        Human h = (Human) Proxy.newProxyInstance(Human.class.getClassLoader(), new Class[] { Human.class }, handle);
        h.run("Huni", "Jack");
    }
}