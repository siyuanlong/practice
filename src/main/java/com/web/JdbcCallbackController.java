package com.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.*;

@RestController
public class JdbcCallbackController {

    @RequestMapping("/callbacktest")
    public void callbacktest() {
        Connection connection = null;
        try {
            String driverName = "com.mysql.jdbc.Driver";
            String url = "jdbc:mysql://localhost:3306/empty";
            String username = "root";
            String password = "123456";
            Class.forName(driverName);
            connection = DriverManager.getConnection(url, username, password);
            connection.setAutoCommit(false);

            String sql01 = "insert into user(username,password) values('温华','123')";
            String sql02 = "update user set username = '洛阳' where id = 1";
            String sql03 = "select * from user where username = '温华' ";

            Statement statement = connection.createStatement();
            statement.execute(sql01);
            //System.out.println(1/0);
            statement.execute(sql02);
            ResultSet query = statement.executeQuery(sql03);
            while (query.next()) {
                int id = query.getInt("id");
                String name = query.getString("username");
                System.out.println(id+"-----"+name);
            }
            System.out.println(query);
            //connection.commit();
            //System.out.println("提交完成");

        } catch (Exception e) {
            e.printStackTrace();
            /*try {
                connection.rollback();
                System.out.println("回滚完成");
            } catch (SQLException e1) {
                e1.printStackTrace();
            }*/
        }
    }
}
