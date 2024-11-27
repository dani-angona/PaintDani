/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author dania
 */
public class Vista extends javax.swing.JFrame implements ActionListener {

    /**
     * Creates new form Vista
     */
    public Vista() {
        System.out.println("Cargando Vista");
        initComponents();
        this.setSize(640, 480);
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

        jPanelColores = new javax.swing.JPanel();
        jToolBarColores = new javax.swing.JToolBar();
        btnNegro = new javax.swing.JButton();
        btnAzul = new javax.swing.JButton();
        btnRojo = new javax.swing.JButton();
        btnVerde = new javax.swing.JButton();
        btnMarron = new javax.swing.JButton();
        jToolBarLimpiar = new javax.swing.JToolBar();
        btnLimpiar = new javax.swing.JButton();
        jPanelLienzo = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jToolBarColores.setRollover(true);

        btnNegro.setBackground(new java.awt.Color(0, 0, 0));
        btnNegro.setText("NEGRO");
        btnNegro.setFocusable(false);
        btnNegro.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNegro.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBarColores.add(btnNegro);

        btnAzul.setBackground(new java.awt.Color(51, 51, 255));
        btnAzul.setText("AZUL");
        btnAzul.setFocusable(false);
        btnAzul.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAzul.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBarColores.add(btnAzul);

        btnRojo.setBackground(new java.awt.Color(255, 0, 0));
        btnRojo.setText("ROJO");
        btnRojo.setFocusable(false);
        btnRojo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRojo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBarColores.add(btnRojo);

        btnVerde.setBackground(new java.awt.Color(0, 204, 0));
        btnVerde.setText("VERDE");
        btnVerde.setFocusable(false);
        btnVerde.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnVerde.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBarColores.add(btnVerde);

        btnMarron.setBackground(new java.awt.Color(102, 51, 0));
        btnMarron.setText("MARRON");
        btnMarron.setFocusable(false);
        btnMarron.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMarron.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBarColores.add(btnMarron);

        jPanelColores.add(jToolBarColores);

        jToolBarLimpiar.setRollover(true);

        btnLimpiar.setText("LIMPIAR");
        btnLimpiar.setFocusable(false);
        btnLimpiar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnLimpiar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBarLimpiar.add(btnLimpiar);

        jPanelColores.add(jToolBarLimpiar);

        getContentPane().add(jPanelColores, java.awt.BorderLayout.PAGE_START);

        jPanelLienzo.setBackground(new java.awt.Color(255, 255, 255));
        jPanelLienzo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jPanelLienzo, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAzul;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnMarron;
    private javax.swing.JButton btnNegro;
    private javax.swing.JButton btnRojo;
    private javax.swing.JButton btnVerde;
    private javax.swing.JPanel jPanelColores;
    private javax.swing.JPanel jPanelLienzo;
    private javax.swing.JToolBar jToolBarColores;
    private javax.swing.JToolBar jToolBarLimpiar;
    // End of variables declaration//GEN-END:variables

    public JButton getBtnNegro(){
        return btnNegro;
    }
    
    public JButton getBtnAzul(){
        return btnAzul;
    }
    
    public JButton getBtnRojo(){
        return btnRojo;
    }
    
    public JButton getBtnVerde(){
        return btnVerde;
    }
    
    public JButton getBtnMarron(){
        return btnMarron;
    }
    
    public JPanel getJPanelColores(){
        return jPanelColores;
    }
    
    public JPanel getJPanelLienzo(){
        return jPanelLienzo;
    }
    
    public JButton getBtnLimpiar(){
        return btnLimpiar;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
}