package Recursion;

public class lastOccuracene {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 2, 5, 6};
        System.out.println(lastOcc(arr, arr.length - 1, 2));
    }
    static int lastOcc(int arr[], int i, int key) {
        //base case
        if (i < 0) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }
        return lastOcc(arr, i - 1, key);
    }
}

/*
 public class QuickClass9 {
     public static void printBeta38() {
}
     
    public static String printName324() {
            return "world";
}
            
    public static void main(String[] args) {
            System.out.println("Hello from QuickClass9");
}
}

public class EpicClass85 {
    public static int updateFlag222() {
            return 11;
}
            
    public static double buildAlpha386() {
            return 83.10;
}
            
    public static void main(String[] args) {
            System.out.println("Hello from EpicClass85");
}
}

public class QuickClass42 {
    public static boolean updateName509() {
            return false;
}
            
    public static void calcBeta104() {
}
    
    public static boolean printTotal270() {
            return true;
}
            
    public static void main(String[] args) {
            System.out.println("Hello from QuickClass42");
}
}

public class SmartClass38 {
    public static boolean buildAlpha93() {
            return true;
}
            
    public static int computeAlpha161() {
            return 46;
}
            
    public static void main(String[] args) {
            System.out.println("Hello from SmartClass38");
}
}

public class QuickClass21 {
    public static void formatValue326() {
}
    
    public static long updateFlag461() {
            return 3071L;
}
            
    public static void transformIndex264() {
}
    
    public static void main(String[] args) {
            System.out.println("Hello from QuickClass21");
}
}

public class BrightClass36 {
    public static String formatFlag530() {
            return "world";
}
            
    public static String formatIndex872() {
            return "world";
}
            
    public static double buildTotal683() {
            return 50.44;
}
            
    public static void main(String[] args) {
            System.out.println("Hello from BrightClass36");
}
}

public class BrightClass77 {
    public static long printValue889() {
            return 16520L;
}
            
    public static void main(String[] args) {
            System.out.println("Hello from BrightClass77");
}
}

public class LazyClass12 {
    public static boolean formatCount830() {
            return false;
}
            
    public static String processScore627() {
            return "hello";
}
            
    public static void formatAlpha867() {
}
    
    public static void main(String[] args) {
            System.out.println("Hello from LazyClass12");
}
}

public class QuickClass10 {
    public static String printBeta706() {
            return "java";
}
            
    public static String updateName231() {
            return "chatgpt";
}
            
    public static void main(String[] args) {
            System.out.println("Hello from QuickClass10");
}
}

public class SmartClass39 {
    public static long updateResult936() {
            return 17580L;
}
            
    public static boolean updateTotal729() {
            return true;
}
            
    public static void main(String[] args) {
            System.out.println("Hello from SmartClass39");
}
}

public class LazyClass65 {
    public static String calcScore188() {
            return "world";
}
            
    public static void main(String[] args) {
            System.out.println("Hello from LazyClass65");
}
}

public class MightyClass38 {
    public static boolean buildIndex558() {
            return false;
}
            
    public static double transformAlpha355() {
            return 18.06;
}
            
    public static int computeScore560() {
            return 43;
}
            
    public static void main(String[] args) {
            System.out.println("Hello from MightyClass38");
}
}

public class EpicClass27 {
    public static String printAlpha839() {
            return "java";
}
            
    public static int formatScore729() {
            return 17;
}
            
    public static void processFlag363() {
}
    
    public static void main(String[] args) {
            System.out.println("Hello from EpicClass27");
}
}

public class C}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}
 */
