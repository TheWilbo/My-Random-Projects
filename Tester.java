import java.awt.BorderLayout;
import java.net.URI;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Tester {
    public static void main(String[] args){
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        //panel.setLayout(new GridLayout(0,1));
        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("I'm Hungry \uD83C\uDF54");
        frame.pack();
        frame.setVisible(true);
        JLabel label = new JLabel("Push Worked!");
        panel.add(label);
        try {
   
            URI uri= new URI("https://www.youtube.com/watch?v=dQw4w9WgXcQ");
        
            java.awt.Desktop.getDesktop().browse(uri);
            System.out.println("Web page opened in browser");
      
       } catch (Exception e) {
        
            e.printStackTrace();
       }
    }
}
