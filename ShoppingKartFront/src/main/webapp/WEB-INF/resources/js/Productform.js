/**
 * 
 */
function formProduct() {
			// Make quick references to our fields
			var productname = document.getElementById('productname');
			var description = document.getElementById('description');
			var category = document.getElementById('category');
			var supplier = document.getElementById('supplier');
			var stock = document.getElementById('stock');
			var Price = document.getElementById('price');
			if (notEmpty(productname, "productName Should not be empty")) {
				if (isAlphabet(productname,"Please enter only letters for product name")) {
					if (notEmpty(description, "Description Should not be empty")) {
						if (notEmpty(category, "Drop down Should not be empty for product")) {
							if (notEmpty(supplier,"Drop Down Should not be empty for supplier")) {
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