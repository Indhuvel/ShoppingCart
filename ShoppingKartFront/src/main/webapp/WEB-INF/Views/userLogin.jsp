

<font color="#0066ff"><h2>Welcome ${pageContext.request.userPrincipal.name}</h2></font><br><br>
<%@include file="/WEB-INF/Views/Menu.jsp" %>
<%@include file="/WEB-INF/Views/Header.jsp" %>

<c:choose>
<c:when test="${not empty productDetails}">
   <%@include file="/WEB-INF/Views/ProductDescription.jsp" %>
</c:when>
<c:when test="${not empty isUserClickerdAddtoKart}">
   <%@include file="/WEB-INF/Views/Mykart.jsp" %>
</c:when>
<c:otherwise> <%@include file="/WEB-INF/Views/ProductList.jsp" %></c:otherwise>
</c:choose>