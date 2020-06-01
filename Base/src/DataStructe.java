package Base.src;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 这里包含常用集合
 * 
 * @List:有序列表
 * @Set:无序不重复
 * @Map:key-value形式的映射表集合
 */
public class DataStructe {
    public static void main(String[] args) {
        /**
         * @List  是一个interface,定义了列表的规范，常用的List的实现类有：ArrayList、LinkedList
         * 要实现List 必须实现其所有方法，包括：
         * ArrayList、LinkedList
         */
        List<String> strs = new ArrayList<>();
        strs.add("sentence one.");
        System.out.println(strs.get(0));
        List<Integer> ints = new LinkedList<>();
        ints.add(10);
        System.out.println(ints.get(0));
    }
}