package view;

import java.awt.event.ActionListener;
import javax.swing.JButton;

public class MainMenu2 extends javax.swing.JPanel {
    public MainMenu2() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LocationLabel = new javax.swing.JLabel();
        judulLabel = new javax.swing.JLabel();
        CreateTAButton = new javax.swing.JButton();
        SetPembimbingButton = new javax.swing.JButton();
        GetPembimbingButton = new javax.swing.JButton();

        LocationLabel.setText("Main Menu | Mahasiswa");

        judulLabel.setText("Sisfo Pengolahan Data TA");

        CreateTAButton.setText("Create TA");
        CreateTAButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateTAButtonActionPerformed(evt);
            }
        });

        SetPembimbingButton.setText("Set Pembimbing");

        GetPembimbingButton.setText("Get Pembimbing");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(judulLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 143, Short.MAX_VALUE)
                .addComponent(LocationLabel)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(GetPembimbingButton)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(CreateTAButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(SetPembimbingButton, javax.swing.GroupLayout.Alignment.LEADING)))
                .addGap(140, 140, 140))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LocationLabel)
                    .addComponent(judulLabel))
                .addGap(40, 40, 40)
                .addComponent(CreateTAButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SetPembimbingButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(GetPembimbingButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    private void CreateTAButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateTAButtonActionPerformed
    }//GEN-LAST:event_CreateTAButtonActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CreateTAButton;
    private javax.swing.JButton GetPembimbingButton;
    private javax.swing.JLabel LocationLabel;
    private javax.swing.JButton SetPembimbingButton;
    private javax.swing.JLabel judulLabel;
    // End of variables declaration//GEN-END:variables
    public void addListener(ActionListener e) {
        CreateTAButton.addActionListener(e);
        SetPembimbingButton.addActionListener(e);
        GetPembimbingButton.addActionListener(e);
    }
    public JButton getCreateTAButton() {
        return CreateTAButton;
    }
    public JButton getGetPembimbingButton() {
        return GetPembimbingButton;
    }
    public JButton getSetPembimbingButton() {
        return SetPembimbingButton;
    }
}
