import java.util.*;
class Student
{


    Scanner sc= new Scanner(System.in);
    void input()
    {
        int no;
        String name;
        System.out.println("Enter Your Roll Number");
        System.out.println("Enter Your Name ");
        no=sc.nextInt();
        name = sc.nextLine();
    }
    void display()
    {
        System.out.println("Your Roll Number" +no);
        System.out.println("Your  name is" + name);
    }
}
class Test extends Student
{

    int cpp,java;
    Scanner sc= new Scanner(System.in);
    void input2()
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
public class Classid
{
    public static void main(String arg[])
    {

    }
}
