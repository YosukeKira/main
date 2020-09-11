package fristDBConnect;

import java.util.List;

public class SelectEmployeeSampleDaoVer {

	public static void main(String[] args) {
		EmployeeDAO empDAO = new EmployeeDAO();

		//employeeテーブルに斉藤さんを追加
		empDAO.insert("EMP003", "斉藤さん", 23);


		//employeeテーブルの全レコードを取得
		List<Employee> empList = empDAO.findAll();

		for ( Employee emp : empList ) {
			System.out.println( "ID:" + emp.getId() );
			System.out.println( "名前:" + emp.getName() );
			System.out.println( "年齢:" + emp.getAge() + "\n" );
		}

		//employeeテーブルから斉藤さんを削除
		empDAO.remove("EMP003");

		//employeeテーブルの全レコードを取得
		empList = empDAO.findAll();

		for ( Employee emp : empList ) {
			System.out.println( "ID:" + emp.getId() );
			System.out.println( "名前:" + emp.getName() );
			System.out.println( "年齢:" + emp.getAge() + "\n" );
		}

	}

}
