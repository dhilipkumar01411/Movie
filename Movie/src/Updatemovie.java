import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Updatemovie {

	public void update() throws Exception{
		String url ="jdbc:mysql://127.0.0.1:3306/newwwww";
		String username = "root";
		String password ="1234";
		String Query = "update first set name = 'luckie' where id = 101";
		Connection con = DriverManager.getConnection(url,username,password);
		PreparedStatement pst  = con.prepareStatement(Query);
		
		pst.executeUpdate();
		con.close();
		System.out.println("data updated");
	}
	
	
	
	public static void main(String[]args) throws Exception {
		Updatemovie obj = new Updatemovie();
		obj.update();
	}
}
