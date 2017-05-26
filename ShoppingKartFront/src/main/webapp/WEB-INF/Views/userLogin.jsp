
<h2>Welcome User!!!!!!!!</h2>
<%@include file="/WEB-INF/Views/Menu.jsp" %>
<%@include file="/WEB-INF/Views/Header.jsp" %>

<c:choose>
<c:when test="${not empty productdescription}">
   <%@include file="/WEB-INF/Views/ProductDescription.jsp" %>
</c:when>
<c:when test="${not empty isUserClickerdAddtoKart}">
   <%@include file="/WEB-INF/Views/Mykart.jsp" %>
</c:when>
<c:otherwise> <%@include file="/WEB-INF/Views/ProductList.jsp" %></c:otherwise>
</c:choose>