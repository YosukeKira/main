package teamDocoTsubu;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class DocoTsubuC
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());

		response.sendRedirect("/docoTsubu_13/");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		doGet(request, response);

		//ログインの判定
		request.setCharacterEncoding("UTF-8");
		String name = request.getParameter("name");
		String pass = request.getParameter("pass");
		if( name == null || pass == null ) {
			request.getRequestDispatcher("/WEB-INF/loginResult.jsp").forward(request, response);
		}

		//入力された値のチェック
//		Pattern patternPass = Pattern.compile("~[0-9a-zA-Z]{4}$");
//		if( patternPass.matcher(name).matches() ) {
//			;
//		}else {
//			request.getRequestDispatcher("/WEB-INF/loginResult.jsp").forward(request, response);
//		}

		User user = new User(name,pass);

		LoginLogic login = new LoginLogic();
		boolean judge = login.loginJudge(user);
		if( judge == true ) {
			HttpSession session = request.getSession();
			session.setAttribute("user", user);
		}

		request.getRequestDispatcher("/WEB-INF/loginResult.jsp").forward(request, response);
	}

}
