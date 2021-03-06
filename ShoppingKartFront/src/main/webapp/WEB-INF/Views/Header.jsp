<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">

<link rel="stylesheet" type="text/css" href="resources/css/Search.css">
<link rel="stylesheet" type="text/css" href="resources/css/Navbar.css">
<link rel="stylesheet" type="text/css" href="resources/css/Pay.css">

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css">
<script type="text/javascript" src="resources/js/jquery.js"></script>

 
<link rel="stylesheet" type="text/css" href="resources/css/style.css" />
 <script type="text/javascript">
 
 //RegForm
function formsignup() {
	var username = document.getElementById('username');
	var email = document.getElementById('email');
	var password = document.getElementById('password');
	var contact = document.getElementById('contact');
	var address = document.getElementById('address');
	var zipcode = document.getElementById('zipcode');
	// Check each input in the order that it appears in the form!

	if (notEmpty(username, "Username Should not be empty")) {
		if (isAlphabet(username, "Please enter only letters for Username")) {
			if (notEmpty(email,"EmailId Should not be empty")) {
		if (emailValidator(email,"EmailId Should be in format of abc@xyz.com ")) {

			if (notEmpty(password, "password Should not be empty")) {

				if (isAlphanumeric(password,"Numbers and Letters Only for Passwords")) {

					if (notEmpty(contact, "Contactnumber Should not be empty")) {
						if (isNumeric(contact,"Please enter only number for Contactnumber")) {
							
									if (notEmpty(address,"Address Should not be empty")) {
										if (notEmpty(zipcode,"Zipcode Should not be empty")) {
											if (isNumeric(zipcode,"Please enter a valid zip code")) {
												return true;
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
		return false;
	}
	function notEmpty(elem, helperMsg) {
		if (elem.value.length == 0) {
			alert(helperMsg);
			elem.focus(); // set the focus to this input
			return false;
		}
		return true;
	}
	function isNumeric(elem, helperMsg) {
		var numericExpression = /^[0-9]+$/;
		if (elem.value.match(numericExpression)) {
			return true;
		} else {
			alert(helperMsg);
			elem.focus();
			return false;
		}
	}
	function isAlphanumeric(elem, helperMsg) {
		var alphaExp = /^[0-9a-zA-Z]+$/;
		if (elem.value.match(alphaExp)) {
			return true;
		} else {
			alert(helperMsg);
			elem.focus();
			return false;
		}
	}
	function emailValidator(elem, helperMsg) {
		var emailExp = /^[\w\-\.\+]+\@[a-zA-Z0-9\.\-]+\.[a-zA-z0-9]{2,4}$/;
		if (elem.value.match(emailExp)) {
			return true;
		} else {
			alert(helperMsg);
			elem.focus();
			return false;
		}
	}
	function isAlphabet(elem, helperMsg) {
		var alphaExp = /^[a-z A-Z]+$/;
		if (elem.value.match(alphaExp)) {
			return true;
		} else {
			alert(helperMsg);
			elem.focus();
			return false;
		}
	}
	
	//SupplierForm
	
	function formSupplier() {
		// Make quick references to our fields
		var suppliername = document.getElementById('suppliername');
		var supplierdescription = document.getElementById('supplierdescription');
		var email = document.getElementById('email');
		var contact = document.getElementById('contact');
		var address = document.getElementById('address');
		var zipcode = document.getElementById('zipcode');

		if (notEmpty(suppliername, "Suppliername Should not be empty")) {
			if (isAlphabet(suppliername,"Please enter only letters for suppliername")) {
				if (notEmpty(supplierdescription, "Supplierdescription Should not be empty")) {
					if (notEmpty(email,"EmailId Should not be empty")) {
						if (emailValidator(email,"EmailId Should be in format of abc@xyz.com ")) {
							if (notEmpty(address,"Address Should not be empty")) {

							if (notEmpty(contact, "Contactnumber Should not be empty")) {
								if (isNumeric(contact,"Please enter only number for Contactnumber")) {
									
												if (notEmpty(zipcode,"Zipcode Should not be empty")) {
													if (isNumeric(zipcode,"Please enter a valid zip code")) {
														return true;
					}}}}
				}
			}
		}}}
	return false;
	}
	function notEmpty(elem, helperMsg) {
		if (elem.value.length == 0) {
			alert(helperMsg);
			elem.focus(); // set the focus to this input
			return false;
		}
		return true;
	}
}
						function emailValidator(elem, helperMsg) {
							var emailExp = /^[\w\-\.\+]+\@[a-zA-Z0-9\.\-]+\.[a-zA-z0-9]{2,4}$/;
							if (elem.value.match(emailExp)) {
								return true;
							} else {
								alert(helperMsg);
								elem.focus();
								return false;
							}
						}
						function isAlphabet(elem, helperMsg) {
							var alphaExp = /^[a-z A-Z]+$/;
							if (elem.value.match(alphaExp)) {
								return true;
							} else {
								alert(helperMsg);
								elem.focus();
								return false;
							}
						}
						function isNumeric(elem, helperMsg) {
							var numericExpression = /^[0-9]+$/;
							if (elem.value.match(numericExpression)) {
								return true;
							} else {
								alert(helperMsg);
								elem.focus();
								return false;
							}
						}
					
	//productform
	function formProduct() {
			// Make quick references to our fields
			var productname = document.getElementById('productname');
			var description = document.getElementById('description');
			var category = document.getElementById('category');
			var supplier = document.getElementById('supplier');
			var stock = document.getElementById('stock');
			var Price = document.getElementById('price');
			if (notEmpty(productname, "productname Should not be empty")) {
				if (isAlphabet(productname,"Please enter only letters for product name")) {
					if (notEmpty(description, "Description Should not be empty")) {
						if (notEmpty(category, "category Should not be empty for product")) {
							if (notEmpty(supplier,"supplier Should not be empty for supplier")) {
								if (notEmpty(stock, "Stock Should not be empty")) {
									if (isNumeric(stock,"Please enter only Numbers for Stock - Quantity")) {
										if (notEmpty(Price,"price Should not be empty")) {
											if (isNumeric(Price,"Please enter only Numbers for Price")) {
												
													return true;
												}
										}
									}
								}
							}
						}
					}
				}
			}
			return false;
		}
		function notEmpty(elem, helperMsg) {
			if (elem.value.length == 0) {
				alert(helperMsg);
				elem.focus(); // set the focus to this input
				return false;
			}
			return true;
		}
		function isNumeric(elem, helperMsg) {
			var numericExpression = /^[0-9]+$/;
			if (elem.value.match(numericExpression)) {
				return true;
			} else {
				alert(helperMsg);
				elem.focus();
				return false;
			}
		}
		function isAlphabet(elem, helperMsg) {
			var alphaExp = /^[a-z A-Z]+$/;
			if (elem.value.match(alphaExp)) {
				return true;
			} else {
				alert(helperMsg);
				elem.focus();
				return false;
			}
		}
		
		//CategoryForm
		
		
		function formCategory() {
		// Make quick references to our fields
		var Categoryname = document.getElementById('Categoryname');
		var categorydescription = document.getElementById('categorydescription');
		if (notEmpty(Categoryname, "Categoryname Should not be empty")) {
			if (isAlphabet(Categoryname,
					"Please enter only letters for Category")) {
				if (notEmpty(categorydescription, "Description Should not be empty")) {
					return true;
				}
			}
		}
		return false;
	}
	function notEmpty(elem, helperMsg) {
		if (elem.value.length == 0) {
			alert(helperMsg);
			elem.focus(); // set the focus to this input
			return false;
		}
		return true;
	}
	function isAlphabet(elem, helperMsg) {
		var alphaExp = /^[a-z A-Z]+$/;
		if (elem.value.match(alphaExp)) {
			return true;
		} else {
			alert(helperMsg);
			elem.focus();
			return false;
		}
	}
						
	//shippingaddress form
	function formAddress() {
	// Make quick references to our fields
	
	var username = document.getElementById('username');
	var contact = document.getElementById('contact');
	var address = document.getElementById('address');
	var zipcode = document.getElementById('zipcode');
	// Check each input in the order that it appears in the form!
		if (notEmpty(username, "Username Should not be empty")) {
		if (isAlphabet(username,"Please enter only letters for Username")) {
				if (notEmpty(contact,"Contact Number Should not be empty")) {
		if (isNumeric(contact,"Please enter only number for Contact Number")) {
	    if (notEmpty(address,"Address Should not be empty")) {
	    if (notEmpty(zipcode,"Zipcode Should not be empty")) {
		if (isNumeric(zipcode,"Please enter a valid zip code")) {
									return true;
														}
													}
												}
											}
										}
									}
}
	return false;
}
function notEmpty(elem, helperMsg) {
	if (elem.value.length == 0) {
		alert(helperMsg);
		elem.focus(); // set the focus to this input
		return false;
	}
	return true;
}
function isNumeric(elem, helperMsg) {
	var numericExpression = /^[0-9]+$/;
	if (elem.value.match(numericExpression)) {
		return true;
	} else {
		alert(helperMsg);
		elem.focus();
		return false;
	}
}
function isAlphabet(elem, helperMsg) {
	var alphaExp = /^[a-z A-Z]+$/;
	if (elem.value.match(alphaExp)) {
		return true;
	} else {
		alert(helperMsg);
		elem.focus();
		return false;
	}
}
</script>

<style>
body {
	font-family: sans-serif;
	background-repeat: no-repeat;
	background-size: cover;
}

//
navbar
 ul {
	padding: 10px;
	width: 100%;
	background-color: #000000;
	float: left;
	margin-top: 20px;
	border-radius: 20px;
	box-shadow: 0px 0px 10px 0px #ff00ff;
}

li {
	float: left;
	width: 125px;
	height: 35px;
	padding: 0px;
	line-height: 30px;
	border-right: 1px solid #400040;
}

a {
	display: block;
	text-decoration: none;
	color: white;
	font-family: 'WebSymbolsRegular', cursive;
}

li:hover {
	width: 200px;
	text-align: center;
	border-radius: 5px;
	background-color: #BDBDBD;
	box-shadow: inset 0px 0px 50px 2px #848484;
	-webkit-transform: scale(1, 1.2);
	-ms-transform: scale(1, 1.2);
	transform: scale(1, 1.2);
	-webkit-transition: all 200ms linear;
	-ms-transition: all 200ms linear;
	transition: all 200ms linear;
}

li:hover a {
	font-size: 23px;
	color: #400000;
	-webkit-transform: rotate(360deg);
	-ms-transform: rotate(360deg);
	transform: rotate(360deg);
	-webkit-transition: all 200ms linear;
	-ms-transition: all 200ms linear;
	transition: all 200ms linear;
}

.container {
	width: 350px;
	padding: 4px 8px;
	outline: none;
	display: inline;
	text-align: center;
}

//Grid
 .new-deal{
    width:100%;
    float:left;
    padding:15px 0;}
.new-deal .item-slide{
    position: relative;
    overflow: hidden;
    transition:all .5s ease;
    -moz-transition:all .5s ease;
    -webkit-transition:all .5s ease;
    margin:15px 0;}
.new-deal .slide-hover{ 
    position: absolute;
    height: 100%;
    width: 100%;left: -100%; 
    background:rgba(0,0,0,.5);
    top: 0;
    transition:all .5s ease;
    -moz-transition:all .5s ease;
    -webkit-transition:all .5s ease;
    -moz-border-radius: 5px; 
    border-radius: 5px;
    -webkit-border-radius: 5px;  }
.new-deal .item-slide:hover .slide-hover{left:0px;}
.new-deal img{max-width:100%;}
.text-wrap {
    position: absolute;
    bottom: 0;
    left: 0;
    width: 100%;
    color: #fff;
    background: rgba(0, 0, 0, .5);
    z-index:999;
    transition:all .5s ease;
    -moz-transition:all .5s ease;
    -webkit-transition:all .5s ease;}
.text-wrap h4{padding:0 5px;}
.box-img{
    width: 100%;   
    float: left;   
     -moz-border-radius: 5px; 
     border-radius: 5px;
     -webkit-border-radius: 5px;   
     overflow: hidden;    
     border: 1px solid #ccc;}
.text-wrap .desc{width:50%;float:left;padding:0 5px;}
.text-wrap p{
    padding: 15px;
    font-size: 15px;
    text-align: center;
    font-weight: normal;
    text-shadow: 2px 2px 3px #000;}
.text-wrap .desc h4{margin:0px;font: 400 17px/21px "Roboto";}
.text-wrap .desc h3{margin:0px;font: 400 32px/36px "Roboto";}
.new-deal .item-slide:hover .text-wrap{background:none}
.book-now-c {float:right;padding:10px;}
.book-now-c a {
    background: #029a8b;
    color: #fff;
    padding: 5px;
    border-radius: 5px;
    margin-top:0px;
    float: left;
    min-width: 101px;
    text-align: center;
    font-size: 16px;}
.new-deal .item-slide:hover .box-img .text-wrap{bottom:-100%;} 


</style>
</head>
<body background="resources/images/">