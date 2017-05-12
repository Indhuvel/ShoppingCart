<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div class="container">

<h2>Supplier List</h2>
<table class = "table table-bordered">
  <tr class="bg-primary">
<th>S.No</th>
<th>SupplierId</th>
<th>SupplierName</th>
 <th>SupplierDescription</th>
 <th>Address</th>
<th>EmailId</th>
<th>ContactNumber</th>
<th>CityCode</th>
<th>EDIT</th>
<th> DELETE</th>
</tr>
 <c:forEach items="${supplierList}" var="supplier" varStatus="status">
<tr>
<td>${status.count}</td>
<td>${supplier.id}</td>
<td>${supplier.suppliername}</td>
 <td>${supplier.supplierdescription}</td>
 <td>${supplier.address}</td>
<td>${supplier.email}</td>
<td>${supplier.contact}</td>
<td>${supplier.citycode}</td>
<td>Edit</td>
<td>Delete</td>
</tr>

</c:forEach> 
</table>
</div>