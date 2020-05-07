package Database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionTest {
	public static void main(String[] args) {
		
		Connection conn = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost/othello_loginsystem?useSSL=false&&useUnicode=true&&characterEncoding=UTF-8&&serverTimezone=UTC"; // UTC ���������� UTC = KST + 9:00
			
			conn = DriverManager.getConnection(url,"root","1234");
			System.out.println("���� ����");
		}catch(ClassNotFoundException e) {
			System.out.println("����̹� �ε� ����");
		}catch(SQLException e) {
			System.out.println("error: "+e);
		}finally {
			try {
				if(conn != null && !conn.isClosed()) {
					conn.close();
				}
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
