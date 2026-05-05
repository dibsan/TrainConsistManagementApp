import java.util.Arrays;

public class UseCase17TrainConsistMgmt {

    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println(" UC17 - Sort Bogie Names (Arrays.sort) ");
        System.out.println("========================================\n");

        // Step 1: Create array of bogie names
        String[] bogieNames = {
                "Sleeper",
                "AC Chair",
                "First Class",
                "General",
                "Luxury"
        };

        // Step 2: Print before sorting
        System.out.println("Before Sorting:");
        System.out.println(Arrays.toString(bogieNames));

        // Step 3: Sort using built-in method
        Arrays.sort(bogieNames);

        // Step 4: Print after sorting
        System.out.println("\nAfter Sorting:");
        System.out.println(Arrays.toString(bogieNames));

        System.out.println("\nUC17 completed...");
    }
}