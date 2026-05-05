import java.util.ArrayList;
import java.util.List;

public class UseCase14TrainConsistMgmt {

    // ==============================
    // Custom Exception Class
    // ==============================
    static class InvalidCapacityException extends Exception {
        public InvalidCapacityException(String message) {
            super(message);
        }
    }

    // ==============================
    // Passenger Bogie Class
    // ==============================
    static class PassengerBogie {
        String type;
        int capacity;

        // Constructor with validation
        PassengerBogie(String type, int capacity) throws InvalidCapacityException {
            if (capacity <= 0) {
                throw new InvalidCapacityException("Capacity must be greater than zero");
            }
            this.type = type;
            this.capacity = capacity;
        }
    }

    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println("   === Train Consist Management App ===");
        System.out.println("========================================\n");

        System.out.println("========================================");
        System.out.println(" UC14 - Handle Invalid Bogie Capacity ");
        System.out.println("========================================\n");

        List<PassengerBogie> train = new ArrayList<>();

        // ==============================
        // VALID CASE
        // ==============================
        try {
            PassengerBogie sleeper = new PassengerBogie("Sleeper", 72);
            train.add(sleeper);
            System.out.println("✅ Added Bogie: " + sleeper.type + " -> " + sleeper.capacity);
        } catch (InvalidCapacityException e) {
            System.out.println("❌ Error: " + e.getMessage());
        }

        // ==============================
        // INVALID CASE (Negative)
        // ==============================
        try {
            PassengerBogie invalidBogie = new PassengerBogie("AC Chair", -10);
            train.add(invalidBogie);
        } catch (InvalidCapacityException e) {
            System.out.println("❌ Error: " + e.getMessage());
        }

        // ==============================
        // INVALID CASE (Zero)
        // ==============================
        try {
            PassengerBogie zeroBogie = new PassengerBogie("First Class", 0);
            train.add(zeroBogie);
        } catch (InvalidCapacityException e) {
            System.out.println("❌ Error: " + e.getMessage());
        }

        // ==============================
        // FINAL TRAIN STATE
        // ==============================
        System.out.println("\nFinal Valid Bogies in Train:");
        for (PassengerBogie b : train) {
            System.out.println(b.type + " -> " + b.capacity);
        }

        System.out.println("\nUC14 validation completed...");
    }
}