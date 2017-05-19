<h2>Edit Supplier</h2>
<fieldset>
<legend> supplier</legend>
<form action="aftereditsupplier" action="post">

  id:<br> <input type="text" name="id"value="${supplier.id}" readonly="true"><br>
  name:<br> <input type="text" name="suppliername" value="${supplier.suppliername}"><br>
  description:<br> <input type="text" name="supplierdescription" value="${supplier.supplierdescription}"><br>
  
  address:<br> <input type="text" name="address" value="${supplier.address}"><br>
  email:<br> <input type="text" name="email"  value="${supplier.email}"><br>
  contact:<br> <input type="text" name="contact" value="${supplier.contact}"><br>
  
   citycode:<br><input type="text" name="citycode"  value="${supplier.citycode}"><br>
 
  <input type="submit" name="submit">
</form>
</fieldset>