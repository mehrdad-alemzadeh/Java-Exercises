
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
            System.out.print("Type the points [0-60]: ");
        double g = Double.parseDouble(reader.nextLine());
        System.out.println();
        if (g>=0)
            if (g<=29)
                System.out.print("Grade: failed");
        else if (g>=30 & g<=34)
            System.out.print("Grade: 1");
        else if (g>=35 & g<=39)
            System.out.print("Grade: 2");
        else if (g>=40 & g<=44)
            System.out.print("Grade: 3");
        else if (g>=45 & g<=49)
            System.out.print("Grade: 4");
        else if (g>=50 & g<=60)
            System.out.print("Grade: 5");
        else
            System.out.print("not supported");
    }
}
