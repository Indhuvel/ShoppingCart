
<div class="container">
  <form action="addShippingaddress" method="post" onsubmit="return formAddress()" class="form-horizontal">
    <div class="form-group">
      <label class="control-label col-sm-2" for="UserName"> User Name:</label>
      <div class="col-sm-7">
        <input type="text" name="username" class="form-control" id="username" placeholder="Enter User Name">
      </div>
    </div>
   
     <div class="form-group">
      <label class="control-label col-sm-2" for="contactNumber">Contact Number:</label>
      <div class="col-sm-7">
        <input type="text" name="contact" class="form-control" id="contact" placeholder="Enter Contact Number">
      </div>
    </div>
    <div class="form-group">
      <label class="control-label col-sm-2" for="pwd">Shipping Address:</label>
      <div class="col-sm-7">          
        <input type="text" name="address" class="form-control" id="address" placeholder="Enter Shipping Address">
      </div>
    </div>
     <div class="form-group">
      <label class="control-label col-sm-2" for="zipcode"> Zipcode:</label>
      <div class="col-sm-7">
        <input type="text" name="zipcode" class="form-control" id="zipcode" placeholder="Enter Zipcode ">
      </div>
    </div>
    <div class="form-group">        
      <div class="col-sm-offset-2 col-sm-7">
        <button type="submit" class="btn btn-default">Submit</button>
      </div>
    </div>
  </form>
</div>
