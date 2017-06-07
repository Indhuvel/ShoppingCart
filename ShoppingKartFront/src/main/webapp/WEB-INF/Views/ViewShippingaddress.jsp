 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

  <button type="button"><span style="float: center;"><a class="btn btn-info" href="shippingaddressPage">New Shipping Address</a></span></button><br><br>

 <c:forEach items="${shippingList}" var="shipping" >
 <div class="col-sm-3 col-sm-offset-1" style="width:300px;heigth:500px;border:5px solid grey; float: left; margin-left: 1.5em;" >

<a class="btn btn-info" href="deleteshippingAddress?shippingId=${shipping.sid}">
<span style="float: left;margin-right:1em;" class="glyphicon glyphicon-trash"></span> 
</a>
<a class="btn btn-info" href="editshippingAddress?shippingId=${shipping.sid }">
<span style="float: left; margin-right:1em;"class="glyphicon glyphicon-pencil"></span>
</a>

<br><font color="#ff0066">Shipping address</font><br><br>

Name:${shipping.username}<br>
<%-- Email:${shipping.email}<br> --%>
Contact Number:${shipping.contact}<br>
Address:${shipping.address}<br>
Zipcode:${shipping.zipcode}

<br><br><button ><a class="btn btn-info" href="shippingAddress?shippingId=${shipping.sid}">Deliver Here</a></button><br><br>
</div>
</c:forEach>
 <br><br>  
 
 
 
 <%-- <c:forEach items="${shippingList}" var="shipping" >
   <div class="wrap1">
  <div class="shipping">
  <br><br>
  <div class="col-sm-3 col-sm-offset-1" style="width:300px;heigth:500px;border:5px solid grey; float: left; margin-left: 1.5em;" >

<a class="btn btn-info" href="deleteshippingAddress?shippingId=${shipping.sid}">
<span style="float: right;margin-right:1em;" class="glyphicon glyphicon-trash"></span> 
</a>
<a class="btn btn-info"  href="editshippingAddress?shippingId=${shipping.sid }">
<span style="float: right; margin-right:1em;"class="glyphicon glyphicon-pencil"></span>
</a>
  
  <br>  <h2><font color="#ff0066">Shipping Address</font></h2> <br> <br>
    <p class="checkBoxText">Please fill out the form below</p>
        
     
    <input placeholder="Name" name="username"  value="${shipping.username}">
     <input placeholder="Email" name="email"  value="${shipping.email}">
     <input placeholder="Phone" name="contact"  value="${shipping.contact}">
    <input placeholder="Address 1"name="address"  value="${shipping.address}">
    <input placeholder="Zip" name="zipcode"  value="${shipping.zipcode}">
  <br><br><button ><a class="btn btn-warning" href="shippingAddress?shippingId=${shipping.sid}">Deliver Here</a></button><br><br>
  
 </div></div>
 </div>
 
</c:forEach>
  <button type="button"><span style="float: center;"><a class="btn btn-info" href="shippingaddressPage">New Shipping Address</a></span></button>
  
 <br><br>
 
 --%>   

