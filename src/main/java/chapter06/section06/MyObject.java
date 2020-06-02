package chapter06.section06;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author: deng
 * @datetime: 2020/6/2 4:48 下午
 * @desc: 使用enum枚举数据类型实现单例模式
 */
public enum MyObject {
    connectionFactory;

    private Connection connection;

    private MyObject() {
        try {
            System.out.println("调用了MyObject的构造");
            String url = "jdbc:mysql://127.0.0.1:3306/pet";
            String username = "root";
            String password = "a19920213";
            String driverName = "com.mysql.jdbc.Driver";
            Class.forName(driverName);
            connection = DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Connection getConnection() {
        return connection;
    }
}
