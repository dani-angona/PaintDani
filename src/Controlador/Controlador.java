/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Modelo;
import Vista.Lienzo;
import Vista.Vista;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;

/**
 *
 * @author dania
 */
public class Controlador implements ActionListener {
    
    private Modelo modelo;
    private Vista vista;
    private Lienzo lienzo;

    public Controlador(Modelo modelo, Vista vista) {
        this.modelo = modelo;
        this.vista = vista;
        
        JPanel jPanelLienzo = vista.getJPanelLienzo();
        lienzo = new Lienzo(jPanelLienzo.getWidth(), jPanelLienzo.getHeight());
        jPanelLienzo.setLayout(new java.awt.BorderLayout());
        jPanelLienzo.add(lienzo);
        
        this.vista.getBtnNegro().addActionListener(this);
        this.vista.getBtnAzul().addActionListener(this);
        this.vista.getBtnRojo().addActionListener(this);
        this.vista.getBtnVerde().addActionListener(this);
        this.vista.getBtnMarron().addActionListener(this);
        this.vista.getBtnLimpiar().addActionListener(this);
    }
    
    public void mostrar(){
        vista.setSize(640, 480);
        vista.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        
        if(e.getSource() == vista.getBtnLimpiar()){
            System.out.println("Limpiando lienzo");
            lienzo.limpiarLienzo();
        }
        else if(source == vista.getBtnNegro()){
            lienzo.setColorActual(new Color(0, 0, 0));
        }
        else if(source == vista.getBtnAzul()){
            lienzo.setColorActual(new Color(51, 51, 255));
        }
        else if(source == vista.getBtnRojo()){
            lienzo.setColorActual(new Color(255, 0, 0));
        }
        else if(source == vista.getBtnVerde()){
            lienzo.setColorActual(new Color(0, 204, 0));
        }
        else if(source == vista.getBtnMarron()){
            lienzo.setColorActual(new Color(102, 51, 0));
        }
    }
}