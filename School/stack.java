import java.util.*;
class Stack
{
    int top,pos,x[],s;
    Stack(int size)
    {
        s=size;
        top=-1;
        pos=-1;
        x=new int[s];
    }
    boolean isempty()
    {
        return(top==-1);
    }
    void push(int item)
    {
        if(isempty())
        {
            top=0;
            pos=0;
            x[top]=item;
        }
        else if(pos+1<s)
        {
            ++pos;
            for(int i=pos;i>0;i--)
            x[i]=x[i-1];
            x[top]=item;
        }
        else
        System.out.println("Overflow");
    }
    void pop()
    {
        if(isempty())
        System.out.println("Empty");
        else if(pos>=0)
        {
            System.out.println(x[top]);
            pos--;
            for(int i=0;i<=pos;i++)
            x[i]=x[i+1];
        }
        else
        {
            System.out.println("Empty");
            top=-1;
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size");
        int s=sc.nextInt();
        Stack obj=new Stack(s);
        System.out.println("Enter elements");
        {
            for(int i=1;i<=s;i++)
            {
                int n=sc.nextInt();
                obj.push(n);
            }
            for(int i=1;i<=s;i++)
            obj.pop();
        }
    }
}
