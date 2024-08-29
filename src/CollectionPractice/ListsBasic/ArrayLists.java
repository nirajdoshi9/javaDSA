package CollectionPractice.ListsBasic;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists {
    public static void main(String[] args) {
        List<Integer> al = new ArrayList<Integer>();
        al.add(1);
        al.add(3);
        al.add(5);

        al.remove(3);
        al.remove(1);
    }
}
