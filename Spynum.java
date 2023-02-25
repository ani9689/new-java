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
        int d,p=1;
        int s=0;
       int t=a; 
        while(a>0)
          { 
           d=a%10;
           p=p*d;
           s=s+d;
           a=a/10;
           }
    if(p==s){
           System.out.println("Spy num="+t);}
    else{System.out.println(" is not spy num="+t);}
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
