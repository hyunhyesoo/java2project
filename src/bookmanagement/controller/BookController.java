package bookmanagement.controller;

import bookmanagement.repository.BookRepository;
import bookmanagement.view.BookSearchView;
import bookmanagement.domain.BookVO;
import center_frame.CenterFrame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class BookController extends JFrame {
    BookSearchView searchPanel;
    BookRepository bookRepository;
    ArrayList<BookVO> bookVOList;
    JComboBox<String> comboBox;
    JButton searchButton;
    JTabbedPane tab = new JTabbedPane(JTabbedPane.TOP); //생략하면 자동으로 top

    public BookController() {
        searchPanel = new BookSearchView();
        comboBox = searchPanel.getComboBox();
        bookRepository = new BookRepository();
        bookVOList = bookRepository.select("", comboBox.getSelectedIndex());
        searchPanel.setBookVOList(bookVOList);
        searchPanel.initview();
        searchButton = searchPanel.getBtnSearch();
        searchButton.addActionListener(btnListener);

        tab.add("도서검색", searchPanel);
        add(tab);

        setTitle("도서관리시스템");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        CenterFrame cf = new CenterFrame(600, 500);
        cf.centerXY();
        setBounds(cf.getX(), cf.getY(), cf.getFw(), cf.getFh());
        setVisible(true);
    }

    ActionListener btnListener = new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
          bookVOList = bookRepository.select(searchPanel.getSearchWord(), comboBox.getSelectedIndex());
          searchPanel.setBookVOList(bookVOList);
          searchPanel.pubSearchResult();
      }
    };

    public static void main(String[] args) {
        new BookController();
    }
}
