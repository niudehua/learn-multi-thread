package chapter06.section07;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author: deng
 * @datetime: 2020/6/2 4:53 下午
 * @desc: 完善使用  enum枚举实现单例模式
 */
public class MyObject {
    public enum MyEnumSingleton {
        connectionFactory;

        private Connection connection;

        private MyEnumSingleton() {
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

    public static Connection getConnection() {
        return MyEnumSingleton.connectionFactory.getConnection();
    }

}
