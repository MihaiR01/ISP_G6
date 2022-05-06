package aut.utcluj.isp.ex4;

import aut.utcluj.isp.ex5.EquipmentHistory;

import java.time.LocalDateTime;

/**
 * @author stefan
 */
public class Equipment {
    private String name;
    private String serialNumber;
    private String currentOwner;
    private boolean taken;
    private EquipmentHistory equipmentHistory;

    public Equipment(String serialNumber) {
<<<<<<< HEAD
        this.serialNumber = serialNumber;
        this.taken = false;
        this.currentOwner = null;
=======
        this.name = "NONE";
        this.serialNumber = serialNumber;
        this.currentOwner = "NONE";
        this.taken = false;
>>>>>>> e289c99fb472e24ebf998e088146089c5fe5b498
    }

    public Equipment(String name, String serialNumber) {
        this.name = name;
        this.serialNumber = serialNumber;
<<<<<<< HEAD
        this.taken = false;
        this.currentOwner = null;
=======
        this.currentOwner = "NONE";
        this.taken = false;
>>>>>>> e289c99fb472e24ebf998e088146089c5fe5b498
    }

    public Equipment(String name, String serialNumber, String owner) {
        this.name = name;
        this.serialNumber = serialNumber;
<<<<<<< HEAD
        this.taken = true;
        this.currentOwner = owner;
=======
        this.currentOwner = owner;
        this.taken = true;
>>>>>>> e289c99fb472e24ebf998e088146089c5fe5b498
    }

    public String getName() {
        return name;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public String getCurrentOwner() {
        return currentOwner;
    }

    public boolean isTaken() {
        return taken;
    }

    /**
     * Provide equipment to a specific user starting with @param providedDate
     * If equipment is already taken, throw {@link EquipmentAlreadyProvidedException}
     * If equipment is not taken, update taken status, the current user and update also equipment history
     *
     * @param owner        - new owner of the equipment
     * @param providedDate - provided date
     */
    public void provideEquipmentToUser(final String owner, final LocalDateTime providedDate) {
        if (taken) {
            throw new EquipmentAlreadyProvidedException();
        } else {
            this.currentOwner = owner;
            this.taken = true;
            //equipmentHistory.addEquipmentHistory(this.getCurrentOwner(),Operation.PROVIDE,providedDate);
        }
    }

    /**
     * If equipment is not taken by anybody, throw {@link EquipmentNotProvidedException}
     * If equipment is taken, the current user of the equipment should be removed, and taken status should be set to false
     */
    public void returnEquipmentToOffice() {
        if(!taken){
            throw new EquipmentNotProvidedException();
        }
        else
        {
            this.taken = false;
            this.currentOwner = null;
        }
    }
}
