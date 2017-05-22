<br><br> <img src="resources/images/products/${product.id}.jpg" alt="${product.id}" width="250" height="350" align="left">
 
 
 <div class="right">
 <ul style="list-style-type:none">
 <br><br><br><br><li class="span2"><h5 style="color: #99003d" >Product Name: ${product.productname}</h5>
  <h6 style="color: #99003d">Price: ${product.price}</h6></li></ul>
 <span style="color: red;"> ${message}</span>
  <div class="w3-container">
    <c:if test="${pageContext.request.userPrincipal.name == null }">
  <p><a href="loginPage"><button class="w3-button w3-pink">Add To Cart</button></a></p>
  </c:if>
    <c:if test="${pageContext.request.userPrincipal.name != null }">
  <br><br><br><p><a href="addtocart?productId=${product.id}"><button class="w3-button w3-pink">Add To Cart</button></a></p>
  </c:if>
  <p><a href="afterlogin"><button align="left" class="w3-button w3-purple">Go Back</button></a></p> 