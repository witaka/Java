/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package windows;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;


public class Rb  extends JFrame 
{
    Rb ()
    {
         JRadioButton male = new JRadioButton("male");
         JRadioButton female = new JRadioButton("Female");
         ButtonGroup bG = new ButtonGroup();
         bG.add(male);
         bG.add(female);
         this.setSize(800,600);
         this.setLayout( new FlowLayout());
         this.add(male);
         this.add(female);
         male.setSelected(true);
         this.setVisible(true);
    }
    public static void main(String args[])
    {
       Rb j = new Rb();
    }
}