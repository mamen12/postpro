package com.test.postpro.constant;

import java.util.HashMap;
import java.util.Map;

public enum ApiResponse {

	// custom API response 
	SUCCESS(true, 0, null),
	FAILED_1000(false, 1000, "Missing field 'ingredients'"),
	FAILED_1001(false, 1001, "Field 'ingredients' cannot be empty "),
	FAILED_1002(false, 1002, "Missing field 'name'"),
	FAILED_1003(false, 1003, "Missing field 'tutorialLink'"),
	FAILED_1004(false, 1004, "Ingredients 1 missing field 'name'"),
	FAILED_1005(false, 1005, "Ingredients 2 missing field 'amount'"),
	FAILED_1006(false, 1006, "Ingredients 5 missing field 'unit'"),
	FAILED_1007(false, 1007, "Field 'tutorialLink' is not valid URL"),
	FAILED_1008(false, 1008, "Field 'tutorialLink' is not valid Youtube"),
	FAILED_1009(false, 1009, "Unit 'sheet' is not registered yet ");
	
			
	private static final Map<Integer, ApiResponse> BY_ATOMIC_NUMBER = new HashMap<>();
	
	private Boolean isOk;
	private Integer errorCode;
	private String reason;
	
	static {
        for (ApiResponse e : values()) {
            BY_ATOMIC_NUMBER.put(e.errorCode, e);
        }
    }
	
	private ApiResponse(String errorString) {
		ApiResponse rs = ApiResponse.valueOf(errorString);
		this.isOk = rs.getIsOk();
		this.errorCode = rs.getErrorCode();
		this.reason = rs.getReason();
	}
	
	private ApiResponse( Boolean isOk, Integer errorCode, String reason) {
		this.isOk = isOk;
		this.errorCode = errorCode;
		this.reason = reason;
	}
	

	public Boolean getIsOk() {
		return isOk;
	}

	public void setIsOk(Boolean isOk) {
		this.isOk = isOk;
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
	
	
	public static ApiResponse valueOfErrorCode(Integer errorCode) {
		return BY_ATOMIC_NUMBER.get(errorCode);
	}
	
}
