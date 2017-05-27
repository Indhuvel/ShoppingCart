<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
@import url(https://fonts.googleapis.com/css?family=Oxygen:400,700);
@import url(https://fonts.googleapis.com/css?family=Knewave);@import url(https://fonts.googleapis.com/css?family=Luckiest+Guy);
body{
  background: url(http://subtlepatterns2015.subtlepatterns.netdna-cdn.com/patterns/robots.png);
  
  font-family: 'Lato', sans-serif;
}

h1{
  color: #ffffff;
  font-family: 'Luckiest Guy', cursive;
  font-size: 30px;
  letter-spacing: 10px;
  margin: 25px;
  text-align: center;
  text-transform: uppercase;
}

.wrap{
  background-color: #ffffff;
  
  -moz-box-shadow: 0px 0px 25px #000000;
  -webkit-box-shadow: 0px 0px 25px #000000;
  box-shadow: 0px 0px 25px #000000;
  
  -moz-border-radius: 3px;
  -webkit-border-radius: 3px;
  border-radius: 3px;
  
  -moz-box-sizing: border-box;
  -webkit-box-sizing: border-box;
  box-sizing: border-box;
  
  margin: 0px auto;
  padding: 30px 20px;
  overflow: auto;
  width: 640px;
}

.shipping{
  float: left;
  text-align: center;
  width: 300px;
}
.billing{
  float: left;
  text-align: center;
  width: 300px;
}

h2{
  color: #0082C5;
  margin: 0px 0px 0px 15px;
  padding: 0px;
  float: left;
}

input{
  background-color: #f2f2f2;
  border: 1px solid #c8c8c8;
  font-family: 'Oxygen', sans-serif;
  
  -moz-border-radius: 2px;
  -webkit-border-radius: 2px;
  border-radius: 2px;
  
  -moz-box-sizing: border-box;
  -webkit-box-sizing: border-box;
  box-sizing: border-box;
  
  margin: 0px 0px 10px 0px;
  padding: 8px;
  width: 90%;
}
select{
  background-color: #f2f2f2;
  border: 1px solid #c8c8c8;
  font-family: 'Oxygen', sans-serif;
  
  -moz-border-radius: 2px;
  -webkit-border-radius: 2px;
  border-radius: 2px;
  
  -moz-box-sizing: border-box;
  -webkit-box-sizing: border-box;
  box-sizing: border-box;
  
  margin: 0px 0px 10px 0px;
  padding: 8px;
  width: 90%;
}
.checkBox{
  clear: left;
  float: left;
  height: 13px;
  margin: 13px 0px 0px 15px;
  width: 13px;
}
.checkBoxText{
  float: left;
  margin: 10px 0px 10px 15px;
  padding: 0px;
}

</style>
<script type="text/javascript">

$(".checkBox").on("click", function(){
	  
	  // Setting up the variables that holds the sipping and billing info
	  
	  var nameShip     = $(".nameShip").val(),
	      address1Ship = $(".address1Ship").val(),
	      address2Ship = $(".address2Ship").val(),
	      cityShip     = $(".cityShip").val(),
	      stateShip    = $(".stateShip").val(),
	      zipShip      = $(".zipShip").val(),
	      phoneShip    = $(".phoneShip").val(),
	      emailShip    = $(".emailShip").val(),
	      nameBill     = $(".nameBill"),
	      address1Bill = $(".address1Bill"),
	      address2Bill = $(".address2Bill"),
	      cityBill     = $(".cityBill"),
	      stateBill    = $(".stateBill"),
	      zipBill      = $(".zipBill"),
	      phoneBill    = $(".phoneBill"),
	      emailBill    = $(".emailBill");
	  
	  // If/Else statment that copy the fields over.
	  
	  if($(".checkBox").is(":checked")){
	    nameBill.val(nameShip);
	    address1Bill.val(address1Ship);
	    address2Bill.val(address2Ship);
	    cityBill.val(cityShip);
	    stateBill.val(stateShip);
	    zipBill.val(zipShip);
	    phoneBill.val(phoneShip);
	    emailBill.val(emailShip);
	  }else{
	    nameBill.val("");
	    address1Bill.val("");
	    address2Bill.val("");
	    cityBill.val("");
	    stateBill.val("");
	    zipBill.val("");
	    phoneBill.val("");
	    emailBill.val("");
	  }
	});
</script>


</head>
<body>
<h1>Copy Address Button</h1>

<div class="wrap">
  <div class="shipping">
    <h2>Shipping Address</h2>
    <p class="checkBoxText">Please fill out the form below</p>
    <input placeholder="Name" class="nameShip" value="Will Robinson">
    <input placeholder="Address 1" class="address1Ship" value="Jupiter 2">
    <input placeholder="Address 2" class="address2Ship" value="B-4">
    <input placeholder="City" class="cityShip" value="Galaxie">
    <select placeholder="State" class="stateShip">
      <option value="Space">Space</option>
      <option value="Frontier">Final Frontier</option>
    </select>
    <input placeholder="Zip" class="zipShip" value="80154">
    <input placeholder="Phone" class="phoneShip" value="(810) 758-9856">
    <input placeholder="Email" class="emailShip" value="lost@space.com">
  </div>

  <div class="billing">
    <h2>Billing Address</h2>
    <input type="checkbox" class="checkBox">
    <p class="checkBoxText">Billing is the same as shipping</p>
    <input placeholder="Name" class="nameBill">
    <input placeholder="Address 1" class="address1Bill">
    <input placeholder="Address 2" class="address2Bill">
    <input placeholder="City" class="cityBill">
    <select placeholder="State" class="stateBill">
      <option value="0">Select a state</option>
      <option value="Space">Space</option>
      <option value="Frontier">Final Frontier</option>
    </select>
    <input placeholder="Zip" class="zipBill">
    <input placeholder="Phone" class="phoneBill">
    <input placeholder="Email" class="emailBill">
  </div>
</div>
</body>
</html>