package com.test.postpro.beans;


public class BaseResponse<T> extends Response<T> {

	private String codeError;

	public String getCodeError() {
		return codeError;
	}

	public void setCodeError(String codeError) {
		this.codeError = codeError;
	}
	
	
	
}
