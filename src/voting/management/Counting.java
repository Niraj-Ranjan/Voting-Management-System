/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package voting.management;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Niraj
 */
public class Counting extends javax.swing.JFrame {

    /**
     * Creates new form result
     */
    public Counting() {
        initComponents();
        showuser3();
        showuser4();
    }

   public ArrayList<User2> userlist2()
    {
        ArrayList<User2> userlist2=new ArrayList<>();
        try{
            
            Connection  con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/VOTING MANAGEMENT SYSTEM", 
                    "postgres", "dbms");
            String sql="select * from partylist1";
            Statement ps= con.createStatement();
             
            ResultSet rs=ps.executeQuery(sql);
            User2 user2;
            while(rs.next())
            {
            user2=new User2(rs.getString("name"),rs.getString("party_leader"),rs.getString("sex"),rs.getString("age"),rs.getString("partyheadquater"),rs.getString("partysign"));
           userlist2.add(user2);
            }
            
        }catch (SQLException ex) {
            Logger.getLogger(Addvoter.class.getName()).log(Level.SEVERE, null, ex);}
        return userlist2;
    }
    
     public void showuser3()
    {
        ArrayList<User2> list= userlist2();
        DefaultTableModel model=(DefaultTableModel) jcounting.getModel();
        
        Object[] row=new Object[10];
        for (int i = 0; i< list.size(); i++) {
            row[0]=list.get(i).getname();
            row[1]=list.get(i).getparty_leader();
            row[2]=list.get(i).getsex();
            row[3]=list.get(i).getage();
            row[4]=list.get(i).getpartyheadquater();
            row[5]=list.get(i).getpartysign();
            row[6]=list.get(i).getage();
            model.addRow(row);
        }
    } 
     
     
     public ArrayList<User4> userlist4()
    {
        ArrayList<User4> userlist4=new ArrayList<>();
        try{
            
            Connection  con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/VOTING MANAGEMENT SYSTEM", 
                    "postgres", "dbms");
            String sql="select partyname,count from result5";
            Statement ps= con.createStatement();
             
            ResultSet rs=ps.executeQuery(sql);
            User4 user4;
            while(rs.next())
            {
                user4=new User4(rs.getString("partyname"),rs.getInt("count"));
           userlist4.add(user4);
            }
            
        }catch (SQLException ex) {
            Logger.getLogger(Addvoter.class.getName()).log(Level.SEVERE, null, ex);}
        return userlist4;
    }
     
     
     public void showuser4()
    {
        ArrayList<User4> list= userlist4();
        DefaultTableModel mode2=(DefaultTableModel) jcounttable.getModel();
        
        Object[] row1=new Object[10];
        for (int i = 0; i< list.size(); i++) {
              row1[0]=list.get(i).getpartyname();
              row1[1]=list.get(i).getcount();
                     

            
            
            mode2.addRow(row1);
        }
    } 
     
     
     
     
     
     
     
     
     
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jcounting = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jcounttable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jcounting.setAutoCreateRowSorter(true);
        jcounting.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Party Name", "Party Leader", "Sex", "Party Headquater", "Party Sign"
            }
        ));
        jScrollPane1.setViewportView(jcounting);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 640, 239));

        jcounttable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Party Name1", "Count"
            }
        ));
        jScrollPane2.setViewportView(jcounttable);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 300, 150, 150));

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel1.setText("Counting");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, -1, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/voting/management/back.png"))); // NOI18N
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 722, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
Home h=new Home();
h.setVisible(true);
dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Counting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Counting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Counting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Counting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Counting().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jcounting;
    private javax.swing.JTable jcounttable;
    // End of variables declaration//GEN-END:variables
}
