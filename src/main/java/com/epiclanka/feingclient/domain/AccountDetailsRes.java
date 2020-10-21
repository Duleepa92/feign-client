/**
 * 
 */
package com.epiclanka.feingclient.domain;

import java.util.List;

/**
 * @author duleepa_w
 *
 */
public class AccountDetailsRes {
	
	private List<AccountDetails> accountList;
	private String responsecode;
	private String totalAmount;
	private String responseerror;
	public List<AccountDetails> getAccountList() {
		return accountList;
	}
	public void setAccountList(List<AccountDetails> accountList) {
		this.accountList = accountList;
	}
	public String getResponsecode() {
		return responsecode;
	}
	public void setResponsecode(String responsecode) {
		this.responsecode = responsecode;
	}
	public String getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}
	public String getResponseerror() {
		return responseerror;
	}
	public void setResponseerror(String responseerror) {
		this.responseerror = responseerror;
	}
	
	
}
