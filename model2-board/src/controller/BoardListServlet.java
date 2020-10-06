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
		ArrayList<Board> list = boardDao.getBoardList(1, 10); // �����忡���� response, request�� ������ �� �ִ�
		request.setAttribute("list", list); // object type���� ����(������)
		request.getRequestDispatcher("/WEB-INF/views/boardList.jsp").forward(request, response);
	}
}
