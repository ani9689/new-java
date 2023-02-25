import java.util.*;
class fact
{
    static int a;
    Scanner sc=new Scanner(System.in);
    void input()
    {
        System.out.println("Enter a number");
        a=sc.nextInt();
        
    }
     static void display()
    {
       System.out.println("A="+a);
    }
}

class Static1 {
    public static void main(String arg[])
    {
        fact x= new fact();
        x.input();
        x.display();
        fact.display();
        
    }
}
