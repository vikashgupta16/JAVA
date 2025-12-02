package BackTracking;

public class findSubSets {
    public static void findSubsets(String str, int i, String curr){
        //Base Case
        if(i == str.length()){
            if(curr.length() == 0){
                System.out.println("null");
                return;
            }
            else{
                System.out.println(curr);
            }
            return;
        }
        //Recursion 
        //Yes choice
        findSubsets(str, i+1, curr+str.charAt(i));
        //No choice
        findSubsets(str, i+1, curr);
    }
    public static void main(String[] args) {
        String str = "Archis";
        findSubsets(str, 0, "");
    }
}


// Example :
/*
 str = "abc"
 i = 0
 curr = ""

 Yes choice -> a -> ab -> abc
                     ac
             a
 No choice -> b -> bc
                     c
             b
         c
         ""
 */ 
// Time Complexity : O(2^n)
// Space Complexity : O(n) for recursion stack