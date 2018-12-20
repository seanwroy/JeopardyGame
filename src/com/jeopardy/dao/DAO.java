package com.jeopardy.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.ArrayList;
import com.jeopardy.beans.Questions;
import com.jeopardy.servlets.AnswerSelect;

public class DAO {

	public void addQuestion(Questions userinput) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = null;
			
			conn = DriverManager.getConnection("jdbc:mysql://localhost/jeopardy", "root", "root");
			String q = "INSERT INTO questions2 VALUES('" + userinput.getQuestion() + "', '" + userinput.getCategory() + "', '" + userinput.getAnswer1() + "', '" + userinput.getAnswer2()
					+ "', '" + userinput.getAnswer3() + "', '" + userinput.getAnswer4() + "', '" + userinput.getCorrectAnswer() + "', '" + userinput.getValue() + "')";
			
			Statement st = conn.createStatement();
			
			st.executeUpdate(q);
			
			System.out.println("Connection Success");
			conn.close();
		} catch (Exception e) {
			System.out.println("Connection Failed");
			System.out.println(e);
		}
	}
	
public Questions getQuestions(String category, int value) {
		Questions questions = new Questions();
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = null;
			
			conn = DriverManager.getConnection("jdbc:mysql://localhost/jeopardy", "root", "root");
			String q = "SELECT * FROM questions2 WHERE (category = '" + category + "') AND (value = " + value + ")";
			
			Statement st = conn.createStatement();
			
			//st.executeUpdate(q);
			
			ResultSet rs = st.executeQuery(q);
			ResultSetMetaData rsmd = rs.getMetaData();			
			
			while(rs.next()) {
				questions.setQuestion(rs.getString(1));
				questions.setCategory(rs.getString(2));
				questions.setAnswer1(rs.getString(3));
				questions.setAnswer2(rs.getString(4));
				questions.setAnswer3(rs.getString(5));
				questions.setAnswer4(rs.getString(6));
				questions.setCorrectAnswer(rs.getString(7));
				questions.setValue(Integer.parseInt(rs.getString(8)));
			}
	
			System.out.println("Connection Success");
			conn.close();
		} catch (Exception e) {
			System.out.println("Connection Failed");
			System.out.println(e);
		}
		
		return questions;
	}
}
