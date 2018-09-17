
import java.util.Scanner;

public class EvenOrOdd {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type a number: ");
        int first = Integer.parseInt(reader.nextLine());
        
        if (first%2==0)
            System.out.println("Number "+first+"is even.");
        else
            System.out.println("Number "+first+"is odd.");
        

    }
}
