/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * RePass.java
 *
 * Created on 11 ต.ค. 2553, 20:47:53
 */

package thelastproject;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrator
 */
public class RePass extends javax.swing.JFrame {

    /** Creates new form RePass */
    public RePass() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rePass = new javax.swing.JButton();
        inputID = new javax.swing.JTextField();
        back = new javax.swing.JButton();
        pass = new javax.swing.JLabel();
        id = new javax.swing.JLabel();
        oldPass = new javax.swing.JPasswordField();
        rePaSS = new javax.swing.JLabel();
        clr = new javax.swing.JButton();
        rePaSS2 = new javax.swing.JLabel();
        inputRePass = new javax.swing.JPasswordField();
        inputRePass2 = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        rePass.setFont(new java.awt.Font("Tahoma", 1, 11));
        rePass.setText("เปลี่ยนPassword");
        rePass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rePassActionPerformed(evt);
            }
        });

        inputID.setFont(new java.awt.Font("Tahoma", 1, 11));

        back.setFont(new java.awt.Font("Tahoma", 1, 11));
        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        pass.setFont(new java.awt.Font("Tahoma", 1, 11));
        pass.setText("Password-เก่า");

        id.setFont(new java.awt.Font("Tahoma", 1, 11));
        id.setText("ID");

        oldPass.setFont(new java.awt.Font("Tahoma", 1, 11));
        oldPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oldPassActionPerformed(evt);
            }
        });

        rePaSS.setFont(new java.awt.Font("Tahoma", 1, 11));
        rePaSS.setText("Password-ใหม่");

        clr.setFont(new java.awt.Font("Tahoma", 1, 11));
        clr.setText("ล้างค่า");
        clr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clrActionPerformed(evt);
            }
        });

        rePaSS2.setFont(new java.awt.Font("Tahoma", 1, 11));
        rePaSS2.setText("Password-ใหม่อีกครั้ง");

        inputRePass.setFont(new java.awt.Font("Tahoma", 1, 11));
        inputRePass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputRePassActionPerformed(evt);
            }
        });

        inputRePass2.setFont(new java.awt.Font("Tahoma", 1, 11));
        inputRePass2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputRePass2ActionPerformed(evt);
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
                        .addComponent(rePass, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(clr, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rePaSS, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rePaSS2, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(inputRePass2)
                            .addComponent(inputRePass)
                            .addComponent(oldPass)
                            .addComponent(inputID, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE))
                        .addGap(36, 36, 36))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputID, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(oldPass, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rePaSS, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(rePaSS2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(inputRePass, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(inputRePass2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clr)
                    .addComponent(back)
                    .addComponent(rePass))
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rePassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rePassActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            Member m = Member.selectByID(inputID.getText());
            if( m.getId().equals(inputID.getText())&&m.getPass().equals(oldPass.getText())){
               if(inputRePass.getText().equals(inputRePass2.getText())){
               m.setPass(inputRePass.getText());
               m.repass();
               JOptionPane.showMessageDialog(this,"เปลี่ยนPasswordเรียบร้อย");
               this.dispose();
               new MainManu().setVisible(true);
               }
               else
                JOptionPane.showMessageDialog(this,"Passwordใหม่ไม่ตรงกันกรุณากรอกใหม่");
            }
            else if((m.getPass().equals(oldPass.getText()))==false){
               JOptionPane.showMessageDialog(this,"Password ผิด");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this,"ไม่มี ID อยู่ในระบบ!");
        }
}//GEN-LAST:event_rePassActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new MainManu().setVisible(true);
}//GEN-LAST:event_backActionPerformed

    private void oldPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oldPassActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_oldPassActionPerformed

    private void clrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clrActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new RePass().setVisible(true);
}//GEN-LAST:event_clrActionPerformed

    private void inputRePassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputRePassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputRePassActionPerformed

    private void inputRePass2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputRePass2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputRePass2ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RePass().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JButton clr;
    private javax.swing.JLabel id;
    private javax.swing.JTextField inputID;
    private javax.swing.JPasswordField inputRePass;
    private javax.swing.JPasswordField inputRePass2;
    private javax.swing.JPasswordField oldPass;
    private javax.swing.JLabel pass;
    private javax.swing.JLabel rePaSS;
    private javax.swing.JLabel rePaSS2;
    private javax.swing.JButton rePass;
    // End of variables declaration//GEN-END:variables

}