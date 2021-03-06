/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Height.Converter;

/**
 *
 * @author saptarshi
 */
public class heightconverter extends javax.swing.JFrame {

    /**
     * Creates new form heightconverter
     */
    public heightconverter() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        feetLabel = new javax.swing.JLabel();
        inchLabel = new javax.swing.JLabel();
        feetField = new javax.swing.JTextField();
        inchField = new javax.swing.JTextField();
        converBut = new javax.swing.JButton();
        cmField = new javax.swing.JTextField();
        clearBut = new javax.swing.JButton();
        exitBut = new javax.swing.JButton();
        cmLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Height Converter");

        jPanel1.setBackground(new java.awt.Color(0, 255, 237));

        feetLabel.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        feetLabel.setText("Feet");

        inchLabel.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        inchLabel.setText("Inches");

        feetField.setToolTipText("Enter height in feet");

        inchField.setToolTipText("Enter height in inches");

        converBut.setBackground(new java.awt.Color(0, 29, 255));
        converBut.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        converBut.setForeground(new java.awt.Color(254, 254, 254));
        converBut.setText("Convert To");
        converBut.setToolTipText("click to convert to cm");
        converBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                converButActionPerformed(evt);
            }
        });

        cmField.setToolTipText("cm output");
        cmField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmFieldActionPerformed(evt);
            }
        });

        clearBut.setBackground(new java.awt.Color(188, 28, 227));
        clearBut.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        clearBut.setForeground(new java.awt.Color(254, 254, 254));
        clearBut.setText("Clear");
        clearBut.setToolTipText("clear input");
        clearBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButActionPerformed(evt);
            }
        });

        exitBut.setBackground(new java.awt.Color(234, 29, 14));
        exitBut.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        exitBut.setForeground(new java.awt.Color(254, 254, 254));
        exitBut.setText("Exit");
        exitBut.setToolTipText("exit application");
        exitBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButActionPerformed(evt);
            }
        });

        cmLabel.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        cmLabel.setText("Centimetres");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cmLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmField, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(clearBut)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(exitBut, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(feetLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(inchLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(feetField)
                    .addComponent(inchField, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(145, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(converBut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(feetLabel)
                        .addGap(48, 48, 48)
                        .addComponent(inchLabel))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(feetField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(inchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(converBut)
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmLabel))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clearBut)
                    .addComponent(exitBut))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void converButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_converButActionPerformed
        // declaring three variables
        double feet=0, inch=0, centimetres;
        
        try
        {
            // getting the text from feet and inch Text Fields and converting to double
            feet = Double.parseDouble(feetField.getText());
            inch = Double.parseDouble(inchField.getText());
            // converting to centimetres
            centimetres = (feet * 12 + inch) * 2.54;
            // setting cm Text Field to value of centimetres
            cmField.setText(String.valueOf(centimetres));
        }
        catch(Exception e)
        {
            System.out.println("Invalid input");
        }
    }//GEN-LAST:event_converButActionPerformed

    private void clearButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButActionPerformed
        // clearing the Text Fields by setting their values ot blank string
        feetField.setText("");
        inchField.setText("");
        cmField.setText("");
    }//GEN-LAST:event_clearButActionPerformed

    private void cmFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmFieldActionPerformed

    private void exitButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButActionPerformed
        // exiting the GUI window
        System.exit(0);
    }//GEN-LAST:event_exitButActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(heightconverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(heightconverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(heightconverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(heightconverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new heightconverter().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clearBut;
    private javax.swing.JTextField cmField;
    private javax.swing.JLabel cmLabel;
    private javax.swing.JButton converBut;
    private javax.swing.JButton exitBut;
    private javax.swing.JTextField feetField;
    private javax.swing.JLabel feetLabel;
    private javax.swing.JTextField inchField;
    private javax.swing.JLabel inchLabel;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
