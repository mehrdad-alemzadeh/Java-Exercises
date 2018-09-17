
import java.util.Scanner;

public class SumOfTheAges {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Type your name: ");
        String n1 = scan.nextLine();
        System.out.print("Type your age: ");
        int x = Integer.parseInt(scan.nextLine());
        
        System.out.print("Type your name: ");
        String n2 = scan.nextLine();
        System.out.print("Type your age: ");
        int y = Integer.parseInt(scan.nextLine());
        System.out.println("");      
        System.out.print(n1+" and "+n2+" are "+(x+y)+" years old in total.");
        // Implement your program here
    }
}
