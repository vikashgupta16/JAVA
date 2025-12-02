package BitManipulation;

public class even {
    public static void main(String[] args) {
        int num = 4;
        if ((num & 1) == 0) {
            System.out.println(num + " is even");
        } else {
            System.out.println(num + " is odd");
        }
        getIthBit(num, 2);
        num = setIthBit(num, 1);
        System.out.println(num);
        num = clearIthBit(num, 2);
        System.out.println(num);
        num = updateIthBit(num, 1, 0);
        System.out.println(num);
    }
    public static void getIthBit(int n, int i){
        int bitMMask = 1 << i;
        System.out.println((n & bitMMask) == 0 ? "0" : "1");
    }
    public static int setIthBit(int n, int i){
        int bitMMask = 1 << i;
        return n | bitMMask;
    }
    public static int clearIthBit(int n, int i){
        int bitMMask = ~(1 << i);
        return n & bitMMask;
    }
    public static int updateIthBit(int n, int i, int newBit){
        int bitMMask = ~(1 << i);
        n = n & bitMMask;
        return n | (newBit << i);
    }
    

}
