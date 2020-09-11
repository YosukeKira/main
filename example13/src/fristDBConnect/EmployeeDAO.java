package fristDBConnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDAO {
	//サーバーモード
//	private final String JDBC_URL = "jdbc:h2:tcp//localhost/~/Documents/data/example";
	//組み込みモード
	private final String JDBC_URL = "jdbc:h2:file:~\\Documents\\data\\example";
	private final String DB_USER = "sa";
	private final String DB_PASS = "";

	//SELECT
	public List<Employee> findAll( ){
		List<Employee> empList = new ArrayList<>();

		//データベースへ接続
		try( Connection conn = DriverManager.getConnection( JDBC_URL, DB_USER, DB_PASS ) ){
			//sql文を準備
			String sql = "SELECT ID, NAME, AGE FROM EMPLOYEE";
			PreparedStatement pStmt = conn.prepareStatement(sql);

			//SELECTを実行し、結果表を取得
			ResultSet rs = pStmt.executeQuery();

			//結果表に格納されたレコードの内容をEmployeeインスタンスに設定し、ArrayListインスタンスに追加
			while( rs.next() ) {
				String id = rs.getString("ID");
				String name = rs.getString("NAME");
				int age = rs.getInt("AGE");
				Employee employee = new Employee( id, name, age );
				empList.add(employee);
			}
		} catch( SQLException e ) {
			e.printStackTrace();
			return null;
		}
		return empList;
	}

	//INSERT
	public boolean insert( String id, String name, int age ) {
		boolean judge = false;
		try( Connection conn = DriverManager.getConnection( JDBC_URL, DB_USER, DB_PASS )){
			//sql文を準備
			String sql = "INSERT INTO EMPLOYEE VALUES (?,?,?)";
			PreparedStatement pStmt = conn.prepareStatement(sql);

			//pStmtに値をセットし、実行
			pStmt.setString(1,id);
			pStmt.setString(2, name);
			pStmt.setInt(3, age);
			int result = pStmt.executeUpdate();
			System.out.println( result + "行が追加されました\n" );

		} catch( SQLException e) {
			e.printStackTrace();
			return false;
		}
		return judge;
	}

	//UPDATE
	public boolean update() {
		boolean judge = false;
		try ( Connection conn = DriverManager.getConnection( JDBC_URL, DB_USER, DB_PASS) ){

		} catch ( SQLException e ) {

		}

		return judge;
	}

	//DELETE
	public boolean remove( String id ) {
		boolean judge = false;
		//データベースへ接続
		try( Connection conn = DriverManager.getConnection( JDBC_URL, DB_USER, DB_PASS) ){
			//delete文を作成
			String sql = "DELETE FROM EMPLOYEE WHERE ID = ?";
			PreparedStatement pStmt = conn.prepareStatement(sql);

			//deleteを実行し、結果を取得
			pStmt.setString(1, "EMP003");
			int result = pStmt.executeUpdate();
			System.out.println( result + "行を削除しました\n");
			judge = true;

		} catch ( SQLException e ) {
			e.printStackTrace();
			return judge;
		}

		return judge;
	}


}
