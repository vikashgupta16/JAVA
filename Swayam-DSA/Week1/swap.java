/* 
void swap(int x, int y){
    int temp;
    temp = x;
    x = y;
    y = temp;
}
*/

class SwapTest{
    public static void swap(T x, T y){
        T temp;
        temp = x;
        x = y;
        y = temp;

    }

    public static void main(String args[]){
        Integer x = new Integer(99);
        Integer y = new Integer(88);
        System.out.println("Before swap: x = " + x + ", y = " + y);
        swap(x, y);
        System.out.println("After swap: x = " + x + ", y = " + y);
    }
}