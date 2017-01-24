package view;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import javax.swing.JButton;
import javax.swing.JTextField;
public class AddMember extends javax.swing.JPanel {
    public AddMember() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        judulLabel = new javax.swing.JLabel();
        LocationLabel = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        nomorTopikTALabel = new javax.swing.JLabel();
        nomorTopikTATextField = new javax.swing.JTextField();
        nimLabel = new javax.swing.JLabel();
        nimTextField = new javax.swing.JTextField();
        backButton = new javax.swing.JButton();
        addButton = new javax.swing.JButton();
        isiScrollPane = new javax.swing.JScrollPane();
        isiList = new javax.swing.JList<>();
        hasilScrollPane2 = new javax.swing.JScrollPane();
        hasilTextArea = new javax.swing.JTextArea();
        jSeparator2 = new javax.swing.JSeparator();
        DataKelompokTALabel = new javax.swing.JLabel();
        isiScrollPane1 = new javax.swing.JScrollPane();
        isiList1 = new javax.swing.JList<>();
        DataNIMLabel = new javax.swing.JLabel();
        nimScrollPane = new javax.swing.JScrollPane();
        nimList = new javax.swing.JList<>();

        setPreferredSize(new java.awt.Dimension(400, 115));

        judulLabel.setText("Sisfo Pengolahan Data TA");

        LocationLabel.setText("Add Member| Dosen");

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

        addButton.setText("Add");

        isiScrollPane.setViewportView(isiList);

        hasilTextArea.setColumns(20);
        hasilTextArea.setRows(5);
        hasilScrollPane2.setViewportView(hasilTextArea);

        DataKelompokTALabel.setText("Data Kelompok (Topik) TA");

        isiScrollPane1.setViewportView(isiList1);

        DataNIMLabel.setText("Data NIM Mahasiswa");

        nimScrollPane.setViewportView(nimList);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2)
                    .addComponent(jSeparator3)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nomorTopikTALabel)
                            .addComponent(judulLabel))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 159, Short.MAX_VALUE)
                                .addComponent(LocationLabel))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addComponent(nomorTopikTATextField))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DataKelompokTALabel, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DataNIMLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(isiScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(nimScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(backButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addButton))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(nimLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(isiScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(hasilScrollPane2)
                            .addComponent(nimTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LocationLabel)
                    .addComponent(judulLabel))
                .addGap(2, 2, 2)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomorTopikTATextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nomorTopikTALabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nimTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nimLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addButton)
                    .addComponent(backButton))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(isiScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(hasilScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DataKelompokTALabel)
                    .addComponent(isiScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DataNIMLabel)
                    .addComponent(nimScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    private void nomorTopikTATextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomorTopikTATextFieldActionPerformed
    }//GEN-LAST:event_nomorTopikTATextFieldActionPerformed
    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
    }//GEN-LAST:event_backButtonActionPerformed
    private void nimTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nimTextFieldActionPerformed
    }//GEN-LAST:event_nimTextFieldActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DataKelompokTALabel;
    private javax.swing.JLabel DataNIMLabel;
    private javax.swing.JLabel LocationLabel;
    private javax.swing.JButton addButton;
    private javax.swing.JButton backButton;
    private javax.swing.JScrollPane hasilScrollPane2;
    private javax.swing.JTextArea hasilTextArea;
    private javax.swing.JList<String> isiList;
    private javax.swing.JList<String> isiList1;
    private javax.swing.JScrollPane isiScrollPane;
    private javax.swing.JScrollPane isiScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
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
    public Object getAddButton() {
        return addButton;
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
    public String getSelectedIsi() {
        return (String) isiList.getSelectedValue();
    }
    public void setListIsi1(String list[]) {
        isiList1.setListData(list);
    }
    public String getSelectedIsi1() {
        return (String) isiList1.getSelectedValue();
    }
    public void setSelectedIsiDetail(String s) {
        hasilTextArea.setText(s);
    }
    public Object getSelectedIsiDetail() {
        return hasilTextArea;
    }
     public String getSelectedNim() {
        return (String) nimList.getSelectedValue();
    }
    public void setListNim(String list[]) {
        nimList.setListData(list);
    }
    public void addListener(ActionListener e) {
        nomorTopikTATextField.addActionListener(e);
        addButton.addActionListener(e);
        backButton.addActionListener(e);
    }
    public void addAdapter(MouseAdapter e){
        isiList.addMouseListener(e);
    }
}