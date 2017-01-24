package view;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTextField;
public class GetPembimbing extends javax.swing.JPanel {
    public GetPembimbing() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        judulLabel = new javax.swing.JLabel();
        LocationLabel = new javax.swing.JLabel();
        kodeDosenLabel = new javax.swing.JLabel();
        kodeDosenTextField = new javax.swing.JTextField();
        backButton = new javax.swing.JButton();
        getButton = new javax.swing.JButton();
        DataKelompokTALabel1 = new javax.swing.JLabel();
        hasilScrollPane2 = new javax.swing.JScrollPane();
        hasilTextArea = new javax.swing.JTextArea();
        jSeparator2 = new javax.swing.JSeparator();
        DataKodeDosenLabel = new javax.swing.JLabel();
        kodeDosenScrollPane = new javax.swing.JScrollPane();
        kodeDosenList = new javax.swing.JList<>();

        setPreferredSize(new java.awt.Dimension(400, 115));

        judulLabel.setText("Sisfo Pengolahan Data TA");

        LocationLabel.setText("Get Pembimbing| Mahasiswa");

        kodeDosenLabel.setText("Kode Dosen");

        kodeDosenTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kodeDosenTextFieldActionPerformed(evt);
            }
        });

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        getButton.setText("Get");
        getButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getButtonActionPerformed(evt);
            }
        });

        DataKelompokTALabel1.setText("Hasil Pencarian");

        hasilTextArea.setColumns(20);
        hasilTextArea.setRows(5);
        hasilScrollPane2.setViewportView(hasilTextArea);

        DataKodeDosenLabel.setText("Data Kode Dosen");

        kodeDosenScrollPane.setViewportView(kodeDosenList);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(kodeDosenLabel)
                            .addComponent(judulLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LocationLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(kodeDosenTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(backButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(getButton))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(DataKelompokTALabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(hasilScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(DataKodeDosenLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(kodeDosenScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
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
                    .addComponent(kodeDosenTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kodeDosenLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(backButton)
                    .addComponent(getButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DataKelompokTALabel1)
                    .addComponent(hasilScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DataKodeDosenLabel)
                    .addComponent(kodeDosenScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    private void kodeDosenTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kodeDosenTextFieldActionPerformed
    }//GEN-LAST:event_kodeDosenTextFieldActionPerformed
    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
    }//GEN-LAST:event_backButtonActionPerformed
    private void getButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getButtonActionPerformed
    }//GEN-LAST:event_getButtonActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DataKelompokTALabel1;
    private javax.swing.JLabel DataKodeDosenLabel;
    private javax.swing.JLabel LocationLabel;
    private javax.swing.JButton backButton;
    private javax.swing.JButton getButton;
    private javax.swing.JScrollPane hasilScrollPane2;
    private javax.swing.JTextArea hasilTextArea;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel judulLabel;
    private javax.swing.JLabel kodeDosenLabel;
    private javax.swing.JList<String> kodeDosenList;
    private javax.swing.JScrollPane kodeDosenScrollPane;
    private javax.swing.JTextField kodeDosenTextField;
    // End of variables declaration//GEN-END:variables
    public String getKodeDosenTATextField(){
        return kodeDosenTextField.getText();
    }
    public Object getGetButton() {
        return getButton;
    }
    public Object getBackButton() {
        return backButton;
    }
    public void reset() {
        kodeDosenTextField.setText("");
    }
    public String getSelectedIsi() {
        return (String) kodeDosenList.getSelectedValue();
    }
    public void setListIsi(String list[]) {
        kodeDosenList.setListData(list);
    }
    public void setSelectedHasil(String s) {
        hasilTextArea.setText(s);
    }
    public void addListener(ActionListener e) {
        kodeDosenTextField.addActionListener(e);
        getButton.addActionListener(e);
        backButton.addActionListener(e);
    }
}