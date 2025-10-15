package w1015;

import center_frame.CenterFrame;

import javax.swing.*;

public class ImageIconTest extends JFrame {
    public ImageIconTest() {
        ImageIcon icon1 = new ImageIcon("D:/Java2Projects/JavaProject2/src/w1015/imgs/ive.jpg");
        ImageIcon icon2 = new ImageIcon("D:/Java2Projects/JavaProject2/src/w1015/imgs/new.jpg");
//        ImageIcon icon3 = new ImageIcon("D:/Java2Projects/JavaProject2/src/w1015/imgs/bl.jpg");
        JLabel label = new JLabel(icon1);
        JButton button = new JButton(icon2);
        add(label, "North");
        add(button, "Center");

        setTitle("ImageIconTest");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //JFrame이 모니터 화면 정중앙에 오도록 한다
        CenterFrame cf = new CenterFrame(500, 500);
        cf.centerXY();
        setBounds(cf.getX(), cf.getY(), cf.getFw(), cf.getFh());
        setVisible(true); //화면 출력
    }

    public static void main(String[] args) {
        new ImageIconTest();
    }
}
