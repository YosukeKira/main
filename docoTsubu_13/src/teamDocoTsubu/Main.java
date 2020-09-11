package teamDocoTsubu;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Main
 */
@WebServlet("/Main")
public class Main extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ServletContext application = this.getServletContext();
		List<Mutter> mutterList = (List<Mutter>) application.getAttribute("mutterList");
		if (mutterList == null) {
			mutterList = new ArrayList<>();
			application.setAttribute("mutterList", mutterList );

		}

		//ログインしているユーザーか確認
		HttpSession session = request.getSession();
		User user = ( User ) session.getAttribute("user");;
		if( user == null ) {
			response.sendRedirect("/docoTsubu_13/");
		} else {
			request.getRequestDispatcher("/WEB-INF/main.jsp").forward(request, response);
		}



	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		request.setCharacterEncoding("UTF-8");
		String mutter = request.getParameter("mutter");
		if( mutter != null && mutter.length() != 0 ) {
			//つぶやきリストを取得
			ServletContext application = this.getServletContext();
			List<Mutter> mutterList = (List<Mutter>) application.getAttribute("mutterList");

			//誰がつぶやいたのか確認
			HttpSession session = request.getSession();
			User user = (User) session.getAttribute("user");

			Mutter userMutter = new Mutter( user.getName(), mutter );

			//つぶやきリストの先頭につぶやきを追加
			PostMutterLogic logic = new PostMutterLogic();
			logic.mutterAdd(userMutter , mutterList);

			//アプリケーションスコープにつぶやきリストを保存
			application.setAttribute("mutterList", mutterList);
		} else {
			String error = "つぶやきが入力されていません";
			request.setAttribute("error", error );
			request.getRequestDispatcher("/WEB-INF/main.jsp").forward(request, response);
		}




		request.getRequestDispatcher("/WEB-INF/main.jsp").forward(request, response);
	}

}
