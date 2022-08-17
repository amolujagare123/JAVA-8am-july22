package JDBCDemos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo1 {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {


        //       1. Loading a Driver (class)
        Class.forName("com.mysql.cj.jdbc.Driver");

        //       2. Creating a connection
        String url="jdbc:mysql://localhost:3306/8ambatch";
        String username="root";
        String password="root";

        Connection con = DriverManager.getConnection(url,username,password);


        //       3. Creating the statement
        Statement st = con.createStatement();

        //       4. Executing query

        // insert / update / delete / select
        // 1. DML - Data manipulation Language : insert / update / delete
        // 2. DDL - Data definition Language : select


        String sql = "insert into student1 values(4, 'Renuka','IT',78)";
      //  String sql = "update student1 set marks=100 where rno=3";
      //  String sql = "delete from student1 where rno=1";
        st.executeUpdate(sql);


    }
}
