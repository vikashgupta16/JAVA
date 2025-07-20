class VarargsMethod{
    static void varargsMethod(int v[]){
        System.out.println("Number of args: "+ v.length + " Elements:");
        for(int x : v)
        System.out.print(x + " ");
        System.out.println();
    }
    public static void main(String args[]){
        // Following arrays are created for testing varargs method
        int x[]= {1,3,5,7};
        int y[]= {2,4};
        int z[]= { };
        varargsMethod (x); // Passing array x to varargs method
        varargsMethod (y); // Passing array y to varargs method
        varargsMethod (z); // Passing empty array to varargs method
    }
}