package kinematicscalculator;

public class KinematicsCalculatorGUI extends javax.swing.JFrame {

    public KinematicsCalculatorGUI() {
        initComponents();
        this.setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        vel1 = new javax.swing.JTextField();
        vel2 = new javax.swing.JTextField();
        acc = new javax.swing.JTextField();
        dis = new javax.swing.JTextField();
        time = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        calculate = new javax.swing.JButton();
        message = new javax.swing.JLabel();
        clear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Kinematics Calculator");

        jLabel2.setText("Initial Velocity");

        jLabel3.setText("Final Velocity");

        jLabel4.setText("Acceleration");

        jLabel5.setText("Displacement");

        jLabel6.setText("Time");

        calculate.setText("Calculate");
        calculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateActionPerformed(evt);
            }
        });

        message.setText("Enter at least three known values");

        clear.setText("Clear");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(message)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(calculate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(clear)
                        .addGap(25, 25, 25)))
                .addGap(54, 54, 54))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(vel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(vel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(acc, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(dis, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(time, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38))
            .addGroup(layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(acc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(time, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(calculate)
                    .addComponent(clear))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(message)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void calculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculateActionPerformed
        
        // adding this comment to test GitHub and stuff
        // setting the text labels to strings
        String svel1 = vel1.getText();
        String svel2 = vel2.getText();
        String sacc = acc.getText();
        String sdis = dis.getText();
        String stime = time.getText();
        String ans1, ans2;
        double[] ans = new double[2];
        
        // error checking
        if(OtherMethods.checkEmpty(svel1, svel2, sacc, sdis, stime) > 2) {
            message.setText("Must have at least three values.");
        } else if(OtherMethods.checkEmpty(svel1, svel2, sacc, sdis, stime) == 0) {
            message.setText("Too many values have been given.");
        } else if(svel1.matches(".*[a-z].*") || svel2.matches(".*[a-z].*") || sacc.matches(".*[a-z].*")
                || sdis.matches(".*[a-z].*") || stime.matches(".*[a-z].*")) {
            message.setText("Cannot have letters in the values.");
        } else {
            message.setText("Calculation finished.");
            
            // swithc case based on the return int of chooseEquation
            switch(OtherMethods.chooseEquation(svel1, svel2, sacc, sdis, stime)) {
                case 0:
                    message.setText("Something went wrong.");
                    break;
                case 1:
                    // solve for initial velocity
                    vel1.setText(KinEqs.findVel1(svel2, sacc, stime));
                    break;
                case 2:
                    // solve for final velocity
                    vel2.setText(KinEqs.findVel2(svel1, sacc, stime));
                    break;
                case 3:
                    // solve for acceleration
                    acc.setText(KinEqs.findAcc(svel1, svel2, stime));
                    break;
                case 4:
                    // solve for displacement
                    dis.setText(KinEqs.findDis(svel1, svel2, sacc));
                    break;
                case 5:
                    // solve for time
                    time.setText(KinEqs.findTime(svel1, svel2, sacc));
                    break;
                case 6:
                    // solve for initial and final velocity
                    ans = KinEqs.findVel1AndVel2(sacc, sdis, stime);
                    ans1 = String.valueOf(ans[0]);
                    ans2 = String.valueOf(ans[1]);
                    vel1.setText(ans1);
                    vel2.setText(ans2);
                    break;
                case 7:
                    // solve for initial velocity and acceleration
                    ans = KinEqs.findVel1AndAcc(svel2, sdis, stime);
                    ans1 = String.valueOf(ans[0]);
                    ans2 = String.valueOf(ans[1]);
                    vel1.setText(ans1);
                    acc.setText(ans2);
                    break;
                case 8:
                    // solve for initial velocity and displacement
                    ans = KinEqs.findVel1AndDis(svel2, sacc, stime);
                    ans1 = String.valueOf(ans[0]);
                    ans2 = String.valueOf(ans[1]);
                    vel1.setText(ans1);
                    dis.setText(ans2);
                    break;
                case 9:
                    // solve for initial velocity and time
                    ans = KinEqs.findVel1AndTime(svel2, sacc, sdis);
                    ans1 = String.valueOf(ans[0]);
                    ans2 = String.valueOf(ans[1]);
                    vel1.setText(ans1);
                    time.setText(ans2);
                    break;
                case 10:
                    // solve for final velocity and acceleration
                    ans = KinEqs.findVel2AndAcc(svel1, sdis, stime);
                    ans1 = String.valueOf(ans[0]);
                    ans2 = String.valueOf(ans[1]);
                    vel2.setText(ans1);
                    acc.setText(ans2);
                    break;
                case 11:
                    // solve for final velocity and displacement
                    ans = KinEqs.findVel2AndDis(svel1, sacc, stime);
                    ans1 = String.valueOf(ans[0]);
                    ans2 = String.valueOf(ans[1]);
                    vel2.setText(ans1);
                    dis.setText(ans2);
                    break;
                case 12:
                    // solve for final veloicty and time
                    ans = KinEqs.findVel2AndTime(svel1, sacc, sdis);
                    ans1 = String.valueOf(ans[0]);
                    ans2 = String.valueOf(ans[1]);
                    vel2.setText(ans1);
                    time.setText(ans2);
                    break;
                case 13:
                    // solve for acceleration and displacement
                    ans = KinEqs.findAccAndDis(svel1, svel2, stime);
                    ans1 = String.valueOf(ans[0]);
                    ans2 = String.valueOf(ans[1]);
                    acc.setText(ans1);
                    dis.setText(ans2);
                    break;
                case 14:
                    // solve for acceleration and time
                    ans = KinEqs.findAccAndTime(svel1, svel2, sdis);
                    ans1 = String.valueOf(ans[0]);
                    ans2 = String.valueOf(ans[1]);
                    acc.setText(ans1);
                    time.setText(ans2);
                    break;
                case 15:
                    // solve for displacement and time
                    ans = KinEqs.findDisAndTime(svel1, svel2, sacc);
                    ans1 = String.valueOf(ans[0]);
                    ans2 = String.valueOf(ans[1]);
                    dis.setText(ans1);
                    time.setText(ans2);
                    break;
            }
        }
    }//GEN-LAST:event_calculateActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        vel1.setText("");
        vel2.setText("");
        acc.setText("");
        dis.setText("");
        time.setText("");
        message.setText("Enter at least three known values.");
    }//GEN-LAST:event_clearActionPerformed

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
            java.util.logging.Logger.getLogger(KinematicsCalculatorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KinematicsCalculatorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KinematicsCalculatorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KinematicsCalculatorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KinematicsCalculatorGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField acc;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton calculate;
    private javax.swing.JButton clear;
    private javax.swing.JTextField dis;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel message;
    private javax.swing.JTextField time;
    private javax.swing.JTextField vel1;
    private javax.swing.JTextField vel2;
    // End of variables declaration//GEN-END:variables
}
