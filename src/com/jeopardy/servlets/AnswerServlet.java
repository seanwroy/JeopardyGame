package com.jeopardy.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.jeopardy.beans.Player;
import com.jeopardy.beans.Questions;

@WebServlet("/AnswerServlet")
public class AnswerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//Connect to session
		HttpSession session = request.getSession();
		
		String choice = request.getParameter("answer");
		Player player = (Player) session.getAttribute("player");
		Questions ques = (Questions) session.getAttribute("question");
		
		//Check if the client's choice is the same as the correct answer
		//for the question. If the answer is correct, add the question's value
		//to the player's score. If the number is wrong, subtract the question's
		//value from the player's score.
		
		try {
	 		if(choice.equals(ques.getCorrectAnswer())){
	 			System.out.println(ques.getCorrectAnswer());
	 			System.out.println(choice);
	 			player.setScore(player.getScore() + ques.getValue());
	 		} else {
	 			System.out.println(choice);
	 			System.out.println(ques.getCorrectAnswer());
	 			player.setScore(player.getScore() - ques.getValue());
	 		}
		} catch (Exception e) {
 			System.out.println(ques.getCorrectAnswer());
 			player.setScore(player.getScore() - ques.getValue());
		} finally {
			session.setAttribute("player", player);
			session.setAttribute("question", ques);
			
			//Request Dispatch to gameboard
			request.getRequestDispatcher("gameboard.jsp").forward(request, response);
		}
	}
}
