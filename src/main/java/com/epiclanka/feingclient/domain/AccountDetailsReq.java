/**
 * 
 */
package com.epiclanka.feingclient.domain;

/**
 * @author duleepa_w
 *
 */
public class AccountDetailsReq {

	private String mode;
	private String cif;
	private String accountNumber;
	
	public String getMode() {
		return mode;
	}
	public void setMode(String mode) {
		this.mode = mode;
	}
	public String getCif() {
		return cif;
	}
	public void setCif(String cif) {
		this.cif = cif;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	
	
}
