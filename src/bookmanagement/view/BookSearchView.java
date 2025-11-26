package bookmanagement.view;

import bookmanagement.domain.BookVO;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.ArrayList;

public class BookSearchView extends JPanel {
    JTable table;
    DefaultTableModel model;
    ArrayList<BookVO> bookVOList;
    String[] header = {"도서번호", "도서명", "출판사", "저자명", "도서가격", "카테고리"};
    JLabel label;
    JTextField textField;
    JButton button;
    String searchWord = "";
    JPanel panel;
    JComboBox<String> comboBox;
    String[] comboStr = {"도서명", "출판사", "저자명"};

    public BookSearchView() {
        setLayout(new BorderLayout());
        comboBox = new JComboBox<>(comboStr);
        label = new JLabel("검색어: ");
        textField = new JTextField(20);
        button = new JButton("검색");
        panel = new JPanel();
        panel.add(comboBox);
        panel.add(label);
        panel.add(textField);
        panel.add(button);
    }


    //JTable과 DefaultTableModel을 연결하고 테이블과 관련된 내용을 초기화
    public void initview() {
        model = new DefaultTableModel(header, bookVOList.size()) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        table = new JTable(model);
        //테이블 컬럼 너비
        table.getColumnModel().getColumn(0).setPreferredWidth(50);
        table.getColumnModel().getColumn(1).setPreferredWidth(200);
        table.getColumnModel().getColumn(2).setPreferredWidth(100);
        table.getColumnModel().getColumn(3).setPreferredWidth(50);
        table.getColumnModel().getColumn(4).setPreferredWidth(50);
        table.getColumnModel().getColumn(5).setPreferredWidth(70);

        //테이블의 행 개수가 많을 때는 스크롤바가 필요
        JScrollPane scrollPane = new JScrollPane(table);

        //각 셀에 리스트에 저장된 BookV0객체가 가지고 있는 값들을 설정
        pubSearchResult();

        //현재 패널에 north에는 panel, center에는 스크롤바가 있는 테이블
        add(panel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);
    }

    //defaultTablemodel에 도서정보들을 설정
    public void pubSearchResult() {
        model.setRowCount(bookVOList.size());
        BookVO vo = null;
        for (int i = 0; i < bookVOList.size(); i++) {
            vo = bookVOList.get(i);
            model.setValueAt(vo.getIsbn(), i, 0);
            model.setValueAt(vo.getName(), i, 1);
            model.setValueAt(vo.getPublish(), i, 2);
            model.setValueAt(vo.getAuthor(), i, 3);
            model.setValueAt(vo.getPrice(), i, 4);
            model.setValueAt(vo.getCategoryName(), i, 5);
        }
    }

    public String getSearchWord() {
        searchWord = textField.getText();
        return searchWord;
    }

    public void setBookVOList(ArrayList<BookVO> bookVOList) {
        this.bookVOList = bookVOList;
    }

    public JButton getBtnSearch() {
        return button;
    }

    public JComboBox<String> getComboBox() {
        return comboBox;
    }
}
