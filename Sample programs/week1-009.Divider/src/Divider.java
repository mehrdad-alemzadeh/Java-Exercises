
import java.util.Scanner;

public class Divider {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type a number: ");
        double x = Integer.parseInt(reader.nextLine());
        System.out.print("Type another number: ");
        double y = Integer.parseInt(reader.nextLine());
        System.out.println("");
        System.out.print("Division: "+x+" / "+y+" = "+(x/y));
        // Implement your program here. Remember to ask the input from user.
    }
}
