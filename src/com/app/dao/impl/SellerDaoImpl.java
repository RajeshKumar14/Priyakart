package com.app.dao.impl;
import org.springframework.stereotype.Repository;

import com.app.client.RestClient;
import com.app.dao.ISellerDao;
import com.app.model.Seller;
import com.app.util.JsonUtil;

@Repository
public class SellerDaoImpl implements ISellerDao{
     
	
	@Override
	public String saveSeller(Seller seller) {
		
		//1.convert obj to json
		 String json=JsonUtil.convertObjToJson(seller);
			
		//2.get response msg back
		  return RestClient.connectToProviderToSaveSeller(json);
	}
	

}
