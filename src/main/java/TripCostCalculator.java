import java.util.Scanner;

public class TripCostCalculator {
    public static double calculateTripCost(double distance, double fuelEfficiency, double fuelCost) {
        return distance / fuelEfficiency * fuelCost;
    }

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the distance of the trip in km: ");
        double distance = scanner.nextDouble();
        double fuelEfficiency = 20; // 20 km per litre
        System.out.println("Enter the cost of fuel per litre: ");
        double fuelCost = scanner.nextDouble();
        double tripCost = calculateTripCost(distance, fuelEfficiency, fuelCost);
        System.out.println("The cost of the trip is: " + tripCost +"€");
    }

}
