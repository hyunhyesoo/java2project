package w1015;

import center_frame.CenterFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RadioButtonTest extends JFrame {
    String[]rbStrArr = {"아이브", "뉴진스", "블랙핑크"};
    String[]imgNameArr = {"ive.jpg", "new.jpg", "bl.jpg"};
    JRadioButton[] rbArr = new JRadioButton[rbStrArr.length];
    JLabel lbl = new JLabel("", JLabel.CENTER);

    public RadioButtonTest() {
        JPanel panel = new JPanel();
        ButtonGroup bg = new ButtonGroup();
        int i = 0;
        for(String str : rbStrArr) {
            rbArr[i] = new JRadioButton(str);
            rbArr[i].addActionListener(radioListener);
            bg.add(rbArr[i]);
            panel.add(rbArr[i]);
            i++;
        }
        lbl.setOpaque(true);
        lbl.setBackground(Color.YELLOW);
        add(panel, "North");
        add(lbl, "Center");
//        위랑 똑같은 내용의 코드
//        for (int i = 0; i < rbStrArr.length; i++) {
//            rbArr[i] = new JRadioButton(rbStrArr[i]);
//        }

        setTitle("RadioButtonTest");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //JFrame이 모니터 화면 정중앙에 오도록 한다
        CenterFrame cf = new CenterFrame(500, 300);
        cf.centerXY();
        setBounds(cf.getX(), cf.getY(), cf.getFw(), cf.getFh());
        setVisible(true); //화면 출력
    }

    ActionListener radioListener = new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {
//            if (rbArr[0].isSelected()) {
//                JOptionPane.showMessageDialog(null, rbStrArr[0] + "가 선택되었습니다");
//            }else if (rbArr[1].isSelected()) {
//                JOptionPane.showMessageDialog(null, rbStrArr[1] + "가 선택되었습니다");
//            }else {
//                JOptionPane.showMessageDialog(null, rbStrArr[2] + "가 선택되었습니다");
//            }
//        }
            int i = 0;
            for (JRadioButton rb : rbArr) {
                if (rb.isSelected()) {
                    ImageIcon img = new ImageIcon("D:/Java2Projects/JavaProject2/src/w1015/imgs/" + imgNameArr[i]);
                    lbl.setIcon(img);
                    JOptionPane.showMessageDialog(null, rb.getText() + "가 선택되었습니다");
                }
                i++;
            }
        }
    };

    public static void main(String[] args) {
        new RadioButtonTest();
    }
}
