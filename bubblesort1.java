import java.util.*;
class bubblesort
{
    Scanner sc=new Scanner(System.in);
    int a[]=new int[5];
    int i;
    void input()
    {
        System.out.println("Enter  5 numbers");
        for(i=0;i<5;i++)
        {
            a[i]=sc.nextInt();
        }
    }
        void cal()
        {
            int i,j,t;
            for(i=0;i<5;i++)
            {
                for(j=i+1;j<5;j++)
                {
                    if(a[i]>a[j])
                    {
                        t=a[i];
                        a[i]=a[j];
                        a[j]=t;
                    }
                }

            }

        }
    
    void display()
    {
        int sum=0;
        System.out.println("Array Element are=");
        for(i=0;i<5;i++)
        {
            System.out.println(a[i]);
            sum=sum+a[i];
        }
        System.out.println("Sum of Array="+sum);
    }
}

class bubblesort1 {
    public static void main(String arg[])
    {
        bubblesort x= new bubblesort();
        x.input();
        x.cal();
        x.display();

    }
}
