
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hasibur Rahman
 */
public class Loading_Page extends javax.swing.JFrame {

    /**
     * Creates new form Loading_Page
     */
    public Loading_Page() {
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel4 = new javax.swing.JLabel();
        loadinglevel = new javax.swing.JLabel();
        loadingValue = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(java.awt.Color.black);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Monotype Corsiva", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Noapara Zonal Office,Abhaynagor");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 70, 440, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 40)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("X");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 0, -1, 30));

        jLabel3.setFont(new java.awt.Font("Monotype Corsiva", 1, 40)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Welcome to...");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 250, -1));
        jPanel1.add(jProgressBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 520, 910, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Load/loading.gif"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 150, 400, 300));

        loadinglevel.setFont(new java.awt.Font("Times New Roman", 0, 30)); // NOI18N
        loadinglevel.setForeground(new java.awt.Color(0, 255, 204));
        loadinglevel.setText("Processing..");
        jPanel1.add(loadinglevel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 476, 360, 40));

        loadingValue.setFont(new java.awt.Font("Times New Roman", 1, 40)); // NOI18N
        loadingValue.setForeground(new java.awt.Color(255, 255, 51));
        loadingValue.setText("0%");
        jPanel1.add(loadingValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 460, 130, 40));

        jLabel7.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -4, 890, 560));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, 550));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel2MouseClicked

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
            java.util.logging.Logger.getLogger(Loading_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Loading_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Loading_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Loading_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
       Loading_Page lp = new Loading_Page();
       lp.setVisible(true);
       try{
           for (int i = 0; i <= 100; i++) {
               Thread.sleep(100);
               lp.loadingValue.setText(i+"%");
               if(i==10){
                   lp.loadinglevel.setText("Please wait sometimes...");
               }
               if(i==20){
                   lp.loadinglevel.setText(" Turning on Modules...");
               }
               if(i==30){
                   lp.loadinglevel.setText("Loading on Modules...");
               }
               if(i==50){
                   lp.loadinglevel.setText("Connecting to Database...");
               }
               if(i==70){
                   lp.loadinglevel.setText("Connection successful...");
               }
               if(i==80){
                   lp.loadinglevel.setText("Launching Aplication...");
               }
               lp.jProgressBar1.setValue(i);
           }
 
       }
       catch(Exception e){
           JOptionPane.showMessageDialog(null, e);
       }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JLabel loadingValue;
    private javax.swing.JLabel loadinglevel;
    // End of variables declaration//GEN-END:variables
}
