package Base.src.Annoation;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Main {
    public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException {
        // Person p = new Person("huixiong", 1); // 测试自定义注解的使用
        //
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