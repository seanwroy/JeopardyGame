<%@ page import="com.jeopardy.beans.Player" %>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Sheridan Jeopardy!</title>
        <link rel="stylesheet" href="css/style.css">
        
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
		<script
		  src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"
		  integrity="sha256-T0Vest3yCU7pafRw9r+settMBX6JkKN06dqBnpQ8d30="
		  crossorigin="anonymous"></script>
		<script src="rsc/script.js"></script>
		                
    </head>
    <body> 
 	
	<h1 style="color: white;">Welcome, <% Player p = (Player)session.getAttribute("player"); %>
		<%= p.getName() %>! This is Jeopardy!</h1>
	  <div class="super-container">
		<div class="grid-container clearfix">
			  <div class="grid-item"><button class="button zoom">${used[0]}</button></div>  
			  <div class="grid-item"><button class="button">${used[1]}</button></div>
			  <div class="grid-item"><button class="button">${used[2]}</button></div>  
			  <div class="grid-item"><button class="button">${used[3]}</button></div>
			  <div class="grid-item"><button class="button">${used[4]}</button></div>  
			  <div class="grid-item"><button class="button">${used[5]}</button></div>
			  <div class="grid-item"><button class="button">${used[6]}</button></div>  
			  <div class="grid-item"><button class="button">${used[7]}</button></div>
			  <div class="grid-item"><button class="button">${used[8]}</button></div>  
			  <div class="grid-item"><button class="button">${used[9]}</button></div>
			  <div class="grid-item"><button class="button">${used[10]}</button></div>  
			  <div class="grid-item"><button class="button">${used[11]}</button></div>
			  <div class="grid-item"><button class="button">${used[12]}</button></div>  
			  <div class="grid-item"><button class="button">${used[13]}</button></div>
			  <div class="grid-item"><button class="button">${used[14]}</button></div>  
			  <div class="grid-item"><button class="button">${used[15]}</button></div>
			  <div class="grid-item"><button class="button">${used[16]}</button></div>
			  <div class="grid-item"><button class="button">${used[17]}</button></div>
			  <div class="grid-item"><button class="button">${used[18]}</button></div>
			  <div class="grid-item"><button class="button">${used[19]}</button></div>
			  <div class="grid-item"><button class="button">${used[20]}</button></div>
			  <div class="grid-item"><button class="button">${used[21]}</button></div>
			  <div class="grid-item"><button class="button">${used[22]}</button></div>
			  <div class="grid-item"><button class="button">${used[23]}</button></div>
			  <div class="grid-item"><button class="button">${used[24]}</button></div>
		  
			</div>

		</div>
	
			<h1 style="color: white;">SCORE: <%= p.getScore() %>!</h1>

    </body>
</html>