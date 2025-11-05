package w1105;

import center_frame.CenterFrame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuTest1 extends JFrame {
    JLabel lbl = new JLabel("메뉴 선택 시 문자열이 변경됩니다", JLabel.CENTER);
    JMenuItem menuItem = new JMenuItem("New");
    JMenuItem menuOpen = new JMenuItem("Open");
    JMenuItem menuClose = new JMenuItem("Close");

    public MenuTest1() {
        add(lbl);
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        JMenu fileMenu = new JMenu("File");
        JMenu editMenu = new JMenu("Edit");
        menuBar.add(fileMenu);
        menuBar.add(editMenu);

        fileMenu.add(menuItem);
        fileMenu.add(menuOpen);
        fileMenu.add(menuClose);

        menuItem.addActionListener(menuListner);
        menuOpen.addActionListener(menuListner);
        menuClose.addActionListener(menuListner);

        setTitle("메뉴 작성");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        CenterFrame cf = new CenterFrame(500, 400);
        cf.centerXY();
        setBounds(cf.getX(), cf.getY(), cf.getFw(), cf.getFh());
        setVisible(true);
    }

    ActionListener menuListner = new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            JMenuItem item = (JMenuItem) e.getSource();
            if(item == menuItem) {
                lbl.setText("[새문서]항목을 선택했습니다");
            } else if(item == menuOpen) {
                lbl.setText("[열기]항목을 선택했습니다");
            } else {
                System.exit(0);
            }
        }
    };

    public static void main(String[] args) {
        new MenuTest1();
    }
}
