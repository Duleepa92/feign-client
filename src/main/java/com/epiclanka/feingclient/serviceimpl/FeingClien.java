/**
 * 
 */
package com.epiclanka.feingclient.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.epiclanka.feingclient.client.ApiClient;
import com.epiclanka.feingclient.domain.AccountDetailsReq;
import com.epiclanka.feingclient.domain.AccountDetailsRes;
import com.epiclanka.feingclient.service.FeingClientService;

/**
 * @author duleepa_w
 *
 */

@Service
public class FeingClien implements FeingClientService {

	@Autowired
	private ApiClient apiClient;

	public AccountDetailsRes getAccountDetailsByFeingClient(AccountDetailsReq accountDetailsReq) {

		AccountDetailsRes accountDetailsRes = apiClient.getAccountDetails(accountDetailsReq);
		System.out.println(accountDetailsRes);
		return accountDetailsRes;

	}

}
