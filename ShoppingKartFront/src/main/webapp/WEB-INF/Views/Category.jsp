 <div class="container">
	<div class="row">
<form class="form-horizontal" action="newCategory" method="post" onsubmit="return formCategory()">
<fieldset>


<div class="form-group">
 <center><big><b>Category</b></big></center>

  <label class="col-md-4 control-label" for="Category">Category Name</label>
  <div class="col-md-4">
      <input id="Categoryname" name="Categoryname" type="text" placeholder="Category Name" class="form-control input-md" >
</div>
</div>


<div class="form-group">
  <label class="col-md-4 control-label" for="Desc">Description</label>  
  <div class="col-md-4">
  <input id="categorydescription" name="categorydescription" type="text" placeholder="Descripton" class="form-control input-md" >
    
  </div>
</div>
<div class="form-group">
  <label class="col-md-4 control-label" for="singlebutton"></label>
  <div class="col-md-4">
    <button id="submit" name="submit" class="btn btn-primary">ADD</button>
  </div>
</div>

</fieldset>
</form>
	</div>
</div> 






	 
	 
	 
	 
	<%--  <h2>  Manage Categories  </h2>

<div id="CreateCategory">

	<form action="manage_category_add">

		<input type="text" name="id">
		 <input type="text" name="name">
		<input type="text" name="description"> 
		<input type="submit" value="Create Category">
	</form>
	
</div>	
	
	<h2> Delete / Update the Categories  </h2>
	<div id="ShowCategories">
	
		<table border="2">
		<thead>
		<tr>
		<td> Category ID</td>
		<td> Category Name</td>
		<td> Category Description </td>
		<td>  Action  </td>
		</tr>
		</thead>
		
	<c:forEach var="category" items="${categoryList}">
	
	<tr>  
	 <td> ${category.id} </td>
	  <td> ${category.name} </td>
	   <td> ${category.description} </td>
	   
	   <td> <a href="manage_category_delete/${category.id}"> Delete | </a>   
	   <a href=""> Update  </a>    </td>
	
	
	
	</tr>

	</c:forEach>
	
	
	</table>
	
	</div>

 --%>	 