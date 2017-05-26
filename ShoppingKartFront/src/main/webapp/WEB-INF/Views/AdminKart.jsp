<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<div class="login-form">
		<center>
			<br>
			<br>
			<br>
			<br>
			<br>
			<h1>Product Added To Cart</h1><br>

<table>
	
			
					<thead>
						<tr>
							<td>Serial no</td>

							<span><td>Product Name</td></span>
							<span><td>Quantity</td></span>
							<td>Product Price</td>
							<td>Total</td>
							<td>User Name</td>
					        <td>Date</td>
						</tr>
					</thead>
					<c:forEach items="${mykartList}" var="mykart" varStatus="status">
						<tr>
							<td>${status.count}</td>


							<td>${mykart.productname }</td>
							<td>${mykart.quantity}</td>
							<td>${mykart.price }</td>
							<td>${mykart.total}</td>
							<td>${mykart.username }</td>
						</tr>
					</c:forEach>
					</div>


				</table>
				<br>
</center>


			</div>
			