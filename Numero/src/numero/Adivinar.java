/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numero;
import java.util.Random;
import javax.swing.JOptionPane;
/**
 *
 * @author ESFOT
 */
public class Adivinar extends javax.swing.JFrame {
    int aleatorio=(int)(Math.random()*1000);
   // Random numAleatorio = new Random();
    
    public Adivinar() {
        initComponents();
       // System.out.println(numAleatorio.nextInt(1000));
        System.out.println(aleatorio);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        lblAviso = new javax.swing.JLabel();
        lblAnuncio = new javax.swing.JLabel();
        txtIntento = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        lblDemasiadoBajo = new javax.swing.JLabel();
        btnOkintento = new javax.swing.JButton();
        btnJugarotravez = new javax.swing.JButton();
        lblDemasiadoAlto = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 0, 0));

        lblTitulo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(204, 0, 0));
        lblTitulo.setText("ADIVINAR EL NUMERO");

        lblAviso.setText("Tengo un numero entre 1 y 1000. Puede usted adivinarlo?");

        lblAnuncio.setText("Por favor escriba su primer intento:");

        btnOkintento.setText("OK");
        btnOkintento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkintentoActionPerformed(evt);
            }
        });

        btnJugarotravez.setText("JUGAR OTRA VEZ");
        btnJugarotravez.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJugarotravezActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(222, 222, 222)
                        .addComponent(lblTitulo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(lblAnuncio)
                        .addGap(10, 10, 10)
                        .addComponent(txtIntento, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(243, 243, 243)
                        .addComponent(btnOkintento)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnJugarotravez)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(59, 59, 59)
                            .addComponent(lblDemasiadoBajo, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(43, 43, 43)
                            .addComponent(lblAviso))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblDemasiadoAlto, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(154, 154, 154))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addComponent(lblTitulo)
                .addGap(18, 18, 18)
                .addComponent(lblAviso)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(lblAnuncio))
                    .addComponent(txtIntento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addComponent(btnOkintento)
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblDemasiadoAlto, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                    .addComponent(lblDemasiadoBajo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(59, 59, 59)
                .addComponent(btnJugarotravez)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOkintentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkintentoActionPerformed
        
        int intento = Integer.parseInt(txtIntento.getText());
        if(intento<aleatorio){
                lblDemasiadoBajo.setText("Demasiado Bajo");
                lblDemasiadoAlto.setText("");
            }else{
                lblDemasiadoAlto.setText("Demasiado alto");
                lblDemasiadoBajo.setText("");
            }
        if(intento<aleatorio+100 && intento > aleatorio-100){
            
            getContentPane().setBackground(new java.awt.Color(204,0,0));//rojo

        }else{
            
            getContentPane().setBackground(new java.awt.Color(0,51,255));

        } if(intento==aleatorio){
            JOptionPane.showMessageDialog(rootPane, "CORRECTO");
            txtIntento.setEnabled(false);
            lblDemasiadoBajo.setText("");
            lblDemasiadoAlto.setText("");
        }
        
    }//GEN-LAST:event_btnOkintentoActionPerformed

    private void btnJugarotravezActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJugarotravezActionPerformed
        aleatorio=(int)(Math.random()*1000);
        System.out.println(aleatorio);
        txtIntento.setEnabled(true);
        txtIntento.setText("");
    }//GEN-LAST:event_btnJugarotravezActionPerformed

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
            java.util.logging.Logger.getLogger(Adivinar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Adivinar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Adivinar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Adivinar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Adivinar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnJugarotravez;
    private javax.swing.JButton btnOkintento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblAnuncio;
    private javax.swing.JLabel lblAviso;
    private javax.swing.JLabel lblDemasiadoAlto;
    private javax.swing.JLabel lblDemasiadoBajo;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtIntento;
    // End of variables declaration//GEN-END:variables
}
