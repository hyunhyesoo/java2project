package w1105;

import center_frame.CenterFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuAndToolbarTest extends JFrame {
    JLabel lbl = new JLabel("툴바의 항목을 선택하세요", JLabel.CENTER);
    JButton btnNew = new JButton(new ImageIcon("D:/Java2Projects/JavaProject2/src/w1105/images/new.png"));
    JButton btnOpen = new JButton(new ImageIcon("D:/Java2Projects/JavaProject2/src/w1105/images//open.png"));
    JButton btnClose = new JButton(new ImageIcon("D:/Java2Projects/JavaProject2/src/w1105/images//close.png"));

    JMenuItem menuNew = new JMenuItem("New");
    JMenuItem menuOpen = new JMenuItem("Open");
    JMenuItem menuClose = new JMenuItem("Close");

    public MenuAndToolbarTest() {
        JToolBar toolbar = new JToolBar();
        add(toolbar, BorderLayout.NORTH);
        add(lbl);

        toolbar.add(btnNew);
        toolbar.add(btnOpen);
        toolbar.addSeparator();
        toolbar.add(btnClose);

        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        JMenu fileMenu = new JMenu("File");
        JMenu editMenu = new JMenu("Edit");
        menuBar.add(fileMenu);
        menuBar.add(editMenu);

        fileMenu.add(menuNew);
        fileMenu.add(menuOpen);
        fileMenu.add(menuClose);

        btnNew.addActionListener(itemListner);
        btnOpen.addActionListener(itemListner);
        btnClose.addActionListener(itemListner);
        menuNew.addActionListener(itemListner);
        menuOpen.addActionListener(itemListner);
        menuClose.addActionListener(itemListner);

        setTitle("툴바 작성");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        CenterFrame cf = new CenterFrame(500, 400);
        cf.centerXY();
        setBounds(cf.getX(), cf.getY(), cf.getFw(), cf.getFh());
        setVisible(true);
    }

    ActionListener itemListner = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            JButton btn = null;
            JMenuItem item = null;
            if(e.getSource() instanceof JButton) {
                btn = (JButton)e.getSource();
            }else {
                item = (JMenuItem)e.getSource();
            }

            if(btn == btnNew || item == menuNew) {
                lbl.setText("[새문서]항목을 선택하셨습니다");
            } else if (btn == btnOpen || item == menuOpen) {
                lbl.setText("[열기]항목을 선택하셨습니다");
            } else {
                System.exit(0);
            }
        }
    };

    public static void main(String[] args) {
        new MenuAndToolbarTest();
    }
}
