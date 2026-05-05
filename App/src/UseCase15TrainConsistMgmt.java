public class UseCase15TrainConsistMgmt {

    // Custom Runtime Exception
    static class CargoSafetyException extends RuntimeException {
        public CargoSafetyException(String message) {
            super(message);
        }
    }

    // Goods Bogie Class
    static class GoodsBogie {
        String type;
        String cargo;

        GoodsBogie(String type) {
            this.type = type;
        }

        void assignCargo(String cargo) {

            try {
                System.out.println("Assigning " + cargo + " to " + type);

                // Rule: Rectangular cannot carry Petroleum
                if (type.equalsIgnoreCase("Rectangular") &&
                        cargo.equalsIgnoreCase("Petroleum")) {

                    throw new CargoSafetyException(
                            "Rectangular bogie cannot carry Petroleum"
                    );
                }

                this.cargo = cargo;
                System.out.println("✅ Cargo assigned");

            } catch (CargoSafetyException e) {

                System.out.println("❌ ERROR: " + e.getMessage());

            } finally {

                System.out.println("✔ Operation completed\n");
            }
        }
    }

    public static void main(String[] args) {

        GoodsBogie b1 = new GoodsBogie("Cylindrical");
        GoodsBogie b2 = new GoodsBogie("Rectangular");

        // Safe
        b1.assignCargo("Petroleum");

        // Unsafe (handled)
        b2.assignCargo("Petroleum");

        // Safe again
        b2.assignCargo("Coal");

        System.out.println("Program continues...");
    }
}