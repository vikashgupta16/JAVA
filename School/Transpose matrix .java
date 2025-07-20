import java.util.*;
class matrix_transpose
{
    int m,n,x[][],y[][];
    matrix_transpose(int r,int c)
    {
        m=r;
        n=c;
        x=new int[m][n];
        y=new int[n][m];
    }
    Scanner sc=new Scanner(System.in);
    void input()
    {
        System.out.println("Enter elements");
for(int i=0;i<m;i++)
for(int j=0;j<n;j++)
        x[i][j]=sc.nextInt();
    }
    void transpose()
    {
for(int i=0;i<m;i++)
for(int j=0;j<m;j++)
        y[i][j]=x[j][i];
        System.out.println(“x”);
        display(x,m,n);
        System.out.println(“y”);
        display(y,m,n);
    }
    void display(int A[][],int r,int c)
    {
for(int i=0;i<r;i++)
        {
for(int j=0;j<c;j++)
            {
System.out.print(A[i][j]+ " ");
            }
        System.out.println();
        } 
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter row abndcolumn");
        int m=sc.nextInt();
        int n=sc.nextInt();
        if(m>0 && n>0)
        {
            matrix_transpose obj =new matrix_transpose(m,n);
obj.input();
obj.transpose();
        }
        else 
        System.out.println("Invalid data");
    }
}
