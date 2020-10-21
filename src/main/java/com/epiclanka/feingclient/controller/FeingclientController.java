/**
 * 
 */
package com.epiclanka.feingclient.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.epiclanka.feingclient.domain.AccountDetailsReq;
import com.epiclanka.feingclient.domain.AccountDetailsRes;
import com.epiclanka.feingclient.service.FeingClientService;

/**
 * @author duleepa_w
 *
 */

@RestController
public class FeingclientController {

	@Autowired
	private FeingClientService feingClientService;

	@PostMapping(consumes = "application/json", produces = "application/json")
	public ResponseEntity<AccountDetailsRes> otpRequest(@RequestBody AccountDetailsReq accountDetailsReq) {

		AccountDetailsRes accountDetailsRes = feingClientService.getAccountDetailsByFeingClient(accountDetailsReq);
		return new ResponseEntity<AccountDetailsRes>(accountDetailsRes, HttpStatus.OK);
	}

}
