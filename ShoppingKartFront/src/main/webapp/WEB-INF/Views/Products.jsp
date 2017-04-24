<!-- <article class="col-lg-12"   style="display: inline-block;">
  <h2>GALLERY</h2>
<div class="row">
  <div class="col-md-3 col-xs-6">
  <div class="thumbnail">
  <img class="img-responsive" src="resources/images/m.png" alt="">
  <h4></h4>
  </div>
  </div>

<div class="col-md-3 col-xs-6">
  <div class="thumbnail" >
  <img class="img-responsive" src="resources/images/m1.jpg" alt="">
  <h4></h4>
  </div>
  </div>
  
  <div class="col-md-3 col-xs-6">
  <div class="thumbnail">
  <img class="img-responsive" src="resources/images/m2.jpg" alt="">
  <h4></h4>
  </div>
  </div>
  
  <div class="col-md-3 col-xs-6">
  <div class="thumbnail">
  <img class="img-responsive" src="resources/images/m6.png" alt="">
  <h4></h4>
  </div>
  </div>

</div>
</article>
 -->
 
 
<div class="container">
	<div class="row">
<form class="form-horizontal" action="newProduct" method="post">
<fieldset>

<!-- Form Name -->
<div class="form-group">
 <legend>Product Request</legend>

  <label class="col-md-4 control-label" for="product">Product Name</label>
  <div class="col-md-6">
      <input id="name" name="productname" type="text" placeholder="Product Name" class="form-control input-md" >
</div>
</div>

<!-- Text input-->
<div class="form-group">
  <label class="col-md-4 control-label" for="Desc">Description</label>  
  <div class="col-md-6">
  <input id="desc" name="description" type="text" placeholder="Descripton" class="form-control input-md" >
    
  </div>
</div>

<div class="form-group">
  <label class="col-md-4 control-label" for="price">Price</label>  
  <div class="col-md-6">
  <input id="price" name="price" type="text" placeholder="Price"class="form-control input-md" >
    
  </div>
</div>

<!-- Text input-->
<div class="form-group">
  <label class="col-md-4 control-label" for="stock">Stock</label>  
  <div class="col-md-6">
  <input id="stock" name="stock" type="text" placeholder="Available" class="form-control input-md" >
    
  </div>
</div>


<!-- Text input-->
<div class="form-group">
  <label class="col-md-4 control-label" for="post">Category</label>  
  <div class="col-md-6">
  <input id="post" name="category" type="text"  class="form-control input-md" required/>
    
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