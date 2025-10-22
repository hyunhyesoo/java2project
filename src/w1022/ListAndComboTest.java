package w1022;

import center_frame.CenterFrame;

import javax.swing.*;
import java.awt.*;

public class ListAndComboTest extends JFrame {
    JList list;
    JComboBox combo;
    String[] items = {"사과", "딸기", "귤", "포도", "망고", "블루베리", "메론", "복숭아", "수박", "무화과", "오렌지"};

    public ListAndComboTest() {
        setLayout(new FlowLayout());
        list = new JList(items);
        combo = new JComboBox(items);
        add(list);
        add(combo);

        setTitle("항목선택 가능 컴포넌트");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //없으면 종료 버튼 눌러도 프로그램은 종료 안 됨
        CenterFrame cf = new CenterFrame(300, 250);
        cf.centerXY();
        setBounds(cf.getX(), cf.getY(), cf.getFw(), cf.getFh());
        setVisible(true); //컴포넌트가 프레임에 추가된 다음에 작성해야 함(화면에 보이도록)
    }

    public static void main(String[] args) {
        new ListAndComboTest();
    }
}


