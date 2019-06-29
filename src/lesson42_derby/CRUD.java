package lesson42_derby;

import java.sql.Connection;
import java.sql.DriverManager;

public class CRUD {

    private static Connection conn;

    public CRUD() throws Exception { // 建構子
        String url = "jdbc:derby://localhost:1527/test";
        String user = "app";
        String password = "1234";
        conn = DriverManager.getConnection(url, user, password); // 建立 conn
        System.out.println(conn.isClosed() ? "已關閉" : "連線中");
    }

    public void read() {

    }

    public void create() {

    }

    @Override
    protected void finalize() throws Throwable { // 解構子
        if (conn != null) {
            conn.close(); // 關閉 conn
        }
    }
    
    public static void main(String[] args) throws Exception {
        CRUD crud = new CRUD();
        crud.read();
    }
    
}
