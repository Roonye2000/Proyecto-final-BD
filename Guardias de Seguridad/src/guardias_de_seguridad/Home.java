package guardias_de_seguridad;

import javax.swing.ImageIcon;

public class Home extends javax.swing.JFrame {
    
    //Objetos
    Guardias guardias = new Guardias();
    Convenios convenios = new Convenios();
    Servicios servicios = new Servicios();
    Inconvenientes inconvenientes = new Inconvenientes();
    
    //Imagenes
    ImageIcon icon_Guardias = new ImageIcon(ClassLoader.getSystemResource("src/img/Guardia.png"));
    ImageIcon icon_Convenios = new ImageIcon(ClassLoader.getSystemResource("src/img/Convenio.png"));
    ImageIcon icon_Servicios = new ImageIcon(ClassLoader.getSystemResource("src/img/Servicios.png"));
    ImageIcon icon_Inconvenientes = new ImageIcon(ClassLoader.getSystemResource("src/img/Inconveniente.png"));
    
    public Home() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        Titulo_ventana = new javax.swing.JLabel();
        titulo_crud = new javax.swing.JLabel();
        titulo_transacciones = new javax.swing.JLabel();
        btn_guardias = new javax.swing.JButton();
        btn_servicios = new javax.swing.JButton();
        btn_convenios = new javax.swing.JButton();
        btn_inconvenientes = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Home");

        background.setBackground(new java.awt.Color(232, 240, 242));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Titulo_ventana.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        Titulo_ventana.setForeground(new java.awt.Color(0, 0, 0));
        Titulo_ventana.setText("Guardias de Seguridad");
        background.add(Titulo_ventana, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 50, -1, -1));

        titulo_crud.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        titulo_crud.setForeground(new java.awt.Color(0, 0, 0));
        titulo_crud.setText("CRUD");
        background.add(titulo_crud, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 145, -1, -1));

        titulo_transacciones.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        titulo_transacciones.setForeground(new java.awt.Color(0, 0, 0));
        titulo_transacciones.setText("Transacciones");
        background.add(titulo_transacciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 145, -1, -1));

        btn_guardias.setBackground(new java.awt.Color(162, 219, 250));
        btn_guardias.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        btn_guardias.setForeground(new java.awt.Color(0, 0, 0));
        btn_guardias.setIcon(icon_Guardias);
        btn_guardias.setText("Guardias");
        btn_guardias.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_guardias.setFocusable(false);
        btn_guardias.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_guardias.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_guardias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_guardiasMouseClicked(evt);
            }
        });
        background.add(btn_guardias, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 179, 125, 100));

        btn_servicios.setBackground(new java.awt.Color(162, 219, 250));
        btn_servicios.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        btn_servicios.setForeground(new java.awt.Color(0, 0, 0));
        btn_servicios.setIcon(icon_Servicios);
        btn_servicios.setText("Servicios solicitados");
        btn_servicios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_servicios.setFocusable(false);
        btn_servicios.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_servicios.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_servicios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_serviciosMouseClicked(evt);
            }
        });
        background.add(btn_servicios, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 179, 125, 100));

        btn_convenios.setBackground(new java.awt.Color(162, 219, 250));
        btn_convenios.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        btn_convenios.setForeground(new java.awt.Color(0, 0, 0));
        btn_convenios.setIcon(icon_Convenios);
        btn_convenios.setText("Convenios");
        btn_convenios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_convenios.setFocusable(false);
        btn_convenios.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_convenios.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_convenios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_conveniosMouseClicked(evt);
            }
        });
        background.add(btn_convenios, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 293, 125, 100));

        btn_inconvenientes.setBackground(new java.awt.Color(162, 219, 250));
        btn_inconvenientes.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        btn_inconvenientes.setForeground(new java.awt.Color(0, 0, 0));
        btn_inconvenientes.setIcon(icon_Inconvenientes);
        btn_inconvenientes.setText("Inconvenientes");
        btn_inconvenientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_inconvenientes.setFocusable(false);
        btn_inconvenientes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_inconvenientes.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_inconvenientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_inconvenientesMouseClicked(evt);
            }
        });
        btn_inconvenientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_inconvenientesActionPerformed(evt);
            }
        });
        background.add(btn_inconvenientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 293, 125, 100));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, 383, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, 462, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_inconvenientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_inconvenientesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_inconvenientesActionPerformed

    private void btn_guardiasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_guardiasMouseClicked
        guardias.setVisible(true);
    }//GEN-LAST:event_btn_guardiasMouseClicked

    private void btn_conveniosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_conveniosMouseClicked
        convenios.setVisible(true);
    }//GEN-LAST:event_btn_conveniosMouseClicked

    private void btn_serviciosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_serviciosMouseClicked
        servicios.setVisible(true);
    }//GEN-LAST:event_btn_serviciosMouseClicked

    private void btn_inconvenientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_inconvenientesMouseClicked
        inconvenientes.setVisible(true);
    }//GEN-LAST:event_btn_inconvenientesMouseClicked

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Titulo_ventana;
    private javax.swing.JPanel background;
    private javax.swing.JButton btn_convenios;
    private javax.swing.JButton btn_guardias;
    private javax.swing.JButton btn_inconvenientes;
    private javax.swing.JButton btn_servicios;
    private javax.swing.JLabel titulo_crud;
    private javax.swing.JLabel titulo_transacciones;
    // End of variables declaration//GEN-END:variables
}
