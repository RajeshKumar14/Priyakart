package com.app.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.ISellerDao;
import com.app.model.Seller;
import com.app.service.ISellerService;

@Service
public class SellerServiceImpl implements ISellerService{

	@Autowired
	private ISellerDao dao;
	
	@Override
	public String saveSeller(Seller seller) {
		return dao.saveSeller(seller);
	}
	
}
