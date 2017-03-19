package com.app.dao;

import com.app.model.Consumer;

public interface IConsumerDao {
	
    public String saveConsumer(Consumer cons);
    public String getConsumerByUmailAndPwd(String consEmail,String Pwd);
	
}
