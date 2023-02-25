import java.util.*;
class fact
{
    int a,b;
    Scanner sc=new Scanner(System.in);
    void input()
    {
        System.out.println("Enter 2 number");
        a=sc.nextInt();
        b=sc.nextInt();

    }
}
class Myx extends Expection
{
    Myx()
    {
        System.out.println("Value of b=0");
    }
}
class calu extends fact
{
    int c;
    void cal()
    {
        try
        {
            if(b==0)
            {
                throw new Myx();
            }
            else
            {
                c=a/b;
                System.out.println("div="+c);
            }
        }
        catch(Myx p)
        {
            System.out.println("division is not possible");
        }
        finally
        {
            System.out.println("||bye||");
        }
    }

}
class Error {
    public static void main(String arg[])
    {
        calu x= new calu();
        x.input();
        x.cal();

    }
}
