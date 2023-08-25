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
  
        // Check that the license number is not null or empty
        if (licenseNumber == null || licenseNumber.isEmpty()) {
          return false;
        }
        
        // Check that the license number is in the correct format
        // Example format: AA123456 (two letters followed by six digits)
        Pattern pattern = Pattern.compile("[A-Z]{2}\\d{6}");
        Matcher matcher = pattern.matcher(licenseNumber);
        if (!matcher.matches()) {
          return false;
        }
        
        // Check that the license number matches the provider's state
        String providerState = provider.getState();
        String licenseState = licenseNumber.substring(0, 2);
        if (!providerState.equals(licenseState)) {
          return false;
        }
        
        // If all checks passed, return true
        return true;
      }
    }
  
  }