package JDBCDemos;

import java.sql.*;

public class JDBCDemo2 {

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


        String sql = "select * from student1";

        ResultSet rs = st.executeQuery(sql);

        while (rs.next())
        {
            System.out.print(rs.getInt("rno")+"\t");
            System.out.print(rs.getString("name")+"\t");
            System.out.print(rs.getString("branch")+"\t");
            System.out.println(rs.getInt("marks"));
        }


    }
}
