package com.app.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.IConsumerDao;
import com.app.model.Consumer;
import com.app.service.IConsumerService;

@Service
public class ConsumerServiceImpl implements IConsumerService{

	@Autowired
	private IConsumerDao dao;
	
	@Override
	public String saveConsumer(Consumer cons) {
		return dao.saveConsumer(cons);
	}
	
	@Override
	public String getConsumerByUmailAndPwd(String consEmail, String Pwd) {
		
		return dao.getConsumerByUmailAndPwd(consEmail, Pwd);
	}
	
}
