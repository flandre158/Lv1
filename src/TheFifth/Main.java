package TheFifth;

import java.sql.Connection;

public class Main {
    public static void main(String[] args) throws Exception{
        URLfir urLfir = new URLfir();
        Connection conn =JDBCUtil.getConnection();
        DBTool myDb = new DBTool(conn);
        JDBCUtil.close(myDb.rs, myDb.stmt, myDb.pstmt, myDb.conn);
    }
}
