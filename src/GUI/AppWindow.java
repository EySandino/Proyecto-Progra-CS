package GUI;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class AppWindow extends JFrame{
    static JFrame appFrame;

    public AppWindow(JPanel window, int x, int y){
        appFrame = new JFrame();
        initFrame(x, y);
        
        window.setLocation(0, 0);
        
        appFrame.getContentPane().add(window);
        appFrame.pack();
    }
    
    private void initFrame(int x, int y){
        appFrame.setResizable(false);
        appFrame.setLocation(750, 150);
        appFrame.setUndecorated(true);
        appFrame.setVisible(true);
        appFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    public static void setWindowLocation(int x, int y){
        appFrame.setLocation(x, y);
    }
}
