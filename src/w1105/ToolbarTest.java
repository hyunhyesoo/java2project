package w1105;

import center_frame.CenterFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ToolbarTest extends JFrame {
    JLabel lbl = new JLabel("툴바의 항목을 선택하세요");
    JButton button1 = new JButton(new ImageIcon("D:/Java2Projects/JavaProject2/src/w1105/images/new.png"));
    JButton button2 = new JButton(new ImageIcon("D:/Java2Projects/JavaProject2/src/w1105/images//open.png"));
    JButton button3 = new JButton(new ImageIcon("D:/Java2Projects/JavaProject2/src/w1105/images//close.png"));
    public ToolbarTest() {
        JToolBar toolbar = new JToolBar();
        add(toolbar, BorderLayout.NORTH);

        toolbar.add(button1);
        toolbar.add(button2);
        toolbar.addSeparator();
        toolbar.add(button3);

        setTitle("툴바 작성");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        CenterFrame cf = new CenterFrame(500, 400);
        cf.centerXY();
        setBounds(cf.getX(), cf.getY(), cf.getFw(), cf.getFh());
        setVisible(true);
    }

    ActionListener btnListner = new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            JButton btn = (JButton) e.getSource();
            if(btn == button1) {
                lbl.setText("[새문서]항목을 선택했습니다");
            } else if(btn == button2) {
                lbl.setText("[열기]항목을 선택했습니다");
            } else {
                System.exit(0);
            }
        }
    };

    public static void main(String[] args) {
        new ToolbarTest();
    }
}
