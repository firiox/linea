/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.linea;

/**
 *
 * @author he_fa
 */
import javax.swing.JFrame;

public class MainWindow extends JFrame {
    public MainWindow(){
               
        setVisible(true);
    }
  
    public static void main(String... args){
        MainWindow ventana = new MainWindow();
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Creacion
        Canva canva = new Canva();
        //Asignacion
        ventana.setContentPane(canva);
        ventana.pack();
        //Localizacion
        ventana.setLocation(200,200);
        
    }
}
