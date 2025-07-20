import java.util.*;
class Matrix_Half
{
    int m,x[][];
Matrix_Half(int m1)
    { 
       m=m1;
       x=new int[m][m];
    }
       Scanner sc=new Scanner (System.in);
    void input()
    {
System.out.println("Enter elements of the matrix");
        for (int i=0;i<m;i++)
        for (int j=0;j<m;j++)
        x[i][j]=sc.nextInt();
    }
    void lower()
    {
System.out.println("Lower half"+"\n");
        for (int i=0;i<m;i++)
        {
for(int j=0;j<m;j++)
        {
         if(j>i)
System.out.print(" ");
         else
System.out.print(x[i][j]+" ");
         }
System.out.println();
        } 
    }
     void upper()
    {
System.out.println("Upper half"+"\n");
        for (int i=0;i<m;i++)
        {
for(int j=0;j<m;j++)
        {
         if(i>j)
System.out.print("");
         else
System.out.print(x[i][j]+" ");
         }
System.out.println();
        } 
    }
   public static void main(String args[])
   {
      Scanner sc=new Scanner (System.in);
System.out.println("Enter row and columns of matrix");
      int m=sc.nextInt();
Matrix_Halfobj=new  Matrix_Half(m);
obj.input();
obj.lower();
obj.upper();
   }
}

