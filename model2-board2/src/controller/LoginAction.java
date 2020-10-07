package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.Dao;


@WebServlet("/LoginAction")
public class LoginAction extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println(request.getParameter("id"));
		System.out.println(request.getParameter("pw"));
		System.out.println(request.getParameter("save"));
		
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		boolean save = false;
		if(request.getParameter("save") != null) {
			save=true;
		}
		//business layer 호출(model layer)
		Dao dao = new Dao();
		if(dao.login(id, pw)) {
			if(save) { //true일때
				Cookie idCookie = new Cookie("id",id);
				idCookie.setMaxAge(60*60*24);
				response.addCookie(idCookie);
				
				Cookie pwCookie = new Cookie("pw",pw);
				pwCookie.setMaxAge(60*60*24);
				response.addCookie(pwCookie);
			}
			request.setAttribute("msg", "success");
		}else {
			request.setAttribute("msg", "fail");
		}
		RequestDispatcher rd = request.getRequestDispatcher("/login_view.jsp");
		rd.forward(request, response);
	}	
}
