import java.util.ArrayList;
import java.util.List;

public class UseCase3TrainConsistMgmt {
    public static void main(String[] args) {

        // ==============================
        // UC1: Initialization (already done)
        // ==============================
        System.out.println("========================================");
        System.out.println("   === Train Consist Management App ===");
        System.out.println("========================================\n");

        List<String> trainConsist = new ArrayList<>();

        System.out.println("Train initialized successfully...");
        System.out.println("Initial Bogie Count : " + trainConsist.size());
        System.out.println("Current Train Consist : " + trainConsist);
        System.out.println("System ready for operations...\n");


        // ==============================
        // UC2: Add Passenger Bogies
        // ==============================
        System.out.println("========================================");
        System.out.println(" UC2 - Add Passenger Bogies to Train ");
        System.out.println("========================================\n");

        // Create ArrayList for passenger bogies
        List<String> passengerBogies = new ArrayList<>();

        // CREATE (Add bogies)
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        // Display after adding
        System.out.println("After Adding Bogies:");
        System.out.println("Passenger Bogies : " + passengerBogies);

        // DELETE (Remove bogie)
        passengerBogies.remove("AC Chair");

        System.out.println("\nAfter Removing 'AC Chair':");
        System.out.println("Passenger Bogies : " + passengerBogies);

        // READ (Check existence)
        System.out.println("\nChecking if 'Sleeper' exists:");
        boolean exists = passengerBogies.contains("Sleeper");
        System.out.println("Contains Sleeper? : " + exists);

        // Final state
        System.out.println("\nFinal Train Passenger Consist:");
        System.out.println(passengerBogies);

        System.out.println("\nUC2 operations completed successfully...");
                // ==============================
        // UC3: Track Unique Bogie IDs
        // ==============================
        System.out.println("\n========================================");
        System.out.println(" UC3 - Track Unique Bogie IDs ");
        System.out.println("========================================\n");

        // Create a Set to store unique bogie IDs
        java.util.Set<String> bogies = new java.util.HashSet<>();

        // ADD IDs (including duplicates)
        bogies.add("BG104");
        bogies.add("BG103");
        bogies.add("BG102");
        bogies.add("BG101");

        // Duplicate entries (will be ignored)
        bogies.add("BG101");
        bogies.add("BG102");

        // Display bogie IDs after insertion
        System.out.println("Bogie IDs After Insertion:");
        System.out.println(bogies);

        // Note about uniqueness
        System.out.println("\nNote:");
        System.out.println("Duplicates are automatically ignored by HashSet.");

        System.out.println("\nUC3 uniqueness validation completed...");

    }
}