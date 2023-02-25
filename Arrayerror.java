import java.util.*;

class Arrayerror{
    public static void main(String arg[])
    {
        int a[]={10,1,3};
        int i;

try
{
for(i=0;i<=3;i++)
{
System.out.println(a[i]);
}
}

catch(ArrayIndexOutOfBoundsException y){
{
System.out.println("Please correct your loop");
}
}

        
    }
}
