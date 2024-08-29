package java8.lambda.comparator;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class TreeMapMain {
    public static void main(String[] args) {
        Map<Integer, String> s = new TreeMap<>();
        s.put(2,"z");
        s.put(1,"a");
        s.put(3,"c");
        System.out.println(s);
        Map<Integer, String> ss = new TreeMap<>((a,b)->b-a);
        ss.put(2,"z");
        ss.put(1,"a");
        ss.put(3,"c");
        System.out.println(ss);

    }
}
