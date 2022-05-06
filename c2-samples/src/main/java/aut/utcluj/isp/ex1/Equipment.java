package aut.utcluj.isp.ex1;

import java.util.Objects;

/**
 * @author stefan
 */
public class Equipment  {
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
<<<<<<< HEAD
        return name + "_" + serialNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Equipment equipment = (Equipment) o;
        return Objects.equals(name, equipment.name) && Objects.equals(serialNumber, equipment.serialNumber);
=======
        return  name + "_" + serialNumber ;
>>>>>>> e289c99fb472e24ebf998e088146089c5fe5b498
    }

    @Override
    public int hashCode() {
<<<<<<< HEAD
        return Objects.hash(name, serialNumber);
    }
=======
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Equipment other = (Equipment) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return Objects.equals(this.serialNumber, other.serialNumber);
    }
    
    
    
>>>>>>> e289c99fb472e24ebf998e088146089c5fe5b498
}
