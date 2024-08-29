package java8.lambda.comparator;

import java.util.Comparator;

public class MyClass implements Comparator<Integer>{
    public int compare(Integer a, Integer b){
        return b-a;
    }
}
