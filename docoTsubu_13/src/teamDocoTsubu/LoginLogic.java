package teamDocoTsubu;

public class LoginLogic {

	public boolean loginJudge( User user ) {
		boolean judge = false;
		//データベースからuser.getName()と同じデータを取得
		//passのデータが入力されたものと等しいか判定
		if( user.getPass().equals("1234") ) {
			judge = true;
		}
		return judge;
	}

}
