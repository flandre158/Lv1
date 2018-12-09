package TheFifth;

import java.sql.Connection;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        URLfir urLfir = new URLfir();
        Connection conn =JDBCUtil.getConnection();
        DBTool myDb = new DBTool(conn);
        try {
            myDb.createClass();
            myDb.createClassGrade();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        JDBCUtil.close(myDb.rs, myDb.stmt, myDb.pstmt, myDb.conn);
    }
}
