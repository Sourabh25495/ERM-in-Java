import java.sql.*;
public class TestConnector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Statement st;
		String sql="";
		try
		{
			Connector c = new Connector();
			c.getConnection();
			st = c.getCon().createStatement();
			sql = "delete from emp where id = 2";
			st.executeUpdate(sql);
			
			
		}
		catch(Exception e)
		{
			System.out.println(e.toString());
		}
		
		

	}

}
