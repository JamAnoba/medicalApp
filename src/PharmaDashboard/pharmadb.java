
package PharmaDashboard;

import medicalapp.Welcomepage;

public class pharmadb extends javax.swing.JFrame {

    
    public pharmadb() {
        initComponents();
    }

    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pharmadb = new javax.swing.JPanel();
        logout = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pharmadb.setLayout(null);

        logout.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        logout.setText("LOGOUT");
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutMouseClicked(evt);
            }
        });
        pharmadb.add(logout);
        logout.setBounds(830, 20, 50, 14);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/1 (2).png"))); // NOI18N
        pharmadb.add(jLabel1);
        jLabel1.setBounds(0, 0, 900, 506);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pharmadb, javax.swing.GroupLayout.DEFAULT_SIZE, 899, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pharmadb, javax.swing.GroupLayout.DEFAULT_SIZE, 504, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
        Welcomepage wm = new Welcomepage();
        wm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logoutMouseClicked

   
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pharmadb().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel logout;
    private javax.swing.JPanel pharmadb;
    // End of variables declaration//GEN-END:variables
}
