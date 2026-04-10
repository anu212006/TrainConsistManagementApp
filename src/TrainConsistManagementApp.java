import java.util.*;

// Custom Runtime Exception
class CargoSafetyException extends RuntimeException {

    public CargoSafetyException(String message) {
        super(message);
    }
}

// Goods Bogie Class
class GoodsBogie {

    String shape;
    String cargo;

    public GoodsBogie(String shape) {
        this.shape = shape;
    }

    public void assignCargo(String cargo) {

        try {

            // Rule: Rectangular cannot carry Petroleum
            if (shape.equalsIgnoreCase("Rectangular")
                    && cargo.equalsIgnoreCase("Petroleum")) {

                throw new CargoSafetyException(
                        "Petroleum cannot be assigned to Rectangular bogie"
                );
            }

            // Safe assignment
            this.cargo = cargo;

            System.out.println(
                    "Cargo assigned successfully: "
                            + cargo + " to " + shape
            );

        }
        catch (CargoSafetyException e) {

            System.out.println(
                    "Error: " + e.getMessage()
            );

        }
        finally {

            System.out.println(
                    "Cargo assignment attempt completed."
            );
        }
    }

    public String getCargo() {
        return cargo;
    }
}

// Main Class
public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=== UC15 Execution ===");

        // Safe case
        GoodsBogie bogie1 =
                new GoodsBogie("Cylindrical");

        bogie1.assignCargo("Petroleum");

        // Unsafe case
        GoodsBogie bogie2 =
                new GoodsBogie("Rectangular");

        bogie2.assignCargo("Petroleum");

        // Another safe case
        GoodsBogie bogie3 =
                new GoodsBogie("Rectangular");

        bogie3.assignCargo("Coal");

        System.out.println(
                "Program continues safely."
        );
    }
}