
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
          System.out.println("good months!!");
       }

}

class abstract 
{
    public static void main(String arg[])
    {
        no t= new no();
        t.display();
        t.input();
        t.show();
    }
}
