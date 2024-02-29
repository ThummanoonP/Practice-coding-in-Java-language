/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Lab04.java
 *
 * Created on Jul 5, 2010, 12:33:07 PM
 */

package lab04;

import javax.swing.JOptionPane;

/**
 *
 * @author CS-KU
 */
public class Lab04 extends javax.swing.JFrame {

    /** Creates new form Lab04 */
    int x;
    public Lab04() {
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

        addTextFieldToList = new java.awt.Button();
        deleteSelectedItemInTheList = new java.awt.Button();
        showSelectedItemUsingMaessagaDialog = new java.awt.Button();
        getItem = new java.awt.TextField();
        listItem = new java.awt.List();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        addTextFieldToList.setLabel("Add Text Field To List");
        addTextFieldToList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addTextFieldToListActionPerformed(evt);
            }
        });

        deleteSelectedItemInTheList.setLabel("Delete Selected Item in the List");
        deleteSelectedItemInTheList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteSelectedItemInTheListActionPerformed(evt);
            }
        });

        showSelectedItemUsingMaessagaDialog.setLabel("Show Selected Item using Maessaga Dialog");
        showSelectedItemUsingMaessagaDialog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showSelectedItemUsingMaessagaDialogActionPerformed(evt);
            }
        });

        getItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getItemActionPerformed(evt);
            }
        });

        listItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listItemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(listItem, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 391, Short.MAX_VALUE)
                    .addComponent(showSelectedItemUsingMaessagaDialog, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteSelectedItemInTheList, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(getItem, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(addTextFieldToList, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(listItem, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(getItem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addTextFieldToList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deleteSelectedItemInTheList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(showSelectedItemUsingMaessagaDialog, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addTextFieldToListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addTextFieldToListActionPerformed
    listItem.add(getItem.getText());    
}//GEN-LAST:event_addTextFieldToListActionPerformed

    private void getItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getItemActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_getItemActionPerformed

    private void showSelectedItemUsingMaessagaDialogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showSelectedItemUsingMaessagaDialogActionPerformed
        if(listItem.getSelectedIndex()>=0)
                JOptionPane.showMessageDialog(this,listItem.getSelectedItem());
       else
            JOptionPane.showMessageDialog(this,"No Selected Index");
}//GEN-LAST:event_showSelectedItemUsingMaessagaDialogActionPerformed

    private void deleteSelectedItemInTheListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteSelectedItemInTheListActionPerformed
        if(listItem.getSelectedIndex()>=0)
            listItem.remove(listItem.getSelectedIndex());
        else
            JOptionPane.showMessageDialog(this,"No Data");
    }//GEN-LAST:event_deleteSelectedItemInTheListActionPerformed

    private void listItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_listItemActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Lab04().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button addTextFieldToList;
    private java.awt.Button deleteSelectedItemInTheList;
    private java.awt.TextField getItem;
    private java.awt.List listItem;
    private java.awt.Button showSelectedItemUsingMaessagaDialog;
    // End of variables declaration//GEN-END:variables

}
