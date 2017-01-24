package view;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTextField;
public class CreateKelompokTA extends javax.swing.JPanel {
    public CreateKelompokTA() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        judulLabel = new javax.swing.JLabel();
        LocationLabel = new javax.swing.JLabel();
        namaTopikTALabel = new javax.swing.JLabel();
        namaTopikTATextField = new javax.swing.JTextField();
        backButton = new javax.swing.JButton();
        addButton = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        DataKelompokTALabel = new javax.swing.JLabel();
        isiScrollPane = new javax.swing.JScrollPane();
        isiList = new javax.swing.JList<>();

        setPreferredSize(new java.awt.Dimension(400, 115));

        judulLabel.setText("Sisfo Pengolahan Data TA");

        LocationLabel.setText("Create Kelompok TA| Dosen");

        namaTopikTALabel.setText("Nama Topik TA");

        namaTopikTATextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namaTopikTATextFieldActionPerformed(evt);
            }
        });

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        addButton.setText("Add");

        DataKelompokTALabel.setText("Data Kelompok (Topik) TA");

        isiScrollPane.setViewportView(isiList);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(278, 278, 278)
                        .addComponent(backButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addButton)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(namaTopikTALabel)
                                    .addComponent(judulLabel)
                                    .addComponent(DataKelompokTALabel, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(LocationLabel)
                                    .addComponent(namaTopikTATextField, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(isiScrollPane, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)))
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LocationLabel)
                    .addComponent(judulLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namaTopikTATextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(namaTopikTALabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addButton)
                    .addComponent(backButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DataKelompokTALabel)
                    .addComponent(isiScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    private void namaTopikTATextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namaTopikTATextFieldActionPerformed
    }//GEN-LAST:event_namaTopikTATextFieldActionPerformed
    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
    }//GEN-LAST:event_backButtonActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DataKelompokTALabel;
    private javax.swing.JLabel LocationLabel;
    private javax.swing.JButton addButton;
    private javax.swing.JButton backButton;
    private javax.swing.JList<String> isiList;
    private javax.swing.JScrollPane isiScrollPane;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel judulLabel;
    private javax.swing.JLabel namaTopikTALabel;
    private javax.swing.JTextField namaTopikTATextField;
    // End of variables declaration//GEN-END:variables
    public String getNamaTopikTATextField() {
        return namaTopikTATextField.getText();
    }
    public Object getAddButton() {
        return addButton;
    }
    public Object getBackButton() {
        return backButton;
    }
    public void reset() {
        namaTopikTATextField.setText("");
    }
    public String getSelectedIsi() {
        return (String) isiList.getSelectedValue();
    }
    public void setListIsi(String list[]) {
        isiList.setListData(list);
    }
    public void addListener(ActionListener e) {
        namaTopikTATextField.addActionListener(e);
        addButton.addActionListener(e);
        backButton.addActionListener(e);
    }
}
