
import java.util.Scanner;

public class Circumference {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Type the radius: ");
        double r = Integer.parseInt(scan.nextLine());
        System.out.println("Circumference of the circle: "+(2*3.14159265359*r));
        // Program your solution here 
    }
}
