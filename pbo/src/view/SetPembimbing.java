package view;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import javax.swing.JButton;
import javax.swing.JTextField;
public class SetPembimbing extends javax.swing.JPanel {
    public SetPembimbing() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        judulLabel = new javax.swing.JLabel();
        LocationLabel = new javax.swing.JLabel();
        kodeDosenLabel = new javax.swing.JLabel();
        kodeDosenTextField = new javax.swing.JTextField();
        setPembimbingLabel = new javax.swing.JLabel();
        setPembimbingComboBox = new javax.swing.JComboBox<>();
        backButton = new javax.swing.JButton();
        setButton = new javax.swing.JButton();
        isiScrollPane = new javax.swing.JScrollPane();
        isiList = new javax.swing.JList<>();
        hasilScrollPane2 = new javax.swing.JScrollPane();
        hasilTextArea = new javax.swing.JTextArea();
        jSeparator2 = new javax.swing.JSeparator();

        setPreferredSize(new java.awt.Dimension(400, 115));

        judulLabel.setText("Sisfo Pengolahan Data TA");

        LocationLabel.setText("Set Pembimbing| Mahasiswa");

        kodeDosenLabel.setText("Kode Dosen");

        kodeDosenTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kodeDosenTextFieldActionPerformed(evt);
            }
        });

        setPembimbingLabel.setText("Set Pembimbing ke-");

        setPembimbingComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2" }));

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        setButton.setText("Set");

        isiScrollPane.setViewportView(isiList);

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
                            .addComponent(kodeDosenLabel)
                            .addComponent(judulLabel)
                            .addComponent(setPembimbingLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LocationLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(kodeDosenTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(setPembimbingComboBox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jSeparator2)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(backButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(setButton)
                        .addGap(11, 11, 11))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(isiScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(hasilScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(kodeDosenTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kodeDosenLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(setPembimbingLabel)
                    .addComponent(setPembimbingComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backButton)
                    .addComponent(setButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(isiScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(hasilScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(56, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    private void kodeDosenTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kodeDosenTextFieldActionPerformed
    }//GEN-LAST:event_kodeDosenTextFieldActionPerformed
    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_backButtonActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LocationLabel;
    private javax.swing.JButton backButton;
    private javax.swing.JScrollPane hasilScrollPane2;
    private javax.swing.JTextArea hasilTextArea;
    private javax.swing.JList<String> isiList;
    private javax.swing.JScrollPane isiScrollPane;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel judulLabel;
    private javax.swing.JLabel kodeDosenLabel;
    private javax.swing.JTextField kodeDosenTextField;
    private javax.swing.JButton setButton;
    private javax.swing.JComboBox<String> setPembimbingComboBox;
    private javax.swing.JLabel setPembimbingLabel;
    // End of variables declaration//GEN-END:variables
    public String getKodeDosenTATextField(){
        return kodeDosenTextField.getText();
    }
    public int getSetPembimbing() {
        return setPembimbingComboBox.getSelectedIndex();
    }
    public Object getSetButton() {
        return setButton;
    }
    public Object getBackButton() {
        return backButton;
    }
    public void reset() {
        kodeDosenTextField.setText("");
    }
    public void setListIsi(String list[]) {
        isiList.setListData(list);
    }
    public String getSelectedIsi() {
        return (String) isiList.getSelectedValue();
    }
    public void setSelectedIsiDetail(String s) {
        hasilTextArea.setText(s);
    }
    public Object getIsiList() {
        return isiList;
    }
    public void addListener(ActionListener e) {
        kodeDosenTextField.addActionListener(e);
        setButton.addActionListener(e);
        backButton.addActionListener(e);
    }
    public void addAdapter(MouseAdapter e){
        isiList.addMouseListener(e);
    }
}