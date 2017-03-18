package com.app.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.client.RestClient;
import com.app.dao.ISellerDao;
import com.app.model.Seller;
import com.app.util.JsonUtil;

@Repository
public class SellerDaoImpl implements ISellerDao{
     
	@Autowired
	private RestClient rc;
	
	
	@Override
	public String saveSeller(Seller seller) {
		
		//1.convert obj to json
		 String json=JsonUtil.convertObjToJson(seller);
			
		//2.get response msg back
		  return rc.connectToProviderToSaveSeller(json);
	}
	

}
