import java.util.*;
class num
{
    int a;
    int b;
    Scanner sc= new Scanner(System.in);

    void input()
    {
        System.out.println("Enter two number");
        a=sc.nextInt();
        b=sc.nextInt();
    }
    int cal()
    {
        if(a>b)
            return (a);
        else
            return (b);
    }
}
public class largestnumber
{
    public static void main(String arg[])
    {
        num x = new num();
        x.input();
        int ans = x.cal();
        System.out.println("largest Number =" + ans);

    }
}
