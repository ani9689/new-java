import java.util.*;
class Array4
{
    public static void main(String arg[])
{
    String city[]=new String[5];
    int i,j,r;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter 5 city names");
    for(i=0;i<5;i++)
    {
        city[i]=sc.nextLine();     
    }
    for(i=0;i<5;i++)
     {
       for(j=i+1;j<5;j++)
        { r=city[i].compareTo(city[j]);
          if(r>0)
            {
              String t=city[i];
              city[i]=city[j];
              city[j]=t;
             }
         }
     }

System.out.println("Aplhabetic List");
for(i=0;i<5;i++)
{
System.out.println("city name="+city[i]);
}
}
}

