import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.LinkedHashSet;

public class UseCase5TrainConsistMgmt {

    public static void main(String[] args) {

        // ==============================
        // UC1: Initialize Train and Display Consist Summary
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

        List<String> passengerBogies = new ArrayList<>();

        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        System.out.println("After Adding Bogies:");
        System.out.println("Passenger Bogies : " + passengerBogies);

        passengerBogies.remove("AC Chair");

        System.out.println("\nAfter Removing 'AC Chair':");
        System.out.println("Passenger Bogies : " + passengerBogies);

        System.out.println("\nChecking if 'Sleeper' exists:");
        boolean exists = passengerBogies.contains("Sleeper");
        System.out.println("Contains Sleeper? : " + exists);

        System.out.println("\nFinal Train Passenger Consist:");
        System.out.println(passengerBogies);

        System.out.println("\nUC2 operations completed successfully...");

        // ==============================
        // UC3: Track Unique Bogie IDs
        // ==============================
        System.out.println("\n========================================");
        System.out.println(" UC3 - Track Unique Bogie IDs ");
        System.out.println("========================================\n");

        Set<String> bogies = new HashSet<>();

        bogies.add("BG104");
        bogies.add("BG103");
        bogies.add("BG102");
        bogies.add("BG101");
        bogies.add("BG101");
        bogies.add("BG102");

        System.out.println("Bogie IDs After Insertion:");
        System.out.println(bogies);

        System.out.println("\nNote:");
        System.out.println("Duplicates are automatically ignored by HashSet.");

        System.out.println("\nUC3 uniqueness validation completed...");

        // ==============================
        // UC4: Maintain Ordered Bogie IDs
        // ==============================
        System.out.println("\n========================================");
        System.out.println(" UC4 - Maintain Ordered Bogie IDs ");
        System.out.println("========================================\n");

        LinkedList<String> orderedTrain = new LinkedList<>();

        orderedTrain.add("Engine");
        orderedTrain.add("Sleeper");
        orderedTrain.add("AC");
        orderedTrain.add("Cargo");
        orderedTrain.add("Guard");

        System.out.println("Initial Train Consist:");
        System.out.println(orderedTrain);

        orderedTrain.add(2, "Pantry Car");

        System.out.println("\nAfter Inserting 'Pantry Car' at position 2:");
        System.out.println(orderedTrain);

        orderedTrain.removeFirst();
        orderedTrain.removeLast();

        System.out.println("\nAfter Removing First and Last Bogie:");
        System.out.println(orderedTrain);

        System.out.println("\nFinal Ordered Train Consist:");
        System.out.println(orderedTrain);

        System.out.println("\nUC4 linked list operations completed successfully...");

        // ==============================
        // UC5: Preserve Insertion Order of Bogies
        // ==============================
        System.out.println("\n========================================");
        System.out.println(" UC5 - Preserve Insertion Order of Bogies ");
        System.out.println("========================================\n");

        Set<String> formation = new LinkedHashSet<>();

        formation.add("Engine");
        formation.add("Sleeper");
        formation.add("Cargo");
        formation.add("Guard");
        formation.add("Sleeper");

        System.out.println("Final Train Formation:");
        System.out.println(formation);

        System.out.println("\nNote:");
        System.out.println("LinkedHashSet preserves insertion order and removes duplicates automatically.");

        System.out.println("\nUC5 formation setup completed...");


                // ==============================
        // UC6: Map Bogie to Capacity
        // ==============================
        System.out.println("\n========================================");
        System.out.println(" UC6 - Map Bogie to Capacity (HashMap) ");
        System.out.println("========================================\n");

        // Create HashMap for bogie-capacity mapping
        java.util.Map<String, Integer> capacityMap = new java.util.HashMap<>();

        // Insert bogie capacities
        capacityMap.put("First Class", 24);
        capacityMap.put("Cargo", 120);
        capacityMap.put("Sleeper", 72);
        capacityMap.put("AC Chair", 56);

        // Display bogie capacity details
        System.out.println("Bogie Capacity Details:");

        for (java.util.Map.Entry<String, Integer> entry : capacityMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        System.out.println("\nUC6 bogie-capacity mapping completed...");







    }
}