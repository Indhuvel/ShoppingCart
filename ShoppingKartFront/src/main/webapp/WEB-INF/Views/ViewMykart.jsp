<center>List Of Cart</center>
<table cellspacing="20">
<tr>
<th>S.No</th>
<th>ProductName</th>
<th>Quantity</th>
<th>Price</th>
<th>Total</th>

<th> DELETE</th>
</tr>
<c:forEach items="${mykartList}" var="cart" varStatus="status">

<tr>
<td>${status.count}</td>
<td>${cart.productname}</td>
<td>${cart.quantity}</td>
<td>${cart.price}</td>
<td>${cart.total}</td>

<td><a href="deleteCart?cartId=${mykart.id}">DELETE</a></td>
</tr>
</c:forEach>
<tr>
<td> Grand Total: </td>
<td> ${total}</td> 
</tr>
<tr>
<td><a href="proceed"><button>proceddelivery</button></a>
</td>
</tr>
</table>