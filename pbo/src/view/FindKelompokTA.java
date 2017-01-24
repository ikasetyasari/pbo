package view;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTextField;

public class FindKelompokTA extends javax.swing.JPanel {
    public FindKelompokTA() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        judulLabel = new javax.swing.JLabel();
        LocationLabel = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        findButton = new javax.swing.JButton();
        nomorTopikTALabel = new javax.swing.JLabel();
        nomorTopikTATextField = new javax.swing.JTextField();
        DataKelompokTALabel = new javax.swing.JLabel();
        isiScrollPane = new javax.swing.JScrollPane();
        isiList = new javax.swing.JList<>();
        DataKelompokTALabel1 = new javax.swing.JLabel();
        hasilScrollPane2 = new javax.swing.JScrollPane();
        hasilList = new javax.swing.JList<>();
        jSeparator1 = new javax.swing.JSeparator();

        setPreferredSize(new java.awt.Dimension(400, 115));

        judulLabel.setText("Sisfo Pengolahan Data TA");

        LocationLabel.setText("Find Kelompok TA| Dosen");

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        findButton.setText("Find");

        nomorTopikTALabel.setText("Nomor Topik TA");

        nomorTopikTATextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomorTopikTATextFieldActionPerformed(evt);
            }
        });

        DataKelompokTALabel.setText("Data Kelompok (Topik) TA");

        isiScrollPane.setViewportView(isiList);

        DataKelompokTALabel1.setText("Hasil Pencarian");

        hasilScrollPane2.setViewportView(hasilList);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(judulLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LocationLabel)
                .addGap(10, 10, 10))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nomorTopikTALabel, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nomorTopikTATextField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(backButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(findButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DataKelompokTALabel)
                            .addComponent(DataKelompokTALabel1))
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(isiScrollPane)
                            .addComponent(hasilScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LocationLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(judulLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomorTopikTALabel, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nomorTopikTATextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(backButton)
                    .addComponent(findButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DataKelompokTALabel1)
                    .addComponent(hasilScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(isiScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DataKelompokTALabel))
                .addContainerGap(92, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
    }//GEN-LAST:event_backButtonActionPerformed
    private void nomorTopikTATextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomorTopikTATextFieldActionPerformed
    }//GEN-LAST:event_nomorTopikTATextFieldActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DataKelompokTALabel;
    private javax.swing.JLabel DataKelompokTALabel1;
    private javax.swing.JLabel LocationLabel;
    private javax.swing.JButton backButton;
    private javax.swing.JButton findButton;
    private javax.swing.JList<String> hasilList;
    private javax.swing.JScrollPane hasilScrollPane2;
    private javax.swing.JList<String> isiList;
    private javax.swing.JScrollPane isiScrollPane;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel judulLabel;
    private javax.swing.JLabel nomorTopikTALabel;
    private javax.swing.JTextField nomorTopikTATextField;
    // End of variables declaration//GEN-END:variables
    public String getNomorTopikTATextField() {
        return nomorTopikTATextField.getText();
    }
    public Object getFindButton() {
        return findButton;
    }
    public Object getBackButton() {
        return backButton;
    }
    public void reset() {
        nomorTopikTATextField.setText("");
    }
    public void addListener(ActionListener e) {
        nomorTopikTATextField.addActionListener(e);
        findButton.addActionListener(e);
        backButton.addActionListener(e);
    }
    public String getSelectedIsi() {
        return (String) isiList.getSelectedValue();
    }
    public void setListIsi(String list[]) {
        isiList.setListData(list);
    }
    public void setListHasil(String list[]) {
        hasilList.setListData(list);
    }
}
