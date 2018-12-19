package ca.jeopardy.questions;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import ca.jeopardy.beans.Questions;

@WebServlet("/PickQuestion")
public class PickQuestion extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		
		String qnum = request.getParameter("qnum");
		AnswerSelect qs = new AnswerSelect();
		Questions ques = qs.getQuestion(Integer.parseInt(qnum));
		
		//Connect to session
		session.setAttribute("question", ques);
		
		//Request dispatch to viewQuestion
		request.getRequestDispatcher("questions.jsp").forward(request, response);

	}

}
