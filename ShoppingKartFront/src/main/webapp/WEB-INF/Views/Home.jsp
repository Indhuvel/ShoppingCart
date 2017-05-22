<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:include page="Header.jsp"></jsp:include>

<div class="header">
	<center>
		<h1>EeKartz</h1>
	</center>

</div>
<span style="color: white;">${message}${email }</span>
<jsp:include page="Menu.jsp"></jsp:include>
<jsp:include page="carousel1.jsp"></jsp:include>


<c:choose>
	<c:when test="${not empty isUserClickedLogin}">

		<%@include file="/WEB-INF/Views/Login.jsp"%>
	</c:when>

	<c:when test="${not empty isUserClickedRegister}">

		<%@include file="/WEB-INF/Views/Registration.jsp"%>
	</c:when>

	<c:when test="${not empty productdescClicked}">

		<%@include file="/WEB-INF/Views/ProductDescription.jsp"%>
	</c:when>

	<c:otherwise>
		<%@include file="/WEB-INF/Views/ProductList.jsp"%>
	</c:otherwise>
</c:choose>




<%-- <c:if test="${isAdmin=='true'}">
	
    <jsp:include page="/WEB-INF/Views/adminLogin.jsp"></jsp:include>

</c:if>  

<c:if test="${isAdminClickedCategory=='true'}">

<jsp:include page="/WEB-INF/Views/Category.jsp"></jsp:include>  

</c:if>

	<c:if test="${isAdminClickedSuppliers=='true'}">
<jsp:include page="/WEB-INF/Views/Supplier.jsp"></jsp:include> <br>
</c:if>

<c:if test="${isAdminClickedProducts=='true'}">
<jsp:include page="/WEB-INF/Views/Products.jsp"></jsp:include> <br>
</c:if>
	

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
	 --%>


<jsp:include page="Footer.jsp"></jsp:include>

