import java.util.*;
import java.io.*;
class ReadData {
   public static void main(String args[]) throws IOException 
{
      BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
      System.out.println("Enter a number ");
      int a,b;
      String s1=br.readLine();
      a=Integer.parseInt(s1);
      b=a*a;
      System.out.println("Square of no "+b);
}
}
