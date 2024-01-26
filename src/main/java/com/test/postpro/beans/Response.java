package com.test.postpro.beans;

import com.test.postpro.constant.ApiResponse;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(Include.NON_NULL)
@JsonPropertyOrder({"isOk", "errorCode", "reason", "data"})
public class Response<T>{
	
	@JsonProperty(value = "isOk")
	private Boolean status;
	
	@JsonProperty(value = "errorCode")
	private Integer errorCode;
	
	@JsonProperty(value = "reason")
	private String reason;
	
	private T data;
	
	
	public Boolean getStatus() {
		return status;
	}


	public void setStatus(Boolean status) {
		this.status = status;
	}


	public Integer getErrorCode() {
		return errorCode;
	}


	public void setErrorCode(Integer errorCode) {
		this.errorCode = errorCode;
	}


	public String getReason() {
		return reason;
	}


	public void setReason(String reason) {
		this.reason = reason;
	}


	public T getData() {
		return data;
	}


	public void setData(T data) {
		this.data = data;
	}


	public void setStatusResponse(Integer errorCd) {
		ApiResponse rs = ApiResponse.valueOfErrorCode(errorCode);
		this.status = rs.getIsOk();
		this.errorCode  = rs.getErrorCode();
		this.reason = rs.getReason();
	}
	
	
	
}
