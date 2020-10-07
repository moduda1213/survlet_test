package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import service.Board;
import service.BoardDao;

@WebServlet("/BoardListServlet")
public class BoardListServlet extends HttpServlet {
	public BoardDao boardDao;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		if(session.getAttribute("loginId") == null) {
			response.sendRedirect(request.getContextPath()+"/LoginServlet");
			return;
		}
		
		this.boardDao = new BoardDao();
		ArrayList<Board> list = boardDao.getBoardList(1, 10);
		request.setAttribute("list", list);
		request.getRequestDispatcher("/WEB-INF/views/boardList.jsp").forward(request, response);
	}
}
