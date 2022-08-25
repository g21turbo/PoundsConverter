// A simple weight converter
// A few measurements that can be converted from pounds






import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Step 1: Choose a measurement
        System.out.println("Welcome to the Weight Converter");
        System.out.println("1:Kilograms");
        System.out.println("2:Grams");
        System.out.println("3:Ounces");
        System.out.println("Choose a number for the corresponding measurement you wish to convert:");
        Scanner scanner = new Scanner(System.in);
        int selection = scanner.nextInt();


        if (selection == 1) {
            System.out.println("Please enter a number of pounds");
            scanner = new Scanner(System.in);
            double pounds = scanner.nextDouble();
            double result = pounds * .45359237;
            System.out.println("Converts to " + result + " kilograms");
        }
        if (selection == 2) {
            System.out.println("Please enter a number of Pounds");
            scanner = new Scanner(System.in);
            double pounds = scanner.nextDouble();
            double result = pounds /  0.002205;
            System.out.println("Converts to " + result + " grams");
        }
        if (selection == 3) {
            System.out.println("Please enter a number of Pounds");
            scanner = new Scanner(System.in);
            double pounds = scanner.nextDouble();
            double result = pounds * 16;
            System.out.println("Converts to " + result + " ounces");
        }
    }
}
