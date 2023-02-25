import java.util.*;
class fact
{
    int a,b;
    Scanner sc=new Scanner(System.in);
    void input()
    {
        System.out.println("Enter 2 number");
        try{
        a=sc.nextInt();
        b=sc.nextInt();
        }
     catch(InputMismatchException x)
     {
       System.out.println("NOt an Int NUmber");

     }
    }
}
class calu extends fact
{     int c;
    void cal()
    {
     try 
     {
       c=a/b;
       System.out.println("div="+c);
     }
     catch(ArithmeticException x)
     {
       System.out.println("div="+x);
       System.out.println("value of b="+b);
       System.out.println("division is not possible");
     }
     finally
     {
      System.out.println("||bye||");
     }
    }
     
}
class Error1 {
    public static void main(String arg[])
    {
        calu x= new calu();
        x.input();
        x.cal();
        
    }
}
