import java.util.*;
class num1
{
    int a,b,c;
    Scanner sc= new Scanner(System.in);
    void getdata()
    {
        System.out.println("Enter Three number");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
    }
}
class calu extends num1
{
    void cal()
    {
        if (a > b && a > c)
            System.out.println("Lagest number =" + a);
        else if (b > c && b > a)
            System.out.println("Lagest number =" + b);
        else
            System.out.println("Lagest number =" + c);
    }
}
public class largestnuminherit
{
    public static void main(String arg[])
    {
        calu obj=new calu();
        obj.getdata();
        obj.cal();
    }
}
