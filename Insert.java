import java.sql.*;
public class Insert {
    public static void main(String[] args) {
        try{
                String url="jdbc:mysql://localhost:3306/test";
                String username="root";
                String pwd="";
                
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection conxn=DriverManager.getConnection(url, username, pwd);
                Statement stmt= conxn.createStatement();
                int i=stmt.executeUpdate("insert into student values(1, 'thomas', 'pepsicola', 'BEIT')");
                
                System.out.println("rows="+i);
                System.out.println("data has been inserted successfully");
                conxn.close();
                
                
                
                
        
        }catch(Exception e){System.out.println(e.getMessage());
        }
     
    }
    
}
