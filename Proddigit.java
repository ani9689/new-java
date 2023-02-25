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
        int d,p=0,sum=0; 
        while(a>0)
          { 
           d=a%10;
           p=p*10+d;
           a=a/10;
           }
    System.out.println("Rever of  num="+p);
    }
     
}
class Spynum {
    public static void main(String arg[])
    {
        calu x= new calu();
        x.input();
        x.cal();
        
    }
}
