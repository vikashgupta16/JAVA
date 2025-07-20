class DemoClass{
    // Defineig a genric method to print any data type;
    void genricPrint(T t){
        System.out.println(t);
    }

    public static void main(String[] args){
        DemoClass aObj; //Creating an object of the class DemoClass
        aObj.genricPrint(101); //Calling genric method with int argument
        aObj.genricPrint("Lol With Java"); //Calling genric method with string
        aObj.genricPrint(3.14); //Calling genric method with double
    }
}

/* 
Note: Dimag me rakhna ki genric method ko call karne se pehle class ka object create karna padega.
      Aur genric method ko call karte waqt type specify nahi karna padta.
      Java automatically type ko samajh lega.
      Is code ko run karne ke liye Java ki version 5 ya usse baad ki jarurat hai.
      Agar aapko type specify karna hai to aap class ke naam ke saath <T> likh sakte ho.
      Example: DemoClass<Integer> aObj = new DemoClass<>();
      Lekin yeh optional hai, Java type inference ka use karke type ko samajh lega.
      Is code ko run karne ke liye aapko Java Development Kit (JDK) ki jarurat hai.
*/ 


// Dimag me khuch nhi gussa, bas code likho aur run karo.