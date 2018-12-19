<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Sheridan Jeopardy!</title>
        <link rel="stylesheet" href="css/style.css"> 
    </head>
    <body> 
 	
	<h1 style="color: white;">Welcome, <% String name = (String)session.getAttribute("player"); %>
    <%= name %>! This is Jeopardy!</h1>
	  <div class="super-container">
		<div class="grid-container clearfix">
			  <div class="grid-item"><button class="button"><a href="PickQuestion?qnum=0"></a></button></div>  
			  <div class="grid-item"><button class="button"><a href="PickQuestion?qnum=1"></a></button></div>
			  <div class="grid-item"><button class="button"><a href="PickQuestion?qnum=2"></a></button></div>  
			  <div class="grid-item"><button class="button"><a href="PickQuestion?qnum=3"></a></button></div>
			  <div class="grid-item"><button class="button"><a href="PickQuestion?qnum=4"></a></button></div>  
			  <div class="grid-item"><button class="button"><a href="PickQuestion?qnum=5"></a></button></div>
			  <div class="grid-item"><button class="button"><a href="PickQuestion?qnum=6"></a></button></div>  
			  <div class="grid-item"><button class="button"><a href="PickQuestion?qnum=7"></a></button></div>
			  <div class="grid-item"><button class="button"><a href="PickQuestion?qnum=8"></a></button></div>  
			  <div class="grid-item"><button class="button"><a href="PickQuestion?qnum=9"></a></button></div>
			  <div class="grid-item"><button class="button"><a href="PickQuestion?qnum=10"></a></button></div>  
			  <div class="grid-item"><button class="button"><a href="PickQuestion?qnum=11"></a></button></div>
			  <div class="grid-item"><button class="button"><a href="PickQuestion?qnum=12"></a></button></div>  
			  <div class="grid-item"><button class="button"><a href="PickQuestion?qnum=13"></a></button></div>
			  <div class="grid-item"><button class="button"><a href="PickQuestion?qnum=14"></a></button></div>  
			  <div class="grid-item"><button class="button"><a href="PickQuestion?qnum=15"></a></button></div>
			  <div class="grid-item"><button class="button"><a href="PickQuestion?qnum=16"></a></button></div>
			  <div class="grid-item"><button class="button"><a href="PickQuestion?qnum=17"></a></button></div>
			  <div class="grid-item"><button class="button"><a href="PickQuestion?qnum=18"></a></button></div>
			  <div class="grid-item"><button class="button"><a href="PickQuestion?qnum=19"></a></button></div>
			  <div class="grid-item"><button class="button"><a href="PickQuestion?qnum=20"></a></button></div>
			  <div class="grid-item"><button class="button"><a href="PickQuestion?qnum=21"></a></button></div>
			  <div class="grid-item"><button class="button"><a href="PickQuestion?qnum=22"></a></button></div>
			  <div class="grid-item"><button class="button"><a href="PickQuestion?qnum=23"></a></button></div>
			  <div class="grid-item"><button class="button"><a href="PickQuestion?qnum=24"></a></button></div>
		  
			</div>

		</div>
	
			<h1 style="color: white;">SCORE: <%= session.getAttribute("score") %>!</h1>

    </body>
</html>