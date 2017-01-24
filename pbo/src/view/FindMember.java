package view;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import javax.swing.JButton;
import javax.swing.JTextField;
public class FindMember extends javax.swing.JPanel {
    public FindMember() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        judulLabel = new javax.swing.JLabel();
        LocationLabel = new javax.swing.JLabel();
        nomorTopikTALabel = new javax.swing.JLabel();
        nomorTopikTATextField = new javax.swing.JTextField();
        nimLabel = new javax.swing.JLabel();
        nimTextField = new javax.swing.JTextField();
        backButton = new javax.swing.JButton();
        findButton = new javax.swing.JButton();
        DataKelompokTALabel1 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        DataKelompokTALabel = new javax.swing.JLabel();
        isiScrollPane1 = new javax.swing.JScrollPane();
        isiList = new javax.swing.JList<>();
        DataNIMLabel = new javax.swing.JLabel();
        nimScrollPane = new javax.swing.JScrollPane();
        nimList = new javax.swing.JList<>();
        hasilScrollPane2 = new javax.swing.JScrollPane();
        hasilTextArea = new javax.swing.JTextArea();

        setPreferredSize(new java.awt.Dimension(400, 115));

        judulLabel.setText("Sisfo Pengolahan Data TA");

        LocationLabel.setText("Find Member| Dosen");

        nomorTopikTALabel.setText("Nomor Topik TA");

        nomorTopikTATextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomorTopikTATextFieldActionPerformed(evt);
            }
        });

        nimLabel.setText("NIM Mahasiswa");

        nimTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nimTextFieldActionPerformed(evt);
            }
        });

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        findButton.setText("Find");
        findButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findButtonActionPerformed(evt);
            }
        });

        DataKelompokTALabel1.setText("Hasil Pencarian");

        DataKelompokTALabel.setText("Data Kelompok (Topik) TA");

        isiScrollPane1.setViewportView(isiList);

        DataNIMLabel.setText("Data NIM Mahasiswa");

        nimScrollPane.setViewportView(nimList);

        hasilTextArea.setColumns(20);
        hasilTextArea.setRows(5);
        hasilScrollPane2.setViewportView(hasilTextArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nomorTopikTALabel)
                                    .addComponent(judulLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LocationLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(nomorTopikTATextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nimLabel)
                                    .addComponent(DataKelompokTALabel1))
                                .addGap(106, 106, 106)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nimTextField)
                                    .addComponent(hasilScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(backButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(findButton)
                        .addGap(11, 11, 11))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator2)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(DataKelompokTALabel, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(DataNIMLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nimScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(isiScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
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
                    .addComponent(nomorTopikTATextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nomorTopikTALabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nimTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nimLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backButton)
                    .addComponent(findButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DataKelompokTALabel1)
                    .addComponent(hasilScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DataKelompokTALabel)
                    .addComponent(isiScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DataNIMLabel)
                    .addComponent(nimScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents
    private void nomorTopikTATextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomorTopikTATextFieldActionPerformed
    }//GEN-LAST:event_nomorTopikTATextFieldActionPerformed
    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
    }//GEN-LAST:event_backButtonActionPerformed
    private void nimTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nimTextFieldActionPerformed
    }//GEN-LAST:event_nimTextFieldActionPerformed
    private void findButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findButtonActionPerformed
    }//GEN-LAST:event_findButtonActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DataKelompokTALabel;
    private javax.swing.JLabel DataKelompokTALabel1;
    private javax.swing.JLabel DataNIMLabel;
    private javax.swing.JLabel LocationLabel;
    private javax.swing.JButton backButton;
    private javax.swing.JButton findButton;
    private javax.swing.JScrollPane hasilScrollPane2;
    private javax.swing.JTextArea hasilTextArea;
    private javax.swing.JList<String> isiList;
    private javax.swing.JScrollPane isiScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel judulLabel;
    private javax.swing.JLabel nimLabel;
    private javax.swing.JList<String> nimList;
    private javax.swing.JScrollPane nimScrollPane;
    private javax.swing.JTextField nimTextField;
    private javax.swing.JLabel nomorTopikTALabel;
    private javax.swing.JTextField nomorTopikTATextField;
    // End of variables declaration//GEN-END:variables
    public int getNomorTopikTATextField(){
        return Integer.parseInt(nomorTopikTATextField.getText());
    }
    public String getNIMTextField(){
        return nimTextField.getText();
    }
    public Object getFindButton() {
        return findButton;
    }
    public Object getBackButton() {
        return backButton;
    }
    public void reset() {
        nomorTopikTATextField.setText("");
        nimTextField.setText("");
    }
    public void setListIsi(String list[]) {
        isiList.setListData(list);
    }
    public void setListHasil(String s) {
        hasilTextArea.setText(s);
    }
     public String getSelectedNim() {
        return (String) nimList.getSelectedValue();
    }
    public void setListNim(String list[]) {
        nimList.setListData(list);
    }
    public void addListener(ActionListener e) {
        nomorTopikTATextField.addActionListener(e);
        findButton.addActionListener(e);
        backButton.addActionListener(e);
    }
    public void addAdapter(MouseAdapter e){
        isiList.addMouseListener(e);
    }
}
