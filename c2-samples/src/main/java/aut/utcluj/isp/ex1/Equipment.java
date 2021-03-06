package aut.utcluj.isp.ex1;

import java.util.Objects;

/**
 * @author stefan
 */
public class Equipment {
    private String name;
    private String serialNumber;

    public Equipment(String serialNumber) {
        this.name = "NONE";
        this.serialNumber = serialNumber;
    }

    public Equipment(String name, String serialNumber) {
        this.name = name;
        this.serialNumber = serialNumber;
    }

    public String getName() {
        return name;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    @Override
    public String toString() {
        return name + "_" + serialNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Equipment equipment = (Equipment) o;
        return Objects.equals(name, equipment.name) && Objects.equals(serialNumber, equipment.serialNumber);
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 71 * hash + Objects.hashCode(this.name);
        hash = 71 * hash + Objects.hashCode(this.serialNumber);
        return hash;
    }
}
