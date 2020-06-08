package Base.src;

import java.util.ArrayList;
import java.util.HashMap;

public class Test {
    public static void main(String[] args) {
        ArrayList<HashMap> arr = new ArrayList<>();
        HashMap<String, String> h = new HashMap<>();
        h.put("a", "a a a");
        h.put("b", "b b b");
        arr.add(h);
        for (HashMap i : arr) {
            i.put("a", "ccc");
        }
        System.out.println(arr);
    }
}