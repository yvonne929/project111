package ch6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Main extends JPanel implements KeyListener{
    Sheep s;

    //創建羊(物件)
    public Main(){
      s = new Sheep(40,40);
      addKeyListener(this);
    }

    //繪製羊(物件)
    @Override
    public void paintComponent(Graphics g){
        g.setColor(Color.BLACK);//設定視窗顏色
        g.fillRect(0,0,getWidth(),getHeight());//顏色填滿整個視窗,意思:從(0,0)~(getWidth(),getHeight())
        s.drawSheep(g);//用 s 裡的 method 繪製羊
        requestFocusInWindow();
    }

    public static void main(String[] args) {
        JFrame window = new JFrame();
        window.setContentPane(new Main());//視窗內容
        window.setSize(500,500);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent keyEvent) {

    }

    @Override
    public void keyPressed(KeyEvent keyEvent) {//按下按鍵
        int k = keyEvent.getKeyCode();//取得按下按鍵的ASCII keyCode
        System.out.println(k);
        if (k == KeyEvent.VK_UP){//按"上"
            s.walk(0,-5);
        }
        if (k == KeyEvent.VK_DOWN){//按"下"
            s.walk(0,5);
        }
        if (k == KeyEvent.VK_LEFT){//按"左"
            s.walk(-5,0);
        }
        if (k == KeyEvent.VK_RIGHT){//按"右"
            s.walk(5,0);
        }
        repaint();//重新繪製
    }

    @Override
    public void keyReleased(KeyEvent keyEvent) {

    }
}
