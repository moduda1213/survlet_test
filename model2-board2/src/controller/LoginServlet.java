package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// ·Î±×ÀÎ Æûºä
		request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		// ·Î±×ÀÎ ¾×¼Ç
		String dbid = "admin";
		String dbpw = "1234";
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		if(dbid.equals(id) && dbpw.equals(pw)) {
			HttpSession session = request.getSession();
			session.setAttribute("loginId", id);
			response.sendRedirect(request.getContextPath()+"/BoardListServlet"); // controller
		} else {
			response.sendRedirect(request.getContextPath()+"/LoginServlet"); // controller
		}
	}
}
