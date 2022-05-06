package aut.utcluj.isp.ex4;

/**
 * @author stefan
 */
public class EquipmentAlreadyProvidedException extends RuntimeException {
    public EquipmentAlreadyProvidedException(){
        System.out.println("Equipment already provided.");
    }
}
