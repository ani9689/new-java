import javax.xml.namespace.QName;
import java.util.*;
interface sport
{
 static final double s=98;
}
class studentno
{
    int no;
    String name;
    Scanner sc= new Scanner(System.in);
    void input1()
    {
        System.out.println("Enter Your Roll Number");
        System.out.println("Enter Your Name ");
        no=sc.nextInt();
        name = sc.nextLine();
       
    }
    void display1()
    {
        System.out.println("Your Roll Number=" +no);
        System.out.println("Your  name =" + name);
    }
}

class test extends studentno
{

    int cpp,java;
    Scanner sc= new Scanner(System.in);
    void input2()
    {
        System.out.println("Enter Your Marks in CPP");
        System.out.println("Enter Your Marks in JAVA");
        cpp=sc.nextInt();
        java=sc.nextInt();
       

    }
    void display2()
    {
        System.out.println("Your Marks in CPP=" + cpp);
        System.out.println("Your Marks in JAVA=" +java);
    }
}
class result extends test implements sport
{ 
   double finalmark;
   void cal()
   {
      finalmark=cpp+java+s;
      System.out.println("Total mark are=" +finalmark);
   }
}
class multipleinheritance {
    public static void main(String arg[])
    {
        result x =new result();
        x.input1();
        x.input2();
        x.display1();
        x.display2();
        x.cal();
    }
}
