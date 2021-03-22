import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreparedStatementDemo {
    public static void main(String args[]) throws SQLException, ClassNotFoundException {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        String url="jdbc:oracle:thin:@localhost:1521:xe";
        String username="system";
        String password="manager";
        Connection con = DriverManager.getConnection(url,username,password);
        if (con != null)
            System.out.println("Connection Established");
        PreparedStatement ps = con.prepareStatement("insert into employee values(?,?)");
        ps.setInt(1,1039);
        ps.setString(2,"Soumya");
        int x=ps.executeUpdate();
        if(x!=0){
            System.out.println("record inserted");
        }
    }
}
