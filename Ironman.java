/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week11;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;
/**
 *
 * @author sitian.chen
 */
public class Ironman {
      private static JFrame frame;
  
    public static void main(String[] args){
        //add a new frame
        frame = new JFrame("Iron Man 3");
        
        frame.setLayout(new FlowLayout(FlowLayout.LEFT,0,0));
        
        //set up panel
        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(480,300));
        panel.setBackground(Color.green);
        frame.add(panel);
        
        //inside panel
        JPanel paneltop = new JPanel();
        paneltop.setPreferredSize(new Dimension(480,40));
        paneltop.setBackground(Color.yellow);
        panel.add(paneltop);
        
        //inside panel
        JPanel panelleft = new JPanel();
        panelleft.setPreferredSize(new Dimension(100,220));
        panelleft.setBackground(Color.blue);
        panel.add(panelleft);
        
        //inside panel
        JPanel panelmid = new JPanel();
        panelmid.setPreferredSize(new Dimension(280,220));
        panelmid.setBackground(Color.orange);
        panel.add(panelmid);
        
        //inside panelmid
        JPanel panelpic = new JPanel();
        panelpic.setPreferredSize(new Dimension(280,160));
        panelpic.setBackground(Color.CYAN);
        panelmid.add(panelpic);
        
        //inside panelmid
        JPanel panelbutton = new JPanel();
        panelbutton.setPreferredSize(new Dimension(280,40));
        panelbutton.setBackground(Color.black);
        panelmid.add(panelbutton);
        
        //add button
        JButton masterbt = new JButton("Master");
        masterbt.setBackground(Color.GRAY);
        masterbt.setBounds(100, 0, 20, 10);
        panelbutton.add(masterbt);
        
        JButton p1bt = new JButton("P1");
        p1bt.setBackground(Color.GRAY);
        p1bt.setBounds(120, 0, 20, 10);
        panelbutton.add(p1bt);
        
        JButton p2bt = new JButton("P2");
        p2bt.setBounds(140, 0, 20, 10);
        p2bt.setBackground(Color.GRAY);
        panelbutton.add(p2bt);
        
        JButton p3bt = new JButton("P3");
        p3bt.setBounds(160, 0, 20, 10);
        p3bt.setBackground(Color.GRAY);
        panelbutton.add(p3bt);
        
        JButton p4bt = new JButton("P4");
        p4bt.setBounds(180, 0, 20, 10);
        p4bt.setBackground(Color.GRAY);
        panelbutton.add(p4bt);
        
        
        //inside panel
        JPanel panelright=new JPanel();
        panelright.setPreferredSize(new Dimension(80,220));
        panelright.setBackground(Color.blue);
        panel.add(panelright);

        
        
        frame.setSize(600,300);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
        //add a button to the frame

        
        //Container container = frame.getContentPane();
        //container.add(masterbt);
        
        //add color
        
        
    }//close main method
}
