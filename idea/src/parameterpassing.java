import java.util.*;
class add
{
    int a,b,c;
    Scanner sc =new Scanner(System.in);
    void getdata(int a1,int b1)
    {
        a=a1;
        b=b1;
        cal();
    }
    void cal()
    {
        c=a+b;
        System.out.println("Addition is"+c);
    }

}
class parameterpassing
{
    public static void main(String arg[])
    {
        Scanner sc= new Scanner(System.in);
        int a1,b1;
        System.out.println("Enter two number");
        a1=sc.nextInt();
        b1=sc.nextInt();
        add x = new add();
        x.getdata(a1,b1);

    }
}