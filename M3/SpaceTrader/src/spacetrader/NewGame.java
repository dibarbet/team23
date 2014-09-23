/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package spacetrader;

/**
 *
 * @author YaxiongLiu
 */
public class NewGame extends javax.swing.JFrame {
    // variable declariation for the variables used in NewGmae class, also used to create the new Player
    private String nname = "";
    private int npilot = 0;
    private int nfighter = 0;
    private int ntrader = 0;
    private int nengineer = 0;
    private int ninvestor = 0;
    // end declariation
    /**
     * Creates new form NewGame
     */
    public NewGame() {
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

        jDialog1 = new javax.swing.JDialog();
        jLabel11 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jSpinner2 = new javax.swing.JSpinner();
        jSpinner3 = new javax.swing.JSpinner();
        jSpinner4 = new javax.swing.JSpinner();
        jSpinner5 = new javax.swing.JSpinner();

        jDialog1.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        jDialog1.setAlwaysOnTop(true);
        jDialog1.setMaximumSize(new java.awt.Dimension(410, 191));
        jDialog1.setMinimumSize(new java.awt.Dimension(410, 191));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel11.setText("Error:  ");

        jButton3.setText("OK");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel12.setText("The name cannot be empty");

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel13.setText("The skills points must be fully allocated");

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13))
                .addContainerGap(28, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialog1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(144, 144, 144))
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(28, 28, 28))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(371, 300));
        setMinimumSize(new java.awt.Dimension(371, 300));

        jButton1.setText("OK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel1.setText("Name");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("Skills");

        jLabel4.setText("Avaliable points");

        jLabel5.setText("Pilot");

        jLabel6.setText("Fighter");

        jLabel7.setText("Trader");

        jLabel8.setText("Engineer");

        jLabel9.setText("Investor");

        jLabel10.setText("15");

        jSpinner1.setModel(new javax.swing.SpinnerNumberModel(0, 0, 15, 1));
        jSpinner1.setMaximumSize(new java.awt.Dimension(39, 20));
        jSpinner1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner1StateChanged(evt);
            }
        });

        jSpinner2.setModel(new javax.swing.SpinnerNumberModel(0, 0, 15, 1));
        jSpinner2.setMaximumSize(new java.awt.Dimension(39, 20));
        jSpinner2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner2StateChanged(evt);
            }
        });

        jSpinner3.setModel(new javax.swing.SpinnerNumberModel(0, 0, 15, 1));
        jSpinner3.setMaximumSize(new java.awt.Dimension(39, 20));
        jSpinner3.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner3StateChanged(evt);
            }
        });

        jSpinner4.setModel(new javax.swing.SpinnerNumberModel(0, 0, 15, 1));
        jSpinner4.setMaximumSize(new java.awt.Dimension(39, 20));
        jSpinner4.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner4StateChanged(evt);
            }
        });

        jSpinner5.setModel(new javax.swing.SpinnerNumberModel(0, 0, 15, 1));
        jSpinner5.setMaximumSize(new java.awt.Dimension(39, 20));
        jSpinner5.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner5StateChanged(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(123, 123, 123)
                                        .addComponent(jLabel10))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel9)
                                                .addGap(25, 25, 25)
                                                .addComponent(jSpinner5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel5)
                                                    .addComponent(jLabel7))
                                                .addGap(34, 34, 34)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jSpinner3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jSpinner1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel6)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGap(52, 52, 52)
                                                        .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel8)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jSpinner4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jSpinner3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jSpinner4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jSpinner5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(29, 29, 29))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        nname = jTextField1.getText();
        npilot = (int)jSpinner1.getValue();
        nfighter = (int)jSpinner2.getValue();
        ntrader = (int)jSpinner3.getValue();
        nengineer = (int)jSpinner4.getValue();
        ninvestor = (int)jSpinner5.getValue();
        if ((npilot + nfighter + ntrader + nengineer + ninvestor != 15) || (nname.equals(""))) {
            jDialog1.setLocationRelativeTo(null);
            jDialog1.setVisible(true);
        } else {
            SpaceTrader.player = new Player(nname, npilot, nfighter, ntrader, nengineer, ninvestor);
            Universe gameUniverse = new Universe();
            System.out.println(gameUniverse.toString());
            dispose();
            new GameWindow().setVisible(true); 
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose(); // close the NewGame window
        new WelcomeWin().setVisible(true); // open the welcome window again
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jDialog1.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jSpinner1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner1StateChanged
        jSpinner1.setModel(new javax.swing.SpinnerNumberModel((int)jSpinner1.getValue(), 0, 15-(int)jSpinner2.getValue()-(int)jSpinner3.getValue()-(int)jSpinner4.getValue()-(int)jSpinner5.getValue(), 1));        // TODO add your handling code here:
        jSpinner2.setModel(new javax.swing.SpinnerNumberModel((int)jSpinner2.getValue(), 0, 15-(int)jSpinner1.getValue()-(int)jSpinner3.getValue()-(int)jSpinner4.getValue()-(int)jSpinner5.getValue(), 1));// TODO add your handling code here:
        jSpinner3.setModel(new javax.swing.SpinnerNumberModel((int)jSpinner3.getValue(), 0, 15-(int)jSpinner1.getValue()-(int)jSpinner2.getValue()-(int)jSpinner4.getValue()-(int)jSpinner5.getValue(), 1));// TODO add your handling code here:
        jSpinner4.setModel(new javax.swing.SpinnerNumberModel((int)jSpinner4.getValue(), 0, 15-(int)jSpinner1.getValue()-(int)jSpinner2.getValue()-(int)jSpinner3.getValue()-(int)jSpinner5.getValue(), 1));// TODO add your handling code here:
        jSpinner5.setModel(new javax.swing.SpinnerNumberModel((int)jSpinner5.getValue(), 0, 15-(int)jSpinner1.getValue()-(int)jSpinner2.getValue()-(int)jSpinner3.getValue()-(int)jSpinner4.getValue(), 1));// TODO add your handling code here:
        jLabel10.setText(Integer.toString(15-(int)jSpinner1.getValue()-(int)jSpinner2.getValue()-(int)jSpinner3.getValue()-(int)jSpinner4.getValue()-(int)jSpinner5.getValue()));
    }//GEN-LAST:event_jSpinner1StateChanged

    private void jSpinner2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner2StateChanged
        jSpinner1.setModel(new javax.swing.SpinnerNumberModel((int)jSpinner1.getValue(), 0, 15-(int)jSpinner2.getValue()-(int)jSpinner3.getValue()-(int)jSpinner4.getValue()-(int)jSpinner5.getValue(), 1));        // TODO add your handling code here:
        jSpinner2.setModel(new javax.swing.SpinnerNumberModel((int)jSpinner2.getValue(), 0, 15-(int)jSpinner1.getValue()-(int)jSpinner3.getValue()-(int)jSpinner4.getValue()-(int)jSpinner5.getValue(), 1));// TODO add your handling code here:
        jSpinner3.setModel(new javax.swing.SpinnerNumberModel((int)jSpinner3.getValue(), 0, 15-(int)jSpinner1.getValue()-(int)jSpinner2.getValue()-(int)jSpinner4.getValue()-(int)jSpinner5.getValue(), 1));// TODO add your handling code here:
        jSpinner4.setModel(new javax.swing.SpinnerNumberModel((int)jSpinner4.getValue(), 0, 15-(int)jSpinner1.getValue()-(int)jSpinner2.getValue()-(int)jSpinner3.getValue()-(int)jSpinner5.getValue(), 1));// TODO add your handling code here:
        jSpinner5.setModel(new javax.swing.SpinnerNumberModel((int)jSpinner5.getValue(), 0, 15-(int)jSpinner1.getValue()-(int)jSpinner2.getValue()-(int)jSpinner3.getValue()-(int)jSpinner4.getValue(), 1));// TODO add your handling code here:
        jLabel10.setText(Integer.toString(15-(int)jSpinner1.getValue()-(int)jSpinner2.getValue()-(int)jSpinner3.getValue()-(int)jSpinner4.getValue()-(int)jSpinner5.getValue()));
    }//GEN-LAST:event_jSpinner2StateChanged

    private void jSpinner3StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner3StateChanged
        jSpinner1.setModel(new javax.swing.SpinnerNumberModel((int)jSpinner1.getValue(), 0, 15-(int)jSpinner2.getValue()-(int)jSpinner3.getValue()-(int)jSpinner4.getValue()-(int)jSpinner5.getValue(), 1));        // TODO add your handling code here:
        jSpinner2.setModel(new javax.swing.SpinnerNumberModel((int)jSpinner2.getValue(), 0, 15-(int)jSpinner1.getValue()-(int)jSpinner3.getValue()-(int)jSpinner4.getValue()-(int)jSpinner5.getValue(), 1));// TODO add your handling code here:
        jSpinner3.setModel(new javax.swing.SpinnerNumberModel((int)jSpinner3.getValue(), 0, 15-(int)jSpinner1.getValue()-(int)jSpinner2.getValue()-(int)jSpinner4.getValue()-(int)jSpinner5.getValue(), 1));// TODO add your handling code here:
        jSpinner4.setModel(new javax.swing.SpinnerNumberModel((int)jSpinner4.getValue(), 0, 15-(int)jSpinner1.getValue()-(int)jSpinner2.getValue()-(int)jSpinner3.getValue()-(int)jSpinner5.getValue(), 1));// TODO add your handling code here:
        jSpinner5.setModel(new javax.swing.SpinnerNumberModel((int)jSpinner5.getValue(), 0, 15-(int)jSpinner1.getValue()-(int)jSpinner2.getValue()-(int)jSpinner3.getValue()-(int)jSpinner4.getValue(), 1));// TODO add your handling code here:
        jLabel10.setText(Integer.toString(15-(int)jSpinner1.getValue()-(int)jSpinner2.getValue()-(int)jSpinner3.getValue()-(int)jSpinner4.getValue()-(int)jSpinner5.getValue()));
    }//GEN-LAST:event_jSpinner3StateChanged

    private void jSpinner4StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner4StateChanged
        jSpinner1.setModel(new javax.swing.SpinnerNumberModel((int)jSpinner1.getValue(), 0, 15-(int)jSpinner2.getValue()-(int)jSpinner3.getValue()-(int)jSpinner4.getValue()-(int)jSpinner5.getValue(), 1));        // TODO add your handling code here:
        jSpinner2.setModel(new javax.swing.SpinnerNumberModel((int)jSpinner2.getValue(), 0, 15-(int)jSpinner1.getValue()-(int)jSpinner3.getValue()-(int)jSpinner4.getValue()-(int)jSpinner5.getValue(), 1));// TODO add your handling code here:
        jSpinner3.setModel(new javax.swing.SpinnerNumberModel((int)jSpinner3.getValue(), 0, 15-(int)jSpinner1.getValue()-(int)jSpinner2.getValue()-(int)jSpinner4.getValue()-(int)jSpinner5.getValue(), 1));// TODO add your handling code here:
        jSpinner4.setModel(new javax.swing.SpinnerNumberModel((int)jSpinner4.getValue(), 0, 15-(int)jSpinner1.getValue()-(int)jSpinner2.getValue()-(int)jSpinner3.getValue()-(int)jSpinner5.getValue(), 1));// TODO add your handling code here:
        jSpinner5.setModel(new javax.swing.SpinnerNumberModel((int)jSpinner5.getValue(), 0, 15-(int)jSpinner1.getValue()-(int)jSpinner2.getValue()-(int)jSpinner3.getValue()-(int)jSpinner4.getValue(), 1));// TODO add your handling code here:
        jLabel10.setText(Integer.toString(15-(int)jSpinner1.getValue()-(int)jSpinner2.getValue()-(int)jSpinner3.getValue()-(int)jSpinner4.getValue()-(int)jSpinner5.getValue()));
    }//GEN-LAST:event_jSpinner4StateChanged

    private void jSpinner5StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner5StateChanged
        jSpinner1.setModel(new javax.swing.SpinnerNumberModel((int)jSpinner1.getValue(), 0, 15-(int)jSpinner2.getValue()-(int)jSpinner3.getValue()-(int)jSpinner4.getValue()-(int)jSpinner5.getValue(), 1));        // TODO add your handling code here:
        jSpinner2.setModel(new javax.swing.SpinnerNumberModel((int)jSpinner2.getValue(), 0, 15-(int)jSpinner1.getValue()-(int)jSpinner3.getValue()-(int)jSpinner4.getValue()-(int)jSpinner5.getValue(), 1));// TODO add your handling code here:
        jSpinner3.setModel(new javax.swing.SpinnerNumberModel((int)jSpinner3.getValue(), 0, 15-(int)jSpinner1.getValue()-(int)jSpinner2.getValue()-(int)jSpinner4.getValue()-(int)jSpinner5.getValue(), 1));// TODO add your handling code here:
        jSpinner4.setModel(new javax.swing.SpinnerNumberModel((int)jSpinner4.getValue(), 0, 15-(int)jSpinner1.getValue()-(int)jSpinner2.getValue()-(int)jSpinner3.getValue()-(int)jSpinner5.getValue(), 1));// TODO add your handling code here:
        jSpinner5.setModel(new javax.swing.SpinnerNumberModel((int)jSpinner5.getValue(), 0, 15-(int)jSpinner1.getValue()-(int)jSpinner2.getValue()-(int)jSpinner3.getValue()-(int)jSpinner4.getValue(), 1));// TODO add your handling code here:
        jLabel10.setText(Integer.toString(15-(int)jSpinner1.getValue()-(int)jSpinner2.getValue()-(int)jSpinner3.getValue()-(int)jSpinner4.getValue()-(int)jSpinner5.getValue()));
    }//GEN-LAST:event_jSpinner5StateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JSpinner jSpinner3;
    private javax.swing.JSpinner jSpinner4;
    private javax.swing.JSpinner jSpinner5;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
