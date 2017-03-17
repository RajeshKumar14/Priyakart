
 <link href='../css/design.css' type='text/css' rel='stylesheet'/>
 
<style>
   table tr{font-family:courier new;font-weight:900;font-size:18px;}
   table tr td,input,button{
   font-family:arial;font-size:16px;
   }
   input,button{
   -webkit-border-radius: 3px 3px 3px 3px;
    border-radius: 3px 3px 3px 3px;}
</style>

<!-- Start of sellerHome_header_wrapper -->
<header id="sellerHome_header_wrapper">
  <div id="sellerHome_header"> 
	  <div id="seller_title">
        <h1><a href="priyakart"><img  width="169" height="70" src="../imgs/sellers-hub.jpg" alt="Home" /></a></h1>
      </div>
	   <nav id='seller_menu'>
        <ul>
         <li><a href="sells">HOME</a></li>
         <li><a href="pricing">PRICING</a></li>
         <li><a href="faq">FAQS</a></li>
         <li><a href="benefits">BENIFITS </a></li>
         <li><a href="priyakart">PRIYAKART.COM </a></li>
       </ul>
     </nav>
	  <div  style="padding:50px;">
         <form name="loginForm" action="loginSeller" method="post">
            <table>
              <tr><td >&emsp;&emsp;&emsp;<input type="text" size="22" name="sellerId" placeholder="Username or Email">
              <input type="password" size="18" name="password" placeholder="Password">
              <button type="submit" name="login">Log In</button></td></tr>
             </table>
          </form>
	  </div>
  </div> <!-- end of sellerHome_header -->
</header> <!-- end of sellerHome_header_wrapper -->
