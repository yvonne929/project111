package ch5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Window extends JPanel implements KeyListener, MouseListener {
    public Window() {
        addKeyListener(this);
        addMouseListener(this);
    }

    @Override //覆寫JPanel裡的method，意義:繪製的東西要在視窗裡
    public void paintComponent(Graphics g) {
        requestFocusInWindow();
    }

    public static void main(String[] args) {
        JFrame window = new JFrame();
        window.setSize(250, 250);
        window.setContentPane(new Window());//視窗裡的內容
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
    }

    //KeyListener Methods
    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println(e.getKeyCode());
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    //MouseListener Methods
    @Override
    public void mouseClicked(MouseEvent m) {
        System.out.println(m.getX() + "," + m.getY());
    }

    @Override
    public void mousePressed(MouseEvent mouseEvent) {

    }

    @Override
    public void mouseReleased(MouseEvent mouseEvent) {

    }

    @Override
    public void mouseEntered(MouseEvent mouseEvent) {

    }

    @Override
    public void mouseExited(MouseEvent mouseEvent) {

    }
}
