package BackTracking;

public class permutation {
    public static void main(String[] args) {
        permute("abc", 0, 2);
    }
    public static void permute(String str, int l, int r){
        if(l == r){
            System.out.println(str);
            return;
        }
        for(int i = l; i <= r; i++){
            char Curr = str.charAt(i);

            str=str.substring(0, l) + Curr + str.substring(l+1, i) + str.charAt(l) + str.substring(i+1);
            permute(str, l+1, r);
        }
    }
}

/*
Example :
 abc
 0 th index
 a-> bc -> ab -> abc
           ac -> acb
 b-> ac -> ba -> bac
           bc -> bca
 c-> ab -> ca -> cab
           cb -> cba
 */
// Time Complexity : O(n*n!)
// Space Complexity : O(1) 