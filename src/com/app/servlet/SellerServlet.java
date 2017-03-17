package com.app.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app.client.RestClient;
import com.app.model.Seller;
import com.app.util.JsonUtil;

public class SellerServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		try{
			//1.reading params
			String firstName=request.getParameter("firstName");
			String lastName=request.getParameter("lastName");
			String email=request.getParameter("email");
			String mobileNo=request.getParameter("mobileNo");
			
			//2.create object(empty)
			 Seller seller=new Seller();
			 
			//4.set the values
			 seller.setFirstName(firstName);
			 seller.setLastName(lastName);
			 seller.setEmail(email);
			 seller.setMobileNo(mobileNo);
			 
			//5.convert obj to json
			 String json=JsonUtil.convertObjToJson(seller);
				
			//6.get response msg back
			  String msg=RestClient.connectToProviderToSaveSeller(json);
			  request.setAttribute("msg",msg);
	
			//7.dispatch to UI
			  request.getRequestDispatcher("SellerReg").forward(request, response);	
			
		}catch (Exception e) {e.printStackTrace();}
	}

}
