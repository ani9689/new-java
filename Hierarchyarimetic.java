import java.util.*;
class num
{
    double a,b;
    Scanner sc =new Scanner(System.in);
    void getdata(double a1,double b1)
    {
        a=a1;
        b=b1;
    }
}
class Add extends num
{
    void cal1()
    {   double c;
        c=a+b;
        System.out.println("Addition is"+c);
    }
}
class Sub extends num
{
    void cal2()
    {   double c;
        c=a-b;
        System.out.println("Subs is"+c);
    }
}
class Mul extends num
{
    void cal3()
    {   double c;
        c=a*b;
        System.out.println("Multiplication is"+c);
    }

}
class Div extends num
{
    void cal4()
    {   double c;
        c=a/b;
        System.out.println("division is"+c);
    }

}
class Hierarchyarimetic
{
    public static void main(String arg[])
    {
        Scanner sc= new Scanner(System.in);
        int a1,b1;
        System.out.println("Enter two number");
        a1=sc.nextInt();
        b1=sc.nextInt();
        Add x = new Add();
        x.getdata(a1,b1);
        x.cal1();
        Sub y= new Sub();
        y.getdata(a1,b1);
        y.cal2();
        Mul z= new Mul();
        z.getdata(a1,b1);
        z.cal3();
        Div a= new Div();
        a.getdata(a1,b1);
        a.cal4();
        

    }
}