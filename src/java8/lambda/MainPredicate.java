package java8.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class MainPredicate {
    public static void main(String[] args) {
        Predicate<Integer> p = x -> x > 100;
        System.out.println(p.test(50));


        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        int sum = numbers.stream().filter(x->x%2 ==0).mapToInt(x->x).sum();
        System.out.println(sum);


        Predicate<String> startsWithN = x->x.toLowerCase().charAt(0) == 'n';
        Predicate<String> endsWithJ = x -> x.toLowerCase().charAt(x.length()-1) == 'j';

        Predicate<String> and = startsWithN.and(endsWithJ);
        System.out.println(and.test("Niraj"));

        Predicate<String> or = startsWithN.or(endsWithJ);
        System.out.println(or.test("Niraj"));

        Predicate<String> negate = startsWithN.negate();
        System.out.println(negate.test("Niraj"));

    }
}
