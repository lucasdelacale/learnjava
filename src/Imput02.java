import java.io.PrintStream;
import java.util.Locale;
import java.util.Scanner;

public class Imput02 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        //Variable Scanner type for scan imput of keyboard

        //For read numbers
        Double x;
        System.out.printf("Write one number: ");
        x = sc.nextDouble();
        System.out.printf("You write: %.2f%n", x, "?");

        //For read one character
        char y;
        y = sc.next().charAt(0);
        System.out.println("Is your 1st letter: " + y + "?");



        sc.close();
    }
}
