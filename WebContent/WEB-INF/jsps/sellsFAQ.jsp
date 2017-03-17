<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>FAQ</title>
<%@include file="sellsHeader.jsp" %>
<style>
#contents {
	width: 900px;
	height:auto;
	margin: 0 auto;
	padding:2px 2px;
	background-color:white;
}
ul#selling-faq{
        background:white;
        list-style-type:none;
        list-style-position:outside;
        list-style-image:url(../imgs/tick.png);
}
ul#selling-faq li{
    background:#E0F8F1;
    padding:5px;
    margin:10px;
	cursor:pointer;
	-webkit-border-radius: 5px 5px 5px 5px;
    border-radius: 5px 5px 5px 5px;
}
ul#selling-faq li:nth-child(2n):hover{
	 background:orange;
	-moz-transform : scale(1.0084);
    -webkit-transform : scale(1.0084);
     transform : scale(1.0084);

    -moz-transition:background 1s ease-in;
    -webkit-transition:background 1s ease-in;
    transition:background 1s ease-in;
   }   
ul#selling-faq li.x{
      list-style-image:url(../imgs/cross.png);
     }
 h3{color:#4c0080;}
</style>

<section id="contents">
<br><h3>Getting Started :</h3>
  <ul id='selling-faq'>
      <li>Why should I sell on Priyakart</li>
      <li></li>
      <li></li>
      <li></li>
      <li></li>
      <li class='x'></li>
      <li class='x'></li>
  </ul>
<h3>Pricing & Payment :</h3>
  <ul id='selling-faq'>
      <li>Who decide the price of the Product?</li>
      <li></li>
      <li></li>
      <li></li>
      <li></li>
  </ul>
<h3>Listing & Catalogs :</h3>
  <ul id='selling-faq'>
      <li>What is the Listing?</li>
      <li></li>
      <li></li>
      <li></li>
      <li></li>

  </ul>
<h3>Oder Management & Shipping :</h3>
  <ul id='selling-faq'>
      <li>Who take care of delivery of my product?</li>
      <li></li>
      <li></li>
      <li></li>
      <li></li>

  </ul>
<h3>Returns & Seller Protection :</h3>
  <ul id='selling-faq'>
      <li>What protection does Priyakart offer in case of lost/damaged goods and fraudulent Customer Claims? </li>
      <li></li>
      <li></li>
      <li></li>
      <li></li>
  </ul>
  <br>
</section>

<%@include file="sellsFooter.jsp" %>
   
