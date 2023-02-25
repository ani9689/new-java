import java.util.*;
interface Circle1
{
    static final double PI=3.14;
    static final double r=10.0;
    void cal();
}
class Circle2 implements Circle1
{
    double a;
    public void cal()
    {
    a=PI*r*r;
    System.out.println("Area of circle="+a);
    }
     
}
class Interface
 {
    public static void main(String arg[])
    {
        Circle2 x= new Circle2();
        x.cal();
        
    }
}
