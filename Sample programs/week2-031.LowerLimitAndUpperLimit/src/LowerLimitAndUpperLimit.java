
import java.util.Scanner;

public class LowerLimitAndUpperLimit {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("First: ");
        int x = Integer.parseInt(reader.nextLine());
        System.out.print("Last: ");
        int y = Integer.parseInt(reader.nextLine());
        while (x <= y) {
            System.out.println(x);
            x += 1;
        }
        // write your code here

    }
}
