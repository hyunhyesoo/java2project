package mvc_jdbc_test.view;

import java.sql.*;

public class DeleteCustomerView {

    public void deleteCustomer(Connection con) {
        System.out.print("삭제할 고객아이디 입력: ");
        String targetId = InputCustomerView.sc.nextLine();

        System.out.print("정말 삭제하시겠습니까? (y/n): ");
        String yn = InputCustomerView.sc.nextLine().trim().toLowerCase();

        if (!yn.equals("y")) {
            System.out.println("삭제를 취소하였습니다");
            return;
        }

        try {
            String delSql = "DELETE FROM 고객 WHERE 고객아이디 = ?";
            PreparedStatement ps = con.prepareStatement(delSql);
            ps.setString(1, targetId);
            int rows = ps.executeUpdate();
            ps.close();

            if (rows > 0) {
                System.out.println("정보 삭제 완료");
            } else {
                System.out.println("입력한 아이디가 존재하지 않습니다");
            }
        } catch (SQLException e) {
            System.out.println("삭제 오류: " + e.getMessage());
        }
    }
}
