
<div class="container">
<div class="row " style="padding-left: 100px">

<div class="col-xs-12 col-md-4">


<!-- CREDIT CARD FORM STARTS HERE -->
<div class="panel panel-default credit-card-box">
<div class="panel-heading display-table" >
<div class="row display-tr" >
<h3 class="panel-title display-td" >Payment Details</h3>
<div class="display-td" >                            
<img class="img-responsive pull-right" src="http://i76.imgup.net/accepted_c22e0.png">
</div>
</div>                    
</div>
<div class="panel-body">
<form role="form" id="payment-form" action="ThankyouPage" method="post">
<div class="row">
<div class="col-xs-12">
<div class="form-group">
<label for="cardNumber">CARD NUMBER</label>
<div class="input-group">
<input type="tel" class="form-control" name="cardNumber" placeholder="Valid Card Number" autocomplete="cc-number"
pattern="[0-9][0-9]{4}" title="Cardnumber should have 5 digits" required autofocus />
<span class="input-group-addon"><i class="fa fa-credit-card"></i></span>
</div>
</div>                            
</div>
</div>
<div class="row">
<div class="col-xs-7 col-md-7">
<div class="form-group">
<label for="cardExpiry"><span class="hidden-xs">EXPIRATION</span><span class="visible-xs-inline">EXP</span> DATE</label>
<input type="tel" class="form-control" name="cardExpiry" placeholder="MM / YYYY" autocomplete="cc-exp" 
pattern="(0[1-9]|1[012])[-/.](20)\d\d" title="Date invalid" required />
</div>
</div>
<div class="col-xs-5 col-md-5 pull-right">
<div class="form-group">
<label for="cardCVC">CV CODE</label>
<input type="tel" class="form-control" name="cardCVC" placeholder="CVC" autocomplete="cc-csc"
pattern="[0-9][0-9]{2,3}" title="CV should have 3 or 4 digits" required />
</div>
</div>
</div>
<div class="row">
<div class="col-xs-12">
<div class="form-group">
<label for="couponCode">COUPON CODE</label>
<input type="text" class="form-control" name="couponCode" />
</div>
</div>                        
</div>
<div class="row">
<div class="col-xs-12">
<button class="btn btn-success btn-lg btn-block" type="submit">Checkout</button>
</div>
</div>
<div class="row" style="display:none;">
<div class="col-xs-12">
<p class="payment-errors"></p>
</div>
</div>
</form>
</div>
</div>            
<!-- CREDIT CARD FORM ENDS HERE -->
</div>            
</div>
</div>



<!-- <div style="margin-right:30%" align="center">
	<form:form class="form-group">

		<table align="center">
			<tr>
			<td colspan="2" align="center"><h3>Payment Details</h3></td>
			</tr>
			<tr>
				<td>Name on Card</td>
				<td>:</td>
				<td><input class="form-control" type="text" name="nameOnCard" id="nameOnCard"/>
				<td>
			</tr>
			<tr>
				<td>Card Number</td>
				<td>:</td>
				<td><input class="form-control" type="text" name="cardNumber" id="cardNumber"/></td>
			</tr>
			<tr>
				<td>Expiration Date</td>
				<td>:</td>
				<td>
				<script language="JavaScript" style="float: left;">
					document.write("<select class='form-control' name='month' style= 'width: 50%'>");
					document.write("<option>month</option>")
					for (var month = 01; month <= 12; month++) {
						document.write("<option>" + month + "</option>");
					}
					document.write("</select>");
				</script> </td><td>
				<script language="JavaScript" style="float: left;">
					document.write("<select class='form-control' name='years' style= 'width: 7em; margin-left: -7em; '>");
					document.write("<option>years</option>")
					for (var year = 2017; year <= 2025; year++) {
						document.write("<option>" + year + "</option>");
					}
					document.write("</select>");
</script></td>
			</tr>
			<tr>
				<td>Card CVV</td>
				<td>:</td>
				<td><input class="form-control" type="password" name="cvv" id="password"/>
			</tr>
			<tr>
				<td colspan="3" align="center"><input type="submit"
					value="Proceed" /></td>
			</tr>
		</table>
	</form:form>
</div>
 -->

	