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
        int i;
        int cout=0;
        for(i=1;i<=a;i++)
          { 
           if(a%i==0){cout++;}
           }
          if(cout==2){System.out.println("It is Prime number");}
          else{System.out.println("It is not a Prime number");}
    }
     
}
class Primenum {
    public static void main(String arg[])
    {
        calu x= new calu();
        x.input();
        x.cal();
        
    }
}
