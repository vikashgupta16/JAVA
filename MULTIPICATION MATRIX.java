import java.util.*;
 class Multiplication_Matrix
 {
     int r1,c1,r2,c2,r,c,x[][],y[][],z[][];
    Multiplication_Matrix (int r11,int c11,int r12,int c12)
    { 
        r1=r11;
        c1=c11;
        r2=r12;
        c2=c12;
        r=r1;
        c=c2;
        x= new int[r1][c1];
        y= new int[r2][c2];
        z= new int[r][c];
    }
    Scanner sc=new Scanner (System.in);
     void input()
    {
      System.out.print ("Enter Elements of 1st Matrix");
      for (int i=0;i<r1;i++)
      for (int j=0;j<c1;j++)
      x[i][j]=sc.nextInt();
      System.out.println("Enter Elements of 2nd Matrix");
      for (int i=0;i<r2;i++)
      for (int j=0;j<c2;j++)
      y[i][j]=sc.nextInt();
     }
    void compute()
     {
      for (int i=0;i<r;i++)
      for (int j=0;j<c;j++)
      z[i][j]=0;
      for (int i=0;i<r;i++)
      for (int j=0;j<c;j++)
      for (int k=0;k<c1;k++)
      z[i][j]+=x[i][k] * y[k][j];
      System.out.println();
      System.out.println("x");
      display(x,r1,c1);
      System.out.println("y");
      display(y,r2,c2);
      System.out.println("z");
      display(z,r,c);
    }
    void display(int a[][],int rr,int cc)
    {
        for (int i=0;i<rr;i++)
   {
      for (int j=0;j<cc;j++)
{
          System.out.println(a[i][j]+"");
      }
       System.out.println();
      }
    }
    public static void main(String args[])
    {
       Scanner sc=new Scanner (System.in);
       System.out.println("Enter row and columns of 1st matrix");
       int r1=sc.nextInt();
       int c1= sc.nextInt();
       System.out.println("Enter row and columns of 2nd matrix");
       int r2= sc.nextInt();
       int c2= sc.nextInt();
       if(c1 == r2)
        {
        Multiplication_Matrix obj=new Multiplication_Matrix (r1,c1,r2,c2);
        obj.input();
         obj.compute();
       }
       else
      System.out.println("Invalid Input");
   }
}
