/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.linea;

/**
 *
 * @author he_fa
 */
import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.Color;
import java.awt.Graphics;
public class Canva extends JPanel{
    public Canva(){
        this.setPreferredSize(new Dimension(300,300));
    }
    private void draw(Graphics g){
        g.drawLine(0,0,150,100);
    }
    @Override
    protected void paintComponent(Graphics g){
        draw(g);
    }
}
