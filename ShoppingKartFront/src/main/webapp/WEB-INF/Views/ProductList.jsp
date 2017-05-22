<%-- <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div class="container">
<c:forEach items="${productList}" var="product" >
<div class="img" >
<a href="productdescription?productid=${product.id}">
<img src="resources/images/products/${product.id}.jpg" width="300" height="200">
<p align="center"><a href="http://bootsnipp.com/" class="btn btn-primary btn-block">AddToCart</a></p>

</a>
Name : ${product.productname}
price : ${product.price}
</div>

</c:forEach>
        </div> 
 --%><!--images from http://haryarti.deviantart.com/gallery/-->
 <div class="container">
  <ul class="gallery">
    <li>
      <div class="flip">
        <div class="front-side"></div>
        <div class="back-side">
          <a href="#">
            <div class="content">
              <div class="loader"></div>
              <div class="text">
                <h3>LINA</h3>
                <p>The sibling rivalries between Lina the Slayer</p>
              </div>
            </div>
          </a>
        </div>
      </div>
    </li>
    <li>
      <div class="flip">
        <div class="front-side"></div>
        <div class="back-side">
          <a href="#">
            <div class="content">
              <div class="loader"></div>
              <div class="text">
                <h3>CRYSTAL MAIDEN</h3>
                <p>The sibling rivalries between Lina the Slayer</p> </div>
            </div>
          </a>
        </div>
      </div>
    </li>
    <li>
      <div class="flip">
        <div class="front-side"></div>
        <div class="back-side">
          <a href="#">
            <div class="content">
              <div class="loader"></div>
              <div class="text">
                <h3>DROW RANGER</h3>
               <p>The sibling rivalries between Lina the Slayer</p>  </div>
            </div>
          </a>
        </div>
      </div>
    </li>
    
    
  </ul>
</div> 