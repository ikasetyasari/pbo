package view;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTextField;
public class CreateTA extends javax.swing.JPanel {
    public CreateTA() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        judulLabel = new javax.swing.JLabel();
        LocationLabel = new javax.swing.JLabel();
        judulTALabel = new javax.swing.JLabel();
        judulTATextField = new javax.swing.JTextField();
        backButton = new javax.swing.JButton();
        addButton = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        DataKelompokTALabel = new javax.swing.JLabel();
        kodeDosenScrollPane = new javax.swing.JScrollPane();
        kodeDosenList = new javax.swing.JList<>();

        setPreferredSize(new java.awt.Dimension(400, 115));

        judulLabel.setText("Sisfo Pengolahan Data TA");

        LocationLabel.setText("Create  TA | Mahasiswa");

        judulTALabel.setText("Judul TA");

        judulTATextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                judulTATextFieldActionPerformed(evt);
            }
        });

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        addButton.setText("Add");

        DataKelompokTALabel.setText("Data Judul TA");

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
                            .addComponent(judulTALabel)
                            .addComponent(judulLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LocationLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(judulTATextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(278, 278, 278)
                        .addComponent(backButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addButton)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(DataKelompokTALabel, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(kodeDosenScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                    .addComponent(judulTATextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(judulTALabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backButton)
                    .addComponent(addButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DataKelompokTALabel)
                    .addComponent(kodeDosenScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    private void judulTATextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_judulTATextFieldActionPerformed
    }//GEN-LAST:event_judulTATextFieldActionPerformed
    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
    }//GEN-LAST:event_backButtonActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DataKelompokTALabel;
    private javax.swing.JLabel LocationLabel;
    private javax.swing.JButton addButton;
    private javax.swing.JButton backButton;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel judulLabel;
    private javax.swing.JLabel judulTALabel;
    private javax.swing.JTextField judulTATextField;
    private javax.swing.JList<String> kodeDosenList;
    private javax.swing.JScrollPane kodeDosenScrollPane;
    // End of variables declaration//GEN-END:variables
    public String getJudulTATextField() {
        return judulTATextField.getText();
    }
    public Object getAddButton() {
        return addButton;
    }
    public Object getBackButton() {
        return backButton;
    }
    public void reset() {
        judulTATextField.setText("");
    }
    public String getSelectedIsi() {
        return (String) kodeDosenList.getSelectedValue();
    }
    public void setListIsi(String list[]) {
        kodeDosenList.setListData(list);
    }
    public void addListener(ActionListener e) {
        judulTATextField.addActionListener(e);
        addButton.addActionListener(e);
        backButton.addActionListener(e);
    }
}