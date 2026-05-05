import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class UseCase9TrainConsistMgmt {

    // Bogie class
    static class Bogie {
        String name;
        int capacity;

        Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }
    }

    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println(" UC9 - Group Bogies by Type ");
        System.out.println("========================================\n");

        // Step 1: Create list
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("Sleeper", 70));
        bogies.add(new Bogie("AC Chair", 60));

        // Step 2: Print original list
        System.out.println("All Bogies:");
        for (Bogie b : bogies) {
            System.out.println(b.name + " -> " + b.capacity);
        }

        // Step 3: Group using Stream
        Map<String, List<Bogie>> grouped =
                bogies.stream()
                        .collect(Collectors.groupingBy(b -> b.name));

        // Step 4: Print grouped result
        System.out.println("\nGrouped Bogies:\n");

        for (Map.Entry<String, List<Bogie>> entry : grouped.entrySet()) {

            System.out.println("Bogie Type: " + entry.getKey());

            for (Bogie b : entry.getValue()) {
                System.out.println("Capacity -> " + b.capacity);
            }

            System.out.println();
        }

        System.out.println("UC9 completed successfully...");
    }


    // ==============================
// UC11: Validate Train ID & Cargo Codes (Regex)
// ==============================
System.out.println("========================================");
System.out.println(" UC11 - Validate Train ID & Cargo Codes ");
System.out.println("========================================\n");

Scanner scanner = new Scanner(System.in);

// Take user input
System.out.print("Enter Train ID (Format: TRN-1234): ");
String trainId = scanner.nextLine();

System.out.print("Enter Cargo Code (Format: PET-AB): ");
String cargoCode = scanner.nextLine();

// Define regex patterns
String trainRegex = "TRN-\\d{4}";
String cargoRegex = "PET-[A-Z]{2}";

// Compile patterns
Pattern trainPattern = Pattern.compile(trainRegex);
Pattern cargoPattern = Pattern.compile(cargoRegex);

// Create matchers
Matcher trainMatcher = trainPattern.matcher(trainId);
Matcher cargoMatcher = cargoPattern.matcher(cargoCode);

// Validate
if (trainMatcher.matches()) {
    System.out.println("✅ Train ID is VALID");
} else {
    System.out.println("❌ Train ID is INVALID");
}

if (cargoMatcher.matches()) {
    System.out.println("✅ Cargo Code is VALID");
} else {
    System.out.println("❌ Cargo Code is INVALID");
}

System.out.println("\nUC11 validation completed...");
}