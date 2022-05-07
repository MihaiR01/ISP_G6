package aut.utcluj.isp.ex4;

import org.junit.Test;

import java.time.LocalDateTime;

import static org.junit.Assert.*;

/**
 * @author stefan
 */
public class EquipmentTestEX4 {
    @Test
    public void testProvideEquipmentToUser() {
        final Equipment equipment = new Equipment("Dell", "SN123");
        equipment.provideEquipmentToUser("John", LocalDateTime.now());
        assertEquals("Owner is 'John'", "John", equipment.getCurrentOwner());
        assertTrue("Equipment is taken", equipment.isTaken());
    }

    @Test(expected = EquipmentAlreadyProvidedException.class)
    public void testProvideEquipmentToUserThrowsExceptionWhenEquipmentIsAlreadyProvided() {
        final Equipment equipment = new Equipment("Dell", "SN123");
        equipment.provideEquipmentToUser("John", LocalDateTime.now());
        assertEquals("Owner is 'John'", "John", equipment.getCurrentOwner());
        assertTrue("Equipment is taken", equipment.isTaken());

        // provide equipment second time
        equipment.provideEquipmentToUser("John", LocalDateTime.now());
    }

    @Test
    public void testReturnEquipmentToOffice() {
        final Equipment eq = new Equipment("Dell", "SN123");

        // provide equipment to user
        eq.provideEquipmentToUser("John", LocalDateTime.now());
        assertEquals("Owner is 'John'", "John", eq.getCurrentOwner());
        assertTrue("Equipment is taken", eq.isTaken());

        // return equipment to the office
        eq.returnEquipmentToOffice();
        assertNull("Current owner should be null", eq.getCurrentOwner());
        assertFalse("Equipment is not taken anymore", eq.isTaken());
    }

    @Test(expected = EquipmentNotProvidedException.class)
    public void testReturnEquipmentToOfficeThrowsExceptionWhenEquipmentNotProvided() {
        final Equipment equipment = new Equipment("Dell", "SN123");

        // return equipment to the office
        equipment.returnEquipmentToOffice();
    }
}