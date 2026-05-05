import java.util.ArrayList;
import java.util.List;

public class UseCase12TrainConsistMgmt {

    // Goods Bogie Class
    static class GoodsBogie {
        String type;
        String cargo;

        GoodsBogie(String type, String cargo) {
            this.type = type;
            this.cargo = cargo;
        }
    }

    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println("   === Train Consist Management App ===");
        System.out.println("========================================\n");

        System.out.println("========================================");
        System.out.println(" UC12 - Safety Compliance Check ");
        System.out.println("========================================\n");

        // Create list of goods bogies
        List<GoodsBogie> goodsList = new ArrayList<>();

        goodsList.add(new GoodsBogie("Cylindrical", "Petroleum"));
        goodsList.add(new GoodsBogie("Rectangular", "Coal"));
        goodsList.add(new GoodsBogie("Cylindrical", "Petroleum"));
        goodsList.add(new GoodsBogie("Rectangular", "Grain"));

        // Display bogies
        System.out.println("Goods Bogies:");
        for (GoodsBogie g : goodsList) {
            System.out.println(g.type + " -> " + g.cargo);
        }

        // Safety validation using Stream API
        boolean isSafe = goodsList.stream()
                .allMatch(b ->
                        !b.type.equalsIgnoreCase("Cylindrical")
                                || b.cargo.equalsIgnoreCase("Petroleum")
                );

        // Result
        System.out.println("\nSafety Check Result:");

        if (isSafe) {
            System.out.println("✅ Train is SAFETY COMPLIANT");
        } else {
            System.out.println("❌ Train is NOT SAFE (Violation detected)");
        }

        System.out.println("\nUC12 validation completed...");
    }
}