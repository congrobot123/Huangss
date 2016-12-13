import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class TestSelect 
{
	static private Connection conn;
	static private PreparedStatement pstmt;
	static private ResultSet rs;

	public static void main(String[] args) throws Exception
	{
		String sql = "select * from student_table";

		if(conn == null)
		{
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(
		"jdbc:mysql://localhost:3306/mydatabase", "root", "congrobot");
		}
			
		pstmt = conn.prepareStatement(sql);
		rs = pstmt.executeQuery();
		while(rs.next())
		{
			System.out.println(rs.getInt(1) + "\t"
			+ rs.getString(3) + "\t"
			+ rs.getString(4) + "\t"
			+ rs.getString(5));
		}

		if(pstmt !=null)
		{
			pstmt.close();
		}
		if(conn !=null)
		{
			conn.close();
		}	
	}
}
