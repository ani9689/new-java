
abstract class fact
{
    abstract void input();
    void display()
    {
       System.out.println("Have Nice Day!!");
    }
}
class no extends fact
{
   void input()
       {
          System.out.println("Have Nice month!!");
       }
   void show()
       {
          System.out.println("goo d months!!");
       }

}

class abstract1 
{
    public static void main(String arg[])
    {
        no t= new no();
        t.display();
        t.input();
        t.show();
    }
}
