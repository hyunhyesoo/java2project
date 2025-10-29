package w1029;

import center_frame.CenterFrame;

import javax.swing.*;
import java.awt.*;

public class CardLayoutTest extends JFrame {
    public CardLayoutTest() {
        setLayout(new CardLayout(5, 5)); //JTdbbedPane 활용하면 훨씬 쉽게 할 수 있음
        for (int i = 0; i < 3; i++) {
            JButton btn = new JButton("버튼" + (i+1));
            add(btn);
        }

        setTitle("카드 레이아웃 테스트");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        CenterFrame cf = new CenterFrame(250, 250);
        cf.centerXY();
        setBounds(cf.getX(), cf.getY(), cf.getFw(), cf.getFh());
        setVisible(true);
    }


    public static void main(String[] args) {
        new CardLayoutTest();
    }
}
