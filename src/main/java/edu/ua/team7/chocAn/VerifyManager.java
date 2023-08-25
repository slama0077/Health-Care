package edu.ua.team7.chocAn;

public class VerifyManager {

    public boolean verifyManager(Manager manager) {

        if (manager == null) {
            return false;
        }

        if (manager.getName() == null || manager.getName().isEmpty()) {
            return false;
        }

        if (manager.getId() == null || manager.getId().isEmpty()) {
            return false;
        }

        if (manager.getLicenseNumber() == null || manager.getLicenseNumber().isEmpty()) {
            return false;
        }

        if (!isValidLicense(manager.getLicenseNumber())) {
            return false;
        }

        return true;
    }

    private boolean isValidLicense(String licenseNumber) {
        // Checks if licenseNumber is null or empty
        if (licenseNumber == null || licenseNumber.isEmpty()) {
            return false;
        }

        // Check if licenseNumber has the right amount of digits
        if (licenseNumber.length() != 8) {
            return false;
        }

        // Check if license number has a character in it
        for (int i = 0; i < licenseNumber.length(); i++) {
            char c = licenseNumber.charAt(i);
            if (!Character.isDigit(c)) {
                return false;
            }
        }

        // Hypothetical but has to start with a certain digit to verify the license number as a manager
        // Must start with a 1 as the first digit and 2 as the second digit
        if (licenseNumber.charAt(0) != '1' || licenseNumber.charAt(1) != '2') {
            return false;
        }

        return true;
    }

}
