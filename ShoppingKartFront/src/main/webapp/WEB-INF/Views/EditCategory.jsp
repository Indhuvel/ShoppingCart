<h2>Edit Category</h2>
<fieldset>
<legend> category</legend>
<form action="afterEditcategory" method="post">
categoryid:<br>
  <input type="text" name="id" value="${category.id}" readonly="true"><br>

  categoryname:<br>
  <input type="text" name="categoryname" value="${category.categoryname}"><br>
  categorydetails:<br>
  <input type="text" name="categorydescription" value="${category.categorydescription}">
  <input type="submit" name="submit">
</form>
</fieldset>