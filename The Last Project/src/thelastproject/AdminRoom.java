/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * AdminRoom.java
 *
 * Created on 13 ต.ค. 2553, 1:09:57
 */

package thelastproject;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrator
 */
public class AdminRoom extends javax.swing.JFrame {
    String ID;
    int a;
    /** Creates new form AdminRoom */
    public AdminRoom(String id, int a) {
        initComponents();
        this.ID=id;
        this.a=a;
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ShowName = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        statName = new javax.swing.JComboBox();
        ShowRoom = new javax.swing.JButton();
        Logout = new javax.swing.JButton();
        back = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        roomNumber1 = new javax.swing.JTextField();
        getName1 = new javax.swing.JTextField();
        makeAdmin = new javax.swing.JButton();
        closeRoom = new javax.swing.JButton();
        openRoom = new javax.swing.JButton();
        makeUser = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ShowName.setText("แสดงรายชื่อID");
        ShowName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowNameActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("สถานะID");

        statName.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "IDทั้งหมด", "User", "Admin" }));

        ShowRoom.setText("แสดงข้อมูลห้อง");
        ShowRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowRoomActionPerformed(evt);
            }
        });

        Logout.setFont(new java.awt.Font("Tahoma", 1, 11));
        Logout.setText("Logout");
        Logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutActionPerformed(evt);
            }
        });

        back.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel6.setText("ชื่อที่ต้องการ");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel7.setText("ห้องต้องการ");

        makeAdmin.setFont(new java.awt.Font("Tahoma", 1, 11));
        makeAdmin.setText("ตั้งเป็นAdmin");
        makeAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                makeAdminActionPerformed(evt);
            }
        });

        closeRoom.setFont(new java.awt.Font("Tahoma", 1, 11));
        closeRoom.setText("ปิดปรับปรุงห้อง");
        closeRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeRoomActionPerformed(evt);
            }
        });

        openRoom.setFont(new java.awt.Font("Tahoma", 1, 11));
        openRoom.setText("เปิดใช้งานห้อง");
        openRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openRoomActionPerformed(evt);
            }
        });

        makeUser.setFont(new java.awt.Font("Tahoma", 1, 11));
        makeUser.setText("ถอดสถานะAdmin");
        makeUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                makeUserActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ShowName, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 131, Short.MAX_VALUE)
                                .addComponent(ShowRoom, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(statName, javax.swing.GroupLayout.Alignment.TRAILING, 0, 370, Short.MAX_VALUE))
                        .addGap(80, 80, 80))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Logout, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                        .addGap(263, 263, 263)
                        .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(getName1, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                            .addComponent(roomNumber1, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(closeRoom, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                            .addComponent(makeAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(openRoom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(makeUser, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(statName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ShowName, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                    .addComponent(ShowRoom, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(getName1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(makeAdmin)
                    .addComponent(makeUser))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
                            .addComponent(roomNumber1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(closeRoom)
                        .addComponent(openRoom)))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Logout)
                    .addComponent(back))
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ShowRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowRoomActionPerformed
        try {
            // TODO add your handling code here:
            Report.report();
        } catch (Exception ex) {
            Logger.getLogger(AdminRoom.class.getName()).log(Level.SEVERE, null, ex);
        }
}//GEN-LAST:event_ShowRoomActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        this.dispose();
        try {
            new ClassRoomSection1(ID, a).setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(AdminRoom.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_backActionPerformed

    private void LogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new MainManu().setVisible(true);
    }//GEN-LAST:event_LogoutActionPerformed

    private void makeAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_makeAdminActionPerformed
        // TODO add your handling code here:
         try {
            // TODO add your handling code here:
            Member m = Member.selectByID(getName1.getText());
            if(m.getAdmin()==1){
                JOptionPane.showMessageDialog(this,getName1.getText()+"เป็นAdminอยู่แล้ว");
            }
            else{
            m.setAdmin(1);
            m.useramin();
            JOptionPane.showMessageDialog(this,getName1.getText()+"ได้ถูกตั้งให้เป็นAdminของระบบแล้ว");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this,"ไม่มี ID อยู่ในระบบ!");
        }
    }//GEN-LAST:event_makeAdminActionPerformed

    private void closeRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeRoomActionPerformed
        // TODO add your handling code here:
        int n =Integer.parseInt(roomNumber1.getText());
        try {
            fixRoom r = fixRoom.selectByRoom(n);
            if(r.getStat()==1){
                JOptionPane.showMessageDialog(this,"ห้อง "+n+" มีการปิดปรับปรุงอยู่แล้ว");
            }
            else{
            r.setStat(1);
            r.close();
            JOptionPane.showMessageDialog(this,"ได้ทำการปิดปรับปรุงห้อง "+n+" เรียบร้อยแล้ว");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this,"ไม่มีห้องนี้อยู่!");
        }
    }//GEN-LAST:event_closeRoomActionPerformed

    private void openRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openRoomActionPerformed
        // TODO add your handling code here:
        int n =Integer.parseInt(roomNumber1.getText());
        try {
            fixRoom r = fixRoom.selectByRoom(n);
            if(r.getStat()==0){
                JOptionPane.showMessageDialog(this,"ห้อง "+n+" เปิดใช้งานอยู่แล้ว");
            }
            else{
            r.setStat(0);
            r.close();
            JOptionPane.showMessageDialog(this,"ได้ทำการเปิดใช้งาน "+n+" เรียบร้อยแล้ว");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this,"ไม่มีห้องนี้อยู่!");
        }
    }//GEN-LAST:event_openRoomActionPerformed

    private void makeUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_makeUserActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            Member m = Member.selectByID(getName1.getText());
            if(m.getAdmin()==0){
                JOptionPane.showMessageDialog(this,getName1.getText()+"ไม่ได้เป็นAdminอยู่แล้ว");
            }
            else{
            m.setAdmin(0);
            m.useramin();
            JOptionPane.showMessageDialog(this,getName1.getText()+"ได้ถูกถอดจากการเป็นAdminของระบบแล้ว");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this,"ไม่มี ID อยู่ในระบบ!");
        }
    }//GEN-LAST:event_makeUserActionPerformed

    private void ShowNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowNameActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_ShowNameActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminRoom().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Logout;
    private javax.swing.JButton ShowName;
    private javax.swing.JButton ShowRoom;
    private javax.swing.JButton back;
    private javax.swing.JButton closeRoom;
    private javax.swing.JTextField getName1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JButton makeAdmin;
    private javax.swing.JButton makeUser;
    private javax.swing.JButton openRoom;
    private javax.swing.JTextField roomNumber1;
    private javax.swing.JComboBox statName;
    // End of variables declaration//GEN-END:variables

}
