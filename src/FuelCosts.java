import java.util.Scanner;
public class FuelCosts {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double gallonsOfGas = 0.0;
        double fuelEfficiency = 0.0;
        double gasPrice = 0.0;
        double costPer100Miles = 0.0;
        double distance = 0.0;
        String trash = "";
        boolean done = false;
        do {
            System.out.println("Enter the number of gallons of gas in the tank: ");
            if(in.hasNextDouble()) {
                gallonsOfGas = in.nextDouble();
                in.nextLine();
                if (gallonsOfGas >= 0) {break;}
                if (gallonsOfGas >= 0)  {done = true;}
                else {
                    System.out.println("Please enter a value greater or equal 0!");
                }
            }
            else {
                trash = in.nextLine();
                System.out.println("Please enter a valid number, not:  " + trash);
            }
        }
        while(!done);
        do {
            System.out.println("Enter the fuel efficiency in miles per gallon: ");
            if(in.hasNextDouble()) {
                fuelEfficiency = in.nextDouble();
                in.nextLine();
                if (fuelEfficiency >= 0) {break;}
                if (fuelEfficiency >= 0) {done = true;}
                else {
                    System.out.println("Please enter a value greater or equal 0!");
                }
            }
            else {
                trash = in.nextLine();
                System.out.println("Please enter a valid number, not:  " + trash);
            }
        }
        while (!done);
        do {
            System.out.println("Enter the price of gas per gallon: ");
            if(in.hasNextDouble()) {
                gasPrice = in.nextDouble();
                in.nextLine();
                if (gasPrice >= 0) {done = true;}
                else {
                    System.out.println("Please enter a value greater or equal 0!");
                }
            }
            else {
                trash = in.nextLine();
                System.out.println("Please enter a valid number, not:  " + trash);
            }
        }
        while (!done);
        costPer100Miles = (gasPrice * 100) / fuelEfficiency;
        distance = gallonsOfGas * fuelEfficiency;
        System.out.println("Cost per 100 miles is ($): " + costPer100Miles);
        System.out.println("Distance with current gas: " + distance + "miles");
    }
}