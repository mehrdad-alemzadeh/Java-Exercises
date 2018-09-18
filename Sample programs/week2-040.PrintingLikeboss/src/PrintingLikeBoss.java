
public class PrintingLikeBoss {

    // copy or rewrite the method of Assignment 39.1 here
    public static void printStars(int amount) {
        while (amount > 0) {
            System.out.print("*");
            amount--;
        }
        System.out.println("");
        // call this command amount times 
    }

    public static void printWhitespaces(int amount) {
        // 40.1
        while (amount > 0) {
            System.out.print(" ");
            amount--;
        }
    }

    public static void printTriangle(int size) {
        // 40.2
        int x=1;
        while(x<=size){
            printWhitespaces(size-x);
            printStars(x);
            x++;
        }
    }

    public static void xmasTree(int height) {
        // 40.3
        
        int x=1;
        int y=height;
        int z=1;
        while(y>0){
            printWhitespaces(height-x);
            printStars(z);
            y--;
            x++;
            z+=2;
        }
        z=(z-1)/2;
        printWhitespaces(z-2);
        printStars(3);
        printWhitespaces(z-2);
        printStars(3);
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!

        printTriangle(5);
        System.out.println("---");
        xmasTree(4);
        System.out.println("---");
        xmasTree(10);
    }
}
