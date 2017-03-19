
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 

<!-- Bootstrap Core CSS -->
    <link href="http://www.tutorialspoint.com/bootstrap/css/bootstrap.min.css" rel="stylesheet">
<!-- Custom CSS -->
    <link href="one-page-wonder.css" rel="stylesheet">
    <link href='../css/design.css' type='text/css' rel='stylesheet'/>

<style>
	#dyn{float:right;padding-right:0px;font-size:18px; color:white;}
	#error{float:right;padding-right:0px;font-size:18px;color:white;}
</style>
<!-- Start of seller_header_wrapper -->
<header id="sellerHome_header_wrapper">
  <div id="sellerHome_header"> 
	  <div id="seller_title">
        <h1><a href="priyakart"><img  width="169" height="70" src="../imgs/vdms-hub.jpg" alt="Home" /></a></h1>
      </div>
	   <nav id='seller_menu'>
        <ul>
          <li><a href="seller">Welcome</a></li>
          <li><a href="#">Listing</a></li>
          <li><a href="#">Order</a></li>
          <li><a href="#">Returns</a></li>
          <li><a href="#">Payments</a></li>
          <li><a href="#">Performance</a></li>
          <li><a href="#">Promotions</a></li>
          <li><a href="#">Advertising</a></li>
        </ul>
     </nav>
     <div  style="padding:20px;">
            <table border="0" >
             <tr><td>&emsp;
            <td>
				<c:choose>
				 <c:when test="${msg eq null}">
			     &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;<div id='error'>Invalid Log in Given</div>
				 </c:when>
				 <c:otherwise>
				  &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;<div id='dyn'>Hi <b> ${msg} !</b></div>
				 </c:otherwise>
			    </c:choose>
			 </td></tr>
          </table>
	  </div>
  </div> <!-- end of seller_header -->
</header> <!-- end of seller_header_wrapper -->


