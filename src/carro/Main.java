/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carro;

import carro.Carro;
import java.awt.Dimension;
import javax.swing.JFrame;

/**
 *
 * @author Usuario14
 */
public class Main {
public static void main(String[]args){
    JFrame frame=new JFrame();
    frame.setSize(new Dimension(200,200));
    frame.add(new Carro());
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
}
}
