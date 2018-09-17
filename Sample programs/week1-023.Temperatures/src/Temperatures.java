
import java.util.Scanner;

public class Temperatures {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        // Write your code here. 
        while(true){
            System.out.print("Enter temperature: ");
            double x = Double.parseDouble(reader.nextLine());
            if (x>=(-30) && x<=40)
                Graph.addNumber(x);
            else
                continue;
        }
        
        // Graph is used as follows:
        
        // Remove or comment out these lines above before trying to run the tests.
    }
}