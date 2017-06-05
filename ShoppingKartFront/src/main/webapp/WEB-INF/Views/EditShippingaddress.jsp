<div class="container">
  <form action="editshippingAddress" method="post" class="form-horizontal">
  <div class="form-group">
      <label class="control-label col-sm-2" for="pwd">Shipping Id:</label>
      <div class="col-sm-10">          
        <input type="text" name="sid" class="form-control" id="sid" value="${shipping.sid }" readonly="true" >
      </div>
    </div>
    <div class="form-group">
      <label class="control-label col-sm-2" for="UserName"> User Name:</label>
      <div class="col-sm-10">
        <input type="text" name="username" class="form-control" id="username" value="${shipping.username }">
      </div>
      <%-- <div class="form-group">
      <label class="control-label col-sm-2" for="email">Email:</label>
      <div class="col-sm-10">          
        <input type="text" name="email" class="form-control" id="email" value="${shipping.email }">
      </div>
    </div>
    </div> --%>
     <div class="form-group">
      <label class="control-label col-sm-2" for="contactNumber">Contact Number:</label>
      <div class="col-sm-10">
        <input type="text" name="contact" class="form-control" id="contact" value="${shipping.contact }">
      </div>
    </div>
    <div class="form-group">
      <label class="control-label col-sm-2" for="pwd">Shipping Address:</label>
      <div class="col-sm-10">          
        <input type="text" name="address" class="form-control" id="address" value="${shipping.address }">
      </div>
    </div>
     <div class="form-group">
      <label class="control-label col-sm-2" for="zipcode"> Zipcode:</label>
      <div class="col-sm-10">
        <input type="text" name="zipcode" class="form-control" id="zipcode"value="${shipping.citycode }">
      </div>
    </div>
    <div class="form-group">        
      <div class="col-sm-offset-2 col-sm-10">
        <button type="submit" class="btn btn-default">Submit</button>
      </div>
    </div>
  </form>
</div>