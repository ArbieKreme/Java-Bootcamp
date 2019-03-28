<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>New/Edit Student</title>

  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css">
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
            <li class="active"><a href="subjectList">Subject</a></li>
            <li><a href="studentList">Student</a></li>
          </ul>
          <ul class="nav navbar-nav navbar-right">
            <li><a href="newStudent"><span class="glyphicon glyphicon-user"></span> Register</a></li>
            <li><a href=""><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
          </ul>
        </div>
      </div>
    </nav>



<div class="container">

        <p><center>Edit Subject</center></p>
        <div class="row">
            <div class= "col-sm-2"></div>
        <div class="col-sm-8">
        <form:form action="/saveSubject" method="post" modelAttribute="subject">
            <form:hidden path="subjectId"/>
                    <p>Subject</p>
                    <div class="form-group">
                      <form:input path="subjectName" type="text" class="form-control" id="subjectName" placeholder="Subject Name"/>
                    </div>

                    <div class="form-group">
                      <form:input path="inTime" type="time" class="form-control" id="inTime" placeholder="Time In"/>
                    </div>

                    <div class="form-group">
                      <form:input path="outTime" type="time" class="form-control" id="outTime" placeholder="Time Out"/>
                    </div>

                    <div class="form-group">
                      <p>Birthday</p>
                      <form:input path="dateOfBirth" type="date" class="form-control" id="dateOfBirth" value="${student.dateOfBirth}"/>
                    </div>


                    <div class="form-group">
                        <p>Age</p>
                      <form:input path="age" type="number" class="form-control" id="age" placeholder="Age" min="0"/>
                    </div>

                    <p>Address</p>
                    <form:hidden path="address.addressId"/>
                    <div class="form-group">
                      <form:input path="address.street" type="text" class="form-control" id="street" placeholder="Street"/>
                    </div>

                    <div class="form-group">
                      <form:input path="address.city" type="text" class="form-control" id="city" placeholder="City"/>
                    </div>

                    <div class="form-group">
                      <form:input path="address.province"  type="text" class="form-control" id="province" placeholder="Region"/>
                    </div>

                    <div class="form-group">
                      <form:input path="address.country" type="text" class="form-control" id="country" placeholder="Country"/>
                    </div>

                    <div class="form-group">
                      <form:input path="address.zipCode" type="text" class="form-control" id="zipCode" placeholder="Zip Code"/>
                    </div>

                        <div class="container">
                            <!-- Trigger the modal with a button -->
                            <button type="button" class="btn btn-default" data-toggle="modal" data-target="#cancelEdit">Cancel</button>

                            <button class="btn btn-default" data-toggle="modal" data-target="#done">Done</button>


                            <!-- Modal -->
                            <div class="modal fade" id="cancelEdit" role="dialog">
                                    <div class="modal-dialog">

                                        <!-- Modal content-->
                                        <div class="modal-content">
                                            <div class="modal-header">
                                                <button type="button" class="close" data-dismiss="modal">&times;</button>
                                             </div>

                                        <div class="modal-body">
                                            <p>Cancel editing student?</p>
                                        </div>

                                    <div class="modal-footer">
                                        <a href="/"><button type="button" class="btn btn-default" >Okay</button></a>
                                    </div>

                                     </div>

                            </div>



                            <div class="modal fade" id="done" role="dialog">
                                <div class="modal-dialog">
                                    <div class="modal-content">

                                        <div class="modal-header">
                                            <button type="button" class="close" data-dismiss="modal">&times;</button>
                                        </div>

                                        <div class="modal-body">
                                            <p>Apply changes?</p>
                                        </div>

                                        <div class="modal-footer">
                                            <a href="/"><button type="submit" value="Save" class="btn btn-default" >Yes</button></a>
                                            <a href="/"><button type="button" class="btn btn-default" >No</button></a>
                                        </div>

                                    </div>
                                </div>
                            </div>


        </form:form>
        </div>
        </div>
</div>
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.6/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/js/bootstrap.min.js"></script>
  </div>
</div>


</body>
</html>