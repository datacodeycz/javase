package com.yuan.algorithm;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class JDBC {
    public static void main(String[] args) {

        JDBC.sort();
    }


    //实现的方法
    static Map<String, String> sort(){
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("8：10-8：20");
        arrayList.add("8：20-8：30");
        arrayList.add("8：30-8：40");
        arrayList.add("8：40-8：50");
        arrayList.add("8：50-9：00");
        arrayList.add("9：00-9：10");
        arrayList.add("9：10-9：20");
        arrayList.add("9：20-9：30");
        arrayList.add("9：30-9：40");
        arrayList.add("9：40-9：50");
        arrayList.add("9：50-10：00");
        arrayList.add("10：10-10：20");
        arrayList.add("10：20-10：30");
        arrayList.add("10：30-10：40");
        arrayList.add("10：40-10：50");
        arrayList.add("10：50-11：00");
        arrayList.add("11：30-11：40");
        arrayList.add("11：40-11：50");
        arrayList.add("11：50-12：00");
        arrayList.add("12：00-12：10");
        arrayList.add("12：10-12：20");
        arrayList.add("12：20-12：30");
        arrayList.add("12：30-12：40");
        arrayList.add("12：40-12：50");
        arrayList.add("12：50-13：00");
        arrayList.add("13：00-13：10");
        arrayList.add("13：10-13：20");
        arrayList.add("13：20-13：30");
        Map<String, Integer> map1 = new HashMap<>();
        try {
            //注册驱动
            Class.forName("com.sql.cj.jdbc.Driver");
            //连接数据库
            String url = "jdbc:mysql://localhost;3306/student_information";
            String user = "root";
            String password = "123456";
            conn = DriverManager.getConnection(url, user, password);
            //获取预编译的数据库对象
            String sql = "";//这里写sql语句
            ps = conn.prepareStatement(sql);
            //执行sql语句
            rs = ps.executeQuery("");
            //处理查询结果集
            while (rs.next()) {

                String class1 = rs.getString("class");
                int class_number = rs.getInt("class_number");
                int wednesday_1_2 = rs.getInt("wednesday_1-2");
                int wednesday_3_4 = rs.getInt("wednesday_3-4");
                int wednesday_5_6 = rs.getInt("wednesday_5-6");
                if(wednesday_1_2 == 0 && wednesday_3_4 == 0 && wednesday_5_6 == 0){



                }else if (wednesday_1_2 == 0 && wednesday_3_4 == 0 && wednesday_5_6 == 1){

                }else if (wednesday_1_2 == 0 && wednesday_3_4 == 1 && wednesday_5_6 == 0){

                }else if (wednesday_1_2 == 0 && wednesday_3_4 == 1 && wednesday_5_6 == 1){

                }else if (wednesday_1_2 == 1 && wednesday_3_4 == 0 && wednesday_5_6 == 0){

                }else if (wednesday_1_2 == 1 && wednesday_3_4 == 0 && wednesday_5_6 == 1){

                }else if(wednesday_1_2 == 1 && wednesday_3_4 == 1 && wednesday_5_6 == 0){

                }else if (wednesday_1_2 == 1 && wednesday_3_4 == 1 && wednesday_5_6 == 1)


                map1.put(class1,class_number);

                System.out.println(class1 + "," + class_number);
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            //释放资源
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

        Map<String, String> map = new HashMap<>();
        return map;

        }


}