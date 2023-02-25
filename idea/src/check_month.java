import java.util.*;
class use
{
    char a;
    Scanner sc =new Scanner(System.in);
    void getdata()
        {
           System.out.println("Enter a number between 1 ans 12=");
           a=sc.next().charAt(0);
        }
    

}
class cal extends use
{
void calu()
{
switch(a)
{
case 'A':
case 'E':
case 'I':
case 'O':
case 'U':
case 'a':
case 'e':
case 'i':
case 'u':

System.out.println("It is vowels");break;
default:System.out.println("Invalid");break;
}
}
}
class check_month
{
public static void main(String arg[])
{
cal sd=new cal();
sd.getdata();
sd.calu();
}
}
