package com.app.client;

import javax.ws.rs.core.MediaType;

import com.app.util.CodecUtil;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class RestClient {

	//============Save Item in Vendor DB=============
	public static String connectToProviderToSaveItem(String json){
		String url="http://localhost:8084/Online_Shopping_Cart/rest/itemService/saveItem";
		String un="rajeshtnb14@gmail.com";
		String pwd="53a920";
		String token="8ccd0b43";
		String msg=null;
		try {
			Client c=Client.create();
			WebResource r=c.resource(url);

			ClientResponse cr=r.type(MediaType.APPLICATION_JSON)
								.header("user",un)
								.header("password", CodecUtil.doEncode(pwd))
								.header("token", CodecUtil.doEncode(token))
								.post(ClientResponse.class, json);
			msg=cr.getEntity(String.class);

		} catch (Exception e) {
			e.printStackTrace();
		}

		return msg;
	}
	
	//============Save Seller in Vendor DB=============
	public static String connectToProviderToSaveSeller(String json){
		String url="http://localhost:8084/Online_Shopping_Cart/rest/sellerService/saveSeller";
		String msg=null;
		try {
			Client c=Client.create();
			WebResource r=c.resource(url);

			ClientResponse cr=r.type(MediaType.APPLICATION_JSON).post(ClientResponse.class, json);
			msg=cr.getEntity(String.class);

		   } catch (Exception e) {e.printStackTrace();}
		return msg;
	  }
	
	//============Login Seller in Vendor DB=============
	public static String connectToProviderToLoginSeller(String sellerEmail,String Pwd){
		String url="http://localhost:8084/Online_Shopping_Cart/rest/sellerService/loginSeller";
		String un=sellerEmail;
		String pwd=Pwd;
		String msg=null;
		try {
			Client c=Client.create();
			WebResource r=c.resource(url);

			ClientResponse cr=r.type(MediaType.APPLICATION_JSON)
								.header("user",un)
								.header("password", CodecUtil.doEncode(pwd))
								.post(ClientResponse.class);
			msg=cr.getEntity(String.class);

		   } catch (Exception e) {
			e.printStackTrace();
		   }
		return msg;
	  }

	//============Logout=============================
	
	
	
	
	
	
		
	//============Save Consumer in Vendor DB=============
		public static String connectToProviderToSaveConsumer(String json){
			String url="http://localhost:8084/Online_Shopping_Cart/rest/consumerService/saveConsumer";
			String msg=null;
			try {
				Client c=Client.create();
				WebResource r=c.resource(url);

				ClientResponse cr=r.type(MediaType.APPLICATION_JSON).post(ClientResponse.class, json);
				msg=cr.getEntity(String.class);

			   } catch (Exception e) {e.printStackTrace();}
			return msg;
		  }
		
	//============Login Seller in Vendor DB=============
		public static String connectToProviderToLoginConsumer(String consEmail,String Pwd){
			String url="http://localhost:8084/Online_Shopping_Cart/rest/consumerService/loginConsumer";
			String un=consEmail;
			String pwd=Pwd;
			String msg=null;
			try {
				Client c=Client.create();
				WebResource r=c.resource(url);

				ClientResponse cr=r.type(MediaType.APPLICATION_JSON)
									.header("user",un)
									.header("password", CodecUtil.doEncode(pwd))
									.post(ClientResponse.class);
				msg=cr.getEntity(String.class);

			   } catch (Exception e) {
				e.printStackTrace();
			   }
			return msg;
		  }

	//============Logout=============================
	
	
	
	
	
}
