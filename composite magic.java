import java.util.*;
class CompositeMagic
{
    boolean Composite(int x)
    {
        int c=0;
        for(int i=1;i<=x;i++)
        {
            if(x%i==0)
            c++;
           }
        return(c>2);
       }
    int sumofdigit(int x)
    {
        int s=0;int r=0;
        while(x!=0)
        {
            r=x%10;
            s+=r;
            x/=10;
        }
        return s;
    }
    boolean Magic(int no)
    {
        while(no>1)
        {
            no=sumofdigit(no);
        }
        return (no==1);
    }
    public static void main(String args[])
    {
        int c=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter range");
        int m=sc.nextInt();
        int n=sc.nextInt();
        if((m>0&&n>0)&&(m<n))
        {
            CompositeMagic obj=new CompositeMagic();
            System.out.println("The Composite Magic Integers numbers are:");
            for(int i=m;i<=n;i++)
            {
                if(obj.Composite(i)&&obj.Magic(i))
                {
                    
                    System.out.println(i+" ");
                    c++;
                    }
                   }
          System.out.println("Frequency of composite magic integer:");
        }
            System.out.println("Invalid");
        }
}
