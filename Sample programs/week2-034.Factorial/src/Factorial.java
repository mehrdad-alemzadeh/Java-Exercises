
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("type a number: ");
        int x = Integer.parseInt(reader.nextLine());
        if (x == 0 || x == 1) {
            System.out.println("Factorial is 1");
        } else {
            int z = x;
            while (x > 1) {
                z *= x - 1;
                x--;
            }
            System.out.println("Factorial is " + z);
        }
    }
}
