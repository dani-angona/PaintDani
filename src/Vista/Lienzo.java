/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import javax.swing.JPanel;

/**
 *
 * @author dania
 */
public class Lienzo extends JPanel implements MouseListener, MouseMotionListener {
    private BufferedImage lienzo;
    private Graphics2D g2d;
    private Point puntoEnCurso;
    private Color colorActual;

    public Lienzo(int width, int height) {
        super();
        puntoEnCurso = new Point();
        iniciando(width, height);
    }
    
    private void iniciando(int width, int height){
        lienzo = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        g2d = lienzo.createGraphics();
        g2d.setBackground(Color.WHITE);
        g2d.clearRect(0, 0, width, height);
        g2d.setStroke(new BasicStroke(2));
        
        this.addMouseListener(this);
        this.addMouseMotionListener(this);
    }
    
    public void limpiarLienzo(){
        g2d.setColor(getBackground());
        g2d.fillRect(0, 0, lienzo.getWidth(), lienzo.getHeight());
        repaint();
    }

    public Color getColorActual() {
        return this.colorActual;
    }

    public void setColorActual(Color colorActual) {
        this.colorActual = colorActual;
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawImage(lienzo, 0, 0, null);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
        puntoEnCurso.setLocation(e.getPoint());
        System.out.println("P-> " + puntoEnCurso.toString());
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
        
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        Point nuevoPunto = e.getPoint();
        g2d.setColor(colorActual);
        g2d.drawLine(puntoEnCurso.x, puntoEnCurso.y, nuevoPunto.x, nuevoPunto.y);
        puntoEnCurso.setLocation(nuevoPunto);
        repaint();
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        
    }
}