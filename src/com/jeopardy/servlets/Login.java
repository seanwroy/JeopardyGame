package com.jeopardy.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.jeopardy.beans.Player;

@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name = request.getParameter("username");
		Player player = new Player();
		player.setName(name);
		player.setScore(0);
		
		String[] used = new String[25];
		used[0] = "<a href=\"PickQuestion?qnum=0&category=Science+Fiction&value=200\"></a>";
		used[1] = "<a href=\"PickQuestion?qnum=1&category=PC+Gaming&value=200\"></a>";
		used[2] = "<a href=\"PickQuestion?qnum=2&category=Hardware&value=200\"></a>";
		used[3] = "<a href=\"PickQuestion?qnum=3&category=Trek+and+Wars&value=200\"></a>";
		used[4] = "<a href=\"PickQuestion?qnum=4&category=Programming&value=200\"></a>";
		used[5] = "<a href=\"PickQuestion?qnum=5&category=Science+Fiction&value=400\"></a>";
		used[6] = "<a href=\"PickQuestion?qnum=6&category=PC+Gaming&value=400\"></a>";
		used[7] = "<a href=\"PickQuestion?qnum=7&category=Hardware&value=400\"></a>";
		used[8] = "<a href=\"PickQuestion?qnum=8&category=Trek+and+Wars&value=400\"></a>";
		used[9] = "<a href=\"PickQuestion?qnum=9&category=Programming&value=400\"></a>";
		used[10] = "<a href=\"PickQuestion?qnum=10&category=Science+Fiction&value=600\"></a>";
		used[11] = "<a href=\"PickQuestion?qnum=11&category=PC+Gaming&value=600\"></a>";
		used[12] = "<a href=\"PickQuestion?qnum=12&category=Hardware&value=600\"></a>";
		used[13] = "<a href=\"PickQuestion?qnum=13&category=Trek+and+Wars&value=600\"></a>";
		used[14] = "<a href=\"PickQuestion?qnum=14&category=Programming&value=600\"></a>";
		used[15] = "<a href=\"PickQuestion?qnum=15&category=Science+Fiction&value=800\"></a>";
		used[16] = "<a href=\"PickQuestion?qnum=16&category=PC+Gaming&value=800\"></a>";
		used[17] = "<a href=\"PickQuestion?qnum=17&category=Hardware&value=800\"></a>";
		used[18] = "<a href=\"PickQuestion?qnum=18&category=Trek+and+Wars&value=800\"></a>";
		used[19] = "<a href=\"PickQuestion?qnum=19&category=Programming&value=800\"></a>";
		used[20] = "<a href=\"PickQuestion?qnum=20&category=Science+Fiction&value=1000\"></a>";
		used[21] = "<a href=\"PickQuestion?qnum=21&category=PC+Gaming&value=1000\"></a>";
		used[22] = "<a href=\"PickQuestion?qnum=22&category=Hardware&value=1000\"></a>";
		used[23] = "<a href=\"PickQuestion?qnum=23&category=Trek+and+Wars&value=1000\"></a>";
		used[24] = "<a href=\"PickQuestion?qnum=24&category=Programming&value=1000\"></a>";
			
		HttpSession session = request.getSession();
		
		session.setAttribute("used", used);
		session.setAttribute("player", player);
		
		//Request Dispatch to the gameboard JSP		
		request.getRequestDispatcher("gameboard.jsp").forward(request, response);
	
	}

}
