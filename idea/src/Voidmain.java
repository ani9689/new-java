import java.util.Scanner;

class Volume {
    double vol, a, b, c;

    // volume of cube
    void findVolume(double a) {
        System.out.println("Volume of cube = " + (a * a * a));
    }

    // volume of rectangular box
    void findVolume(double a, double b, double c) {
        System.out.println("Volume of rectangular box = " + (a * b * c));
    }

    // volume of cylinder
    void findVolume(double a, double b) {
        System.out.println("Volume of cylinder = " + (3.14 * a * a * b));
    }
}

class VolumeMain {
    public static void main(String args[]) {
        double a, b, c;
        Scanner sc = new Scanner(System.in);
        Volume obj = new Volume();
        System.out.print("Enter the length, width and height of the rectangular box : ");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        obj.findVolume(a, b, c);
        obj.findVolume(a);
        obj.findVolume(a, b);
    }
}