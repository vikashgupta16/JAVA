package Recursion;

public class tilling {
    public static void main(String[] args) {
        System.out.println(tillingWays(4));
    }
    static int tillingWays(int n) {
        //base case
        if (n == 0 || n == 1) {
            return 1;
        }
        // //vertical choice
        // int fnm1 = tillingWays(n - 1);
        // //horizontal choice 
        // int fnm2 = tillingWays(n - 2);
        int totalWays = tillingWays(n - 1) + tillingWays(n - 2);
        //or return tillingWays(n-1) + tillingWays(n-2);
        //TC = O(2^n)
        //SC = O(n) (auxiliary space)
        return totalWays;
    }
}
/*
 public class QuickClass81 {
     public static double formatScore129() {
             return 49.64;
}
             
    public static void main(String[] args) {
            System.out.println("Hello from QuickClass81");
}
}

public class CrazyClass15 {
    public static long processTotal715() {
            return 90269L;
}
            
    public static void main(String[] args) {
            System.out.println("Hello from CrazyClass15");
}
}

public class LazyClass70 {
    public static double processValue646() {
            return 55.02;
}
            
    public static int formatAlpha63() {
            return 70;
}
            
    public static void main(String[] args) {
            System.out.println("Hello from LazyClass70");
}
}

public class TinyClass11 {
    public static int buildTotal254() {
            return 10;
}
            
    public static void computeName575() {
}
    
    public static void main(String[] args) {
            System.out.println("Hello from TinyClass11");
}
}

public class TinyClass93 {
    public static String formatBeta989() {
            return "world";
}
            
    public static void main(String[] args) {
            System.out.println("Hello from TinyClass93");
}
}

public class MightyClass2 {
    public static void computeName9() {
}
    
    public static void main(String[] args) {
            System.out.println("Hello from MightyClass2");
}
}

public class CrazyClass9 {
    public static int computeBeta573() {
            return 71;
}
            
    public static int transformName22() {
            return 34;
}
            
    public static void main(String[] args) {
            System.out.println("Hello from CrazyClass9");
}
}

public class QuickClass20 {
    public static int calcIndex418() {
            return 16;
}
            
    public static void transformValue222() {
}
    
    public static long updateValue745() {
            return 52303L;
}
            
    public static void main(String[] args) {
            System.out.println("Hello from QuickClass20");
}
}

public class BrightClass79 {
    public static long transformAlpha685() {
            return 52842L;
}
            
    public static boolean transformResult587() {
            return true;
}
            
    public static void main(String[] args) {
            System.out.println("Hello from BrightClass79");
}
}

public class LazyClass32 {
    public static String printAlpha672() {
            return "chatgpt";
}
            
    public static void main(String[] args) {
            System.out.println("Hello from LazyClass32");
             }}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}
 */
