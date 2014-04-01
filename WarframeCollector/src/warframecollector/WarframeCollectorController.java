/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package warframecollector;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.sql.*;
import warframecollector.Resources.Items;


/**
 *
 * @author Joseph
 */
public class WarframeCollectorController {
    
    private WarframeCollectorView view;
    
    public WarframeCollectorController( WarframeCollectorView viewToAdd ) throws Exception {
        
        if ( !saveFileExists() ) {
            createSaveFile();
            initializeSaveFile();
        }
        
        view = viewToAdd;
        
        String[] arr = new String[50];
        ArrayList<String[]> arrayList1 = new ArrayList<String[]>();
        arrayList1.add(arr);
        view.populateWarframes( arrayList1 );
        
        view.initializeTableListeners();
    }
    
    private Boolean saveFileExists() {
        Path file = Paths.get("data.wcf");
        
        return Files.exists(file);
    }
    
    private void createSaveFile() {
        Path file = Paths.get("data.wcf");
        
        try {
            Files.createFile(file);
        } catch ( IOException e ) {
            System.err.format("createFile error: %s%n", e);
        }
        
    }
    
    private void initializeSaveFile() throws Exception {
        initializeWarframes();
/*
        initializePrimaries();
        initializeSecondaries();
        initializeMelees();
        initializeSentinels();
        initializeSentinelWeapons();
        initializeCosmetics();
*/
    }
    
    private void initializeWarframes() throws Exception {
        Connection c = null;
        Class.forName("org.sqlite.JDBC");
        c = DriverManager.getConnection("jdbc:sqlite:data.wdb");
        Statement statement = c.createStatement();
        statement.execute("create table Warframes("
                + "name varchar(30),"
                + "owned INT,"
                + "rank varchar(10),"
                + "reactor INT,"
                + "forma varchar(10))");
            
        
        String[] warframes = Items.warframes;
        
        for ( int i = 0; i < warframes.length; i++ ) {
            PreparedStatement prep = c.prepareStatement("insert into Warframes values(?,0,'Unranked',0,'None');");
            prep.setString(1, warframes[i]);
            prep.execute();
        }
        
        ResultSet result = statement.executeQuery("select * from Warframes");
        while (result.next()) {
            System.out.println(result.getString("name") + " " + result.getInt("owned"));
        }
    }
    
}
