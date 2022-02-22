<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
        <meta charset="ISO-8859-1">
        <title>TheTojTech</title>
        <link rel="stylesheet" type="text/css" href="webresources/syles/home.css">
</head>
<body>
	<div id="header">
		<div class="container">
			<h1>
				<span class="logo">TheToj</span>Tech
			</h1>
			<ul class="navbar">
				<li><a href="#" class="active">Home</a></li>
				<li><a href="about.jsp">About</a></li>
				<li><a href="courses.jsp">Courses</a></li>
				<li><a href="realFeedback.jsp">Feedback</a></li>
			</ul>
		</div>
	</div>

	<div id="banner" style="background-image: url(webresources/images/Hungary.png);">
		<div class="container">
			<h1 class="logo" style="color:#00FFFF">Hungary Standarts In Uzbekistan</h1>
			<h2 style="color:black;">Live your life, enjoy every moment</h2>

		</div>
	</div>

	<div id="newsletter">
		<div class="container">
			<div class="left">
				<h3>Subscribe to our newsletter</h3>
			</div>
			<div class="right">
				<form action="subscribe">
					<input type="text" name="email" placeholder="Your Email">
					<input type="submit" class="button" value="Subscribe"/>
				</form>
			</div>
		</div>
	</div>


    <div>
        <div class="container">
			<div class="left"  style="float: left; padding:10px 0px 15px 100px;">
				<h2>About creator</h2><br>
				<p>Shukhrat Tojiev</p>
				<p><span>Nationality:</span>  Uzbek</p>
				<p><span>Currently in:</span>  Budapest, Hungary</p>
				<p><span>Contacts:</span></p>
				<p>+36205923052</p>
				<p>shukhrat.tojiev999@mail.ru</p>
				<p><a href="https://github.com/shukhratojiev">Github</a></p>
				<p><a href="https://www.hackerrank.com/profile/shukhrat_tojiev1">HackerRank</a></p>
				<p><a href="">Linkedln</a></p>
				

			</div>

			<div class="right" style="float: right; padding:10px 100px 15px 0px; ">
				<img src="webresources/images/creator.jpg" width="220" height="220"
					alt="shukhrat">
			</div>
             <div class="clr"></div>
             
			<div>
				<p>Hi there, welcome to my website. I am a student in Budapest University of Technology and Economics.
				   If you are interested in skills I acquire you can visit my <b>Linkedln</b>, <b>Hackerrank profiles</b>.
				   Also, there are some projects I worked and I am working in my <b>Github</b> profile.<br>
				  
				   Shortly about this website, it is built in <b>Spring MVC</b> framework. The frontend part is simple <b>html/css</b>,
				   it is connected to database with <b>JDBC</b>. And it is deployed on <b>Amazon Web Services</b>.
				   You can subscribe my website to receive just welcome email:). We do not bother you after all. I highly appreciate if you could leave your feedback about my work.
				   <br>Thank you!     
				</p>
			</div>
		</div>
    
    </div>
	

	<div class="clr"></div>

	<div id="footer">
		<p>TheTojTech &Tau;&tau;&Tau; 2022</p>
	</div>

</body>
</html>