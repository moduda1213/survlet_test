package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/GetLogin")
public class GetLogin extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/cookie/loginFormCookie.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Cookie[] cookies = request.getCookies(); // ��Ű ������ �޾Ƽ� ����
		String id = "";
		String pw = "";
		String save = request.getParameter("save");
		if(cookies != null){ //��Ű�� �����Ͱ� ���� �� ����
			for(Cookie c : cookies){
				if(c.getName().equals("id")){
					id=c.getValue();
				}else if(c.getName().equals("pw")){
					pw=c.getValue();
				}
			}
		}
		HttpSession session = request.getSession();
		session.setAttribute("id", id);
		session.setAttribute("pw", pw);
		session.setAttribute("save", save);
		response.sendRedirect(request.getContextPath()+"/LoginAction");
	}
}
