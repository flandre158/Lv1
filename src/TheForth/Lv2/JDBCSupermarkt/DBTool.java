package TheForth.Lv2.JDBCSupermarkt;

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

    //建立部门
    public void createDepartment(String department) throws SQLException {
        String sql = "CREATE TABLE IF NOT EXISTS " + department + "(id int,businessExpenses int,supervisorName varchar(30),phoneNumber varchar(30),address varchar(30))";
        stmt.executeUpdate(sql);
    }

    //插入部门数据
    public void insertDepartment(String department, int id, int businessExpenses, String supervisorName, String phoneNumber, String address) throws SQLException {
        String sql = "INSERT INTO " + department + "(id,businessExpenses,supervisorName,phoneNumber,address) VALUES(?,?,?,?,?)";
        pstmt = conn.prepareCall(sql);
        pstmt.setInt(1, id);
        pstmt.setInt(2, businessExpenses);
        pstmt.setString(3, supervisorName);
        pstmt.setString(4, phoneNumber);
        pstmt.setString(5, address);
        pstmt.executeUpdate();
    }

    //更新部门数据
    public void updateDepartment(String department, int id, int businessExpenses, String supervisorName, String phoneNumber, String address) throws SQLException {
        String sql = "UPDATE " + department + " SET businessExpenses = ?,supervisorName = ?,phoneNumber = ?,address = ? WHERE id = ?";
        pstmt = conn.prepareCall(sql);
        pstmt.setInt(1, businessExpenses);
        pstmt.setString(2, supervisorName);
        pstmt.setString(3, phoneNumber);
        pstmt.setString(4, address);
        pstmt.setInt(5, id);
        pstmt.executeUpdate();
    }

    //建立部门员工表
    public void createStaff(String staff) throws SQLException {
        String sql = "CREATE TABLE IF NOT EXISTS " + staff + "(id int,name varchar(30),age int,position varchar(30),phoneNumber varchar(30),address varchar(30))";
        stmt.executeUpdate(sql);
    }

    //插入员工数据
    public void insertStaff(String staff, int id, String name, int age, String position, String phoneNumber, String address) throws SQLException {
        String sql = "INSERT INTO " + staff + "(id,name,age,position,phoneNumber,address) VALUES(?,?,?,?,?,?)";
        pstmt = conn.prepareCall(sql);
        pstmt.setInt(1, id);
        pstmt.setString(2, name);
        pstmt.setInt(3, age);
        pstmt.setString(4, position);
        pstmt.setString(5, phoneNumber);
        pstmt.setString(6, address);
        pstmt.executeUpdate();
    }

    //更新员工数据
    public void updateStaff(String staff, int id, String name, int age, String position, String phoneNumber, String address) throws SQLException {
        String sql = "UPDATE " + staff + " SET name = ?,age = ?,position = ?,phoneNumber = ?,address = ? WHERE id = ?";
        pstmt = conn.prepareCall(sql);
        pstmt.setString(1, name);
        pstmt.setInt(2, age);
        pstmt.setString(3, position);
        pstmt.setString(4, phoneNumber);
        pstmt.setString(5, address);
        pstmt.setInt(6, id);
        pstmt.executeUpdate();
    }

    //建立商品表
    public void createCommodity() throws SQLException {
        String sql = "CREATE TABLE IF NOT EXISTS commodity(id int,name varchar(30),cost int,sale int,supplierName varchar(30),storageId int,departmentId int)";
        stmt.executeUpdate(sql);
    }

    //插入商品数据
    public void insertCommodity(int id, String name, int cost, int sale, String supplierName, int storageId, int departmentId) throws SQLException {
        String sql = "INSERT INTO commodity(id,name,cost,sale,supplierName,storageId,departmentId) VALUES(?,?,?,?,?,?,?)";
        pstmt = conn.prepareCall(sql);
        pstmt.setInt(1, id);
        pstmt.setString(2, name);
        pstmt.setInt(3, cost);
        pstmt.setInt(4, sale);
        pstmt.setString(5, supplierName);
        pstmt.setInt(6, storageId);
        pstmt.setInt(7, departmentId);
        pstmt.executeUpdate();
    }

    //更新商品数据
    public void updateCommodity(int id, String name, int cost, int sale, String supplierName, int storageId, int departmentId) throws SQLException {
        String sql = "UPDATE commodity SET name = ?,cost = ?,sale = ?,supplierName = ?,storageId = ?,departmentId = ? WHERE id = ?";
        pstmt = conn.prepareCall(sql);
        pstmt.setString(1, name);
        pstmt.setInt(2, cost);
        pstmt.setInt(3, sale);
        pstmt.setString(4, supplierName);
        pstmt.setInt(5, storageId);
        pstmt.setInt(6, departmentId);
        pstmt.setInt(7, id);
        pstmt.executeUpdate();
    }

    //建立进货商表
    public void createSupplier() throws SQLException {
        String sql = "CREATE TABLE IF NOT EXISTS supplier(supplierName varchar(30),phoneNumber varchar(30),address varchar(30))";
        stmt.executeUpdate(sql);
    }

    //插入进货商数据
    public void insertSupplier(String name, String phoneNumber, String address) throws SQLException {
        String sql = "INSERT INTO supplier(supplierName,phoneNumber,address) VALUES(?,?,?)";
        pstmt = conn.prepareCall(sql);
        pstmt.setString(1, name);
        pstmt.setString(2, phoneNumber);
        pstmt.setString(3, address);
        pstmt.executeUpdate();
    }

    //更新进货商数据
    public void updateSupplier(String name, String phoneNumber, String address) throws SQLException {
        String sql = "UPDATE supplier SET phoneNumber = ?,address = ? WHERE supplierName = ?";
        pstmt = conn.prepareCall(sql);
        pstmt.setString(1, phoneNumber);
        pstmt.setString(2, address);
        pstmt.setString(3, name);
        pstmt.executeUpdate();
    }

    //建立仓库表
    public void createStorage() throws SQLException {
        String sql = "CREATE TABLE IF NOT EXISTS storage(id int,storageKeeperName varchar(30),phoneNumber varchar(30))";
        stmt.executeUpdate(sql);
    }

    //插入仓库数据
    public void insertStorage(int id, String name, String phoneNumber) throws SQLException {
        String sql = "INSERT INTO storage(id,storageKeeperName,phoneNumber) VALUES(?,?,?)";
        pstmt = conn.prepareCall(sql);
        pstmt.setInt(1, id);
        pstmt.setString(2, name);
        pstmt.setString(3, phoneNumber);
        pstmt.executeUpdate();
    }

    //更新仓库数据
    public void updateStorage(int id, String name, String phoneNumber) throws SQLException {
        String sql = "UPDATE storage SET storageKeeperName = ?,phoneNumber = ? WHERE id = ?";
        pstmt = conn.prepareCall(sql);
        pstmt.setString(1, name);
        pstmt.setString(2, phoneNumber);
        pstmt.setInt(3, id);
        pstmt.executeUpdate();
    }

    //删除数据
    public void delete(String chartName, int id) throws SQLException {
        String sql = "DELETE FROM " + chartName + " WHERE id = ?";
        pstmt = conn.prepareCall(sql);
        pstmt.setInt(1, id);
        pstmt.executeUpdate();
    }

    //删除进货商数据(进货商没有ID无法通常删除）
    public void deleteSupplier(String name) throws SQLException {
        String sql = "DELETE FROM supplier WHERE supplierName = ?";
        pstmt = conn.prepareCall(sql);
        pstmt.setString(1, name);
        pstmt.executeUpdate();
    }

    //普通商品查询
    public void normalSelect() throws SQLException {
        String sql = "SELECT id,name,cost,sale,supplierName,storageId,departmentId FROM commodity";
        rs = stmt.executeQuery(sql);
        while (rs.next()) {
            System.out.println("ID:" + rs.getString(1) + "  名称:" + rs.getString(2) + "  成本价:" + rs.getString(3) + "  零售价:" + rs.getString(4) + "  供应商:" + rs.getString(5) + "  仓库ID:" + rs.getString(6) + "  部门ID:" + rs.getString(7));
        }
    }

    //商品模糊查询
    public void commoditySelect(int id, String name, int cost, int sale, String supplierName, int storageId, int departmentId) throws SQLException {
        String sql = "SELECT id,name,cost,sale,supplierName,storageId,departmentId FROM commodity WHERE id LIKE ? OR name LIKE ? OR cost LIKE ? OR sale LIKE ? OR supplierName LIKE ? OR storageId LIKE ? OR departmentId LIKE ?";
        pstmt = conn.prepareCall(sql);
        pstmt.setString(1, "%" + id + "%");
        pstmt.setString(2, "%" + name + "%");
        pstmt.setString(3, "%" + cost + "%");
        pstmt.setString(4, "%" + sale + "%");
        pstmt.setString(5, "%" + supplierName + "%");
        pstmt.setString(6, "%" + storageId + "%");
        pstmt.setString(7, "%" + departmentId + "%");
        rs = pstmt.executeQuery();
        while (rs.next()) {
            System.out.println("ID:" + rs.getString(1) + "  名称:" + rs.getString(2) + "  成本价:" + rs.getString(3) + "  零售价:" + rs.getString(4) + "  供应商:" + rs.getString(5) + "  仓库ID:" + rs.getString(6) + "  部门ID:" + rs.getString(7));
        }
    }
}
