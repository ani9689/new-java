import java.util.*;
interface input
{
    static final double a=3.31;
    static final double b=10.11;
    static final double c=10.12;
    void cal();
}
class Calculation implements input
{
    
    public void cal()
    {
        if(a>b&&a>c)
            System.out.println("a="+a);
        else if(b>c&&b>a)
            System.out.println("b="+b);
        else
            System.out.println("c="+c);
    }
     
}
class Interface_largenum
 {
    public static void main(String arg[])
    {
       Calculation x= new Calculation();
        x.cal();
        
    }
}
