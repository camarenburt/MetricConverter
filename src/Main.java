import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double METERS_TO_MILES = 0.00062137;
        double METERS_TO_FEET = 3.28084;
        double METERS_TO_INCHES = 39.37008;
        double meters = 0;
        double miles;
        double feet;
        double inches;
        boolean done = false;

        do{
            System.out.println("Enter Meter Measurement");
            if (scan.hasNextDouble()) {
                meters = scan.nextDouble();
                scan.nextLine();
                if (meters > 0){
                    done = true;
                } else {
                    System.out.println("The value you entered was incorrect. Please try again.");
                }
            } else {
                System.out.println("The value you entered was incorrect. Please try again.");
                scan.nextLine();
            }
        } while(!done);

        miles = meters * METERS_TO_MILES;
        feet = meters * METERS_TO_FEET;
        inches = meters * METERS_TO_INCHES;

        System.out.printf("Meters: %12.2f", meters);
        System.out.printf("\nMiles: %13.2f", miles);
        System.out.printf("\nFeet: %14.2f", feet);
        System.out.printf("\nInches: %12.2f", inches);


    }
}
