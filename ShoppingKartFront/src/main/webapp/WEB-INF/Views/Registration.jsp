<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div class="container">

	<div class="row vertical-offset-100" style="padding-top: 100px">

		<div class="col-md-4 col-md-offset-4">

			<div class="panel panel-default">

				<div class="panel-heading">

					<h3 class="panel-title">Registration Form</h3>

				</div>
<div class="panel-body">

	<form action="newUser" method="post" onsubmit="return formsignup()">
	<div class="form-group">
	<label for="name" class="cols-sm-2 control-label">User Name</label>
	<div class="cols-sm-10">
	<div class="input-group">
	<span class="input-group-addon"><i class="glyphicon glyphicon-user" aria-hidden="true"></i></span> 
	<input type="text" class="form-control" name="username" id="username" placeholder="Enter your Name"  />
								</div>
							</div>
						</div>
						<div class="form-group">
	<label for="othername" class="cols-sm-2 control-label">E-mail</label>
	<div class="cols-sm-10">
	<div class="input-group">
	<span class="input-group-addon"><i class="fa fa-envelope fa" aria-hidden="true"></i></span> 
	<input type="text" class="form-control" name="email" id="email" placeholder="Enter your Email" />
									</div>
								</div>
							</div>
	<div class="form-group">
		<label for="password" class="cols-sm-2 control-label">Password</label>
		<div class="cols-sm-10">
		<div class="input-group">
		<span class="input-group-addon"><i class="fa fa-lock fa-lg" aria-hidden="true"></i></span> 
		<input type="password" class="form-control" name="password" id="password" placeholder="Enter your Password"  />
								</div>
							</div>
						</div>

	 
  <div class="form-group">
	<label for="tel" class="cols-sm-2 control-label">Contact</label>
	<div class="cols-sm-10">
	<div class="input-group">
	<span class="input-group-addon"><i class="glyphicon glyphicon-phone" aria-hidden="true"></i></span> 
	<input type="text" class="form-control" name="contact" id="contact" placeholder="Enter your Number"  />
									</div>
								</div>
							</div>

  <div class="form-group">
      <label for="addr" class="cols-sm-2 control-label">Address</label>
	  <div class="cols-sm-10">
	  <div class="input-group">
	  <span class="input-group-addon"><i class="glyphicon glyphicon-list-alt" aria-hidden="true"></i></span>
	  <input type="text" class="form-control" name="address" id="address" placeholder="Enter your Address"  />
									</div>
								</div>
							</div>
  <div class="form-group">
		<label for="addr" class="cols-sm-2 control-label">Zip-Code</label>
		<div class="cols-sm-10">
	    <div class="input-group">
		<span class="input-group-addon"><i class="fa fa-circle" aria-hidden="true"></i></span> 
		<input type="text" class="form-control" name="zipcode" id="zipcode" placeholder="Enter your Zipcode"  />
									</div>
								</div>
							</div>
							
   <input class="btn btn-lg btn-success btn-block" type="submit" value="Register">
   
						</form>
				</div>

			</div>

		</div>
	</div>
</div>
