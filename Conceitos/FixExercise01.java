import java.util.Locale;

public class FixExercise01 {
    public static void main(String[] args) {
        // For generated main structure, code 'psvm'
        // (public static void main).

        //Fixing exercise 01
        String productOne = "T-shirt";
        String productTwo = "Sneakers";

        int age = 30;
        int code = 3337;
        char gender = 'F';

        double priceOne = 2225.90;
        double priceTwo = 4575.90;
        double measure = 53.2345678709;

        //Quest
        System.out.printf(
                "Products: %n" +
                        "%s, which price is $%.2f%n" +
                        "%s which price is $%.2f%n" +
                        "%n" +
                        "Record: %d years old, code %d and gender: %s%n" +
                        "%n" +
                        "Measure with eight decimal places: %f%n" +
                        "Rounded (three decimal places: %.3f%n"
                , productOne, priceOne, productTwo, priceTwo, age, code, gender
                , measure, measure);
        Locale.setDefault(Locale.US);
        System.out.printf(
                "US decimal point: %.3f%n", measure
        );

    }
}
