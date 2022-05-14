package aut.utcluj.isp.ex3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author stefan
 */
public class EquipmentController {
    List<Equipment> equipmentList = new ArrayList<>();
    /**
     * Add new equipment to the list of equipments
     *
     * @param equipment - equipment to be added
     */
    public void addEquipment(final Equipment equipment) {
        equipmentList.add(equipment);
    }

    /**
     * Get current list of equipments
     *
     * @return list of equipments
     */
    public List<Equipment> getEquipments() {
        return equipmentList;
    }

    /**
     * Get number of equipments
     *
     * @return number of equipments
     */
    public int getNumberOfEquipments() {
        return equipmentList.size();
    }

    /**
     * Group equipments by owner
     *
     * @return a dictionary where the key is the owner and value is represented by list of equipments he owns
     */
    public Map<String, List<Equipment>> getEquipmentsGroupedByOwner() {
        Map<String, List<Equipment>> map = new HashMap<String, List<Equipment>>();
        for(Equipment eq : equipmentList) {
            if(!map.containsKey(eq.getOwner())){
                map.put(eq.getOwner(),new ArrayList<Equipment>());
            }
            map.get(eq.getOwner()).add(eq);
        }
        return map;
    }

    /**
     * Remove a particular equipment from equipments list by serial number
     * @param serialNumber - unique serial number
     * @return deleted equipment instance or null if not found
     */
    public Equipment removeEquipmentBySerialNumber(final String serialNumber) {
        Equipment removedEq = null;
        for (int i = equipmentList.size()-1; i >=0; i--){
            if(equipmentList.get(i).getSerialNumber().equals(serialNumber))
            {
                removedEq = equipmentList.get(i);
                equipmentList.remove(i);
            }
        }
        return removedEq;
    }
}
