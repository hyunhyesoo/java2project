package w1029;

import center_frame.CenterFrame;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class LAB_GridDice extends JFrame {
    public LAB_GridDice() {
        Random rand = new Random();
        int rows = rand.nextInt(10) + 1;
        int cols = rand.nextInt(10) + 1;
        setLayout(new GridLayout(rows, cols));

        Color[] colors = {Color.pink, Color.white, Color.green, Color.cyan, Color.yellow, Color.orange};
        for (int i = 0; i < rows*cols; i++) {
            int diceNum = rand.nextInt(6) + 1;
            JButton btn = new JButton(diceNum + "");
            btn.setBackground(colors[diceNum - 1]); //주사위 배경색 / 인덱스 순서랑 맞춰주기 위해 -1했음
            add(btn);

        }

        setTitle("그리드레이아웃-랜덤다이스");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        CenterFrame cf = new CenterFrame(500, 500);
        cf.centerXY();
        setBounds(cf.getX(), cf.getY(), cf.getFw(), cf.getFh());
        setVisible(true);
    }

    public static void main(String[] args) {
        new LAB_GridDice();
    }
}
