package w1112;

import center_frame.CenterFrame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MessageDialogTest extends JFrame implements ActionListener {
    String[] btnStrs = {"Plain", "Warning", "Information"};
    JButton[] btns = new JButton[btnStrs.length];

    public MessageDialogTest() {
        JPanel panel = new JPanel();
        add(panel, "North");

        for (int i = 0; i < btnStrs.length; i++) {
            btns[i] = new JButton(btnStrs[i]);
            btns[i].addActionListener(this);
            panel.add(btns[i]);
        }


        setTitle("메시지대화상자 연습");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        CenterFrame cf = new CenterFrame(500, 400);
        cf.centerXY();
        setBounds(cf.getX(), cf.getY(), cf.getFw(), cf.getFh());
        setVisible(true);
    }

    public static void main(String[] args) {
        new MessageDialogTest();
    }

    public void actionPerformed(ActionEvent e) {
        //버튼 객체 위의 문자열 반환
        String eBtnStr = e.getActionCommand();
        switch (eBtnStr) {
            case "Plain":
                JOptionPane.showMessageDialog(null, "일반 메시지 대화상자", "plain option", JOptionPane.PLAIN_MESSAGE);
                break;
            case "Warning":
                JOptionPane.showMessageDialog(null, "경고 메시지 대화상자", "warning option", JOptionPane.WARNING_MESSAGE);
                break;
            case "Information":
                JOptionPane.showMessageDialog(null, "정보 메시지 대화상자", "information option", JOptionPane.INFORMATION_MESSAGE);
                break;
        }
    }
}
