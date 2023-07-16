<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
 <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM" crossorigin="anonymous">
  </head>
</head>
<body class="bg-primary bg-opacity-25">

	<section class="d-flex flex-column min-vh-100 justify-content-center align-items-center">
		<div class="container">
			<div class="row">
				<div class="col-md-10 mx-auto rounded shadow bg-white">
					<div class="row">
						<div class="col-md-6">
							<div class="m-5">
								<h1>Welcome!</h1>
							</div>
							
							<form class="m-5">
								<div class="mb-3">
									<label class="form-label" for="email">Email</label>
									<input class="form-control" type="text" id="email" />
								</div>
								
								<div class="mb-3">
									<label class="form-label" for="pw">Password</label>
									<input class="form-control" type="password" id="pw" />
								</div>
								<div class="row mb-3">
									<div class="col-6">
										<div class="form-check">
											<input class="form-check-input" type="checkbox" id="rm" />
											<label class="form-check-label" for="rm">Remember Me</label>											
										</div>
									</div>
								
								
									<div class="col-6">
											<div class="text-end">
												<a href="">Forgot Password?</a>
											</div>
									</div>
									
									<div>
										<button class="form-control btn btn-primary mt-3" onclick="location.href='/JobApp/joblisting.jsp'">Sign-Up</button>
									</div>
									
									<div class="m-3">
										<div class="text-center">
											<a href="/JobApp/registrationForm.jsp">Don't have an account?</a>
										</div>
									</div>
								</div>
							
							</form>
						</div>
						<div class="col-md-6">
							<img alt="" src="./images/Inked13_LI.jpg" class="img-fluid p-5">
						</div>
					</div>
				</div>
			</div>
		</div>
	</section>
	
</body>
</html>