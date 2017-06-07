
<h2><font color="#0066ff">Welcome ${pageContext.request.userPrincipal.name}</font><br><br></h2>

<%@include file="/WEB-INF/Views/Menu.jsp" %>
<%@include file="/WEB-INF/Views/Header.jsp" %>

<c:choose>

<c:when test="${isAdminClickedProducts=='true'}">
<%@include file="/WEB-INF/Views/Products.jsp" %>
</c:when>

<c:when test="${isAdminClickedCategory=='true'}">
<%@include file="/WEB-INF/Views/Category.jsp" %>
</c:when>

<c:when test="${isAdminClickedSupplier=='true'}">
<%@include file="/WEB-INF/Views/Supplier.jsp" %>
</c:when>

<c:when test="${isAdminClickedViewProducts=='true'}">
<%@include file="/WEB-INF/Views/ViewProducts.jsp" %>
</c:when>

<c:when test="${isAdminClickedViewCategory=='true'}">
<%@include file="/WEB-INF/Views/ViewCategory.jsp" %>
</c:when>

<c:when test="${isAdminClickedViewSupplier=='true'}">
<%@include file="/WEB-INF/Views/ViewSupplier.jsp" %>
</c:when>

<c:when test="${isAdminClickedEditProducts=='true'}">
<%@include file="/WEB-INF/Views/EditProducts.jsp" %>
</c:when>

<c:when test="${isAdminClickedEditCategory=='true'}">
<%@include file="/WEB-INF/Views/EditCategory.jsp" %>
</c:when>

<c:when test="${isAdminClickedEditSupplier=='true'}">
<%@include file="/WEB-INF/Views/EditSupplier.jsp" %>
</c:when>

</c:choose>
