<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Student Information System</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css"/>
<c:url value="/resources/stylesheets.css" var="stylesheet"/>
<link rel="stylesheet" href="${stylesheet}"/>
</head>

<body>

    <nav class="navbar navbar-inverse">
      <div class="container-fluid">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="navbar-brand" href="/">SLMC</a>
        </div>
        <div class="collapse navbar-collapse" id="myNavbar">
          <ul class="nav navbar-nav">
            <li><a href="/">Home</a></li>
            <li><a href="departmentList">Department</a></li>
            <li><a href="subjectList">Subject</a></li>
            <li class="active"><a href="studentList">Student</a></li>
          </ul>
          <ul class="nav navbar-nav navbar-right">
            <li><a href="newStudent"><span class="glyphicon glyphicon-user"></span> Register</a></li>
            <li><a href=""><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
          </ul>
        </div>
      </div>
    </nav>

    <div class = "container">
		<h1>Student List</h1>

		New Student Register <a href="newStudent">here</a>

		<table class = "table">

			<th>First Name</th>
			<th>Middle Name</th>
			<th>Last Name</th>
			<th>Age</th>
			<th>Birthdate</th>
			<th>Street</th>
			<th>City</th>
			<th>Province</th>
			<th>Country</th>
            <th>Zip Code</th>

			<c:forEach var="student" items="${listStudent}">
				<tr>

					<td>${student.firstName}</td>
					<td>${student.middleName}</td>
					<td>${student.lastName}</td>
					<td>${student.age}</td>
                    <td>${student.dateOfBirth}</td>
					<td>${student.address.street}</td>
					<td>${student.address.city}</td>
					<td>${student.address.province}</td>
					<td>${student.address.country}</td>
					<td>${student.address.zipCode}&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;





                            <!-- Trigger the modal with a button -->

                            <button type="button" class="btn btn-default" data-toggle="modal" data-target="#editStudent">Edit</button>

                            <button type="button" class="btn btn-default" data-toggle="modal" data-target="#deleteStudent">Delete</button>



                            <div class="modal fade" id="deleteStudent" role="dialog">
                                    <div class="modal-dialog">
                                            <div class="modal-content">
                                                        <div class="modal-header">
                                                                <button type="button" class="close" data-dismiss="modal">&times;</button>
                                                        </div>

                                                    <div class="modal-body">
                                                          <p>Are you sure you want to delete student?</p>
                                                    </div>

                                                    <div class="modal-footer">
                                                            <a href="deleteStudent?studentId=${student.studentId}"><button type="button" class="btn btn-default" >Yes</button></a>
                                                            <a href="/"><button type="button" class="btn btn-default" >No</button></a>
                                                    </div>
                                            </div>
                                     </div>
                             </div>



                            <div class="modal fade" id="editStudent" role="dialog">
                                <div class="modal-dialog">
                                    <div class="modal-content">

                                        <div class="modal-header">
                                            <button type="button" class="close" data-dismiss="modal">&times;</button>
                                        </div>

                                        <div class="modal-body">
                                            <p>Are you sure you want to edit student?</p>
                                        </div>

                                        <div class="modal-footer">
                                            <a href="editStudent?studentId=${student.studentId}"><button type="button" class="btn btn-default" >Yes</button></a>
                                            <a href="/"><button type="button" class="btn btn-default" >No</button></a>
                                        </div>

                                    </div>
                                </div>
                            </div>


					    </div>


					</td>
				</tr>
			</c:forEach>
		</table>

	</div>
	    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
        <script>$(function() {

                  $("#dialog").dialog({
                     autoOpen: false,
                     modal: true
                   });

                  $("#editButton").on("click", function(e) {
                      e.preventDefault();
                      $("#dialog").dialog("open");
                  });

                });
        </script>
</body>
</html>