/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import Controlador.*;
import java.util.*;
/**
 *
 * @author profe
 */
public class Menu extends javax.swing.JFrame {
    public int cantModulos;
    public ArrayList<String> nombres;
    public ArrayList<Modulo> modulos;
    public GrafoFabrica fabrica;
    /**
     * Creates new form Menu
     */
    public Menu() {
        nombres = new ArrayList<String>();
        modulos = new ArrayList<Modulo>();
        cantModulos = 0;
        fabrica = new GrafoFabrica();
        initComponents();
    }
    void agregarModulo(Modulo mod){
        modulos.add(mod);
        nombres.add(mod.nombre);
        fabrica.agregarNodo(mod.index);
    }
    
    void agregarArista(String origen, String destino, int peso){
        //Hcer algo
        Modulo origenMod = getModuloAt(origen);
        Modulo destinoMod = getModuloAt(destino);
        fabrica.agregarArista(origenMod.index, destinoMod.index, peso, origenMod.factorError);
    }
    
    Modulo getModuloAt(String nom){
        for(Modulo mod:modulos){
            if(nom.equals(mod.nombre)){
                return mod;
            }
        }
        return null;
    }
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialogFuenteSumidero = new javax.swing.JDialog();
        txtAgregar4 = new javax.swing.JLabel();
        txtAgregar5 = new javax.swing.JLabel();
        txtAgregar6 = new javax.swing.JLabel();
        txtAgregar7 = new javax.swing.JLabel();
        txtFieldFuente = new javax.swing.JTextField();
        txtFieldSumidero = new javax.swing.JTextField();
        btnComenzar = new javax.swing.JButton();
        txtAgregar2 = new javax.swing.JLabel();
        txtAgregar = new javax.swing.JLabel();
        txtAgregar1 = new javax.swing.JLabel();
        txtAgregar3 = new javax.swing.JLabel();
        btnArista = new javax.swing.JButton();
        btnModulo = new javax.swing.JButton();
        btnComenzarOptimizacion = new javax.swing.JButton();

        jDialogFuenteSumidero.setModal(true);
        jDialogFuenteSumidero.setPreferredSize(new java.awt.Dimension(400, 300));

        txtAgregar4.setFont(new java.awt.Font("Cascadia Code", 1, 12)); // NOI18N
        txtAgregar4.setText("Ingrese el  nombre  del modulo");

        txtAgregar5.setFont(new java.awt.Font("Cascadia Code", 1, 12)); // NOI18N
        txtAgregar5.setText("Ingrese  el  nombre  del modulo");

        txtAgregar6.setFont(new java.awt.Font("Cascadia Code", 1, 12)); // NOI18N
        txtAgregar6.setText(" que recibe la materia prima");

        txtAgregar7.setFont(new java.awt.Font("Cascadia Code", 1, 12)); // NOI18N
        txtAgregar7.setText("que despacha los productos");

