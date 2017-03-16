<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Consumer</title>

<!-- Start of home_header_wrapper -->
<header id="home_header_wrapper">
  <div id="home_header"> 
      <nav id='item_top_menu'>
        <ul>
          <li><a href="seller">Sell on Priyakart</a></li>
          <li><a href="#">GiftCard </a></li>
          <li><a href="#">Customer Care </a></li>
          <li><a href="#">Track Order</a></li>
          <li><a href="regConsumer">SignUp </a></li>
          <li><a href="loginConsumer">LogIn </a></li>
        </ul>
      </nav>
	
	  <div id="priyakart_title">
        <h1><a href="ItemHome.jsp"><img  width="149" src="../imgs/logo.png" alt="Priyakart" /></a></h1>
      </div>
	  <div id="item_search_box">
          <form action="#" method="post">
              <input type="text"  id="item_search_input" placeholder="Search for Product,Brands and More">
              <button type="submit"  id="item_search_button" name="search"><img width="60" height="30" src="../imgs/search_icon.ico"/></button>
          </form>
	  </div>
	  <div id="item_cart_button">
	    <button type="submit" name="cart" value="CART" id="cart"><img width="60" height="30" src="../imgs/cart.png"/></button>
	 </div>
  </div> <!-- end of Home_header -->
</header> <!-- end of Home_header_wrapper -->

 <section id="content-wrapper">
   <div id="content">
	    <form name="consForm" action="insertCons" method="post"  onsubmit="return doValidateConsumerForm();">
		<table border="0" cellpadding="10" align="center">
			<tr><th colspan="2">Create a Priyakart Account</th></tr>
			
			<tr><td>Name</td><td><input type="text" size="20" name="consFirstName" placeholder="first name"/>
			        <input type="text" size="15" name="consLastName" placeholder="Last name"/><span id="consNameErr"></span></td>
			<tr><td>Email ID</td><td><input type="text" size="40" name="consEmail" placeholder="email address" /><span id="consEmailErr"></span></td></tr>
			<tr><td>Location</td>
			<td><select name="loc.locId">
			    <option value="">Select Any One Nearest Location</option>
                 <c:forEach items="${locListObj}" var="loc">
                 <option value="${loc.locId}"><c:out value="${loc.locName},${loc.locDist},${loc.locState} - ${loc.locPinCode}"/></option>
                 </c:forEach>
             </select><span id="consLocationErr"></span> </td></tr>
			<tr><td>Mobile No</td><td><input type="text"size="40" name="mobileNo" placeholder="mobile no"/><span id="consMobileErr"></span></td></tr>
			<tr><td>Birthday </td><td><input type="date" name="consDob" ></td>
	        <tr><td>Gender</td><td><input type="radio" name="consGender" value="Male" />Male 
		    <input type="radio" name="consGender" value="Female" />Female</td></tr>

			<tr><td colspan="2" align="center">
			   <input type="submit" value="Create Account">&nbsp; <br></td></tr>
		</table>
	  </form>
   </div> <!-- end of content -->
</section>
<%@include file="itemFooter.jsp" %>