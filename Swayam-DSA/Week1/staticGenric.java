class StaticGenricMethod{
    // Defining a static generic method to print any data type
    static <T> void genricPrint(T t){
        System.out.println(t);
        // The following statment just print which type parameter T this method is handling
        System.out.println(t.getClass().getName()+ ":" + t);
    }

    public static void main(String[] args){
        // Calling generic method with int argument
        genricPrint(101); 
        // Calling generic method with string
        genricPrint("Lol With Java"); 
        // Calling generic method with double
        genricPrint(3.14); 
    }
}