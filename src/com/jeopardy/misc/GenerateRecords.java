package com.jeopardy.misc;

import com.jeopardy.beans.Questions;
import com.jeopardy.dao.DAO;


public class GenerateRecords {

public static void main(String[] args) {
	for(int i = 0; i <= 24; i++) {
		getQuestion(i);
	}
}

	public static void getQuestion(int qnum) {

    	DAO dao = new DAO();
    	
    	if(qnum == 0) {
    		String category = "Science Fiction";
    		int value = 200;
    		String question = "The 1999 film where the protagonist is offered "
    				+ "to take a red pill or a blue pill";
    		String answer1 = "The Matrix";
    		String answer2 = "eXistenZ";
    		String answer3 = "Equilibrium";
    		String answer4 = "The Thirteenth Floor";
    		String correct = "The Matrix";
    		
    		Questions ques = new Questions(category, value, question, answer1, answer2, answer3, answer4, correct);
    		
    		dao.addQuestion(ques);
    	}
    	
    	else if(qnum == 5) {
    		String category = "Science Fiction";
    		int value = 400;
    		String question = "Which of the following SciFi films "
    				+ "were NOT directed by Steven Speilberg?";
    		String answer1 = "Close Encounters of the Third Kind";
    		String answer2 = "War of the Worlds";
    		String answer3 = "AI";
    		String answer4 = "2001: A Space Odyssey";
    		String correct = "2001: A Space Odyssey";
    		
    		Questions ques = new Questions(category, value, question, answer1, answer2, answer3, answer4, correct);
    		
    		dao.addQuestion(ques);
    	}
    	
    	else if(qnum == 10) {
    		String category = "Science Fiction";
    		int value = 600;
    		String question = "From what classic SciFi film "
					+ "does the quote ''a bit of the old ultra violence'' come from?";
    		String answer1 = "2001: A Space Odyssey";
    		String answer2 = "The Shining";
    		String answer3 = "A Clockwork Orange";
    		String answer4 = "Star Wars";
    		String correct = "A Clockwork Orange";
    		Questions ques = new Questions(category, value, question, answer1, answer2, answer3, answer4, correct);
    		
    		dao.addQuestion(ques);
    		
    	}
    	else if(qnum == 15) {
    		String category = "Science Fiction";
    		int value = 800;
    		String question = "According to official Blade Runner canon, "
					+ "is Deckard a replicant?";
    		String answer1 = "Yes";
    		String answer2 = "No";
    		String answer3 = "Maybe";
    		String answer4 = "Evidence points to ''yes''";
    		String correct = "Yes";

    		Questions ques = new Questions(category, value, question, answer1, answer2, answer3, answer4, correct);
    		
    		dao.addQuestion(ques);
    	}
    	else if(qnum == 20) {
    		String category = "Science Fiction";
    		int value = 1000;
    		String question = "Which science fiction author wrote the following: A Scanner Darkly, Minority Report, "
    				+ "Do Androids Dream of Electric Sheep, and Man in the High Castle?";
    		String answer1 = "Aldous Huxley";
    		String answer2 = "Arthur C. Clarke";
    		String answer3 = "Philip K. Dick";
    		String answer4 = "Robert A. Heinlein";
    		String correct = "Philip K. Dick";

    		Questions ques = new Questions(category, value, question, answer1, answer2, answer3, answer4, correct);
    		
    		dao.addQuestion(ques);
    	}
    	else if(qnum == 1) {
    		String category = "PC Gaming";
    		int value = 200;
    		String question = "This famous Nintendo plumber wears red and blue overalls";
    		String answer1 = "Luigi";
    		String answer2 = "Super Mario";
    		String answer3 = "Bowser";
    		String answer4 = "King Koopa";
    		String correct = "Super Mario";
    		Questions ques = new Questions(category, value, question, answer1, answer2, answer3, answer4, correct);
    		
    		dao.addQuestion(ques);
    	}
    	else if(qnum == 6) {
    		String category = "PC Gaming";
    		int value = 400;
    		String question = "The three playable races in this RTS game include Terran, Zerg, and Protoss";
    		String answer1 = "Red Alert";
    		String answer2 = "Wing Commander";
    		String answer3 = "Starcraft";
    		String answer4 = "Fallout";
    		String correct = "Starcraft";
    		Questions ques = new Questions(category, value, question, answer1, answer2, answer3, answer4, correct);
    		
    		dao.addQuestion(ques);
    	}
    	else if(qnum == 11) {
    		String category = "PC Gaming";
    		int value = 600;
    		String question = "The main character in this franchise is named Gordan Freeman";
    		String answer1 = "Doom";
    		String answer2 = "Portal";
    		String answer3 = "Call of Duty";
    		String answer4 = "Half-Life";
    		String correct = "Half-Life";

    		Questions ques = new Questions(category, value, question, answer1, answer2, answer3, answer4, correct);
    		
    		dao.addQuestion(ques);
    	}
    	else if(qnum == 16) {
    		String category = "PC Gaming";
    		int value = 800;
    		String question = "Guybrush Threepwood is a character from which classic adventure game?";
    		String answer1 = "Return to Zork";
    		String answer2 = "Myst";
    		String answer3 = "Full Throttle";
    		String answer4 = "The Secret of Monkey Island";
    		String correct = "The Secret of Monkey Island";
    		
    		Questions ques = new Questions(category, value, question, answer1, answer2, answer3, answer4, correct);
    		
    		dao.addQuestion(ques);
    	}
    	else if(qnum == 21) {
    		String category = "PC Gaming";
    		int value = 1000;
    		String question = "''But there''s no sense crying over every mistake. You just keep on "
					+ "trying ''til you run out of cake.'' is a line from a song from which classic game?";
    		String answer1 = "Team Fortress 2";
    		String answer2 = "Portal 2";
    		String answer3 = "Pac-Man";
    		String answer4 = "Portal";
    		String correct = "Portal";
    		

    		Questions ques = new Questions(category, value, question, answer1, answer2, answer3, answer4, correct);
    		
    		dao.addQuestion(ques);
    	}
    	else if(qnum == 2) {
    		String category = "Hardware";
    		int value = 200;
    		String question = "Which company is the most well known CPU manufacturer?";
    		String answer1 = "Intel";
    		String answer2 = "Dell";
    		String answer3 = "AMD";
    		String answer4 = "Microsoft";
    		String correct = "Intel";

    		Questions ques = new Questions(category, value, question, answer1, answer2, answer3, answer4, correct);
    		
    		dao.addQuestion(ques);
    	}
    	else if(qnum == 7) {
    		String category = "Hardware";
    		int value = 400;
    		String question = "Do case LEDs provide any performance improvements?";
    		String answer1 = "Of course";
    		String answer2 = "That''s absurd";
    		String answer3 = "It''s unproven";
    		String answer4 = "In some cases";
    		String correct = "That''s absurd";
    	
    		Questions ques = new Questions(category, value, question, answer1, answer2, answer3, answer4, correct);
    		
    		dao.addQuestion(ques);
    	}
    	else if(qnum == 12) {
    		String category = "Hardware";
    		int value = 600;
    		String question = "This prominent VR company was acquired by Facebook in 2014";
    		String answer1 = "HTC";
    		String answer2 = "Oculus";
    		String answer3 = "Pimax";
    		String answer4 = "Valve";
    		String correct = "Oculus";

    		Questions ques = new Questions(category, value, question, answer1, answer2, answer3, answer4, correct);
    		
    		dao.addQuestion(ques);
    	}
    	else if(qnum == 17) {
    		String category = "Hardware";
    		int value = 800;
    		String question = "Historically, GPUs accelerated which type of real time rendering?";
    		String answer1 = "Rasterization";
    		String answer2 = "Ray Tracing";
    		String answer3 = "Wireframe";
    		String answer4 = "Software Rendering";
    		String correct = "Rasterization";

    		Questions ques = new Questions(category, value, question, answer1, answer2, answer3, answer4, correct);
    		
    		dao.addQuestion(ques);
    	}
    	else if(qnum == 22) {
    		String category = "Hardware";
    		int value = 1000;
    		String question = "Ending in approx. 2010, the observed phenomenon where the number of transistors on an "
    				+ "integrated circuit doubled every two years was known as:";
    		String answer1 = "Moore''s Law";
    		String answer2 = "The Law of Thermodynamics";
    		String answer3 = "The Law of Quantum Tunnelling";
    		String answer4 = "Law & Order: Special Victims Unit";
    		String correct = "Moore''s Law";

    		Questions ques = new Questions(category, value, question, answer1, answer2, answer3, answer4, correct);
    		
    		dao.addQuestion(ques);
    	}
    	else if(qnum == 3) {
    		String category = "Trek and Wars";
    		int value = 200;
    		String question = "Who was the first TV captain of the Starship Enterprise?";
    		String answer1 = "Picard";
    		String answer2 = "Sulu";
    		String answer3 = "Kirk";
    		String answer4 = "Sisko";
    		String correct = "Kirk";

    		Questions ques = new Questions(category, value, question, answer1, answer2, answer3, answer4, correct);
    		
    		dao.addQuestion(ques);
    	}
    	else if(qnum == 8) {
    		String category = "Trek and Wars";
    		int value = 400;
    		String question = "Who said: ''Do or do not, there is no try''";
    		String answer1 = "Luke Skywalker";
    		String answer2 = "Captain Jean Luc Picard";
    		String answer3 = "Han Solo";
    		String answer4 = "Yoda";
    		String correct = "Yoda";

    		Questions ques = new Questions(category, value, question, answer1, answer2, answer3, answer4, correct);
    		
    		dao.addQuestion(ques);
    	}
    	else if(qnum == 13) {
    		String category = "Trek and Wars";
    		int value = 600;
    		String question = "Which of the following is not an alien race from Star Trek?";
    		String answer1 = "Romulans";
    		String answer2 = "Vulcans";
    		String answer3 = "Wookies";
    		String answer4 = "The Borg";
    		String correct = "Wookies";

    		Questions ques = new Questions(category, value, question, answer1, answer2, answer3, answer4, correct);
    		
    		dao.addQuestion(ques);
    	}
    	else if(qnum == 18) {
    		String category = "Trek and Wars";
    		int value = 800;
    		String question = "Lando Calrissian was the administrator of _____";
    		String answer1 = "Tatooine";
    		String answer2 = "Cloud City";
    		String answer3 = "The Borg Cube";
    		String answer4 = "Hoth";
    		String correct = "Cloud City";

    		Questions ques = new Questions(category, value, question, answer1, answer2, answer3, answer4, correct);
    		
    		dao.addQuestion(ques);
    	}
    	else if(qnum == 23) {
    		String category = "Trek and Wars";
    		int value = 1000;
    		String question = "The Next Generation takes place during which century?";
    		String answer1 = "21st";
    		String answer2 = "22nd";
    		String answer3 = "23rd";
    		String answer4 = "24th";
    		String correct = "24th";

    		Questions ques = new Questions(category, value, question, answer1, answer2, answer3, answer4, correct);
    		
    		dao.addQuestion(ques);
    	}
    	else if(qnum == 4) {
    		String category = "Programming";
    		int value = 200;
    		String question = "What does HTML stand for?";
    		String answer1 = "Hypertext Multi Language";
    		String answer2 = "Hypertext Markup Language";
    		String answer3 = "Hypertext Meaning Language";
    		String answer4 = "Hypertext Moo Language";
    		String correct = "Hypertext Markup Language";

    		Questions ques = new Questions(category, value, question, answer1, answer2, answer3, answer4, correct);
    		
    		dao.addQuestion(ques);
    	}
    	else if(qnum == 9) {
    		String category = "Programming";
    		int value = 400;
    		String question = "CSS stands for:";
    		String answer1 = "Cascading Stereo Sounds";
    		String answer2 = "Central Sound System";
    		String answer3 = "Cascading Style Sheets";
    		String answer4 = "Cascading Simulation Sheets";
    		String correct = "Cascading Style Sheets";

    		Questions ques = new Questions(category, value, question, answer1, answer2, answer3, answer4, correct);
    		
    		dao.addQuestion(ques);
    	}
    	else if(qnum == 14) {
    		String category = "Programming";
    		int value = 600;
    		String question = "Which of the following languages are NOT object oriented?";
    		String answer1 = "Java";
    		String answer2 = "Python";
    		String answer3 = "C";
    		String answer4 = "C++";
    		String correct = "C";

    		Questions ques = new Questions(category, value, question, answer1, answer2, answer3, answer4, correct);
    		
    		dao.addQuestion(ques);
    	}
    	else if(qnum == 19) {
    		String category = "Programming";
    		int value = 800;
    		String question = "Web programmers are which type of developer";
    		String answer1 = "Front End";
    		String answer2 = "Back End";
    		String answer3 = "Full Stack";
    		String answer4 = "MEAN Stack";
    		String correct = "Front End";
    		
    		Questions ques = new Questions(category, value, question, answer1, answer2, answer3, answer4, correct);
    		
    		dao.addQuestion(ques);
    	}
    	else if (qnum == 24){
    		String category = "Programming";
    		int value = 1000;
    		String question = "Which programming language is the oldest?";
    		String answer1 = "Fortran";
    		String answer2 = "Basic";
    		String answer3 = "Cobol";
    		String answer4 = "Lisp";
    		String correct = "Fortran";
    		
    		Questions ques = new Questions(category, value, question, answer1, answer2, answer3, answer4, correct);
    		
    		dao.addQuestion(ques);
    	}
    	
    	
    }

}
