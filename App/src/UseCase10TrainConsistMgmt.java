import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.HashMap;
import java.util.stream.Collectors;

public class UseCase9TrainConsistMgmt {

    // Inner Bogie class
    static class Bogie {
        String name;
        int capacity;

        Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }
    }

    public static void main(String[] args) {

        // ==============================
        // UC1: Initialize Train
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
        System.out.println(passengerBogies);

        passengerBogies.remove("AC Chair");

        System.out.println("\nAfter Removing 'AC Chair':");
        System.out.println(passengerBogies);

        System.out.println("\nChecking if Sleeper exists:");
        System.out.println(passengerBogies.contains("Sleeper"));

        System.out.println("\nUC2 completed...\n");

        // ==============================
        // UC3: Unique Bogie IDs
        // ==============================
        System.out.println("========================================");
        System.out.println(" UC3 - Unique Bogie IDs ");
        System.out.println("========================================\n");

        Set<String> bogieIds = new HashSet<>();

        bogieIds.add("BG101");
        bogieIds.add("BG102");
        bogieIds.add("BG103");
        bogieIds.add("BG101");

        System.out.println("Unique IDs:");
        System.out.println(bogieIds);

        System.out.println("\nUC3 completed...\n");

        // ==============================
        // UC4: Ordered Train using LinkedList
        // ==============================
        System.out.println("========================================");
        System.out.println(" UC4 - Ordered Train Consist ");
        System.out.println("========================================\n");

        LinkedList<String> orderedTrain = new LinkedList<>();

        orderedTrain.add("Engine");
        orderedTrain.add("Sleeper");
        orderedTrain.add("AC");
        orderedTrain.add("Cargo");
        orderedTrain.add("Guard");

        orderedTrain.add(2, "Pantry Car");

        orderedTrain.removeFirst();
        orderedTrain.removeLast();

        System.out.println(orderedTrain);

        System.out.println("\nUC4 completed...\n");

        // ==============================
        // UC5: LinkedHashSet
        // ==============================
        System.out.println("========================================");
        System.out.println(" UC5 - Preserve Order + Uniqueness ");
        System.out.println("========================================\n");

        Set<String> formation = new LinkedHashSet<>();

        formation.add("Engine");
        formation.add("Sleeper");
        formation.add("Cargo");
        formation.add("Guard");
        formation.add("Sleeper");

        System.out.println(formation);

        System.out.println("\nUC5 completed...\n");

        // ==============================
        // UC6: HashMap
        // ==============================
        System.out.println("========================================");
        System.out.println(" UC6 - Map Bogie to Capacity ");
        System.out.println("========================================\n");

        Map<String, Integer> capacityMap = new HashMap<>();

        capacityMap.put("Sleeper", 72);
        capacityMap.put("AC Chair", 56);
        capacityMap.put("First Class", 24);
        capacityMap.put("Cargo", 120);

        for (Map.Entry<String, Integer> entry : capacityMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        System.out.println("\nUC6 completed...\n");

        // ==============================
        // UC7: Sort by Capacity
        // ==============================
        System.out.println("========================================");
        System.out.println(" UC7 - Sort Bogies by Capacity ");
        System.out.println("========================================\n");

        List<Bogie> bogieList = new ArrayList<>();

        bogieList.add(new Bogie("Sleeper", 72));
        bogieList.add(new Bogie("AC Chair", 56));
        bogieList.add(new Bogie("First Class", 24));
        bogieList.add(new Bogie("General", 90));

        System.out.println("Before Sorting:");
        for (Bogie b : bogieList) {
            System.out.println(b.name + " -> " + b.capacity);
        }

        bogieList.sort((b1, b2) -> Integer.compare(b1.capacity, b2.capacity));

        System.out.println("\nAfter Sorting:");
        for (Bogie b : bogieList) {
            System.out.println(b.name + " -> " + b.capacity);
        }

        System.out.println("\nUC7 completed...\n");

        // ==============================
        // UC8: Stream Filtering
        // ==============================
        System.out.println("========================================");
        System.out.println(" UC8 - Filter Passenger Bogies ");
        System.out.println("========================================\n");

        List<Bogie> bogiesStream = new ArrayList<>();

        bogiesStream.add(new Bogie("Sleeper", 72));
        bogiesStream.add(new Bogie("AC Chair", 56));
        bogiesStream.add(new Bogie("First Class", 24));
        bogiesStream.add(new Bogie("General", 90));

        List<Bogie> filteredBogies = bogiesStream.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());

        for (Bogie b : filteredBogies) {
            System.out.println(b.name + " -> " + b.capacity);
        }

        System.out.println("\nUC8 completed...\n");

        // ==============================
        // UC9: Group Bogies by Type
        // ==============================
        System.out.println("========================================");
        System.out.println(" UC9 - Group Bogies by Type ");
        System.out.println("========================================\n");

        List<Bogie> groupedList = new ArrayList<>();

        groupedList.add(new Bogie("Sleeper", 72));
        groupedList.add(new Bogie("AC Chair", 56));
        groupedList.add(new Bogie("First Class", 24));
        groupedList.add(new Bogie("Sleeper", 70));
        groupedList.add(new Bogie("AC Chair", 60));

        Map<String, List<Bogie>> groupedBogies =
                groupedList.stream()
                        .collect(Collectors.groupingBy(b -> b.name));

        for (Map.Entry<String, List<Bogie>> entry : groupedBogies.entrySet()) {

            System.out.println("Bogie Type: " + entry.getKey());

            for (Bogie b : entry.getValue()) {
                System.out.println("Capacity -> " + b.capacity);
            }

            System.out.println();
        }

        System.out.println("UC9 grouping completed...");
    }
}