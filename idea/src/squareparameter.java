import java.util.*;
class para
{
    int side,area;
    void input(int s1)
    {
        side=s1;
        cal();
    }
    void cal()
    {
        area=side*side;
        System.out.println("Area of square="+area);
    }
}
class squareparameter
{
    public static void main(String arg[])
    {
        Scanner sc= new Scanner(System.in);
        int s1;
        System.out.println("Enter side");
        s1=sc.nextInt();
        para x=new para();
        x.input(s1);
    }
}