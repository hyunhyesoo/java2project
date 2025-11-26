package bookmanagement.repository;

import bookmanagement.domain.BookVO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class BookRepository {
    ArrayList<BookVO> bookV0List;

    public ArrayList<BookVO> select(String searchWord, int selectedIndex) {
        Connection con = JDBCConnector.getConnection();
        bookV0List = new ArrayList<BookVO>();
        ResultSet rs = null;
        PreparedStatement ps = null;
        String[] columnName = {"name", "publish", "author"};
        String sql = "select isbn, name, publish, author, price, category_name from book, category " +
                "where book.category = category.category_id and " + columnName[selectedIndex] + " like ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, "%" + searchWord + "%");
            rs = ps.executeQuery();
            while (rs.next()) {
                BookVO bookVO = new BookVO();
                bookVO.setIsbn(rs.getInt("isbn"));
                bookVO.setName(rs.getString("name"));
                bookVO.setPublish(rs.getString("publish"));
                bookVO.setAuthor(rs.getString("author"));
                bookVO.setPrice(rs.getInt("price"));
                bookVO.setCategoryName(rs.getString("category_name"));
                bookV0List.add(bookVO);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (rs != null)
                    rs.close();

                if (ps != null)
                    ps.close();

                if (con != null)
                    con.close();

            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }

        return bookV0List;
    }

    public void insert(BookVO bookVO) {
        Connection con = JDBCConnector.getConnection();
        String sql = "insert into book values(?,?,?,?,?,?)";
        PreparedStatement ps = null;

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, bookVO.getIsbn());
            ps.setString(2, bookVO.getName());
            ps.setString(3, bookVO.getPublish());
            ps.setString(4, bookVO.getAuthor());
            ps.setInt(5, bookVO.getPrice());
            int categoryId = 0;
            switch (bookVO.getCategoryName()) {
                case "IT도서":
                    categoryId = 10;
                    break;
                case "소설":
                    categoryId = 20;
                    break;
                case "비소설":
                    categoryId = 30;
                    break;
                case "경제":
                    categoryId = 40;
                    break;
                case "사회":
                    categoryId = 50;
                    break;
            }
            ps.setInt(6, categoryId);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally{
            try{
                if (ps != null)
                    ps.close();
                if(con != null)
                    con.close();
            }catch (SQLException e){
                System.out.println("insert close 문제발생");
                e.printStackTrace();
            }
        }
    }
}
