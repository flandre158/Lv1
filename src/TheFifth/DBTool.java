package TheFifth;

import java.sql.*;

//操作工具
public class DBTool {
    Connection conn;
    Statement stmt;
    PreparedStatement pstmt;
    ResultSet rs;

    //构造方法赋值
    public DBTool(Connection conn) {
        this.conn = conn;
        try {
            stmt = conn.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //建立班级表
    public void createClass() throws SQLException {
        String sql = "CREATE TABLE IF NOT EXISTS myClass(xh varchar(100),xm varchar(100),xmEn varchar(100),xb varchar(100),bj varchar(100),zyh varchar(100),zym varchar(100),yxh varchar(100),yxm varchar(100),nj varchar(100),csrq varchar(100),xjzt varchar(100),rxrq varchar(100),yxmen varchar(100),zymEn varchar(100),xz varchar(100),mz varchar(100))";
        stmt.executeUpdate(sql);
    }

    //建立成绩表
    public void createClassGrade() throws SQLException {
        String sql = "CREATE TABLE IF NOT EXISTS myClassGrade(xh varchar(100),english int,math int,c int)";
        stmt.executeUpdate(sql);
    }

    //插入学生信息
    public void insertClass(String xh,String xm,String xmEn,String xb,String bj,String zyh,String zym,String yxh,String yxm,String nj,String csrq,String xjzt,String rxrq,String yxmen,String zymEn,String xz,String mz) throws SQLException {
        String sql = "INSERT INTO myClass(xh,xm,xmEn,xb,bj,zyh,zym,yxh,yxm,nj,csrq,xjzt,rxrq,yxmen,zymEn,xz,mz) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        pstmt = conn.prepareCall(sql);
        pstmt.setString(1,xh);
        pstmt.setString(2,xm);
        pstmt.setString(3,xmEn);
        pstmt.setString(4,xb);
        pstmt.setString(5,bj);
        pstmt.setString(6,zyh);
        pstmt.setString(7,zym);
        pstmt.setString(8,yxh);
        pstmt.setString(9,yxm);
        pstmt.setString(10,nj);
        pstmt.setString(11,csrq);
        pstmt.setString(12,xjzt);
        pstmt.setString(13,rxrq);
        pstmt.setString(14,yxmen);
        pstmt.setString(15,zymEn);
        pstmt.setString(16,xz);
        pstmt.setString(17,mz);
        pstmt.executeUpdate();
    }

    //插入学生成绩
    public void insertClassGrade(String xh,int englsh,int math,int c) throws SQLException {
        String sql = "INSERT INTO myClassGrade(xh,english,math,c) VALUES(?,?,?,?)";
        pstmt = conn.prepareCall(sql);
        pstmt.setString(1,xh);
        pstmt.setInt(2,englsh);
        pstmt.setInt(3,math);
        pstmt.setInt(4,c);
        pstmt.executeUpdate();
    }

    //查询
    public void normalSelect() throws SQLException {
        String sql = "SELECT xh,xm,xmEn,xb,bj,zyh,zym,yxh,yxm,nj,csrq,xjzt,rxrq,yxmen,zymEn,xz,mz FROM myClass";
        rs = stmt.executeQuery(sql);
        while (rs.next()) {
            System.out.println();
        }
    }
}
