package w1001;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JButtonTest2 extends JFrame {
    JTextField fld;
    public JButtonTest2() {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension screenSize = toolkit.getScreenSize();
        int screenWidth = screenSize.width;
        int screenHeight = screenSize.height;
        int fw = 500;
        int fh = 200;
        int x = (screenWidth - fw) / 2;
        int y = (screenHeight - fh) / 2;

        setLayout(new FlowLayout(FlowLayout.CENTER));
        setTitle(("JButton Test2"));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JButton btn = new JButton("확인");
        add(btn);
        fld = new JTextField(20);
        add(fld);
        btn.addActionListener(btnListener);

        setBounds(x, y, fw, fh);
        setVisible(true);
    }

    ActionListener btnListener = new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(null, fld.getText() + "(이)가 입력되었습니다");
        }
    }; //콜백메서드(대기하고 있다가 호출되면 실행함)

    public static void main(String[] args) {
        new JButtonTest2();
    }
}

