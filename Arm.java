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
        int d,sum=0;
        int cube;
        int t=a; 
        while(a>0)
          { 
           d=a%10;
           cube=d*d*d;
           sum=sum+cube;
           a=a/10;
           }
    if(t==sum){System.out.println("It is a Armstrong");}
    else{System.out.println("It is not a Armstrong");}
    }
     
}
class Arm {
    public static void main(String arg[])
    {
        calu x= new calu();
        x.input();
        x.cal();
        
    }
}
