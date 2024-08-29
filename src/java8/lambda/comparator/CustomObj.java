package java8.lambda.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CustomObj {
    public static void main(String[] args) {
        Student s1 = new Student(2, "Vipul");
        Student s2 = new Student(1, "Raj");
        Student s3 = new Student(4,"Akshay");
        List<Student> l = new ArrayList<>();
        l.add(s1); l.add(s2); l.add(s3);
        Collections.sort(l,(a,b) -> a.id - b.id);
        System.out.println(l);
    }
}
