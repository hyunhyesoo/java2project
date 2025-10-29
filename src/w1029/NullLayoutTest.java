package w1029;

import center_frame.CenterFrame;

import javax.swing.*;
import java.awt.*;

public class NullLayoutTest extends JFrame {
    public NullLayoutTest() {
        setLayout(null); //배치관리자 없음, 컴포넌트의 위치와 크기를 절대값으로 설정 가능
        int[] xy = {30, 70, 110, 150};

        for (int i = 0; i < xy.length; i++) {
            JButton btn = new JButton("버튼" + (i+1));
            btn.setBounds(xy[i], xy[i], 70, 60);
            add(btn);
        }

        setTitle("레이아웃 매니저 null");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        CenterFrame cf = new CenterFrame(250, 250);
        cf.centerXY();
        setBounds(cf.getX(), cf.getY(), cf.getFw(), cf.getFh());
        setVisible(true);
    }


    public static void main(String[] args) {
        new NullLayoutTest();
    }
}
