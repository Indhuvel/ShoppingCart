
 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<c:forEach items="${billingList}" var="billing" >
   <div class="wrap1">
  <div class="billing">
  <br><br>
  <div class="col-sm-3 col-sm-offset-1" style="width:300px;heigth:500px;border:5px solid grey; float: left; margin-left: 1.5em;" >

<a class="btn btn-info" href="deletebillingAddress?billingId=${billing.bid}">
<span style="float: right;margin-right:1em;" class="glyphicon glyphicon-trash"></span> 
</a>
<a class="btn btn-info"  href="editbillingAddress?shippingId=${billing.bid }">
<span style="float: right; margin-right:1em;"class="glyphicon glyphicon-pencil"></span>
</a>
  
  <br>  <h2><font color="#ff0066">Billing Address</font></h2> <br> <br>
    <p class="checkBoxText">Please fill out the form below</p>
        
     
    <input placeholder="Name" name="username"  value="${billing.username}">
     <input placeholder="Email" name="email"  value="${billing.email}">
     <input placeholder="Phone" name="contact"  value="${billing.contact}">
    <input placeholder="Address 1"name="address"  value="${billing.address}">
    <input placeholder="Zip" name="zipcode"  value="${billing.zipcode}">
  <br><br><button ><a class="btn btn-warning" href="billingAddress?billingId=${billing.bid}">Deliver Here</a></button><br><br>
  
 </div></div>
 </div>
 
</c:forEach>
  <button type="button"><span style="float: center;"><a class="btn btn-info" href="billingaddressPage">New Billing Address</a></span></button>
  
 <br><br>
 
 <%-- <button type="button"><span style="float: center;"><a href="billingaddressPage">New Billing Address</a></span></button><br><br>


<c:forEach items="${billingList}" var="billing" >
<div class="col-sm-3 col-sm-offset-1" style="width:300px;heigth:500px;border:5px solid grey; float: left; margin-left: 1.5em;" >

<a href="deletebillingAddress?billingId=${billing.bid}">
<span style="float: right;" class="glyphicon glyphicon-trash"></span> 
</a>
<a href="editbillingAddress?shippingId=${billing.bid }">
<span style="float: right;"class="glyphicon glyphicon-pencil"></span>
</a>

<br><font color="#ff0066">Billing address</font><br><br>

Name:${billing.username}<br>
Email:${billing.email}<br>
Contact Number:${billing.contact}<br>
Address:${billing.address}<br>
Zipcode:${billing.zipcode}

<br><br><button ><a href="billingAddress?billingId=${billing.bid}">Deliver Here</a></button><br><br>
</div>
</c:forEach>
<br><br>
 --%>
  