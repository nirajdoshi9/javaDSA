package java8.lambda.comparator;

import java.util.*;

public class TreeSetMain {
    public static void main(String[] args) {
        Set<Integer> s = new TreeSet<>();
        s.add(22);
        s.add(1);
        s.add(3);
        System.out.println(s);
        Set<Integer> ss = new TreeSet<>((a,b) -> b - a);
        ss.add(22);
        ss.add(1);
        ss.add(3);
        System.out.println(ss);
    }
}
