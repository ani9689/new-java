import java.util.*;
class arrayeg
{
    Scanner sc=new Scanner(System.in);
    int a[]=new int[5];
    int i;
    void input()
    {
        System.out.println("Enter  5 numbers");
        for(i=0;i<4;i++)
         {
             a[i]=sc.nextInt();
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

class Array1d {
    public static void main(String arg[])
    {
        arrayeg x= new arrayeg();
        x.input();
        x.display();
              
    }
}
