<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Practo</title>
<link rel="stylesheet" href="styles.css" />
<script src="validation.js"></script>
</head>
<body>
	<header>
			<h1 style=text-align:center;>Welcome to Practo portal</h1>
			<p style=text-align:center;>
				<a href="/home"> home </a> | <a href="/aboutus"> about-us </a> | <a
					href="/Contact"> contact</a> | <a href="/PatientReg">
					patient-signup </a> | <a href="/Patientlogin"> patient-login </a> |<a href="/DoctorReg">doctor-signup </a>|
					<a href="/doctorlogin">doctor-login </a>| <a href="/adminlogin">Admin Login</a>
			</p>
		</header>
	<hr>
	<h1>hey! Dr.<span style=color:blue;>${key1}</span>,you registered successfully</h1><br><br>
	<h3>Your Details are :</h3>
	<h2 style=text-align:center;> Name:${key1}<br>PhoneNumber:${key2}<br>Gender:${key3}<br>Age:${key4}<br>Specialist:${key5}</h2>
	
	

		 <br><br><br><br><br>
		<hr>
		<footer>
				<h3 style=text-align:center;>copyright@Vardhan</h3>
			</footer>
	</body>
	</html>