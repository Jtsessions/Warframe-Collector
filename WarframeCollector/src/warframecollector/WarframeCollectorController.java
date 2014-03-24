/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package warframecollector;

import java.util.ArrayList;

/**
 *
 * @author Joseph
 */
public class WarframeCollectorController {
    
    private WarframeCollectorView view;
    
    public WarframeCollectorController( WarframeCollectorView viewToAdd ) {
        view = viewToAdd;
        
        String[] arr = new String[50];
        ArrayList<String[]> arrayList1 = new ArrayList<String[]>();
        arrayList1.add(arr);
        view.populateWarframes( arrayList1 );
        System.out.println("Done.");
    }
    
}
