package TheForth.Lv1;

import java.sql.Connection;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        Connection conn = JDBCUtil.getConnection();
        DBTool myDb = new DBTool(conn);
        try {
            myDb.createTable();
            myDb.insert(1, "小白", "white");
            myDb.insert(2, "小黑", "black");
            myDb.insert(3, "大黄", "yellow");
            myDb.insert(4, "小黄", "yellow");
            myDb.insert(5, "老白", "white");
            myDb.insert(6, "愣头青", "red");
            System.out.println("修改前查找数据：");
            myDb.select(2, "白", "yellow");
            myDb.update(1, "就是她吗？", "scarlet");
            myDb.update(2, "威严尽失", "scarlet");
            myDb.delete(3);
            System.out.println("修改后数据：");
            myDb.select(2, "白", "yellow");
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.close(myDb.rs, myDb.stmt, myDb.pstmt, myDb.conn);
        }
        System.out.println();
    }
}
