//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Hello World!");

        int y = 32; // int number
        double x = 10.56278; // float number
        System.out.println(y); // print variable
        System.out.printf("%.2f%n", x); // format number with decimals case

        System.out.println("The result is:" + x);

        // for print variables, use this type for inputs
        // %f for float
        // %d for int
        // %s text (strings)
        // %n line broker

        //Exercise

        String name = "Lucas";
        int years = 26;
        double income = 3.700;
        System.out.printf(
                "Hello, i'm %s, i have a %d years and my month income is %.3f%n",
                name, years, income);
    }

}