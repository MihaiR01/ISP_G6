package aut.utcluj.isp.ex5;

import aut.utcluj.isp.ex4.EquipmentHistoryDetails;
import aut.utcluj.isp.ex4.Operation;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author stefan
 */
public class EquipmentHistory implements IEquipmentHistory, Comparator<EquipmentHistoryDetails> {
    private List<EquipmentHistoryDetails> historyDetailsList = new ArrayList<>();

    public void addEquipmentHistory(final String owner, final Operation operation, final LocalDateTime providedDate) {
        historyDetailsList.add(new EquipmentHistoryDetails(owner,operation,providedDate));
    }

    public List<EquipmentHistoryDetails> filterEquipmentHistoryByOperation(final Operation operation) {
        List<EquipmentHistoryDetails> returnedList = new ArrayList<>();
        for(EquipmentHistoryDetails eq : historyDetailsList){
            if(eq.getOperation().equals(operation))
            {
                returnedList.add(eq);
            }
        }
        return returnedList;
    }

    public List<EquipmentHistoryDetails> sortEquipmentHistoryByDateDesc() {
        Collections.sort(historyDetailsList, new Comparator<EquipmentHistoryDetails>() {
            @Override
            public int compare(EquipmentHistoryDetails o1, EquipmentHistoryDetails o2) {
                return o2.getDate().compareTo(o1.getDate());
            }
        });
        return historyDetailsList;
    }

    public List<EquipmentHistoryDetails> getHistoryDetailsList() {
        return historyDetailsList;
    }

    @Override
    public int compare(EquipmentHistoryDetails o1, EquipmentHistoryDetails o2) {
        return o1.getDate().compareTo(o2.getDate());
    }
}
