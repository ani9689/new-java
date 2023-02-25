import javax.xml.namespace.QName;
import java.util.*;
class studentno
{
    int no;
    String name;
    Scanner sc= new Scanner(System.in);
    void data()
    {
        System.out.println("Enter Your Roll Number");
        System.out.println("Enter Your Name ");
         no=sc.nextInt();
        name = sc.nextLine();
        display();
    }
    void display()
    {
        System.out.println("Your Roll Number" +no);
        System.out.println("Your  name is" + name);
    }
}
class test extends studentno
{

    int cpp,java;
    Scanner sc= new Scanner(System.in);
    void data2()
    {
        System.out.println("Enter Your Marks in CPP");
        System.out.println("Enter Your Marks in JAVA");
        cpp=sc.nextInt();
        java=sc.nextInt();
        display2();

    }
    void display2()
    {
        System.out.println("Your Marks in CPP" + cpp);
        System.out.println("Your Marks in JAVA" +java);
    }
}
public class Classdata {
    public static void main(String arg[])
    {
        test .x =new test();
        x.getdata();
        x.getdata();
    }
}
