package ch3;

import javax.swing.*;
import java.awt.*;

public class GUI extends JPanel {
    public void paintComponent(Graphics g){
        g.drawString("Hello world in window",150,150);
    }

    public static void main(String[] args) {
        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(400,350);
        window.setContentPane(new GUI());
        window.setVisible(true);
    }
}
