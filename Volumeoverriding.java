import java.util.Scanner;

class Volume1
 {  
    
    // volume of cube
    void findVolume() {
        System.out.println("Volume of cube = " );
    }
}

class Volume2 extends Volume1
{
 // volume of rectangular box
    void findVolume() 
    {
        super.findVolume();
        System.out.println("Volume of rectangular box = " );
    }
}
class Volume3 extends Volume2
{
 
    void findVolume() {
        super.findVolume();
        System.out.println("Volume of cylinder = " );
    }
}


class Volumeoverriding {
    public static void main(String args[]) 
{
        
        Volume3 obj = new Volume3();
        obj.findVolume();
   }
}