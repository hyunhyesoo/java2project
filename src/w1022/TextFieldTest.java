package w1022;

import center_frame.CenterFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextFieldTest extends JFrame {
    JTextField textField;
    JTextArea textArea;
    JPasswordField passwordField;

    public TextFieldTest() {
        textField = new JTextField(10);
        textArea = new JTextArea(5, 10);
        passwordField = new JPasswordField(10);
        JButton button = new JButton("SHOW MESSAGE");
        //버튼을 클릭했을 때 3개 컴포넌트에 입력된 값을 대화 상자에 출력
        button.addActionListener(btnListener);

        setLayout(new FlowLayout());

        add(textField);
        JScrollPane scrollPane = new JScrollPane(textArea); //스크롤 보이게
        add(scrollPane);
        add(passwordField);
        add(button);

        setTitle("텍스트입력 컴포넌트");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //없으면 종료 버튼 눌러도 프로그램은 종료 안 됨
        CenterFrame cf = new CenterFrame(200, 250);
        cf.centerXY();
        setBounds(cf.getX(), cf.getY(), cf.getFw(), cf.getFh());
        setVisible(true); //컴포넌트가 프레임에 추가된 다음에 작성해야 함(화면에 보이도록)
    }

    ActionListener btnListener = new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            String tf = textField.getText();
            String ta = textArea.getText();
            String pwd = String.copyValueOf(passwordField.getPassword()); // char형의 1차원 배열을 반환
            // String pwd = passwordField.getText(); 이렇게 하면 텍스트 반환, 이것도 사용은 가능한데 다른 방법을 추천하기 때문에 경고가 뜸
            JOptionPane.showMessageDialog(null, tf + "\n" + ta + "\n" + pwd);
        }
    };

    public static void main(String[] args) {
        new TextFieldTest();
    }
}
