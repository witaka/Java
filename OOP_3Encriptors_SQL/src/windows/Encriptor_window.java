/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package windows;

import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;
import javax.swing.JTextField;


public class Encriptor_window extends JFrame
{
    private JTextField tf;
    private Font f1;
    private Font f2;
    private JRadioButton rb1;
    private JRadioButton rb2;
    private JRadioButton rb3;
    private ButtonGroup group;
    
    public Encriptor_window()
    {
          super("Encriptor");
          setLayout(new FlowLayout());
          
          tf = new JTextField("",25);
          add(tf);
          
          rb1 = new JRadioButton("plain",true);
          rb2 = new JRadioButton("plain",false);
          rb3 = new JRadioButton("plain",false);
          add(rb1);
          add(rb2);
          add(rb3);
          
          group = new ButtonGroup();
          group.add(rb1);
          group.add(rb2);
          group.add(rb3);
          
          f1 = new Font("Serif", Font.PLAIN, 14);
          f2 = new Font("Serif", Font.BOLD, 16);
        
          rb1.addItemListener(new HandlerClass(f1));
          rb2.addItemListener(new HandlerClass(f2));
          rb3.addItemListener(new HandlerClass(f1));
          

               
    }
    
    private class HandlerClass implements ItemListener
    {
           private Font font;
           
           public HandlerClass(Font f)
           {
              font =f;
           }

        @Override
        public void itemStateChanged(ItemEvent event) {
            tf.setFont(font);
        }
           
    }
    
}
