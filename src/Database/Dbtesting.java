package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



public class Dbtesting {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
		Connection conn=null;
		String url="jdbc:mysql://localhost:3306/";
		String dbname="test";
		String dbdriver="com.mysql.jdbc.Driver";
		String username="root";
		String password="root";
		Class.forName(dbdriver).newInstance();
		conn=DriverManager.getConnection(url+dbname,username,password);
		PreparedStatement psmt=conn.prepareStatement("select * from emp where sal>? and deptno=?");
		psmt.setString(1,"2000");
		psmt.setString(2,"20");
		ResultSet rs=psmt.executeQuery();
		while(rs.next())
		{
			for(int i=1;i<=8;i++)
			{
				System.out.print(rs.getString(i)+"  ");
			}
			System.out.println();
		}

	}

}
