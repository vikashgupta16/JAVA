package ArrayList;

public class findMax {
    public static void main(String[] args) {
        java.util.ArrayList<Integer> list = new java.util.ArrayList<>();
        list.add(12);
        list.add(3);
        list.add(45);
        list.add(7);
        list.add(23);

        int max = Integer.MIN_VALUE;
        for(int i=0;i<list.size();i++){
            if(list.get(i) > max){
                max = list.get(i);
            }
        }
        System.out.println("Maximum value in the ArrayList: " + max);
    }
}
