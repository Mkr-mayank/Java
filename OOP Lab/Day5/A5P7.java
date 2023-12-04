public class A5P7 {
    // Static fields to hold the rates for petrol and diesel
    private static float ratePetrol = 20.0f;
    private static float rateDiesel = 10.0f;

    // Constructor to automatically hike the rates by 10%
    public A5P7() {
        ratePetrol *= 1.10f;
        rateDiesel *= 1.10f;
    }

    // Method to display the current fuel rates
    public static void displayFuelRates() {
        System.out.println("Current Petrol Rate: Rs " + ratePetrol);
        System.out.println("Current Diesel Rate: Rs " + rateDiesel);
    }

    public static void main(String[] args) {
        // Display initial fuel rates
        System.out.println("Initial Fuel Rates:");
        displayFuelRates();

        // Create 5 objects of Fuel class, and display rates after each creation
        for (int i = 1; i <= 5; i++) {
            A5P7 fuel = new A5P7();
            System.out.println("\nFuel Rates After Object #" + i + " Creation:");
            displayFuelRates();
        }
    }
}
