package w1022;

import center_frame.CenterFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectFood extends JFrame{
    JComboBox combo;
    String[] items = {"떡만두국", "샐러드", "닭볶음탕", "순두부찌개", "돈까스", "카레라이스", "떡볶이"};
    JLabel imglabel;

    public SelectFood() {
        JPanel north = new JPanel(new FlowLayout(FlowLayout.CENTER)); // 가운데 정렬
        JLabel label = new JLabel("Food: ");
        combo = new JComboBox(items);
        JButton btn = new JButton("선택");
        btn.addActionListener(btnListener);
        add(north, BorderLayout.NORTH);
        north.add(label, "Left");
        north.add(combo, "Center");
        north.add(btn, "Right");
        imglabel = new JLabel(new ImageIcon("./imgs/food01.jpg"));
        add(imglabel, "Center");
        btn.addActionListener(btnListener);

        setTitle("음식 선택 컴포넌트");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //없으면 종료 버튼 눌러도 프로그램은 종료 안 됨
        CenterFrame cf = new CenterFrame(500, 400);
        cf.centerXY();
        setBounds(cf.getX(), cf.getY(), cf.getFw(), cf.getFh());
        setVisible(true); //컴포넌트가 프레임에 추가된 다음에 작성해야 함(화면에 보이도록)
    }

    ActionListener btnListener = new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            int selected = combo.getSelectedIndex();
            ImageIcon icon = new ImageIcon("D:/Java2Projects/JavaProject2/src/w1022/imgs/food0" + (selected + 1) + ".jpg");
            imglabel.setIcon(icon);
        }
    };

    public static void main(String[] args) {
        new SelectFood();
    }
}
