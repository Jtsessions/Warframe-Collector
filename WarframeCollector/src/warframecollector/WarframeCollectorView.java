/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package warframecollector;

import java.util.ArrayList;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Joseph
 */
public class WarframeCollectorView extends javax.swing.JFrame {

    public WarframeCollectorController controller;
    
    /**
     * Creates new form WarframeCollectorView
     */
    public WarframeCollectorView() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        itemTabbedPane = new javax.swing.JTabbedPane();
        warframeScrollPane = new javax.swing.JScrollPane();
        warframeTable = new javax.swing.JTable();
        primaryScrollPane = new javax.swing.JScrollPane();
        primaryTable = new javax.swing.JTable();
        secondaryScrollPane = new javax.swing.JScrollPane();
        secondaryTable = new javax.swing.JTable();
        meleeScrollPane = new javax.swing.JScrollPane();
        meleeTable = new javax.swing.JTable();
        sentinelScrollPane = new javax.swing.JScrollPane();
        sentinelTable = new javax.swing.JTable();
        sentinelWeaponScrollPane = new javax.swing.JScrollPane();
        sentinelWeaponTable = new javax.swing.JTable();
        cosmeticScrollPane = new javax.swing.JScrollPane();
        cosmeticTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Warframe Collector");

        warframeTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Name", "Owned", "Rank", "Reactor", "Forma"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Boolean.class, java.lang.Integer.class, java.lang.Boolean.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        warframeScrollPane.setViewportView(warframeTable);

        itemTabbedPane.addTab("Warframe", warframeScrollPane);

        primaryTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Name", "Owned", "Rank", "Catalyst", "Forma"
            }
        ));
        primaryScrollPane.setViewportView(primaryTable);

        itemTabbedPane.addTab("Primary", primaryScrollPane);

        secondaryTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Name", "Owned", "Rank", "Catalyst", "Forma"
            }
        ));
        secondaryScrollPane.setViewportView(secondaryTable);

        itemTabbedPane.addTab("Secondary", secondaryScrollPane);

        meleeTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Name", "Owned", "Rank", "Catalyst", "Forma"
            }
        ));
        meleeScrollPane.setViewportView(meleeTable);

        itemTabbedPane.addTab("Melee", meleeScrollPane);

        sentinelTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Name", "Owned", "Rank", "Reactor", "Forma"
            }
        ));
        sentinelScrollPane.setViewportView(sentinelTable);

        itemTabbedPane.addTab("Sentinel", sentinelScrollPane);

        sentinelWeaponTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Name", "Owned", "Rank", "Catalyst", "Forma"
            }
        ));
        sentinelWeaponScrollPane.setViewportView(sentinelWeaponTable);

        itemTabbedPane.addTab("Sentinel Weapon", sentinelWeaponScrollPane);

        cosmeticTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Name", "Owned"
            }
        ));
        cosmeticScrollPane.setViewportView(cosmeticTable);

        itemTabbedPane.addTab("Cosmetic", cosmeticScrollPane);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addComponent(itemTabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 717, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(itemTabbedPane, javax.swing.GroupLayout.DEFAULT_SIZE, 406, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void populateWarframes( ArrayList<String[]> warframes ) {
        
        System.out.println("Populating...");
        System.out.println(warframes.size());
        for (int i = 0; i < warframes.size(); i++ ) {
            DefaultTableModel y =(DefaultTableModel)warframeTable.getModel(); 
                Vector rowData = new Vector(); 
                rowData.add("Rhino"); 
                rowData.add(true); 
                rowData.add(30);
                rowData.add(false);
                rowData.add(3);

                y.addRow(rowData); 
                System.out.println("Done!");
        }
        
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(WarframeCollectorView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WarframeCollectorView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WarframeCollectorView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WarframeCollectorView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WarframeCollectorView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane cosmeticScrollPane;
    private javax.swing.JTable cosmeticTable;
    private javax.swing.JTabbedPane itemTabbedPane;
    private javax.swing.JScrollPane meleeScrollPane;
    private javax.swing.JTable meleeTable;
    private javax.swing.JScrollPane primaryScrollPane;
    private javax.swing.JTable primaryTable;
    private javax.swing.JScrollPane secondaryScrollPane;
    private javax.swing.JTable secondaryTable;
    private javax.swing.JScrollPane sentinelScrollPane;
    private javax.swing.JTable sentinelTable;
    private javax.swing.JScrollPane sentinelWeaponScrollPane;
    private javax.swing.JTable sentinelWeaponTable;
    private javax.swing.JScrollPane warframeScrollPane;
    private javax.swing.JTable warframeTable;
    // End of variables declaration//GEN-END:variables
}