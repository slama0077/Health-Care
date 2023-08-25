// Avery Fernandez

package edu.ua.team7.chocAn;

public class Manager {
    private String name;
    private String id;
    private String licenseNumber;

    public Manager(String name, String id, String licenseNumber) {
        this.name = name;
        this.id = id;
        this.licenseNumber = licenseNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }
}
