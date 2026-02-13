package Nisarga;

import java.sql.*;

public class JDBC_EX {

    public static void main(String[] args) {

        try {

         
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/", "root","Nisu@2003");

            Statement stmt = con.createStatement();

          
            stmt.executeUpdate("CREATE DATABASE IF NOT EXISTS student_db");
            System.out.println("Database created");

            
            stmt.executeUpdate("USE student_db");

          
            String createTable =
                    "CREATE TABLE IF NOT EXISTS student ("
                            + "student_id INT PRIMARY KEY, "
                            + "name VARCHAR(50), "
                            + "course VARCHAR(50), "
                            + "gender VARCHAR(10), "
                            + "age INT, "
                            + "city VARCHAR(50))";

            stmt.executeUpdate(createTable);
            System.out.println("Student table created");

            
            stmt.executeUpdate(
                    "INSERT INTO student VALUES "
                            + "(1,'Nisarga','Java','Female',22,'Bangalore')," 
                    		+"(2,'Niv','Java','Female',24,'Bangalore')," 
                            + "(3,'raghu','Java','male',21,'Bangalore'),"
                    		+"(4,'varsha','Java','Female',21,'Bangalore'),"
                            + "(5,'anu','Java','Female',23,'Bangalore')" );
            System.out.println("Data inserted");

            
            stmt.executeUpdate(
                    "UPDATE student SET course = 'Full Stack' WHERE student_id = 1"
            );
            System.out.println("Data updated");

          
            ResultSet rs = stmt.executeQuery("SELECT * FROM student");

            while (rs.next()) {
                System.out.println(
                        rs.getInt("student_id") + " "
                        + rs.getString("name") + " "
                        + rs.getString("course") + " "
                        + rs.getString("gender") + " "
                        + rs.getInt("age") + " "
                        + rs.getString("city")
                );
            }

           
            //stmt.executeUpdate(
              //      "DELETE FROM student WHERE student_id = 1);
           // System.out.println("Data deleted");

            // Close connection
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}


