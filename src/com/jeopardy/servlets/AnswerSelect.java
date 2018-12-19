package com.jeopardy.servlets;

import com.jeopardy.beans.Questions;

public class AnswerSelect {    
    public Questions getQuestion(int qnum) {
    	Questions question = new Questions();
    	
    	if(qnum == 0) {
    		question.setCategory("Science Fiction");
    		question.setValue(200);
    		question.setQuestion("The 1999 film where the protagonist is offered "
    				+ "to take a red pill or a blue pill");
    		question.setAnswer1("The Matrix");
    		question.setAnswer2("eXistenZ");
    		question.setAnswer3("Equilibrium");
    		question.setAnswer4("The Thirteenth Floor");
    		question.setCorrectAnswer("The Matrix");
    	}
    	
    	else if(qnum == 5) {
    		question.setCategory("Science Fiction");
    		question.setValue(400);
    		question.setQuestion("Which of the following SciFi films "
    				+ "were NOT directed by Steven Speilberg?");
    		question.setAnswer1("Close Encounters of the Third Kind");
    		question.setAnswer2("War of the Worlds");
    		question.setAnswer3("AI");
    		question.setAnswer4("2001: A Space Odyssey");
    		question.setCorrectAnswer("2001: A Space Odyssey");
    	}
    	
    	else if(qnum == 10) {
    		question.setCategory("Science Fiction");
    		question.setValue(600);
    		question.setQuestion("From what classic SciFi film "
					+ "does the quote 'a bit of the old ultra violence' come from?");
    		question.setAnswer1("2001: A Space Odyssey");
    		question.setAnswer2("The Shining");
    		question.setAnswer3("A Clockwork Orange");
    		question.setAnswer4("Star Wars");
    		question.setCorrectAnswer("A Clockwork Orange");
    	}
    	else if(qnum == 15) {
    		question.setCategory("Science Fiction");
    		question.setValue(800);
    		question.setQuestion("According to official Blade Runner canon, "
					+ "is Deckard a replicant?");
    		question.setAnswer1("Yes");
    		question.setAnswer2("No");
    		question.setAnswer3("Maybe");
    		question.setAnswer4("Evidence points to 'yes'");
    		question.setCorrectAnswer("Yes");
    	}
    	else if(qnum == 20) {
    		question.setCategory("Science Fiction");
    		question.setValue(1000);
    		question.setQuestion("Which science fiction author wrote the following: A Scanner Darkly, Minority Report, "
    				+ "Do Androids Dream of Electric Sheep, and Man in the High Castle?");
    		question.setAnswer1("Aldous Huxley");
    		question.setAnswer2("Arthur C. Clarke");
    		question.setAnswer3("Philip K. Dick");
    		question.setAnswer4("Robert A. Heinlein");
    		question.setCorrectAnswer("Philip K. Dick");
    	}
    	else if(qnum == 1) {
    		question.setCategory("PC Gaming");
    		question.setValue(200);
    		question.setQuestion("This famous Nintendo plumber wears red and blue overalls");
    		question.setAnswer1("Luigi");
    		question.setAnswer2("Super Mario");
    		question.setAnswer3("Bowser");
    		question.setAnswer4("King Koopa");
    		question.setCorrectAnswer("Super Mario");
    	}
    	else if(qnum == 6) {
    		question.setCategory("PC Gaming");
    		question.setValue(400);
    		question.setQuestion("The three playable races in this RTS game include Terran, Zerg, and Protoss");
    		question.setAnswer1("Red Alert");
    		question.setAnswer2("Wing Commander");
    		question.setAnswer3("Starcraft");
    		question.setAnswer4("Fallout");
    		question.setCorrectAnswer("Starcraft");
    	}
    	else if(qnum == 11) {
    		question.setCategory("PC Gaming");
    		question.setValue(600);
    		question.setQuestion("The main character in this franchise is named Gordan Freeman");
    		question.setAnswer1("Doom");
    		question.setAnswer2("Portal");
    		question.setAnswer3("Call of Duty");
    		question.setAnswer4("Half-Life");
    		question.setCorrectAnswer("Half-Life");
    	}
    	else if(qnum == 16) {
    		question.setCategory("PC Gaming");
    		question.setValue(800);
    		question.setQuestion("Guybrush Threepwood is a character from which classic adventure game?");
    		question.setAnswer1("Return to Zork");
    		question.setAnswer2("Myst");
    		question.setAnswer3("Full Throttle");
    		question.setAnswer4("The Secret of Monkey Island");
    		question.setCorrectAnswer("The Secret of Monkey Island");
    	}
    	else if(qnum == 21) {
    		question.setCategory("PC Gaming");
    		question.setValue(1000);
    		question.setQuestion("'But there's no sense crying over every mistake. You just keep on "
					+ "trying 'til you run out of cake.' is a line from a song from which classic game?");
    		question.setAnswer1("Team Fortress 2");
    		question.setAnswer2("Portal 2");
    		question.setAnswer3("Pac-Man");
    		question.setAnswer4("Portal");
    		question.setCorrectAnswer("Portal");
    	}
    	else if(qnum == 2) {
    		question.setCategory("Hardware");
    		question.setValue(200);
    		question.setQuestion("Which company is the most well known CPU manufacturer?");
    		question.setAnswer1("Intel");
    		question.setAnswer2("Dell");
    		question.setAnswer3("AMD");
    		question.setAnswer4("Microsoft");
    		question.setCorrectAnswer("Intel");
    	}
    	else if(qnum == 7) {
    		question.setCategory("Hardware");
    		question.setValue(400);
    		question.setQuestion("Do case LEDs provide any performance improvements?");
    		question.setAnswer1("Of course");
    		question.setAnswer2("That's absurd");
    		question.setAnswer3("It's unproven");
    		question.setAnswer4("In some cases");
    		question.setCorrectAnswer("That's absurd");
    	}
    	else if(qnum == 12) {
    		question.setCategory("Hardware");
    		question.setValue(600);
    		question.setQuestion("This prominent VR company was acquired by Facebook in 2014");
    		question.setAnswer1("HTC");
    		question.setAnswer2("Oculus");
    		question.setAnswer3("Pimax");
    		question.setAnswer4("Valve");
    		question.setCorrectAnswer("Oculus");
    	}
    	else if(qnum == 17) {
    		question.setCategory("Hardware");
    		question.setValue(800);
    		question.setQuestion("Historically, GPUs accelerated which type of real time rendering?");
    		question.setAnswer1("Rasterization");
    		question.setAnswer2("Ray Tracing");
    		question.setAnswer3("Wireframe");
    		question.setAnswer4("Software Rendering");
    		question.setCorrectAnswer("Rasterization");
    	}
    	else if(qnum == 22) {
    		question.setCategory("Hardware");
    		question.setValue(1000);
    		question.setQuestion("Ending in approx. 2010, the observed phenomenon where the number of transistors on an "
    				+ "integrated circuit doubled every two years was known as:");
    		question.setAnswer1("Moore's Law");
    		question.setAnswer2("The Law of Thermodynamics");
    		question.setAnswer3("The Law of Quantum Tunnelling");
    		question.setAnswer4("Law & Order: Special Victims Unit");
    		question.setCorrectAnswer("Moore's Law");
    	}
    	else if(qnum == 3) {
    		question.setCategory("Trek and Wars");
    		question.setValue(200);
    		question.setQuestion("Who was the first TV captain of the Starship Enterprise?");
    		question.setAnswer1("Picard");
    		question.setAnswer2("Sulu");
    		question.setAnswer3("Kirk");
    		question.setAnswer4("Sisko");
    		question.setCorrectAnswer("Kirk");
    	}
    	else if(qnum == 8) {
    		question.setCategory("Trek and Wars");
    		question.setValue(400);
    		question.setQuestion("Who said: 'Do or do not, there is no try'");
    		question.setAnswer1("Luke Skywalker");
    		question.setAnswer2("Captain Jean Luc Picard");
    		question.setAnswer3("Han Solo");
    		question.setAnswer4("Yoda");
    		question.setCorrectAnswer("Yoda");
    	}
    	else if(qnum == 13) {
    		question.setCategory("Trek and Wars");
    		question.setValue(600);
    		question.setQuestion("Which of the following is not an alien race from Star Trek?");
    		question.setAnswer1("Romulans");
    		question.setAnswer2("Vulcans");
    		question.setAnswer3("Wookies");
    		question.setAnswer4("The Borg");
    		question.setCorrectAnswer("Wookies");
    	}
    	else if(qnum == 18) {
    		question.setCategory("Trek and Wars");
    		question.setValue(800);
    		question.setQuestion("Lando Calrissian was the administrator of _____");
    		question.setAnswer1("Tatooine");
    		question.setAnswer2("Cloud City");
    		question.setAnswer3("The Borg Cube");
    		question.setAnswer4("Hoth");
    		question.setCorrectAnswer("Cloud City");
    	}
    	else if(qnum == 23) {
    		question.setCategory("Trek and Wars");
    		question.setValue(1000);
    		question.setQuestion("The Next Generation takes place during which century?");
    		question.setAnswer1("21st");
    		question.setAnswer2("22nd");
    		question.setAnswer3("23rd");
    		question.setAnswer4("24th");
    		question.setCorrectAnswer("24th");
    	}
    	else if(qnum == 4) {
    		question.setCategory("Programming");
    		question.setValue(200);
    		question.setQuestion("What does HTML stand for?");
    		question.setAnswer1("Hypertext Multi Language");
    		question.setAnswer2("Hypertext Markup Language");
    		question.setAnswer3("Hypertext Meaning Language");
    		question.setAnswer4("Hypertext Moo Language");
    		question.setCorrectAnswer("Hypertext Markup Language");
    	}
    	else if(qnum == 9) {
    		question.setCategory("Programming");
    		question.setValue(400);
    		question.setQuestion("CSS stands for:");
    		question.setAnswer1("Cascading Stereo Sounds");
    		question.setAnswer2("Central Sound System");
    		question.setAnswer3("Cascading Style Sheets");
    		question.setAnswer4("Cascading Simulation Sheets");
    		question.setCorrectAnswer("Cascading Style Sheets");
    	}
    	else if(qnum == 14) {
    		question.setCategory("Programming");
    		question.setValue(600);
    		question.setQuestion("Which of the following languages are NOT object oriented?");
    		question.setAnswer1("Java");
    		question.setAnswer2("Python");
    		question.setAnswer3("C");
    		question.setAnswer4("C++");
    		question.setCorrectAnswer("C");
    	}
    	else if(qnum == 19) {
    		question.setCategory("Programming");
    		question.setValue(800);
    		question.setQuestion("Web programmers are which type of developer");
    		question.setAnswer1("Front End");
    		question.setAnswer2("Back End");
    		question.setAnswer3("Full Stack");
    		question.setAnswer4("MEAN Stack");
    		question.setCorrectAnswer("Front End");
    	}
    	else if (qnum == 24){
    		question.setCategory("Programming");
    		question.setValue(1000);
    		question.setQuestion("Which programming language is the oldest?");
    		question.setAnswer1("Fortran");
    		question.setAnswer2("Basic");
    		question.setAnswer3("Cobol");
    		question.setAnswer4("Lisp");
    		question.setCorrectAnswer("Fortran");
    	}
    	
    	return question;
    }

}
