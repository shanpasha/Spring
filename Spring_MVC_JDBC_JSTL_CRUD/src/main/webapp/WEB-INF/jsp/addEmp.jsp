<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Employee</title>


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
.save {
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

.save{
  background-color:#4CAF50; 
  color: black; 
  border: 2px solid #4CAF50;
}

.save:hover {
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
<h1 align="center">Add Employee</h1>
<a href="./home" class="home">Home</a><br><br>
<div align="center">
<form action="./save" method="post">

<label >Employee ID</label><br>
<input type="text" name="id"><br>
<label >Name</label><br>
<input type="text" name="name"><br>

<label >Salary</label><br>
<input type="text" name="salary"><br>
<label >Email ID</label><br>
<input type="text" name="email"><br>
<input type="submit" value="save" class="save"> 
<input type="reset" value="Rest" class="save rest"><br>
</form>
</div>
</body>
</html>