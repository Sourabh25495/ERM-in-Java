import java.sql.*;
public class Connector {

	
	private Connection con;
	private Statement st;
	private ResultSet rs;
	public void getConnection()
	{
		try
		{
		Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost/employee","root","");
		//System.out.println("hello");
		}
		catch(Exception e)
		{
			System.out.println(e.toString());
		}
	}
	public Connection getCon()
	{
		return con;
	}
	public Statement getStatement()
	{
		return st;
	}
	public ResultSet getResult()
	{
		return rs;
	}
	
}
