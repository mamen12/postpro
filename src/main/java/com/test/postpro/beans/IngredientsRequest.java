package com.test.postpro.beans;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class IngredientsRequest {

	
	private String name;
	
	private BigDecimal  ammount;
	
	private String unit;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getAmmount() {
		return ammount;
	}

	public void setAmmount(BigDecimal ammount) {
		this.ammount = ammount;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}
	
	
}
