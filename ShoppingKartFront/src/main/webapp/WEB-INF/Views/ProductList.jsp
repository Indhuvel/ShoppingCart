 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
 
<section class="new-deal">
		 <div class="container">
		 <c:forEach items="${productList}" var="product" >
		 
		   			<div class="col-lg-4 col-md-4 col-sm-4 col-xs-4 deal deal-block">
				<div class="item-slide">
						<div class="box-img">
						<a href="productdescription?productid=${product.id}">
					<img src="resources/images/products/${product.id}.jpg" width="250" height="250"></a>
							<div class="text-wrap">
								<div class="desc">									
									<span>Name : ${product.productname}</span>
									<h3>Price : ${product.price}</h3>
								</div>
								<div class="book-now-c">								
								<a href="#">Add to Cart</a>
								</div>
							</div>
						</div>
						<div class="slide-hover">
						<div class="text-wrap">
						<p>My Search gets you Mobiles at the best price. </p>
						<div class="desc">									
									<h3><span>Name : ${product.productname}</span>
									Price : ${product.price}
<%-- 								    ${product.description}
 --%>									</h3>
								</div>
								<div class="book-now-c">
									<a href="productDetails?id=${product.id }">View Details</a>
								</div>
							</div>
						</div>
				</div>
			</div>
			</c:forEach>
		</div>
	</section> 	