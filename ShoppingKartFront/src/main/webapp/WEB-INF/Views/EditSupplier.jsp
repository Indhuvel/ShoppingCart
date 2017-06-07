
<div style="margin-right:30%" align="center">
<h2>Edit Supplier</h2>
<fieldset>
<!-- <legend> supplier</legend> -->
<form action="aftereditsupplier" action="post">

  SupplierId:<br> <input type="text" name="id"value="${supplier.id}" readonly="true"><br>
  Supplier Name:<br> <input type="text" name="suppliername" value="${supplier.suppliername}"><br>
  Description:<br> <input type="text" name="supplierdescription" value="${supplier.supplierdescription}"><br>
  
  Address:<br> <input type="text" name="address" value="${supplier.address}"><br>
  Email:<br> <input type="text" name="email"  value="${supplier.email}"><br>
  Contact:<br> <input type="text" name="contact" value="${supplier.contact}"><br>
  
   Citycode:<br><input type="text" name="citycode"  value="${supplier.citycode}"><br>
 
  <input type="submit" name="submit">
</form>
</fieldset>
</div>