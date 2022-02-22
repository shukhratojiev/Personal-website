<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
           <title>TheTojTech</title>
           <link rel="stylesheet" type="text/css" href="webresources/syles/forFeedback.css">
             
</head>
<body>

    <div class="header" style="background-color:#35424a; margin: 0px;">
	   <h2 style="text-align:center; padding: 30px; color: coral;">Leave Your Feedback, it matters!</h2>
	</div>
	<div class="container" style="margin=0px;">
		<form action="addFeedback">
			<div class="row">
				<div class="col-25">
					<label>First Name</label>
				</div>
				<div class="col-75">
					<input type="text" id="fname" name="Name"
						placeholder="Your name..">
				</div>
			</div>
			<div class="row">
				<div class="col-25">
					<label>Last Name</label>
				</div>
				<div class="col-75">
					<input type="text" id="lname" name="LastName"
						placeholder="Your last name..">
				</div>
			</div>
			<div class="row">
				<div class="col-25">
					<label>Mail Id</label>
				</div>
				<div class="col-75">
					<input type="email" id="email" name="email"
						placeholder="Your mail id..">
				</div>
			</div>
			<div class="row">
				<div class="col-25">
					<label>Country</label>
				</div>
				<div class="col-75">
					<select id="country" name="country">
						<option value="none">Select Country</option>
						<option value="australia">Australia</option>
						<option value="canada">Canada</option>
						<option value="usa">USA</option>
						<option value="russia">Russia</option>
						<option value="japan">Japan</option>
						<option value="india">India</option>
						<option value="china">China</option>
					</select>
				</div>
			</div>
			<div class="row">
				<div class="col-25">
					<label>Feed Back</label>
				</div>
				<div class="col-75">
					<textarea id="subject" name="Message"
						placeholder="Write something.." style="height: 200px"></textarea>
				</div>
			</div>
			<div class="row">
				<input type="submit" value="Submit">
			</div>
		</form>
	</div>

</body>
</html>