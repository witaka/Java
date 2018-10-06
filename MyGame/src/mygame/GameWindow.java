package mygame;

import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import javax.swing.JFrame;

public class GameWindow extends JFrame 
{
   GraphicsDevice objDevice = GraphicsEnvironment.getLocalGraphicsEnvironment().getScreenDevices()[0]; 
   
   public GameWindow(String title,int width, int height)
   {
        setTitle(title);
        setSize(width,height);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false);
   }   
   public void setFullScreen(int nFullScreenMode)
   {
        switch(nFullScreenMode)
        {
            case 0: 
                System.out.println("No full screen");
                setUndecorated(false);
                break;
            case 1: 
                System.out.println("No full screen");
                setExtendedState(JFrame.MAXIMIZED_BOTH);
                setUndecorated(true);
                break;
            case 2: 
                System.out.println("No full screen");
                objDevice.setFullScreenWindow(this);
                setUndecorated(true);
                break;
            default: System.err.println("error");
                break;
        }
   }
   
}
