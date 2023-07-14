<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<br /><br /><br />
    <div class="row">
      <div class="col-md-4"></div>
      <div class="col-md-3">
        <div class="card">
          <div class="card-body">
            <h1 style="text-align: center">LOGIN</h1>
            <div class="row">
              <div class="col-md-3"></div>
              <div class="col-md-4">
                <img
                  style="width: 200px; height: 200px"
                src="images/profilepic.png"  alt="circle user avatar Icon 4035892"
                  class="styles__Image-sc-2erpfv-1 eOQgUF"
                />
              </div>
              <div class="col-md-4"></div>
            </div>
            <form method="post" action="LoginServlet">
              <div class="form-group">
                <label>Email</label
                ><input class="form-control col-md-12" placeholder="Email" name="email" />
              </div>
              <div class="form-group">
                <label>Password</label
                ><input
                  type="password"
                  class="form-control col-md-12"
                  placeholder="Password"
                  name="password"
                />
              </div>
              <a href="/signup/index.jsp"
                >Don't you have an account</a
              >
              <div class="row">
                <div class="col-md-4"></div>
                <div class="col-md-4">
                  <br />
                  <input type="submit" class="btn btn-primary col-md-10" value="Login">
                </div>
                <div class="col-md-4"></div>
              </div>
            </form>
          </div>
        </div>
      </div>
      <div class="col-md-4"></div>
    </div>

</body>
</html>