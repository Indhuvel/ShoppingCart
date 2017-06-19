<div class="container">
  <form action="afterEditshippingaddress" method="post" class="form-horizontal">
  <div class="form-group">
      <label class="control-label col-sm-2" for="pwd">Shipping Id:</label>
      <div class="col-sm-7">          
        <input type="text" name="sid" class="form-control" id="sid" value="${shippingaddress.sid }" readonly="true" >
      </div>
    </div>
    <div class="form-group">
      <label class="control-label col-sm-2" for="UserName"> User Name:</label>
      <div class="col-sm-7">
        <input type="text" name="username" class="form-control" id="username" value="${shippingaddress.username }">
      </div>
      </div>
      <%-- <div class="form-group">
      <label class="control-label col-sm-2" for="email">Email:</label>
      <div class="col-sm-10">          
        <input type="text" name="email" class="form-control" id="email" value="${shipping.email }">
      </div>
    </div> --%>
     <div class="form-group">
      <label class="control-label col-sm-2" for="contactNumber">Contact Number:</label>
      <div class="col-sm-7">
        <input type="text" name="contact" class="form-control" id="contact" value="${shippingaddress.contact }">
      </div>
    </div>
    <div class="form-group">
      <label class="control-label col-sm-2" for="pwd">Shipping Address:</label>
      <div class="col-sm-7">          
        <input type="text" name="address" class="form-control" id="address" value="${shippingaddress.address }">
      </div>
    </div>
     <div class="form-group">
      <label class="control-label col-sm-2" for="zipcode"> Zipcode:</label>
      <div class="col-sm-7">
        <input type="text" name="zipcode" class="form-control" id="zipcode"value="${shippingaddress.zipcode }">
      </div>
    </div>
    <div class="form-group">        
      <div class="col-sm-offset-2 col-sm-7">
        <button type="submit" class="btn btn-default">Submit</button>
      </div>
    </div>
  </form>
</div>