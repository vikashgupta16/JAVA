package ArrayList;
import java.util.ArrayList;
public class multiDimen {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(4);
        list2.add(5);
        list2.add(6);

        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(7);
        list3.add(8);
        list3.add(9);

        mainList.add(list1);
        mainList.add(list2);
        mainList.add(list3);

        // Printing the 2D ArrayList
        for (int i = 0; i < mainList.size(); i++) {
            System.out.println("Row " + i + ": " + mainList.get(i));
        }
    } 

}
