import java.util.*;
class test
{
    static int cout=4;
    Scanner sc=new Scanner(System.in);
    void increment()
    {
      cout++;  
      System.out.println("No of ocject created="+cout);
    }
    void total()
    {
       System.out.println("Toatal No of ocject created="+cout);
    }
}

class Static2 {
    public static void main(String arg[])
    {
        test x= new test();
        x.increment();
        test y= new test();
        y.increment();
        x.total();
        
    }
}
