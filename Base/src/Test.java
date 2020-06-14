package Base.src;

import java.util.Arrays;
import java.util.Comparator;

@FunctionalInterface
interface Person {
    void setName(String name);

    default String getName() {
        return "I get a name";
    }

    static Person getGender() {
        return new Man();
    }
}

class Man implements Person {

    @Override
    public void setName(String name) {
    }

}

public class Test {
    public static void main(String[] args) {
        String[] arr = new String[] { "Apple", "Orange", "Banana", "Lemon" };
        Arrays.sort(arr, (s1, s2) -> {
            return s1.compareTo(s2);
        });
        Person p = (name) -> {
            System.out.println(name);
        };
    }
}