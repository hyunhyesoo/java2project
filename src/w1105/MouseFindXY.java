package w1105;

import center_frame.CenterFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MouseFindXY extends JFrame {
    JTextField tfX, tfY;

    public MouseFindXY() {
        setLayout(new FlowLayout());
        addMouseListener(mouseListner);
        tfX = new JTextField(10);
        tfY = new JTextField(10);
        JLabel lblX = new JLabel("X좌표: ");
        JLabel lblY = new JLabel("Y좌표: ");
        add(lblX); add(tfX);
        add(lblY); add(tfY);

        setTitle("Mouse Find Location");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //없으면 종료 버튼 눌러도 프로그램은 종료 안 됨
        CenterFrame cf = new CenterFrame(500, 400);
        cf.centerXY();
        setBounds(cf.getX(), cf.getY(), cf.getFw(), cf.getFh());
        setVisible(true);
    }

    MouseAdapter mouseListner = new MouseAdapter() {
        @Override
        public void mousePressed(MouseEvent e) {
            tfX.setText(e.getX() + "");
            tfY.setText(e.getY() + "");
        }
    };

    public static void main(String[] args) {
        new MouseFindXY();
    }
}
