import java.util.*;
class Chara
{
char ch;
Scanner sc=new Scanner(System.in);
void input()
{
System.out.println("Enter any char");
ch=sc.next().charAt(0);
}
void cal()
{
if((ch>=65)&&(ch<=90))
   System.out.println("UPPERCASE");
else if((ch>=97)&&(ch<=122))
   System.out.println("LOWERCASE");
else if((ch>=48)&&(ch<=57))
   System.out.println("DIGIT");
else
   System.out.println("Symbol");
}
}
class character_check
{
public static void main(String arg[])
{
Chara x=new Chara();
x.input();
x.cal();
}
}