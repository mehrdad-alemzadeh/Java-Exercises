
import java.util.Scanner;

public class LoopsEndingRemembering {

    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts

        Scanner reader = new Scanner(System.in);
        System.out.print("Type numbers ");
        int x = Integer.parseInt(reader.nextLine());
        int sum = 0;
        int counter = 0;
        double average=0;
        int even=0;
        while (x != -1) {
            if(x%2==0)
                even++;
            counter++;
            sum += x;
            x = Integer.parseInt(reader.nextLine());
        }
        if (x == -1) {
            System.out.println("Thank you and see you later!");
        }
        if (counter!=0)
            average=(double) sum/counter; 
        System.out.println("The sum is " + sum);
        System.out.println("How many numbers: "+counter);
        System.out.println("Average: "+average);
        System.out.println("Even numbers: "+even);
        System.out.println("Odd numbers: "+(counter-even));
    }
}
