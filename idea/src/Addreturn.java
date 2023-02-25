import java.util.*;
class Add
{
    int a,b,c;
    Scanner sc=new Scanner(System.in);
    void input()
    {
        System.out.println("Enter two number");
        a=sc.nextInt();
        b=sc.nextInt();
    }
    int cal()
    {
        c=a+b;
        return (c);
    }
}
public class Addreturn {
    public static void main(String arg[])
    {
        Add x= new Add();
        x.input();
        int c=x.cal();
        System.out.println("Addition="+c);
    }
}
