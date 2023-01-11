<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employees List</title>
<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Sofia">
<style>
body {
  font-family: "Sofia", sans-serif;
}


body {
  font-family: "Sofia", sans-serif;
}
table {
  border-collapse: collapse;
  width: 100%;
}

th, td {
  text-align: left;
  padding: 8px;
}

tr:nth-child(even){background-color: #f2f2f2}

th {
  background-color: #04AA6D;
  color: white;
}

.button {
  background-color: #4CAF50; /* Green */
  border: none;
  color: white;
  padding: 16px 32px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 16px;
  margin: 4px 2px;
  transition-duration: 0.4s;
  cursor: pointer;
}
.delete {
  background-color: white; 
  color: black; 
  border: 2px solid #f44336;
}
.delete:hover {
  background-color: #f44336;
  color: white;
}
.update {
  background-color: white; 
  color: black; 
  border: 2px solid #008CBA;
}

.update:hover {
  background-color: #008CBA;
  color: white;
}

.home {
  background-color: #4CAF50; /* Green */
  border: none;
  color: white;
  padding: 15px 32px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  margin: 4px 2px;
  cursor: pointer;
}

.home {font-size: 10px;}
</style>
</head>
<body>

<h1 align="center">Employees List</h1>


<a class="home" href="./home">Home</a><br><br>
<div align="center">
<table border="2px" >
<tr><th>Employee ID</th>

 <th>Name</th>
 <th>Salary</th>
<th>Email ID </th>
 <th>Update </th>
 <th>Delete </th></tr>
 <c:forEach items="${getEmps}" var="emp">
 <tr>
 <td><c:out value="${emp.id} "></c:out></td>
 <td><c:out value="${emp.name} "></c:out></td>
 <td><c:out value="${emp.salary} "></c:out></td>
 <td><c:out value="${emp.email} "></c:out></td>

 <td><a class="button update"href="updateEmp?id=${emp.id} ">Update</a></td>
  <td><a class=" button delete"href="delete?id=${emp.id} ">Delete</a></td>
 
 </tr>


</c:forEach>


</table>




</div>

</body>
</html>