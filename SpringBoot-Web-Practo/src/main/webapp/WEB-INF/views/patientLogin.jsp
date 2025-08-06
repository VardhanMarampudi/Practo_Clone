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
	<h2>Patient Login Form</h2>
	<form action="Patientlogin" method="post" name="form1"
		onsubmit="return validateloginFormData()">

		<table align="center" cellpadding="5px" cellspacing="5px">
			<tr>
				<td><label for="id1">Phone number</label></td>
				<td><input type="number" name="n1" id="id1"></td>
			</tr>
			<tr>
				<td><label for="id2">Password</label></td>
				<td><input type="Password" name="n2" id="id2"></td>
			</tr>
			<tr>
				<td><input type="Submit" value="Login"></td>
				<td><input type="reset" value="clear"></td>
			</tr>

		</table>

	</form>


	<br>
	<br>
	<br>
	<br>
	<br>
	<hr>
	<footer>
			<h3 style=text-align:center;>copyright@Vardhan</h3>
		</footer>
</body>
</html>