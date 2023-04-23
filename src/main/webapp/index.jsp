<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="ISO-8859-1">
    <title>First JSP</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
  </head>
  <body class="bg-dark">
    <div class="container">
      <div class="raw">
        <div class="col-md-6 offset-md-3 mt-2">
          <div class="card">
            <div class="card-header text-center fs-3">EMPLOYEE RESISTER</div>
            <div class="card-body">
              <form method="post" action="register">
                <div class="mb-3">
                  <label for="exampleInputEmail1" class="form-label">Name</label>
                  <input type="text" class="form-control" name="name">
                </div>
                <div class="mb-3">
                  <label for="exampleInputEmail1" class="form-label">Phone</label>
                  <input type="text" class="form-control" name="phone">
                </div>
                <div class="mb-3">
                  <label for="exampleInputEmail1" class="form-label">Department</label>
                  <input type="text" class="form-control" name="department">
                </div>
                <div class="mb-3">
                  <label for="exampleInputEmail1" class="form-label">Email</label>
                  <input type="email" class="form-control" name="email">
                </div>
                <div class="mb-3">
                  <label for="exampleInputPassword1" class="form-label">Password</label>
                  <input type="password" class="form-control" name="password">
                </div>
            </div>
            <button type="submit" class="btn btn-primary col-md-12">Register</button>
          </div>
          <div class="card text-center">
          <%
         String message=(String) session.getAttribute("message");
         if(message!=null) {
          %>
          <p class="text-center fs-4 text-success"><%=message%></p>
          <%
          }
          session.removeAttribute("message");
           %>
           </div>
        </div>
      </div>
    </div>
  </body>
</html>