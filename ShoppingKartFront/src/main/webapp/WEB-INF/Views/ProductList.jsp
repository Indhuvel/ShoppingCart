<c:forEach items="${productList}" var="product" >
<div class="img" >
<a href="productdescription?productid=${product.id}">
<img src="resources/images/products/${product.id}.jpg" width="200" height="200">
</a>
Name : ${product.productname}
price : ${product.price}
</div>
</c:forEach>