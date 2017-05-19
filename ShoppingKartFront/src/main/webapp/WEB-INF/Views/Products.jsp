<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

 <div class="container">
	<div class="row">
<form action="newProduct" method="post" onsubmit="return formProduct()" enctype="multipart/form-data"  class="form-horizontal" >
<fieldset>

<!-- Form Name -->
<div class="form-group">
 <legend>Product Request</legend>

  <label class="col-md-4 control-label" for="product">Product Name</label>
  <div class="col-md-6">
      <input id="productname" name="productname" type="text" placeholder="Product Name" class="form-control input-md" >
</div>
</div>

<!-- Text input-->
<div class="form-group">
  <label class="col-md-4 control-label" for="Desc">Description</label>  
  <div class="col-md-6">
  <input id="description" name="description" type="text" placeholder="Descripton" class="form-control input-md" >
    
  </div>
</div>
<div class="form-group">
  <label class="col-md-4 control-label" for="post">Category</label>  
  <div class="col-md-6">
  <select name="Category">
  <br><br><option value="">Select Category</option><br><br>
  <c:forEach items="${categoryList}" var="category" varStatus="status"><br><br>
  <option value="${category.categoryname}">${category.categoryname}</option>
  </c:forEach>
</select>
 
<!--   <input id="category" name="category" type="text"  class="form-control input-md" />
 -->    
  </div>
</div>
<div class="form-group">
  <label class="col-md-4 control-label" for="post">SupplierName</label>  
  <div class="col-md-6">
  <select name="suppliername"><br><br>
  <option value="">Select Supplier</option><br><br>
  <c:forEach items="${supplierList}" var="supplier" varStatus="status"><br><br>
  <option value="${supplier.suppliername}">${supplier.suppliername}</option>
  </c:forEach>
</select>
<!--   <input id="supplier" name="supplier" type="text"  class="form-control input-md" />
 -->    
  </div>
</div>

<!-- Text input-->
<div class="form-group">
  <label class="col-md-4 control-label" for="stock">Stock</label>  
  <div class="col-md-6">
  <input id="stock" name="stock" type="text" placeholder="Available" class="form-control input-md" >
    
  </div>
</div>
<div class="form-group">
  <label class="col-md-4 control-label" for="price">Price</label>  
  <div class="col-md-6">
  <input id="price" name="price" type="text" placeholder="Price"class="form-control input-md" >
    
  </div>
</div>
<div class="form-group">
  <label class="col-md-4 control-label" for="post">file to upload</label>  
  <div class="col-md-6">
  <input id="file" name="image" type="file"  class="form-control input-md" />
    
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

<%-- Category:<br>
  <select name="Category">
  <br><br><option value="">Select Category</option><br><br>
  <c:forEach items="${categoryList}" var="category" varStatus="status"><br><br>
  <option value="${category.categoryname}">${category.categoryname}</option>
  </c:forEach>
</select>
 
 <br><br> SupplierName:<br>
  <select name="SupplierName"><br><br>
  <option value="">Select Supplier</option><br><br>
  <c:forEach items="${supplierList}" var="supplier" varStatus="status"><br><br>
  <option value="${supplier.suppliername}">${supplier.suppliername}</option>
  </c:forEach>
</select>

 --%>