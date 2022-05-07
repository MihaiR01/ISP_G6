package aut.utcluj.isp.ex5;

import aut.utcluj.isp.ex4.EquipmentHistoryDetails;
import aut.utcluj.isp.ex4.Operation;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author stefan
 */
public class EquipmentHistory implements IEquipmentHistory{
    private List<EquipmentHistoryDetails> historyDetailsList;

    public void addEquipmentHistory(final String owner, final Operation operation, final LocalDateTime providedDate) {
        
        if(historyDetailsList == null)
        {
            historyDetailsList = new ArrayList<EquipmentHistoryDetails>();
        }
        
        EquipmentHistoryDetails ehd = new EquipmentHistoryDetails(owner,operation, providedDate);
        historyDetailsList.add(ehd);
    }

    public List<EquipmentHistoryDetails> filterEquipmentHistoryByOperation(final Operation operation) {
        List<EquipmentHistoryDetails> filteredList = new ArrayList<EquipmentHistoryDetails>();
        for( EquipmentHistoryDetails ehs : historyDetailsList )
        {
            if(ehs.getOperation().equals(operation))
                filteredList.add(ehs);
        }
        
        return filteredList;
    }

    public List<EquipmentHistoryDetails> sortEquipmentHistoryByDateDesc() {
        List<EquipmentHistoryDetails> sortedList = new ArrayList<EquipmentHistoryDetails>(historyDetailsList);
        
        int ok=0;
        while(ok==0)
        {
            ok=1;    
            for(int i =1; i< sortedList.size(); i++)
            {
                if( sortedList.get(i).getDate().isAfter(  sortedList.get(i-1).getDate()     ) )
                {
                    ok=0;
                    Collections.swap(sortedList,i-1,i);         
                }
            } 
        }
       
        return sortedList;
    }

    public List<EquipmentHistoryDetails> getHistoryDetailsList() {
        return historyDetailsList;
    }
}