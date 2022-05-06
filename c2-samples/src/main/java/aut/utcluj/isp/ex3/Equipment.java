package aut.utcluj.isp.ex3;

/**
 * @author stefan
 */
public class Equipment {
    private String name;
    private String serialNumber;
    private String owner;
    private boolean taken;

    public Equipment(String serialNumber) {
<<<<<<< HEAD
        this.serialNumber = serialNumber;
=======
        this.name = "NONE";
        this.serialNumber = serialNumber;
        this.owner = "NONE";
>>>>>>> e289c99fb472e24ebf998e088146089c5fe5b498
        this.taken = false;
    }

    public Equipment(String name, String serialNumber) {
        this.name = name;
        this.serialNumber = serialNumber;
<<<<<<< HEAD
=======
        this.owner = "NONE";
>>>>>>> e289c99fb472e24ebf998e088146089c5fe5b498
        this.taken = false;
    }

    public Equipment(String name, String serialNumber, String owner) {
        this.name = name;
        this.serialNumber = serialNumber;
        this.owner = owner;
        this.taken = true;
    }

    public String getName() {
        return name;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public String getOwner() {
        return owner;
    }

    public boolean isTaken() {
        return taken;
    }

    /**
     * Provide the owner of the equipment
     * Equipment should be set as taken
     *
     * @param owner - owner name
     */
    public void provideEquipmentToUser(final String owner) {
        this.owner = owner;
        this.taken = true;
    }

    /**
     * Equipment is returned to the office
     * Equipment should not be set as taken
     * Remove the owner
     */
    public void returnEquipmentToOffice() {
<<<<<<< HEAD
        this.taken = false;
        this.owner = null;
=======
        this.owner = "NONE";
        this.taken = false;
>>>>>>> e289c99fb472e24ebf998e088146089c5fe5b498
    }
}
