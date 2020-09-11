package fristDBConnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class SelectEmployeeSample {

	public static void main(String[] args) {
		//データベースに接続	(サーバーモードの場合はデータベースを常駐させておく必要あり)
		try( Connection conn = DriverManager.getConnection("jdbc:h2:file:~\\Documents\\data\\example","sa","") ){
									//組み込みモードの場合     jdbc:h2:C:\Users\pm\Documents\data\example
															 //jdbc:h2:file:~\\Documents\\data\\example
			//select文を準備
			String sql = "select ID,NAME,AGE from employee";
			PreparedStatement pStmt = conn.prepareStatement(sql);

			//selectを実行し、結果表(ResultSet)を取得
			ResultSet rs = pStmt.executeQuery();

			//結果表に格納されたレコードの内容を表示
			while( rs.next() ) {
				String id = rs.getString("ID");
				String name = rs.getString("NAME");
				int age = rs.getInt("AGE");

				//取得したデータを出力
				System.out.println("ID:" + id);
				System.out.println("名前:" + name);
				System.out.println("年齢:" + age + "\n");
			}

		} catch ( SQLException e ) {
			e.printStackTrace();
		}

	}

}
