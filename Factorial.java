import java.util.*;
class fact
{
    int a;
    Scanner sc=new Scanner(System.in);
    void input()
    {
        System.out.println("Enter a number");
        a=sc.nextInt();
        
    }
}
class calu extends fact
{
    void cal()
    {
        int p;
        p=1;
        for(int i=1;i<=a;i++)
          {
             p=p*i;
          }
        System.out.println("Factorial="+p);
    }
     
}
class Factorial  {
    public static void main(String arg[])
    {
        calu x= new calu();
        x.input();
        x.cal();
        
    }
}
