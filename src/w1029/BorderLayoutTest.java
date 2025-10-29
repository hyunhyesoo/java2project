package w1029;

import center_frame.CenterFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BorderLayoutTest extends JFrame {
    public BorderLayoutTest() {
        setLayout(new BorderLayout(10, 10));
        String[] constraints = {"East", "West", "South", "North", "Center"};
        for (int i = 0; i < 5; i++) {
            JButton btn = new JButton(constraints[i] + "버튼");
            add(btn, constraints[i]);
            btn.addActionListener(btnListener);
        }


        setTitle("보더 레이아웃 테스트");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //없으면 종료 버튼 눌러도 프로그램은 종료 안 됨
        CenterFrame cf = new CenterFrame(300, 250);
        cf.centerXY();
        setBounds(cf.getX(), cf.getY(), cf.getFw(), cf.getFh());
        setVisible(true); //컴포넌트가 프레임에 추가된 다음에 작성해야 함(화면에 보이도록)
    }

    ActionListener btnListener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            JButton btn = (JButton) e.getSource();
            JOptionPane.showMessageDialog(null, btn.getText() + " 선택");
        }
    };

    public static void main(String[] args) {
        new BorderLayoutTest();
    }
}
