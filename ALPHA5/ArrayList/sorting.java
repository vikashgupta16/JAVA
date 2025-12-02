package ArrayList;
import java.util.*;
public class sorting {
    //Inbuild method
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(34);
        list.add(12);
        list.add(5);
        list.add(67);
        list.add(23);

        System.out.println("ArrayList before sorting: " + list);
        Collections.sort(list);
        System.out.println("ArrayList after sorting: " + list);
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("ArrayList after reverse sorting: " + list);
    }
}
