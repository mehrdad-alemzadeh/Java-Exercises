
import java.util.Scanner;


public class UpToCertainNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Up to what number? ");
        int x = Integer.parseInt(reader.nextLine());
        int y=1;
        while(y<=x){
            System.out.println(y);
            y+=1;
        }
        // Write your code here
        
    }
}
