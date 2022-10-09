import java.util.Scanner;

public class App {

    static Scanner scan = new Scanner(System.in);

    // Answers
    public static void main(String[] args) throws Exception {
        System.out.println("Exam 2 practice problems");

        // Part 1: Conversions
        // Print the converted values

        // create a method to convert meters to feet.
        System.out.print("Enter height in meter: ");
        double heightInmeter = scan.nextDouble();
        double heightInfeet = ( heightInmeter * 3.28084);
        System.out.println(heightInmeter + "height in meter is equal to " + heightInfeet +
        "feet");

        // create method to convert feet to meter.
        System.out.print("Enter height in feet: ");
        heightInfeet = scan.nextDouble();
        heightInmeter = ( heightInfeet / 3.281);
        System.out.println(heightInfeet + "height in feet is equal to " + heightInmeter +
        "meter");



        // Part 2: Conditions
        // Display "valid" if it is true.
        // Display "invalid" if it is false.

        // 6. Create a condition to check if the length given of student number is valid 

        System.out.print("Enter your Student Number: ");
        String studentNumber = scan.next();

        if (studentNumber.length() == 10) {
        System.out.println("valid");
        } 
        else {
        System.out.println("invalid");
        }

        // 7. Create a condition to check if your bestfriend's first name is in
        // UPPERCASE letters
        System.out.print("Enter name of your bestfriend in UPPERCASE: ");
        String bestfriend = scan.next();

        if (bestfriend == bestfriend.toUpperCase()) {
        System.out.println("valid");
        } 
        else {
        System.out.println("invalid");
        }

        // 8. Create a condition to check if the answer is correct
        // answer should be manila or MANILA
        System.out.print("Enter the capital of the philippines: ");
        String capital = scan.next();

        if (capital.toLowerCase().equals("manila") || capital.toUpperCase().equals("MANILA")) {
            System.out.println("valid");
        } else {
            System.out.println("invalid");
        }

        // 9. Create a condition to check if the answer belongs to one of the five human senses
        // sight
        // touch
        // hearing
        // smell
        // taste
        System.out.print("Enter one of the five human senses: ");
        String sense = scan.next();

        switch (sense) {
            case "sight":
                System.out.print("Valid ");
                break;
            case "smell":
                System.out.print("Valid ");
                break;
            case "hearing":
                System.out.print("Valid ");
                break;
            case "touch":
                System.out.print("Valid ");
                break;
            case "taste":
                System.out.print("Valid ");
                break;
            default:
                System.out.print("invalid ");
                break;
        }
    }

    static double toFahrenheit(double temperature) {
        temperature = (temperature * 9 / 5) + 32;
        return temperature;
    }

    static double toCelsius(double temperature) {
        temperature = (temperature - 32) * 5 / 9;
        return temperature;
    }

    static double secondstoMinutes(double seconds) {
        double minutes = seconds / 60;
        return minutes;
    }

    static double hoursToMinutes(double hours) {
        double minutes = hours * 60;
        return minutes;
    }

    static double megabyteToGigabyte(double megabytes) {
        double gigabytes = megabytes / 1000;
        return gigabytes;
    }
}
