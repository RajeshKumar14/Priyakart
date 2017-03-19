package com.app.service;

import com.app.model.Seller;

public interface ISellerService {
	
    public String saveSeller(Seller seller);

	public String getSellerByUmailAndPwd(String sellerEmail,String Pwd);
	
}
