package ch3;

import javax.swing.*;
import java.awt.*;

public class GUI extends JPanel {
    public void paintComponent(Graphics g){
        //在 Panel裡設文字
        //g.drawString("Hello world in window",150,150);

        //在 Panel設線條及圖形
//        g.setColor(Color.BLUE);
//        g.drawLine(100,80,355,290);
//        g.setColor(Color.RED);
//        g.drawRect(50,50,120,80);
//        g.setColor(Color.orange);
//        g.fillRect(50,50,120,80);

        ImageIcon img = new ImageIcon("lantern.jpg");
        img.paintIcon(null,g,20,20);
    }

    public static void main(String[] args) {
        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(400,350);
        window.setContentPane(new GUI());
        window.setVisible(true);
    }
}
