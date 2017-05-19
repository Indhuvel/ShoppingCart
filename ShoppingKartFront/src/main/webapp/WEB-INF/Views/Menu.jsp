<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<nav>	
    <ul class="nav navbar-nav">
               <li><a href="#">HOME</a></li>
   
    <c:choose>
    
    <c:when test="${isAdmin=='true'}">
     <li class="dropdown"><a data-toggle="dropdown" href="#">PRODUCT<span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li><a href="ViewProductsPage">View</a></li>
           <li><a href="ProductsPage">Add</a></li>
<!--             <li><a href="EditProductsPage">Edit</a></li>
 -->          </ul></li> 
                 
<li class="dropdown"><a data-toggle="dropdown" href="#">SUPPLIER<span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li><a href="ViewSupplierPage">View</a></li>
           <li><a href="SupplierPage">Add</a></li>
<!--           <li><a href="EditSupplierPage">Edit</a></li>
 -->          </ul></li>
           
           <li class="dropdown"><a data-toggle="dropdown" href="#">CATEGORY<span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li><a href="ViewCategoryPage">View</a></li>
           <li><a href="CategoryPage">Add</a></li>
<!--             <li><a href="EditCategoryPage">Edit</a></li>
 -->          </ul></li>  
            <li style="float:right;"><a href="logout">LOGOUT</a></li>
            </c:when>      	
    

  <c:when test="${isUser=='true'}">
<li><a href="#">PRODUCTS</a></li>
<li><a href="#">SERVICES</a></li>
      <li><a href="#">ABOUT</a></li>
      <li><a href="#">CONTACT US</a></li>
<li style="float:right;"><a href="#">LOGOUT</a></li>
</c:when>

<c:otherwise>
<li><a href="#">SERVICES</a></li>
      <li><a href="#">ABOUT</a></li>
      <li><a href="#">CONTACT US</a></li>
      
      <form action="" class="search-form">
                <div class="form-group has-feedback">
            		<label for="search" class="sr-only">Search</label>
            		<input type="text" class="form-control" name="search" id="search" placeholder="search">
              		<span class="glyphicon glyphicon-search form-control-feedback"></span>
            	</div>
            </form>
<li style="float:right;"><a href="RegistrationPage"><span class="glyphicon glyphicon-hand-right"></span> Register</a></li>
   <li class="active" style="float:right;"><a href="loginPage" class="active" id="login"><span class="glyphicon glyphicon-user"></span> Login</a></li>


</c:otherwise>

</c:choose>

    </ul>
     </nav>


<%--       <li><a href="#">HOME</a></li>
 <li class="dropdown"><a data-toggle="dropdown" href="#">PRODUCT<span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li><a href="#">View</a></li>
           <li><a href="ProductsPage">Add</a></li>
           </ul></li>       
       <li><a href="#">SERVICES</a></li>
      <li><a href="#">ABOUT</a></li>
      <li><a href="#">CONTACT US</a></li>
<li class="dropdown"><a data-toggle="dropdown" href="#">SUPPLIER<span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li><a href="#">View</a></li>
           <li><a href="SupplierPage">Add</a></li>
           </ul></li>
           <li class="dropdown"><a data-toggle="dropdown" href="#">CATEGORY<span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li><a href="#">View</a></li>
           <li><a href="CategoryPage">Add</a></li>
           </ul></li>
              
                <li class="dropdown"><a data-toggle="dropdown" href="#">CATEGORYLIST<span class="caret"></span></a>
        <ul class="dropdown-menu">
         <c:forEach items="${categoryList}" var="category">
          <li><a href="#">${category.categoryname}</a></li>
          </c:forEach>
           </ul></li> 
        
        <form action="" class="search-form">
                <div class="form-group has-feedback">
            		<label for="search" class="sr-only">Search</label>
            		<input type="text" class="form-control" name="search" id="search" placeholder="search">
              		<span class="glyphicon glyphicon-search form-control-feedback"></span>
            	</div>
            </form>
           				
   <li style="float:right;"><a href="RegistrationPage"><span class="glyphicon glyphicon-hand-right"></span> Register</a></li>
   <li class="active" style="float:right;"><a href="LoginPage" class="active" id="login"><span class="glyphicon glyphicon-user"></span> Login</a></li>
  --%>    


