package ArrayList;

public class swap2 {
    public static void main(String[] args) {
        java.util.ArrayList<Integer> list = new java.util.ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        int index1 = 1; // Index of first element to swap
        int index2 = 3; // Index of second element to swap

        System.out.println("ArrayList before swapping: " + list);
        // Swapping elements at index1 and index2
        int temp = list.get(index1);
        list.set(index1, list.get(index2));
        list.set(index2, temp);

        System.out.println("ArrayList after swapping: " + list);
    }
}
