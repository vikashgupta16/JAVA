import java.util.*;
class Diagonal_matrix
{
    int m,x[][];
    Diagonal_matrix(int m1)
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
    void display(){
      for (int i=0;i<m;i++)
        for(int j=0;j<m;j++)
        {
        if(i+j==(m-1))
        System.out.println ("Right matrix ="+x[i][j]);
       }
      for (int i=0;i<m;i++)
        for(int j=0;j<m;j++)
        {
        if (i==j)
        System.out.println ("Left matrix ="+x[i][j]);
      }
   }
    void sum()                //Sum Of Row and column of matrix 
   {
       int sumrow,sumcol;
      for (int i=0;i<m;i++)
      {
        sumrow=0;
        for(int j=0;j<m;j++)
        {
          sumrow+=x[i][j];
          System.out.println("Sum of row ="+sumrow);
        }
      }
      for (int i=0;i<m;i++)
      {
        sumcol=0;
        for(int j=0;j<m;j++)
        {
        sumcol+=x[i][j];
        System.out.println("Sum of Column ="+sumcol);
      }
     }
    }
   public static void main(String args[])
   {
      Scanner sc=new Scanner (System.in);
      System.out.println("Enter row and columns of matrix");
      int m=sc.nextInt();
      Diagonal_matrix obj=new Diagonal_matrix(m);
         obj.input();
         obj.display();
         obj.sum();
   }
}
