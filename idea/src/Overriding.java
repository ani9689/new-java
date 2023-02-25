import java.util.*;
class Base
{
int a,b;
Base(int x,int y)
{
a=x;
b=y;
}
void show()
{
System.out.println("a="+a);
System.out.println("b="+b);
}
}
class Derived extends Base
{
int c;
Derived(int x,int y,int z)
{
super(x,y);
c=z;
}
void show()
{
System.out.println("a="+a);
System.out.println("b="+b);
System.out.println("c="+c);
}

}
class Overriding
{
public static void main(String arg[])
{
Derived d=new Derived(10,20,30);
d.show();
}
}