import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class TrainConsistManagementApp {

    // UC11 Methods (Reusable for testing)

    public static boolean validateTrainID(String trainId) {
        String trainPattern = "TRN-\\d{4}";
        Pattern pattern = Pattern.compile(trainPattern);
        Matcher matcher = pattern.matcher(trainId);
        return matcher.matches();
    }

    public static boolean validateCargoCode(String cargoCode) {
        String cargoPattern = "PET-[A-Z]{2}";
        Pattern pattern = Pattern.compile(cargoPattern);
        Matcher matcher = pattern.matcher(cargoCode);
        return matcher.matches();
    }

    // MAIN METHOD (Demo Run)

    public static void main(String[] args) {

        System.out.println("=== UC11: Train ID & Cargo Code Validation ===");

        String trainId = "TRN-1234";
        String cargoCode = "PET-AB";

        boolean trainValid = validateTrainID(trainId);
        boolean cargoValid = validateCargoCode(cargoCode);

        if (trainValid) {
            System.out.println("Valid Train ID: " + trainId);
        } else {
            System.out.println("Invalid Train ID: " + trainId);
        }

        if (cargoValid) {
            System.out.println("Valid Cargo Code: " + cargoCode);
        } else {
            System.out.println("Invalid Cargo Code: " + cargoCode);
        }
    }
}