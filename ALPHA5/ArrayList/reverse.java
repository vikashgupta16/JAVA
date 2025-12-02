package ArrayList;

public class reverse {
    public static void main(String[] args) {
        java.util.ArrayList<Integer> list = new java.util.ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);


        for(int i=list.size()-1;i>=0;i--){
            System.out.print(list.get(i)+" ");
        }
        
        // int left = 0;
        // int right = list.size() - 1;
        
        // while (left < right) {
        //     // Swap elements at left and right indices
        //     int temp = list.get(left);
        //     list.set(left, list.get(right));
        //     list.set(right, temp);
            
        //     left++;
        //     right--;
        // }
        
        // System.out.println("Reversed ArrayList: " + list);
    }  
}
