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

<div class="container">

        <h1><center>New/Edit Student</center></h1>
        <div class="row">
        <div class= "col-sm-2"></div>
        <div class="col-sm-8">
        <form:form action="/saveStudent" method="post" modelAttribute="student">
            <form:hidden path="studentId"/>
                    <p>Name</p>
                    <div class="form-group">
                      <form:input path="firstName" type="text" class="form-control" id="firstName" placeholder="First Name"/>
                    </div>

                    <div class="form-group">
                      <form:input path="middleName" type="text" class="form-control" id="middleName" placeholder="Middle Name"/>
                    </div>

                    <div class="form-group">
                      <form:input path="lastName" type="text" class="form-control" id="lastName" placeholder="Last Name"/>
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

                    <div class="form-group">
                                                <div class="container">
                                                    <!-- Trigger the modal with a button -->
                                                    <button type="button" class="btn btn-default" data-toggle="modal" data-target="#cancelNewStudent">Cancel</button>

                                                    <!-- Modal -->
                                                    <div class="modal fade" id="cancelNewStudent" role="dialog">
                                                            <div class="modal-dialog">

                                                                <!-- Modal content-->
                                                                <div class="modal-content">
                                                                    <div class="modal-header">
                                                                        <button type="button" class="close" data-dismiss="modal">&times;</button>
                                                                     </div>

                                                                <div class="modal-body">
                                                                    <p>Cancel creating new student?</p>
                                                                </div>

                                                            <div class="modal-footer">
                                                                <a href="/"><button type="button" class="btn btn-default" >Okay</button></a>
                                                            </div>

                                                             </div>

                                                    </div>

                                                </div>
                                                <button type="submit" value="Save" class="btn btn-default" data-toggle="modal" data-target="#submitButton">Submit</button>
                                                </div>

                                                                        <div class="modal fade" id="submitButton" role="dialog">
                                                                                <div class="modal-dialog">
                                                                                        <div class="modal-content">
                                                                                                    <div class="modal-header">
                                                                                                            <button type="button" class="close" data-dismiss="modal">&times;</button>
                                                                                                    </div>

                                                                                                <div class="modal-body">
                                                                                                      <p>Are you sure you want to add student?</p>
                                                                                                </div>

                                                                                                <div class="modal-footer">
                                                                                                        <a href="/"><button type="button" class="btn btn-default" >Yes</button></a>
                                                                                                        <a href="editStudent?studentId=${student.studentId}"><button type="button" class="btn btn-default" >No</button></a>
                                                                                                </div>
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