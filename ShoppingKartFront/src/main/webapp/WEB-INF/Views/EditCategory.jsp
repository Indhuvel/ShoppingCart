
<div style="margin-right:30%" align="center">
<h2>Edit Category</h2>
<fieldset>
<!-- <legend> category</legend> -->
<form action="afterEditcategory" method="post">
CategoryId:<br>
  <input type="text" name="id" value="${category.id}" readonly="true"><br>

  Category Name:<br>
  <input type="text" name="categoryname" value="${category.categoryname}"><br>
  Category Details:<br>
  <input type="text" name="categorydescription" value="${category.categorydescription}"><br>
  <input type="submit" name="submit">
</form>
</fieldset></div>