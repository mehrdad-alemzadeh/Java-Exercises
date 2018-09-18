
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type a number ");
        int x = Integer.parseInt(reader.nextLine());
        int result=0;
        while(x>=0){
             result += (int)Math.pow(2,x);
             x--;
        }
        System.out.println("The result is "+result);
    }
}
