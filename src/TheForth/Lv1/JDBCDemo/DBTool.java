package TheForth.Lv1.JDBCDemo;

import java.sql.*;
//操作工具
public class DBTool {
    Connection conn;
    Statement stmt;
    PreparedStatement pstmt;
    ResultSet rs;
    //构造方法赋值并且清空表中数据
    public DBTool(Connection conn) {
        this.conn = conn;
        try {
            stmt = conn.createStatement();
            stmt.executeUpdate("DELETE FROM cat");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    //建立cat表
    public void createTable() throws SQLException {
        String sql = "CREATE TABLE IF NOT EXISTS cat(id int,name varchar(30),color varchar(30))";
        stmt.executeUpdate(sql);
    }
    //插入数据
    public void insert(int id, String name, String color) throws SQLException {
        String sql = "INSERT INTO cat(id,name,color) VALUES(?,?,?)";
        pstmt = conn.prepareCall(sql);
        pstmt.setInt(1, id);
        pstmt.setString(2, name);
        pstmt.setString(3, color);
        pstmt.executeUpdate();
    }
    //删除数据
    public void delete(int id) throws SQLException {
        String sql = "DELETE FROM cat WHERE id = ?";
        pstmt = conn.prepareCall(sql);
        pstmt.setInt(1, id);
        pstmt.executeUpdate();
    }
    //更新数据
    public void update(int id, String name, String color) throws SQLException {
        String sql = "UPDATE cat SET name = ?,color = ? WHERE id = ?";
        pstmt = conn.prepareCall(sql);
        pstmt.setString(1, name);
        pstmt.setString(2, color);
        pstmt.setInt(3, id);
        pstmt.executeUpdate();
    }
    //模糊查找数据
    public void select(int id, String name, String color) throws SQLException {
        String sql = "SELECT id,name,color FROM cat WHERE id LIKE ? OR name LIKE ? OR color LIKE ?";
        pstmt = conn.prepareCall(sql);
        pstmt.setString(1, "%" + id + "%");
        pstmt.setString(2, "%" + name + "%");
        pstmt.setString(3, "%" + color + "%");
        rs = pstmt.executeQuery();
        while (rs.next()) {
            System.out.println("ID:" + rs.getString(1) + "  姓名:" + rs.getString(2) + "  颜色:" + rs.getString(3));
        }
    }
}
