import java.util.*;
 class Matrix_symmetry
 {
     int r,c,x[][],y[][],flag=0;
Matrix_symmetry(int r1,int c1)
    { 
        r=r1;
        c=c1;
        x= new int[r][c];
        y= new int[c][r];
    }
     Scanner sc=new Scanner (System.in);
   void input()
    {
System.out.print ("Enter Elements of 1st Matrix");
      for (int i=0;i<r;i++)
      for (int j=0;j<c;j++)
      x[i][j]=sc.nextInt();     
     }
   void transpose()
     {
        for (int i=0;i<r;i++)
       for (int j=0;j<c;j++)
        y[i][j]=x[j][i];
          }
    void Check()
    {
    for (int i=0;i<r;i++)
    {
      for (int j=0;j<c;j++){
          if(x[i][j]!=y[i][j])
      {
           flag=1;
           break;
      }
    }
    }
    if(flag==1)
System.out.println("Not a Symmetric matrix");
    else 
System.out.println("Symmetric Matrix");
   }
   void display(int a[][],int m,int n )
    {
      for (int i=0;i<m;i++)
      for (int j=0;j<n;j++)
System.out.print(a[i][j]);
System.out.println();
    }
    public static void main(String args[])
    {
       Scanner sc=new Scanner (System.in);
System.out.println("Enter row and columns of matrix");
       int r=sc.nextInt();
       int c=sc.nextInt();
       if(r==c)
        {
Matrix_symmetryobj=new Matrix_symmetry(r,c);
obj.input();
obj.transpose();
obj.Check();
       }
       else
System.out.println("Invalid Input");
   }
 }
