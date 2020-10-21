/**
 * 
 */
package com.epiclanka.feingclient.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.epiclanka.feingclient.domain.AccountDetailsReq;
import com.epiclanka.feingclient.domain.AccountDetailsRes;

import feign.Headers;

/**
 * @author duleepa_w
 *
 */

@Service
@CrossOrigin
@FeignClient(name = "get-account-details", url = "http://your-url:8243")
public interface ApiClient {

	@Headers({"Content-Type : application/json","c_mf_version : 1.00","c_app_id : 1","c_channel_type : 3","c_uid : 3234234234234","c_trans_date : 14-08-2018 9:30:16 AM","c_private_data : 0","Authorization: Bearer 8f4f4450-ecc1-3dda-a91a-a3c6bf9ebcf5","c_trans_type : 4"})
	@RequestMapping(method = RequestMethod.POST, value = "/core/account_detail", consumes = "application/json")
	AccountDetailsRes getAccountDetails(AccountDetailsReq accountDetailsReq);
	
}
