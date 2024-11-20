import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DEletemovie {

    public void delete() throws Exception {
        String url = "jdbc:mysql://127.0.0.1:3306/newwwww";
        String username = "root";
        String password = "1234";
        String Query = "delete from first where age = '21'";
        Connection con = DriverManager.getConnection(url, username, password);
        PreparedStatement pst = con.prepareStatement(Query);
        
        pst.executeUpdate();
        con.close();
        System.out.println("data deleted");
    }
    
    
    
    
    public static void main(String[] args) throws Exception {
        DEletemovie obj = new DEletemovie();
        obj.delete();
    }
}

