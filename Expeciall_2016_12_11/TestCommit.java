import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Savepoint;

public class TestCommit
{
	static private Connection conn = null;
	static private PreparedStatement pstmt1 = null;
	static private PreparedStatement pstmt2 = null;
	static private ResultSet rs = null;

	public static void index() throws Exception
	{
		String sql = "select * from student_table";
		pstmt2 = conn.prepareStatement(sql);
		if(pstmt2 != null)
		{
			rs = pstmt2.executeQuery();
		}

		ResultSetMetaData rsmd = rs.getMetaData();
		int columnCount = rsmd.getColumnCount();

		while(rs.next())
		{
			for(int i =0; i <columnCount; i++)
			{
				System.out.print(rs.getString(i+1) + "\t");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) throws Exception
	{

		if(conn ==null)
		{
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/pbsbase2", 
			"root", "congrobot");
		}
		
		conn.setAutoCommit(false);
		String sql1 = "insert into student_table values(null, 'huangss2', '00000000002', 'man', 'a boy')";
		Savepoint a = conn.setSavepoint("a");

		pstmt1 = conn.prepareStatement(sql1);
		pstmt1.executeUpdate();

		index();

		System.out.println();

		conn.rollback(a);
		index();

		System.out.println();

		conn.commit();
		index();

		if(pstmt1 != null)
		{
			pstmt1.close();
		}
		if(pstmt2 != null)
		{
			pstmt1.close();
		}
		if(conn != null)
		{
			conn.close();
		}
	}
}