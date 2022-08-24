import java.util.Scanner;

public class Main {

        public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number of pounds");
        double pounds = scanner.nextDouble();
        double result = pounds * .45359237;
        System.out.println("\n");
        System.out.println("Converts to " + result + "kgs");



    }

}
