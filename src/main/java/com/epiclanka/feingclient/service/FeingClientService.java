package com.epiclanka.feingclient.service;

import org.springframework.stereotype.Service;

import com.epiclanka.feingclient.domain.AccountDetailsReq;
import com.epiclanka.feingclient.domain.AccountDetailsRes;

@Service
public interface FeingClientService {

	public AccountDetailsRes getAccountDetailsByFeingClient(AccountDetailsReq accountDetailsReq);
	
}
