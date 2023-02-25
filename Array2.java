import java.util.*;
class Array2d
{
    int a[][]=new int[2][2];
    Scanner sc=new Scanner(System.in);
    int r,c;
    void input()
    {
        System.out.println("Enter four number");
        for(r=0;r<2;r++)
        {
           for(c=0;c<2;c++)
             {a[r][c]=sc.nextInt();} 
        }
        
    }
}
class calu extends Array2d
{
    void cal()
    {
        System.out.println("Enter four number");
        for(r=0;r<2;r++)
        {
           for(c=0;c<2;c++)
             {System.out.print(a[r][c]+"\t");} 
        System.out.println();
        }
     
        
    }
     
}
class Array2 {
    public static void main(String arg[])
    {
        calu x= new calu();
        x.input();
        x.cal();
        
    }
}
