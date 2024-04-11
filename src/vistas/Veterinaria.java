package vistas;

import entidades.Mascota;
import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Veterinaria extends javax.swing.JFrame {
   
    /**
     * Creates new form Principal1
     */
    public Veterinaria() {
        initComponents();
      
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImageIcon icono = new ImageIcon(getClass().getResource("/images/fielpet.jpg"));
        Image miImagen = icono.getImage();
        escritorio = new javax.swing.JDesktopPane(){
            public void paintComponent(Graphics g){
                g.drawImage(miImagen, 0, 0, getWidth(), getHeight(), this);
            }
        };
        mnuBarra = new javax.swing.JMenuBar();
        mSalir = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        mMascotas = new javax.swing.JMenuItem();
        mnuListar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("FielPet");
        setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        setResizable(false);
        setSize(new java.awt.Dimension(800, 800));

        escritorio.setPreferredSize(new java.awt.Dimension(600, 600));

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 900, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        mnuBarra.setBorder(new javax.swing.border.MatteBorder(null));
        mnuBarra.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N

        mSalir.setText("Archivo");
        mSalir.setToolTipText("");
        mSalir.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        mSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mSalirActionPerformed(evt);
            }
        });

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jMenuItem2.setText("Salir");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        mSalir.add(jMenuItem2);

        mnuBarra.add(mSalir);

        jMenu1.setText("Mascotas");
        jMenu1.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        mMascotas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.CTRL_MASK));
        mMascotas.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        mMascotas.setText("Formulario de mascotas");
        mMascotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mMascotasActionPerformed(evt);
            }
        });
        jMenu1.add(mMascotas);

        mnuListar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        mnuListar.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        mnuListar.setText("Listar Mascotas Registradas");
        mnuListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuListarActionPerformed(evt);
            }
        });
        jMenu1.add(mnuListar);

        mnuBarra.add(jMenu1);

        setJMenuBar(mnuBarra);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 877, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(918, 947));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void mSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mSalirActionPerformed
        // TODO add your handling code here:
       System.exit(0);
    }//GEN-LAST:event_mSalirActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
         System.exit(0);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void mMascotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mMascotasActionPerformed
          escritorio.removeAll(); //limpiar ventanas abiertas
          escritorio.repaint();
          PetsView va=new PetsView();
          va.setVisible(true);
          escritorio.add(va);
          escritorio.moveToFront(va);
    }//GEN-LAST:event_mMascotasActionPerformed

    private void mnuListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuListarActionPerformed
         escritorio.removeAll(); //limpiar ventanas abiertas
        escritorio.repaint();
          ListarView vlis=new ListarView();
          vlis.setVisible(true);
        escritorio.add(vlis);
        escritorio.moveToFront(vlis);
    }//GEN-LAST:event_mnuListarActionPerformed

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
            java.util.logging.Logger.getLogger(Veterinaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Veterinaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Veterinaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Veterinaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
     //   LocalDate.parse("1999/03/03");
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
     //   LocalDate.parse("1999/03/03");
       
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Veterinaria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem mMascotas;
    private javax.swing.JMenu mSalir;
    private javax.swing.JMenuBar mnuBarra;
    private javax.swing.JMenuItem mnuListar;
    // End of variables declaration//GEN-END:variables

  
}
