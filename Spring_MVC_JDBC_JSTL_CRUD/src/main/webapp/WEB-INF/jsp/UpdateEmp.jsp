<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update</title>


<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Sofia">
<style>
body {
  font-family: "Sofia", sans-serif;
}

input[type=text] {
  width: 50%;
  padding: 12px 20px;
  margin: 8px 0;
  box-sizing: border-box;
  border: 2px solid red;
  border-radius: 4px;
  
}
.update {
  background-color:#4CAF50 ; /* Green */
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
  font-family:cursive;
  
}

.update{
  background-color:#4CAF50; 
  color: black; 
  border: 2px solid #4CAF50;
}

.update:hover {
  background-color:  white;
  color: white;
  
}.rest {
  background-color:#f44336 ; 
  color: black; 
  border: 2px solid #f44336;
}

.rest:hover {
  background-color:white ;
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
<h1 align="center">Update Employee</h1>
<a href="./home" class="home">Home</a>
<div align="center">
<form action="./update" method="post">

<label>Employee ID</label><br>
<input type="text" name="id" value="${emp.id}" readonly="readonly"><br>
<label>Name</label><br>
<input type="text" name="name" value="${emp.name}"><br>

<label>Salary</label><br>
<input type="text" name="salary" value="${emp.salary}"><br>
<label>Email ID</label><br>
<input type="text" name="email" value="${emp.email}"><br><br>
<input type="submit" value="Update" class="update"> 
<input type="reset" value="Rest" class="update rest">
</form>
</div>
</body>
</html>