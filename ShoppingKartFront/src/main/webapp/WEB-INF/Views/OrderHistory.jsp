<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div class="container">

<h2>Order History</h2>

<table class = "table table-bordered">
  
  <tr class="bg-primary">
			
				<th>Product Name</th>
				<th >Price</th>
				<th >Quantity</th>
				<th >Total</th>
			</tr>
<c:forEach items="${mykartList}" var="product" varStatus="status">
				<tr>
					<td>${product.productname}</td>
					<td>${product.price}</td>
					<td>${product.quantity}</td>
					<td>${product.total}</td>
</tr>
			</c:forEach>
					</table>
			</div>