<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div class="container">
  <h2>Category List</h2>
  
<table class = "table table-bordered">
 
  <tr class="bg-primary">
<th>S.No</th>
<th>Category id</th>
<th>CategoryName</th>
<th>CategoryDescription</th>
<th>EDIT</th>
<th> DELETE</th>
</tr>

 
  
<c:forEach items="${categoryList}" var="category" varStatus="status">
<tr>
<td>${status.count}</td>
<td>${category.id}</td>
<td>${category.categoryname}</td>
<td>${category.categorydescription}</td>
<td>Edit</td>
<td>Delete</td>
</tr>

</c:forEach>

  </table>
    </div>