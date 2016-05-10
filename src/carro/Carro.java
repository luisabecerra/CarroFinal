/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carro;

import com.sun.prism.shader.FillCircle_Color_AlphaTest_Loader;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author Usuario14
 */
public class Carro extends JPanel implements ActionListener, KeyListener{
    private int x;
    private int y;
    private Timer timer;
    public Carro(){
        this.x=50;
        this.y=140;
        this.setFocusable(true);
        this.addKeyListener(this);
        this.timer=new Timer(50,this);
        this.timer.start();
                
    }
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(Color.BLACK);
        g.fillOval(this.x+2, this.y, 25, 25);
        g.fillOval(this.x+42, this.y, 25, 25);
        g.setColor(Color.BLACK);
        g.setColor(new Color (200,200,100));
        g.fillRect(this.x-15, this.y-10, 100, 15);
        g.setColor(new Color (250,170,250));
        Polygon poligon=new Polygon();
        poligon.addPoint(this.x+20, this.y-10);
        poligon.addPoint(this.x+20,this.y-30);
        poligon.addPoint(this.x+40,this.y-30);
        poligon.addPoint(this.x+70,this.y-10);
        g.fillPolygon(poligon);
     
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        this.x+=0;
        this.y+=0;
        if (this.x>150)
            this.x=50;
        if(this.y>200)
            this.y=140;
        repaint();
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
         switch (e.getKeyCode()) {
            case KeyEvent.VK_DOWN: y += 30; break;
            case KeyEvent.VK_UP: y -= 30; break;
            case KeyEvent.VK_LEFT: x -= 15; break;
            case KeyEvent.VK_RIGHT: x += 15; break;
           
          } //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyReleased(KeyEvent e) {
         
    }
    
    
}
