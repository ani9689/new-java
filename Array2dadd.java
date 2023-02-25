import java.util.*;
class Array2d
{
    int a[][]=new int[2][2];
    int b[][]=new int[2][2];
    int p[][]=new int[2][2];
    Scanner sc=new Scanner(System.in);
    int r,c;
    void input()
    {
        System.out.println("Enter four numberfor matrix a");
        for(r=0;r<2;r++)
        {
           for(c=0;c<2;c++)
             {a[r][c]=sc.nextInt();} 
        }
        System.out.println("Enter four number for martix b");
        for(r=0;r<2;r++)
        {
           for(c=0;c<2;c++)
             {b[r][c]=sc.nextInt();} 
        }
        
    }
}
class calu extends Array2d
{
    void display()
    {
        System.out.println("Enter four number of Array a");
        
        for(r=0;r<2;r++)
        {
           for(c=0;c<2;c++)
             {System.out.print(a[r][c]+"\t");} 
        System.out.println();
        }
        System.out.println("&& Enter four number of Array b");
        for(r=0;r<2;r++)
        {
           for(c=0;c<2;c++)
             {System.out.print(b[r][c]+"\t");} 
        System.out.println();
        }
     
        
    }
    void cal()
    {
        for(r=0;r<2;r++)
        {
           for(c=0;c<2;c++)
             {p[r][c]=a[r][c]+b[r][c];} 

        }
        System.out.println("Addition of  martix 2*2 Array ");
        for(r=0;r<2;r++)
        {
           for(c=0;c<2;c++)
             {System.out.print(p[r][c]+"\t");} 
        System.out.println();
        }
        
    }
   
     
}
class Array2dadd {
    public static void main(String arg[])
    {
        calu x= new calu();
        x.input();
        x.display();
        x.cal();
        
    }
}
