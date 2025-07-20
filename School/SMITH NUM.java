import java.util.*;
class smith number
{
     public static void main(String sr[])throws InputMismatchException
     {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter a number: ");
       int n=sc.nextInt();
       int p,q,i,sod=0,sopf=0,t;
       p=q=n;  //Find the sum of all the digits of the number
       while(p>0)
       {
         sod+=p%10;
         p/=10;
       }
       for(i=2;i<=q;i++)
       {
         if(q%i==0)
         { 
           t=i;import java.util.Scanner;
public class SmithNumber
{
       public static void main(String args[]) {
       Scanner in = new Scanner(System.in);
       System.out.print("Enter number to check");
       int n = in.nextInt();
       if (n <= 0) {
        System.out.println(n + " is not a Smith Number.");
        return;
       }
       boolean isComposite = false;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                isComposite = true;
                break;
            }
        }
        if (isComposite && n != 1) {
            int sumDigits = 0;
        

    int t = n;
            while (t != 0) {
                int d = t % 10;
                sumDigits += d;
                t /= 10;
            }
            int sumPrimeDigits = 0;
            t = n;
            for(int i = 2; i < t; i++) {
                while(t % i == 0) {
                    t /= i;
                    int temp = i;
                    while (temp != 0) {
                        int d = temp % 10;
                        sumPrimeDigits += d;
                        temp /= 10;
                    }
                }
            }
            if(t > 2) {
                while (t != 0) {
                    int d = t % 10;
                    sumPrimeDigits += d;
                    t /= 10;
                }
            }
            if (sumPrimeDigits == sumDigits)
                System.out.println(n + " is a Smith Number.");
            else
                System.out.println(n + " is not a Smith Number.");
        }
        else {
            System.out.println(n + " is not a Smith Number.");
       }
     }
}

           while(t>0)
           { //find the sum of the digits of the factor
             sopf+=t%10;
             t/=10;
           }
           q=q/i;
           i--; //decrement the factor so that next time the same factor is checked again and
         }
       }
       if(sod==sopf) // if sum of digits and sum of prime factors are equal, it is smith number
       System.out.println("Smith number");
       else
       System.out.println("Not Smith number");
     }
}
