<div class="container">
	<div class="row">
<form class="form-horizontal" action="newSupplier" method="post">
<fieldset>

<!-- Form Name -->
<div class="form-group">
 <legend>Supplier</legend>

  <label class="col-md-4 control-label" for="Supplier">Supplier Name</label>
  <div class="col-md-6">
      <input id="name" name="suppliername" type="text" placeholder="Supplier Name" class="form-control input-md" >
</div>
</div>

<!-- Text input-->
<div class="form-group">
  <label class="col-md-4 control-label" for="Desc">Description</label>  
  <div class="col-md-6">
  <input id="desc" name="supplierdescription" type="text" placeholder="Descripton" class="form-control input-md" >
    
  </div>
</div>

<div class="form-group">
  <label class="col-md-4 control-label" for="price">Email</label>  
  <div class="col-md-6">
  <input id="email" name="email" type="text" placeholder="Email"class="form-control input-md" >
    
  </div>
</div>

<!-- Text input-->
<div class="form-group">
  <label class="col-md-4 control-label" for="stock">Address</label>  
  <div class="col-md-6">
  <input id="addr" name="address" type="text" placeholder="Address" class="form-control input-md" >
    
  </div>
</div>


<!-- Text input-->
<div class="form-group">
  <label class="col-md-4 control-label" for="contact">Contact</label>  
  <div class="col-md-6">
  <input id="contact" name="contact" type="text"  class="form-control input-md" required/>
    
  </div>
</div>
<div class="form-group">
  <label class="col-md-4 control-label" for="code">Zipcode</label>  
  <div class="col-md-6">
  <input id="code" name="citycode" type="text"  class="form-control input-md" required/>
    
  </div>
</div>
<div class="form-group">
  <label class="col-md-4 control-label" for="singlebutton"></label>
  <div class="col-md-4">
    <button id="submit" name="submit" class="btn btn-primary">ADD</button>
  </div>
</div>

</fieldset>
</form>
	</div>
</div>