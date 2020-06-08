package Base.src;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import Base.src.OOP.Student;

/**
 * 这里包含常用集合
 * 
 * @List:有序列表
 * @Set:无序不重复
 * @Map:key-value形式的映射表集合
 */
public class DataStructe {
    public static void main(String[] args) {
        mySet();
    }

    public static void myList() {
        /**
         * void add(E e)
         * 
         * void add(int index,E e)
         * 
         * int remove(int index)
         * 
         * boolean remove(Ojbect o)
         * 
         * E get(int index)
         * 
         * int size()
         * 
         * boolean contains(Object o)
         * 
         * int indexOf(Object o)
         * 
         * ArrayList 列表 获取指定元素快，插入删除慢，内存占用少
         * 
         * LinkedList 链表 获取指定元素慢，插入删除快，内存占用多
         */
        List<String> arr = new ArrayList<>();
        arr.add("huixiong"); // ["huixiong"]
        arr.add("name"); // ["huixiong","name"]
        arr.add(0, "gender");// ["gender","huixiong","name"]
        arr.remove(1);// ["gender","name"]
        arr.remove("clazz");// false
        arr.get(1);// "name"
        arr.size();// 2
        // 迭代
        // for
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }
        // iterator
        for (Iterator<String> it = arr.iterator(); it.hasNext();) {
            System.out.println(it.next());
        }
        // foreach 和iterator本质是一样的
        for (String str : arr) {
            System.out.println(str);
        }

    }

    public static void myMap() {

        /**
         * 无序的
         */
        Map<String, Student> map = new HashMap<>();
        map.put("huixiong", new Student("huixiong", 18));// 放入一个不存在的key，返回null
        Student s = map.put("huixiong", new Student("huiioxng", 19));// 放入一个存在的key，返回旧的value
        s.getAge();// 19
        map.get("huixiong"); // 返回一个Student对象
        // 遍历key
        for (String iter : map.keySet()) {
            System.out.println(iter);
        }
        // 遍历entry
        for (Map.Entry<String, Student> entry : map.entrySet()) {
            String key = entry.getKey();
            Student value = entry.getValue();
            System.out.println(entry);
        }
    }

    public static void mySet() {
        /**
         * Set 唯一、无序、接口
         * 
         * SortedSet 唯一、有序、接口
         * 
         * TreeSet 唯一、有序、类、实现了Sorted接口
         * 
         * HashSet 唯一、无序 类、本质是没有value的 HashMap
         * 
         * 
         */
        // 插入的数据 无序
        Set<String> h = new HashSet<>();
        h.add("hashset1");
        h.add("hashset2");
        for (String str : h) {
            System.out.println(str);
        }
        // 插入的数据 有序
        Set<String> t = new TreeSet<>();
        t.add("treeset1");
        t.add("treeset2");
        for (String str : t) {
            System.out.println(str);
        }
    }
}