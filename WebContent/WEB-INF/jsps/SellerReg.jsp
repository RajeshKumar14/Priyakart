<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Register to SellerHub</title>
    <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css">
    <link href="http://fonts.googleapis.com/css?family=Cookie" rel="stylesheet" type="text/css">
    <link href='../css/design.css' type='text/css' rel='stylesheet'/>
    
<%@include file="sellerHeader.jsp" %>   
<section id="content-wrapper">
  <div id="content">
   <form name="sellerForm" action="insertSeller" method="POST">
	  <table border="0" cellpadding="10" align="center">
	   <tr><th colspan="2" align="center">Create a Seller Account </th></tr>
	   <tr><td>Name</td>
	   <td><input type="text"  name="firstName" size="15"  placeholder="first name"/>                
	       <input type="text"  name="lastName" size="10" placeholder="last name"/></td></tr>
	   <tr><td>Email Id</td>
	       <td><input type="text" name="email" size="30" placeholder="Email address"></td>	</tr>
	   <tr><td>Mobile No</td>
	       <td colspan="2" align="left"><input type="text" name="mobileNo" size="30" placeholder="mobile number"></td></tr>
	   <tr><td colspan="2" align="center"><button type="submit" name="sellerReg">Create Account</button><br></td></tr>
     </table>
   </form>
   <p align="right"><label>${msg}</label></p>
   </div> <!-- end of content -->
</section>
<%@include file="sellsFooter.jsp" %>
