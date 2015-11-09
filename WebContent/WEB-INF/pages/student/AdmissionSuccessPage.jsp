<html>

<title>Hello Student</title>

<body>
	<h1>AdmissionSuccess Page</h1>
	<h2>${headerMessage}</h2>
	${msg}

	<table>
		<tr>
			<td>Numele studentului este:</td>
			<td>${student.name}</td>
		</tr>
		<tr>
			<td>Studentul are un hobby, acesta este:</td>
			<td>${student.hobby}</td>
		</tr>
		<tr>
			<td>nr Telefonului: </td><td>${student.mobile }</td>
		</tr>
		<tr>
			<td>Ziua de nastere a studentului:</td>
			<td>${student.DOB}</td>
		</tr>
		<tr>
			<td>Studentul are abilitati:</td>
			<td>${student.skills }</td>
		</tr>
		<tr>
			<td>Emailul Studentului:</td>
			<td>${student.email }</td>
		</tr>
		<tr>
			<td>Adress</td>
		</tr>
		<tr>
			<td>Country</td>
			<td>${student.adress.country}</td>
		</tr>
		<tr>
			<td>City</td>
			<td>${student.adress.city}</td>
		</tr>
		<tr>
			<td>Street</td>
			<td>${student.adress.street}</td>
		</tr>
		<tr>
			<td>ZipCode</td>
			<td>${student.adress.zipCode}</td>
		</tr>
		<tr>
			<td>App Number</td>
			<td>${student.adress.apNr}</td>
		</tr>

	</table>
</body>

</html>