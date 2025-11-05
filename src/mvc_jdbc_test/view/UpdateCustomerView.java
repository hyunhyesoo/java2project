package mvc_jdbc_test.view;

import mvc_jdbc_test.entity.Customer;

import java.sql.*;

public class UpdateCustomerView {

    public void updateCustomer(Connection con) {
        System.out.print("수정할 고객아이디 입력: ");
        String targetId = InputCustomerView.sc.nextLine();

        // 2) 기존 정보 조회
        Customer prevC = null;
        try {
            String selSql = "SELECT * FROM 고객 WHERE 고객아이디 = ?";
            PreparedStatement ps = con.prepareStatement(selSql);
            ps.setString(1, targetId);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                prevC = new Customer();
                prevC.setCustomerid(rs.getString("고객아이디"));
                prevC.setCustomername(rs.getString("고객이름"));
                prevC.setAge(rs.getInt("나이"));
                prevC.setLevel(rs.getString("등급"));
                prevC.setJob(rs.getString("직업"));
                prevC.setReward(rs.getInt("적립금"));
            }
            rs.close();
            ps.close();
        } catch (SQLException e) {
            System.out.println("조회 오류: " + e.getMessage());
            return;
        }

        if (prevC == null) {
            System.out.println("입력한 아이디가 존재하지 않습니다");
            return;
        }

        // 3) 기존 정보 출력
        CustomerView cv = new CustomerView();
        cv.printHead();
        System.out.println("[수정 전 정보]");
        cv.printCustomer(prevC);
        cv.printFooter();

        // 4) 새 값 입력(아이디는 변경 불가)
        System.out.println("===고객 정보 수정===");
        System.out.println("고객아이디: " + prevC.getCustomerid() + " (변경 불가)");
        System.out.print("고객이름(새 값) 입력: ");
        String newName = InputCustomerView.sc.nextLine();

        System.out.print("고객나이(새 값) 입력: ");
        int newAge = 0;
        try {
            newAge = InputCustomerView.sc.nextInt();
        } catch (Exception ex) {
            System.out.println("숫자만 입력");
            InputCustomerView.sc.nextLine(); // 버퍼 비우기
            return;
        }

        System.out.print("고객등급(새 값) 입력: ");
        String newLevel = InputCustomerView.sc.nextLine();

        System.out.print("고객직업(새 값) 입력: ");
        String newJob = InputCustomerView.sc.nextLine();

        System.out.print("고객적립금(새 값) 입력: ");
        int newReward = 0;
        try {
            newReward = InputCustomerView.sc.nextInt();
        } catch (Exception ex) {
            System.out.println("숫자만 입력");
            InputCustomerView.sc.nextLine();
            return;
        }

        // 5) DB 업데이트
        try {
            String updSql = "UPDATE 고객 SET 고객이름 = ?, 나이 = ?, 등급 = ?, 직업 = ?, 적립금 = ? WHERE 고객아이디 = ?";
            PreparedStatement up = con.prepareStatement(updSql);
            up.setString(1, newName);
            up.setInt(2, newAge);
            up.setString(3, newLevel);
            up.setString(4, newJob);
            up.setInt(5, newReward);
            up.setString(6, prevC.getCustomerid());
            int rows = up.executeUpdate();
            up.close();

            if (rows > 0) {
                System.out.println("정보 수정 완료");
            } else {
                System.out.println("수정한 정보가 없습니다");
                return;
            }
        } catch (SQLException e) {
            System.out.println("수정 오류: " + e.getMessage());
            return;
        }

        // 6) 수정된 정보 재조회 후 전체 출력
        Customer after = null;
        try {
            String selSql = "SELECT * FROM 고객 WHERE 고객아이디 = ?";
            PreparedStatement ps = con.prepareStatement(selSql);
            ps.setString(1, targetId);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                after = new Customer();
                after.setCustomerid(rs.getString("고객아이디"));
                after.setCustomername(rs.getString("고객이름"));
                after.setAge(rs.getInt("나이"));
                after.setLevel(rs.getString("등급"));
                after.setJob(rs.getString("직업"));
                after.setReward(rs.getInt("적립금"));
            }
            rs.close();
            ps.close();
        } catch (SQLException e) {
            System.out.println("조회 오류: " + e.getMessage());
            return;
        }

        if (after != null) {
            cv.printHead();
            System.out.println("[수정 후 정보]");
            cv.printCustomer(after);
            cv.printFooter();
        }
    }
}
