package w1001;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JButtonTest extends JFrame {
    public JButtonTest() {
        setLayout(new FlowLayout(FlowLayout.CENTER));
        setTitle(("JButton Test"));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JButton btn = new JButton("클릭하세요");
        btn.addActionListener(btnListener);
        add(btn);
        JButton btn2 = new JButton("한번 더 클릭하세요");
        btn2.addActionListener(btnListener);
        add(btn2);
        //버튼 하나 당 액션리스너 하나만 가능

        String[] btnTexts = {"버튼1", "버튼2", "버튼3", "버튼4", "버튼5"};
        JButton[] btns = new JButton[btnTexts.length];
        for (int i = 0; i < btnTexts.length; i++) {
            btns[i] = new JButton(btnTexts[i]);
            btns[i].addActionListener(btnListener);
            add(btns[i]);
        }

        setBounds(500, 300, 400, 300);
        setVisible(true);
    }

    ActionListener btnListener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(null, e.getActionCommand() + " 버튼을 선택했습니다");
        }
    };

public static void main(String[] args) {
    new JButtonTest();
    }
}

