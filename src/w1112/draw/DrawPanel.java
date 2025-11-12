package w1112.draw;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class DrawPanel extends JPanel {
    String polygon;
    int x1, y1, x2, y2;

    public DrawPanel(String polygon) {
        this.polygon = polygon;
        setBackground(Color.yellow);
        addMouseListener(mouseListner);
    }

    MouseAdapter mouseListner = new MouseAdapter() {
        @Override
        public void mousePressed(MouseEvent e) {
            x1 = e.getX();
            y1 = e.getY();
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            x2 = e.getX();
            y2 = e.getY();
            repaint();  // 좌표 찍혔으니 다시 그리기
        }
    };

    public void clearXY() {
        x1 = 0;
        y1 = 0;
        x2 = 0;
        y2 = 0;
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        switch (polygon) {
            case "선":
                g.setColor(Color.RED);
                g.drawLine(x1, y1, x2, y2);
                break;
            case "사각형":
                g.setColor(Color.green);
                g.fillRect(x1, y1, x2-x1, y2-y1);
                break;
            case "타원형":
                g.setColor(Color.blue);
                g.drawOval(x1, y1, x2-x1, y2-y1);
                break;
        }
    }
}
