import java.util.*;
class odd
{
int i;
void cal()
{ 
i=1;
System.out.println("Odd  number=");

do{
System.out.println(i);
i=i+2;
}
while(i<=20);
}
}
class Oddnum
{
public static void main(String arg[])
{
odd x=new odd();
x.cal();
}
}