package com.app.service;

import com.app.model.Consumer;

public interface IConsumerService {
	
    public String saveConsumer(Consumer cons);

	public String getConsumerByUmailAndPwd(String consEmail,String Pwd);
	
}
