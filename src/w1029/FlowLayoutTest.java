package w1029;

import center_frame.CenterFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class FlowLayoutTest extends JFrame {
    ArrayList<JButton> buttons = new ArrayList<JButton>();

    public FlowLayoutTest() {
        setLayout(new FlowLayout(FlowLayout.CENTER, 15, 15));
        for (int i = 0; i < 7; i++) {
            buttons.add(new JButton("버튼" + (i + 1)));
        }

        for (JButton button : buttons) {
            add(button);
            button.addActionListener(btnListener);
        }

        setTitle("플로우 레이아웃 테스트");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //없으면 종료 버튼 눌러도 프로그램은 종료 안 됨
        CenterFrame cf = new CenterFrame(250, 250);
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
        new FlowLayoutTest();
    }
}
