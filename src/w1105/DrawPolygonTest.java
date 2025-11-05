package w1105;

import center_frame.CenterFrame;

import javax.swing.*;
import java.awt.*;

public class DrawPolygonTest extends JFrame {
    public DrawPolygonTest() {
        DrawPanel dp = new DrawPanel();
        add(dp);

        setTitle("다각형 그리기");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //없으면 종료 버튼 눌러도 프로그램은 종료 안 됨
        CenterFrame cf = new CenterFrame(500, 400);
        cf.centerXY();
        setBounds(cf.getX(), cf.getY(), cf.getFw(), cf.getFh());
        setVisible(true);
    }

    public static void main(String[] args) {
        new DrawPolygonTest();
    }

        class DrawPanel extends JPanel {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(Color.pink);
                g.drawLine(10, 20, 490, 20);
                g.setColor(Color.blue);
                g.drawOval(20, 30, 150, 100);
                g.setColor(Color.green);
                g.fillOval(200, 30, 150, 100);
                g.setColor(Color.yellow);
                g.fillOval(370, 30, 100, 100);
                g.setColor(Color.magenta);
                g.drawRect(20, 160, 200, 150);
                g.setColor(Color.orange);
                g.fillRect(250, 160, 200, 200);
                g.setColor(Color.white);
                g.fillRoundRect(280, 190, 140, 140, 20, 20);
                g.setColor(Color.black);
                int[] xPoints = {120, 30, 200};
                int[] yPoints = {180, 215, 215};
                g.drawPolygon(xPoints, yPoints, xPoints.length);
        }
    }
}
