<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div class="container">

<h2>Mykart List</h2>

<table class = "table table-bordered">
  
  <tr class="bg-primary">
			
				<th >S.No</th>
				<th >Kart Id</th>
				<th>Product Name</th>
				<th >Price</th>
				<th >Quantity</th>
				<th >Total</th>
				<th >Days</th>
				<th >Remove</th>

			</tr>

			<c:forEach items="${mykartList}" var="mykart" varStatus="status">
				<tr>
					<td>${status.count}</td>
					<td>${mykart.kartid}</td>
					<td>${mykart.productname}</td>
					<td>${mykart.price}</td>
					<td>${mykart.quantity}</td>
					<td>${mykart.total}</td>
					<td>${mykart.days}</td>
					<td><a  class="btn btn-info" href="removekart?kartid=${mykart.kartid}">Remove</a></td>
				</tr>
			</c:forEach>
			<tr>
				<td colspan="5">Grand Total :</td>
				<td colspan="2">${GrandTotal }</td>
				<td></td>
			</tr>
			
		</table>
		
		<p>
			<a class="btn btn-info" href="proceed">Proceed</a>
			 
                   
		</p>


                        
                       
</div>



 
<%-- <div class="container">
    <div class="row">
        <div class="col-sm-12 col-md-10 col-md-offset-1">
            <table class="table table-hover">
                <thead>
                    <tr>
                        <th>Product</th>
                        <th>Quantity</th>
                        <th class="text-center">Price</th>
                        <th class="text-center">Subtotal</th>
                        <th> </th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td class="col-sm-8 col-md-6">
                        <div class="media">
                            <a class="thumbnail pull-left" href="#"> 
                            <img class="media-object" src="resources/images/products/${product.id}.jpg" alt="${product.id}" width="120" height="150" align="left"> </a>
                            <br><br>
                            <div class="media-body">
                                <h4 class="media-heading">Product Name: ${product.productname}</h4>
                                <br><br>
                                <span class="text-success"><strong>In Stock:${product.stock}</strong></span>
                            </div>
                        </div></td>
                        
                        <td class="col-sm-1 col-md-1" style="text-align: center">
                        <input type="email" class="form-control" id="exampleInputEmail1" value="1">
                        </td>
                        <td class="col-sm-1 col-md-1 text-center"><strong>${product.price}</strong></td>
                        
                        <td class="col-sm-1 col-md-1 text-center"><strong>$14.61</strong></td>
                        <td class="col-sm-1 col-md-1">
                        <button type="button" class="btn btn-danger">
                            <span class="glyphicon glyphicon-remove"></span> Remove
                        </button></td>
                    </tr>
                   <tr>
                        <td>   </td>
                        <td>   </td>
                        <td>   </td>
                        <td><h3>Total</h3></td>
                        <td class="text-right"><h3><strong>$31.53</strong></h3></td>
                    </tr>
                    <tr>
                        <td>   </td>
                        <td>   </td>
                        <td>   </td>
                        <td>
                        
                        <button type="button" class="btn btn-default">
                            <span class="glyphicon glyphicon-shopping-cart"></span> Continue Shopping
                        </button></td>
                        <td>
                     <a href="#">   <button type="button" class="btn btn-success">
                            checkout <span class="glyphicon glyphicon-play"></span>
                        </button></a></td>
                    </tr>
                    
                </tbody>
            </table>
        </div>
    </div>
</div>  

 --%>

