import java.sql.*; 
import java.util.Scanner;
public class Insertmovie {
	
	public void insert() throws Exception{
		String url ="jdbc:mysql://127.0.0.1:3306/newwwww";
		String username = "root";
		String password ="1234";
		String Query = "insert into first values(?,?,?)";
		Connection con = DriverManager.getConnection(url,username,password);
		PreparedStatement pst  = con.prepareStatement(Query);
		Scanner sc = new Scanner(System.in);
        
       
        System.out.println("Enter ID:");
        int id = sc.nextInt();
        
        System.out.println("Enter Name:");
        String name = sc.next();
        
        System.out.println("Enter Age:");
        int age = sc.nextInt();
        
        
		pst.setInt(1,id);
		pst.setString(2, name);
		pst.setInt(3, age);
		pst.executeUpdate();
		con.close();
		System.out.println("data inserted");
	}
	
	
	
	public static void main(String[]args) throws Exception {
		Insertmovie obj = new Insertmovie();
		obj.insert();
	}
}






//import java.sql.*; 
//
//public class Insertmovie {
//	
//	public void insert() throws Exception{
//		String url ="jdbc:mysql://127.0.0.1:3306/newwwww";
//		String username = "root";
//		String password ="1234";
//		String Query = "insert into first values(?,?,?)";
//		Connection con = DriverManager.getConnection(url,username,password);
//		PreparedStatement pst  = con.prepareStatement(Query);
//		
//		pst.setInt(1,102);
//		pst.setString(2, "kumar");
//		pst.setInt(3, 22);
//		pst.executeUpdate();
//		con.close();
//		System.out.println("data inserted");
//	}
//	
//	
//	
//	public static void main(String[]args) throws Exception {
//		Insertmovie obj = new Insertmovie();
//		obj.insert();
//	}
//}
