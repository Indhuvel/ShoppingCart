<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div style="margin-right:70%" align="center">

<h2>Edit Products</h2>
<fieldset>
<!-- <legend>Product</legend>
 -->  <form action="afterEditproducts" method="post">
  Product Id:<input class="form-control" type="text" name="id" value="${product.id}" readonly="true"><br>
  
  Product Name:
  <input class="form-control" type="text" name="productname" value="${product.productname}"><br>
  Product Description:
  <input class="form-control" type="text" name="description" value="${product.description}"><br>
   
   Category:<select name="category">
   <option value="">select your category</option>
   	<c:forEach items="${categoryList}" var="category">
<option value="${category.categoryname}">${category.categoryname}</option>
</c:forEach>
</select><br><br>

SupplierName:<select name="suppliername">
   <option value="">select your supplier</option>
   <c:forEach items="${supplierList}" var="supplier">	
   <option value="${supplier.suppliername}">${supplier.suppliername}</option>
   </c:forEach>
</select><br>
Price:
<input class="form-control" type="text" name="price" value="${product.price}"><br>
stock:
<input class="form-control" type="text" name="Stock" value="${product.stock}"><br>
<input type="submit" name="submit">
</form>
</fieldset></div>