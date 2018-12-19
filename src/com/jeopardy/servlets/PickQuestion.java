package com.jeopardy.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.jeopardy.beans.Questions;
import com.jeopardy.dao.DAO;

@WebServlet("/PickQuestion")
public class PickQuestion extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		
		String category = (String) request.getParameter("category"); 
		int value = Integer.parseInt(request.getParameter("value"));
		int qnum = Integer.parseInt(request.getParameter("qnum"));
		
		String[] used = (String[])session.getAttribute("used");
		used[qnum] = "<img src='rsc/x.png' style='height:60px; width:60px;'>";
	    
		Questions question = new Questions();
		
		DAO dao = new DAO();
		
		question = dao.getQuestions(category, value);
					
		//Connect to session
		session.setAttribute("question", question);
		session.setAttribute("used", used);	
		
		//Request dispatch to viewQuestion
		request.getRequestDispatcher("questions.jsp").forward(request, response);

	}

}
