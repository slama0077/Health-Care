package edu.ua.team7.chocAn;

public class VerifyProvider {

    public boolean verifyProvider(Provider provider) {
        // Check that the provider is not null
        if (provider == null) {
            return false;
        }

        // Check that the provider's name is not null or empty
        if (provider.getName() == null || provider.getName().isEmpty()) {
            return false;
        }

        // Check that the provider's ID is not null or empty
        if (provider.getId() == null || provider.getId().isEmpty()) {
            return false;
        }

        // Check that the provider's license number is not null or empty
        if (provider.getLicenseNumber() == null || provider.getLicenseNumber().isEmpty()) {
            return false;
        }

        // Check that the provider's license is valid
        if (!isValidLicense(provider.getLicenseNumber())) {
            return false;
        }
        // If all checks passed, return true
        return true;
    }

    private boolean isValidLicense(String licenseNumber) {
        // Implement validation logic for the license number
        if (licenseNumber.length() != 10) {
            return false;
        }

        for (int i = 0; i < licenseNumber.length(); i++) {
            char c = licenseNumber.charAt(i);
            if (!Character.isDigit(c)) {
                return false;
            }
        }

        return true;
    }

}
