package ca.jeopardy.beans;
import java.io.Serializable;

public class Questions implements Serializable {
	private static final long serialVersionUID = 1L;
	private String category;
	private int value;
	private String question;
	private String answer1;
	private String answer2;
	private String answer3;
	private String answer4;
	private String correctAnswer;
	
	public Questions() {
		this.category = "c";
		this.value = 100;
		this.question = "q";
		this.answer1 = "a1";
		this.answer2 = "a2";
		this.answer3 = "a3";
		this.answer4 = "a4";
		this.correctAnswer = "a";
	}

	public Questions(String category, int value, String question, String answer1, String answer2, String answer3,
			String answer4, String correctAnswer) {
		super();
		this.category = category;
		this.value = value;
		this.question = question;
		this.answer1 = answer1;
		this.answer2 = answer2;
		this.answer3 = answer3;
		this.answer4 = answer4;
		this.correctAnswer = correctAnswer;
	}

	//Getters and Setters
	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getAnswer1() {
		return answer1;
	}

	public void setAnswer1(String answer1) {
		this.answer1 = answer1;
	}

	public String getAnswer2() {
		return answer2;
	}

	public void setAnswer2(String answer2) {
		this.answer2 = answer2;
	}

	public String getAnswer3() {
		return answer3;
	}

	public void setAnswer3(String answer3) {
		this.answer3 = answer3;
	}

	public String getAnswer4() {
		return answer4;
	}

	public void setAnswer4(String answer4) {
		this.answer4 = answer4;
	}

	public String getCorrectAnswer() {
		return correctAnswer;
	}

	public void setCorrectAnswer(String correctAnswer) {
		this.correctAnswer = correctAnswer;
	}

	@Override
	public String toString() {
		return "Questions [category=" + category + ", value=" + value + ", question=" + question + ", answer1="
				+ answer1 + ", answer2=" + answer2 + ", answer3=" + answer3 + ", answer4=" + answer4
				+ ", correctAnswer=" + correctAnswer + "]";
	}
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}	
}
