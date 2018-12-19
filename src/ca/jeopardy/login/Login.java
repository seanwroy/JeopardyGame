package ca.jeopardy.login;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import ca.jeopardy.beans.Player;

@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name = request.getParameter("username");
		Player player = new Player();
		player.setName(name);
		player.setScore(1);
		HttpSession session = request.getSession();
		session.setAttribute("player", player.getName());
		session.setAttribute("score", player.getScore());
		//Request Dispatch to the gameboard JSP
		
		request.getRequestDispatcher("gameboard.jsp").forward(request, response);
	
	}

}
