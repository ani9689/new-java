import java.util.*;
class Volume
{
double l,b,h,vol;
Volume(double l1,double b1,double h1)
{
l=l1;
b=b1;
h=h1;
System.out.println("volume of cubeoid="+(l*b*h));
}
Volume(double l1)
{
        l=l1;
        System.out.println("volume of cube="+(l*l*l));
}

}
class overdoing
{
    public static void main(String[]args)
{
        double l,b,h;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length,breadth,height,radius resprctively=");
        l=sc.nextDouble();
        b=sc.nextDouble();
        h=sc.nextDouble();
        Volume x= new Volume(l,b,h);
        Volume o= new Volume(l);
    }
}