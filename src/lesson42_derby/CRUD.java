package lesson42_derby;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class CRUD {

    private static Connection conn;

    public CRUD() throws Exception { // 建構子
        String url = "jdbc:derby://localhost:1527/test";
        String user = "app";
        String password = "1234";
        conn = DriverManager.getConnection(url, user, password); // 建立 conn
        System.out.println(conn.isClosed() ? "已關閉" : "連線中");
    }
    
    // 查詢
    public void read() throws Exception {
        String sql = "Select school, score, type from exam";
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(sql);
        while(rs.next()) {
            String school = rs.getString("school");
            double score = rs.getDouble("score");
            int type = rs.getInt("type");
            System.out.printf("%s\t%.1f\t%d\t\n", school, score, type);
        }
    }
    
    // 新增
    public void create(String school, double score, int type) throws Exception {
        String sql = "Insert into exam(school, score, type) values(?, ?, ?)";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, school);
        pstmt.setDouble(2, score);
        pstmt.setInt(3, type);
        int x = pstmt.executeUpdate();
        System.out.println("新增 " + x + " 筆");
    }
    
    // 修改
    public void update(String school, double score, int type) throws Exception {
        String sql = "Update exam set score=?, type=? Where school=?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setDouble(1, score);
        pstmt.setInt(2, type);
        pstmt.setString(3, school);
        int x = pstmt.executeUpdate();
        System.out.println("修改 " + x + " 筆");
    }
    
    // 刪除
    public void delete(String school) throws Exception {
        String sql = "Delete From exam Where school=?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, school);
        int x = pstmt.executeUpdate();
        System.out.println("刪除 " + x + " 筆");
    }

    @Override
    protected void finalize() throws Throwable { // 解構子
        if (conn != null) {
            conn.close(); // 關閉 conn
        }
    }
    
    public static void main(String[] args) throws Exception {
        CRUD crud = new CRUD();
        //crud.create("泰山高中", 23.5, 3);
        //crud.update("泰山高中", 24.5, 1);
        crud.delete("泰山高中");
        Thread.sleep(100);
        crud.read();
    }
    
}
