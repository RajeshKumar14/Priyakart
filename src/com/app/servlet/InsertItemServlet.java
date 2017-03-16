package com.app.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.app.client.RestClient;
import com.app.model.Item;
import com.app.util.JsonUtil;

@SuppressWarnings("serial")
public class InsertItemServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		try{
			//1.reading params
			String itemname=request.getParameter("itemName");
			String itemcost=request.getParameter("itemCost");
			String marginvalue=request.getParameter("marginValue");
			
			//2.convert the values
			double itemCost=Double.parseDouble(itemcost);
			int marginValue=Integer.parseInt(marginvalue);
			
			//3.create object(empty)
			 Item item=new Item();
			 
			//4.set the values
			 item.setItemName(itemname);
			 item.setItemCost(itemCost);
			 item.setMarginValue(marginValue);
			 
			//5.convert obj to json
			 String json=JsonUtil.convertObjToJson(item);
				
			//6.get response msg back
			  String msg=RestClient.connectToProvider(json);
			  request.setAttribute("msg",msg);
				
			//7.dispatch to UI
			  request.getRequestDispatcher("Register.jsp").forward(request, response);	
			
		}catch (Exception e) {e.printStackTrace();}
	}

}
