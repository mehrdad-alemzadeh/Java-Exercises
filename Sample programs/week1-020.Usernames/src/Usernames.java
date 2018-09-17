
import java.util.Scanner;

public class Usernames {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type your ussername: ");
        String s1 = reader.nextLine();
        System.out.print("Type your password: ");
        String s2 = reader.nextLine();
        if ((s1.equals("alex") && s2.equals("mightyducks")) || (s1.equals("emily") && s2.equals("cat")))
            System.out.print("You are now logged into the system!");
        else
            System.out.print("Your username or password was invalid!");
        
    }
}
