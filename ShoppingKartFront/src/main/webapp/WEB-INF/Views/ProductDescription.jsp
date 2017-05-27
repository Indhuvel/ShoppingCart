 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>  
   
   <div class="container-fluid">
   <div class="product col-md-3 service-image-left">
    <img src="resources/images/products/${product.id}.jpg" alt="${product.id}" width="250" height="350" align="left">
					</div>
				
			<div class="col-md-7">
				<div class="product-title"><h3>Description</h3></div>
					<br>
					<div class="product-desc">${product.description}

				</div>
				
<!-- 				<div class="product-rating" style="color:red;"><i class="fa fa-star gold"></i> <i class="fa fa-star gold"></i> <i class="fa fa-star gold"></i> <i class="fa fa-star gold"></i> <i class="fa fa-star-o"></i> </div>
 --> 					<hr>
					<div class="product-name">Product Name: ${product.productname}</div>
					<div class="product-price">Price: ${product.price}</div>
					<div class="product-stock">In Stock: ${product.stock }</div>
					<hr>
					    <c:if test="${pageContext.request.userPrincipal.name == null }">
					
				<p><a href="loginPage">	<div class="btn-group cart">
						<button type="button" class="btn btn-success">
							Add to Cart 
						</button>
						</div></a></p>
						
						</c:if>
						
						<h3 style="color: red;">${message }</h3>
						<c:if test="${pageContext.request.userPrincipal.name != null }">
                 <p><a href="addtokart?productId=${product.id}">
             <div class="btn-group cart">
						<button type="button" class="btn btn-success">Add To Cart</button>
						</div></a></p>
  </c:if>
						</div>
					</div>
					
				
			 
				
					
				
				 
				  