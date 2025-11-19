package bookmanagement.repository;

import java.sql.*;

public class JDBCConnector {
    private static final String DRIVER_PATH = "oracle.jdbc.driver.OracleDriver";
    private static final String URL = "jdbc:oracle:thin:@localhost:1521/xe"; //오라클 데베에 접근할 수 있는 주소
    private static final String USER = "c##book";
    private static final String PASSWORD = "1234";

    private static Connection con;

    public static Connection getConnection() {

        try {
            //1. JDBC Driver Memory Loading
            Class.forName(DRIVER_PATH);
            System.out.println("JDBC Driver Loaded");
            //2. Connection
            con = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Connected Successfully");
        } catch (ClassNotFoundException e) {
            System.out.println("Driver Class Not Found");
        } catch (SQLException e) {
            System.out.println("Connection Error");
        }

        return con;
    }

    public static void resultSetTest() {
        try {
            //3. sql문을 실행할 수 있는 statement 객체 생성(미리 준비된 sql문을 실행할 수 있는 문장객체)
            String sql = "select * from book, category where book.category = category.category_id";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery(); //쿼리 실행(결과행의 집합을 반환)
            while (rs.next()) {
                System.out.print(rs.getString("name") + " || ");
                System.out.print(rs.getString("publish"));
                System.out.println();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        Connection con = getConnection();
        resultSetTest();
    }
}
