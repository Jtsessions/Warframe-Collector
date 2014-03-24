/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package warframecollector;

/**
 *
 * @author Joseph
 */
public class WarframeCollector {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        WarframeCollectorView view = new WarframeCollectorView();
        view.controller = new WarframeCollectorController( view );
        
        view.setVisible(true);
        
    }
    
}
