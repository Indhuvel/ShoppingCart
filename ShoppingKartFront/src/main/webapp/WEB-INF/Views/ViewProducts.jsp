<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div class="container">

<h2>Product List</h2>
<table class = "table table-bordered">
  
  <tr class="bg-primary">

<th>S.No</th>
<th>Product id</th>
<th>ProductName</th>
<th>ProductDescription</th>
<th>Category</th>
<th>SupplierName</th>
<th>Price</th>
<th>Stock</th>
<th>EDIT</th>
<th>DELETE</th>
</tr>

<c:forEach items="${productList}" var="product" varStatus="status">
<tr>
<td>${status.count}</td>
<td>${product.id}</td>
<td>${product.productname}</td>
<td>${product.description}</td>
<td>${product.category}</td>
<td>${product.suppliername}</td>
<td>${product.price}</td>
<td>${product.stock}</td>
<td><a class="btn btn-info" href="editProducts?productId=${product.id}">Edit</a></td> 
<td><a class="btn btn-info" href="deleteProducts?productId=${product.id}">Delete</a></td>
</tr>

</c:forEach>

  </table>
    </div>
