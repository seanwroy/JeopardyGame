<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.jeopardy.beans.Questions" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Sheridan Jeopardy!</title>
        <link rel="stylesheet" href="css/style.css"> 
    </head>
    <body>
    
    <% Questions q = (Questions) session.getAttribute("question"); %>
		<div id="question">
        <h2>Category: <u><%=q.getCategory() %></u></h2>
		<h2>Value: <a style="color: gold;"><%=q.getValue() %></a></h2>
		<h3><%=q.getQuestion() %></h3>
        </div>
		<div id="answer">
		<form action="AnswerServlet" method="get" id="questionbox">
			<br>
			<input type="radio" name="answer" value="<%=q.getAnswer1() %>"><%=q.getAnswer1() %><br>
			<input type="radio" name="answer" value="<%=q.getAnswer2() %>"><%=q.getAnswer2() %><br>
			<input type="radio" name="answer" value="<%=q.getAnswer3() %>"><%=q.getAnswer3() %><br>
			<input type="radio" name="answer" value="<%=q.getAnswer4() %>"><%=q.getAnswer4() %><br>
			<br>
			<input type="submit" value="Submit">
        </form>
		</div>
    </body>
</html>