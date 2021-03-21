import java.sql.*;
public class Selects {
    public static void main(String[] args) {
        try{
                String url="jdbc:mysql://localhost:3306/test";
                String username="root";
                String pwd="";
                
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection conxn=DriverManager.getConnection(url, username, pwd);
                Statement stmt= conxn.createStatement();
                ResultSet rs=stmt.executeQuery("select * from student");
                while(rs.next()){
                    System.out.println("data has been selected");}
                conxn.close();
                
                
                
                
        
        }catch(Exception e){System.out.println(e.getMessage());
        }
     
    }
    
}

