<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:include page="Header.jsp"></jsp:include>

<div class="header">
<center><h1>EeKartz</h1></center>
 
</div>
	<span style="color: white;">${message}${email }</span>
	<jsp:include page="Menu.jsp"></jsp:include>
	<jsp:include page="carousel1.jsp"></jsp:include>
	

	<br>
		<c:if test="${isUserClickedLogin=='true' }">
		<jsp:include page="Login.jsp"></jsp:include>
	</c:if>


	<c:if test="${isUserClickedRegister=='true' }">
		<jsp:include page="Registration.jsp"></jsp:include>
	</c:if>
    
    <c:if test="${isUserClickedProducts=='true' }">
		<jsp:include page="Products.jsp"></jsp:include>
	</c:if>
     <c:if test="${isUserClickedSupplier=='true' }">
		<jsp:include page="Supplier.jsp"></jsp:include>
	</c:if>
	<c:if test="${isUserClickedCategory=='true' }">
		<jsp:include page="Category.jsp"></jsp:include>
	</c:if>
<jsp:include page="Footer.jsp"></jsp:include>
  
