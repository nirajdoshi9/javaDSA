package java8.lambda.comparator;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(99);
        list.add(10);
        list.add(0);
        list.add(6);
        Collections.sort(list);
        System.out.println("Ascending "+ list);
        Collections.sort(list, new MyClass());
        System.out.println("descending "+ list);
        Collections.sort(list, (a,b)->b-a);
        System.out.println("descending "+list);
    }
}
