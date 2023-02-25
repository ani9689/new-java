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
        int d,rev=0;
        int t=a; 
        while(a>0)
          { 
           d=a%10;
           rev=rev*10+d;
           a=a/10;
           }
    if(t==rev){System.out.println("It is a pallirome");}
    else{System.out.println("It is not a pallirome");}
    }
     
}
class Pallidrome {
    public static void main(String arg[])
    {
        calu x= new calu();
        x.input();
        x.cal();
        
    }
}
