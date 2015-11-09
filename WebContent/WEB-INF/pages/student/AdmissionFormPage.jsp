<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<style>

</style>
	<title>Student Form Page</title>
	
	<body>
		<h1>Student Form</h1>
		<h2>${headerMessage}</h2>
<form:errors path="student.*"/>
		<form action="/FirstSpringMVCProgect/submitAdmissionForm.html" method="POST" 	id="loginForm">
		
		<table>
			<tr><td>Student Name: </td>      <td><input  type="text" name="name"/></td></tr>
			<tr><td>Student Hobby: </td>     <td><input  type="text" name="hobby"/></td></tr>
			<tr><td>Student Mobile: </td>    <td><input  type="text" name="mobile"/></td></tr>
			<tr><td>Student DOB: </td><td>   <input  type="text" name="DOB"/></td></tr>
			<tr><td>Student email</td>		 <td><input type="text" name ="email"/></td></tr>
			<tr><td>Students skills: </td>   <td><select name="skills" multiple>
											  	<option value="Java Core">Java Core</option>
											  	<option value="Spring Core">Spring Core</option>
											  	<option value="Tapestry">Tapestry</option>
											  	<option value="Spring MVC">Spring MVC</option>
											  </select></td>
			</tr>
			
			
		</table>
		<table>
			<tr>
				<td>Student Adress:</td>
			</tr>
			<tr>
				<th>Country</th>
				<th>City</th>
				<th>Street</th>
				<th>ZipCode</th>
				<th>App.Number</th>
			<tr>
				<td><input type="text" name="adress.country" /></td>
				<td><input type="text" name="adress.city" /></td>
				<td><input type="text" name="adress.street" /></td>
				<td><input type="text" name="adress.zipCode" /></td>
				<td><input type="text" name="adress.apNr" /></td>
			</tr>
		</table>
		<p><input  type="submit" value="Apasa pentru submit"/></p>		
		</form>
	</body>

</html>