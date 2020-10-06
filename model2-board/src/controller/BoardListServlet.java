package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import service.*;

@WebServlet("/BoardListServlet")
public class BoardListServlet extends HttpServlet {
	public BoardDao boardDao;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.boardDao = new BoardDao();
		ArrayList<Board> list = boardDao.getBoardList(1, 10); // 포워드에서는 response, request만 보내줄 수 있다
		request.setAttribute("list", list); // object type으로 저장(다형성)
		request.getRequestDispatcher("/WEB-INF/views/boardList.jsp").forward(request, response);
	}
}
