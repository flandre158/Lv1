package TheForth.Lv2.JDBCSupermarkt;

import java.sql.Connection;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        Connection conn = JDBCUtil.getConnection();
        DBTool myDb = new DBTool(conn);
        try {
            myDb.createDepartment("生鲜部");
            myDb.createDepartment("熟食部");
            myDb.insertDepartment("生鲜部", 1, 100000, "老黄", "123456", "???");
            myDb.insertDepartment("熟食部", 2, 111111, "老白", "654321", "???");
            myDb.createStaff("生鲜部员工");
            myDb.createStaff("熟食部员工");
            myDb.insertStaff("生鲜部员工", 1, "老黄", 38, "主管", "123456", "???");
            myDb.insertStaff("生鲜部员工", 2, "小黄", 25, "副管", "123457", "???");
            myDb.insertStaff("熟食部员工", 1, "老白", 40, "主管", "654321", "???");
            myDb.insertStaff("熟食部员工", 2, "小白", 23, "副管", "754321", "???");
            myDb.createCommodity();
            myDb.insertCommodity(111, "生鲜1", 10, 20, "大黄", 1, 1);
            myDb.insertCommodity(211, "生鲜2", 11, 21, "大黄", 1, 1);
            myDb.insertCommodity(301, "熟食1", 18, 36, "大黑", 2, 2);
            myDb.insertCommodity(422, "熟食2", 33, 55, "大黑", 2, 2);
            myDb.createSupplier();
            myDb.insertSupplier("大黄", "123", "???");
            myDb.insertSupplier("大黑", "163", "???");
            myDb.createStorage();
            myDb.insertStorage(1, "二狗子", "555");
            myDb.insertStorage(2, "二愣子", "666");
            //录入
            myDb.updateDepartment("生鲜部", 1, 100000, "老黄", "123456", "十里坡");
            myDb.updateStaff("生鲜部员工", 1, "老黄", 38, "主管", "123456", "诺莫瑞根");
            myDb.updateCommodity(1, "生鲜1", 66, 99, "大黄", 1, 1);
            myDb.updateSupplier("大黄", "123", "奥格瑞玛");
            myDb.updateStorage(1, "二狗子", "13868858688");
            //修改
            myDb.delete("生鲜部员工", 2);
            //删除
            System.out.println("普通商品查询：");
            myDb.normalSelect();
            System.out.println("模糊商品查询：");
            myDb.commoditySelect(1, "1", 1, 2, "黄", 1, 1);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.close(myDb.rs, myDb.stmt, myDb.pstmt, myDb.conn);
        }
    }
}
