package w1001;

import javax.swing.*;
import java.awt.*;

//JFrame의 기본 LayoutManager(배치관리자): BorderLayout(동, 서, 남, 북, 가운데)
public class JLabelTest extends JFrame{
        public JLabelTest() {
            setLayout(new FlowLayout()); //자연스럽게 배치됨
            setTitle("JLableTest");
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            //setLocatioin(x,y) + setSize(width, height)
            String[] lblTexts = {"한국폴리텍대학", "서울정수캠퍼스", "인공지능소프트웨어과"};
//            String[] locTexts = {"North", "South", "Center"};
            Color[] lblBgColors = {Color.orange, Color.green, Color.BLUE};
            JLabel[] lbls = new JLabel[lblTexts.length];
            for (int i = 0; i < lbls.length; i++) {
                lbls[i] = new JLabel(lblTexts[i], JLabel.CENTER);
                lbls[i].setForeground(Color.WHITE);
                lbls[i].setOpaque(true);
                lbls[i].setBackground(lblBgColors[i]);
                add(lbls[i]);
            }
            //arrayList 사용해도 됨

            Font font = new Font("맑은 고딕", Font.BOLD, 30);
            lbls[2].setFont(font);

            setBounds(100, 100, 500, 500);
            setVisible(true);
        }

    public static void main(String[] args) {
        new JLabelTest();
    }
}