        txtFieldFuente.setFont(new java.awt.Font("Cascadia Code", 0, 14)); // NOI18N
        txtFieldFuente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldFuenteActionPerformed(evt);
            }
        });

        txtFieldSumidero.setFont(new java.awt.Font("Cascadia Code", 0, 14)); // NOI18N
        txtFieldSumidero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldSumideroActionPerformed(evt);
            }
        });

        btnComenzar.setBackground(new java.awt.Color(30, 58, 95));
        btnComenzar.setFont(new java.awt.Font("Cascadia Code", 1, 18)); // NOI18N
        btnComenzar.setText("COMENZAR");
        btnComenzar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComenzarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jDialogFuenteSumideroLayout = new javax.swing.GroupLayout(jDialogFuenteSumidero.getContentPane());
        jDialogFuenteSumidero.getContentPane().setLayout(jDialogFuenteSumideroLayout);
        jDialogFuenteSumideroLayout.setHorizontalGroup(
            jDialogFuenteSumideroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialogFuenteSumideroLayout.createSequentialGroup()
                .addGroup(jDialogFuenteSumideroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDialogFuenteSumideroLayout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(txtFieldFuente, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jDialogFuenteSumideroLayout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addGroup(jDialogFuenteSumideroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jDialogFuenteSumideroLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(txtAgregar7))
                            .addComponent(txtAgregar5)
                            .addGroup(jDialogFuenteSumideroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtAgregar4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtAgregar6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jDialogFuenteSumideroLayout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(txtFieldSumidero, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jDialogFuenteSumideroLayout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(btnComenzar)))
                .addContainerGap(78, Short.MAX_VALUE))
        );
        jDialogFuenteSumideroLayout.setVerticalGroup(
            jDialogFuenteSumideroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialogFuenteSumideroLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(txtAgregar4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtAgregar6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtFieldFuente, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtAgregar5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtAgregar7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtFieldSumidero, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnComenzar)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Optimizador");

        txtAgregar2.setFont(new java.awt.Font("Cascadia Code", 1, 36)); // NOI18N
        txtAgregar2.setText("AGREGAR");

        txtAgregar.setFont(new java.awt.Font("Cascadia Code", 1, 36)); // NOI18N
        txtAgregar.setText("AGREGAR");

        txtAgregar1.setFont(new java.awt.Font("Cascadia Code", 1, 36)); // NOI18N
        txtAgregar1.setText("CONEXION");

        txtAgregar3.setFont(new java.awt.Font("Cascadia Code", 1, 36)); // NOI18N
        txtAgregar3.setText("MODULO");

        btnArista.setFont(new java.awt.Font("Cascadia Code", 1, 48)); // NOI18N
        btnArista.setText("+");
        btnArista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAristaActionPerformed(evt);
            }
        });

        btnModulo.setFont(new java.awt.Font("Cascadia Code", 1, 48)); // NOI18N
        btnModulo.setText("+");
        btnModulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModuloActionPerformed(evt);
            }
        });

        btnComenzarOptimizacion.setFont(new java.awt.Font("Cascadia Code", 1, 36)); // NOI18N
        btnComenzarOptimizacion.setText("COMENZAR");
        btnComenzarOptimizacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComenzarOptimizacionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(175, 175, 175)
                .addComponent(btnModulo, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnArista, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(164, 164, 164))
            .addGroup(layout.createSequentialGroup()
                .addGap(132, 132, 132)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(txtAgregar3)
                        .addGap(11, 11, 11))
                    .addComponent(txtAgregar, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 213, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtAgregar1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(txtAgregar2)
                        .addGap(11, 11, 11)))
                .addGap(111, 111, 111))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnComenzarOptimizacion)
                .addGap(281, 281, 281))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(153, 153, 153)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAgregar2)
                    .addComponent(txtAgregar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAgregar3)
                    .addComponent(txtAgregar1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnArista, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModulo, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addComponent(btnComenzarOptimizacion)
                .addGap(123, 123, 123))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAristaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAristaActionPerformed
        this.setVisible(false);
        AgregarConexion a = new AgregarConexion(this);
        a.setLocationRelativeTo(null);
        a.setVisible(true);
    }//GEN-LAST:event_btnAristaActionPerformed

    private void btnModuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModuloActionPerformed
        // TODO add your handling code here:
        AgregarModulo m = new AgregarModulo(this);
        m.setLocationRelativeTo(null);
        m.setVisible(true);
    }//GEN-LAST:event_btnModuloActionPerformed

    private void btnComenzarOptimizacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComenzarOptimizacionActionPerformed
        //Lanzar dialogs que le pidan el nombre de la fuente y el sumidero
        this.dispose();
        jDialogFuenteSumidero.setSize(400, 335);
        jDialogFuenteSumidero.setLocationRelativeTo(null);
        jDialogFuenteSumidero.setVisible(true);
    }//GEN-LAST:event_btnComenzarOptimizacionActionPerformed

    private void txtFieldFuenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldFuenteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldFuenteActionPerformed

    private void txtFieldSumideroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldSumideroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldSumideroActionPerformed

    
    
    
    private void btnComenzarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComenzarActionPerformed
        String fuente = txtFieldFuente.getText();
        String sumidero = txtFieldSumidero.getText();
        Modulo fuenteMod = getModuloAt(fuente);
        Modulo sumideroMod = getModuloAt(sumidero);
        int indexFuente = fuenteMod.index;
        int indexSumidero = sumideroMod.index;
        var parIdeal = fabrica.cuellosDeBotella(indexFuente, indexSumidero, false);
        //Lanzar una ventana de resultados:
        var parReal = fabrica.cuellosDeBotella(indexFuente, indexSumidero, true);
        Resultado r = new Resultado(parIdeal, parReal, modulos);
        r.setLocationRelativeTo(null);
        r.setVisible(true);
        jDialogFuenteSumidero.dispose();
        
        
        /*var listaAristas = parIdeal.second;
        for(var culpable:listaAristas){
            int nodoCulpable = culpable.first;
            System.out.println("El modulo "+nombres.get(nodoCulpable)+" tiene elementos que podrian ser mejorados");
            System.out.println(calcularMejora(nodoCulpable));
        }*/
        
    }//GEN-LAST:event_btnComenzarActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnArista;
    private javax.swing.JButton btnComenzar;
    private javax.swing.JButton btnComenzarOptimizacion;
    private javax.swing.JButton btnModulo;
    private javax.swing.JDialog jDialogFuenteSumidero;
    private javax.swing.JLabel txtAgregar;
    private javax.swing.JLabel txtAgregar1;
    private javax.swing.JLabel txtAgregar2;
    private javax.swing.JLabel txtAgregar3;
    private javax.swing.JLabel txtAgregar4;
    private javax.swing.JLabel txtAgregar5;
    private javax.swing.JLabel txtAgregar6;
    private javax.swing.JLabel txtAgregar7;
    private javax.swing.JTextField txtFieldFuente;
    private javax.swing.JTextField txtFieldSumidero;
    // End of variables declaration//GEN-END:variables
}