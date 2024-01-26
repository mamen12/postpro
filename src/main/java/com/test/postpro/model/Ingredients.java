package com.test.postpro.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import org.hibernate.annotations.UuidGenerator;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tbl_ingredients")
public class Ingredients implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@UuidGenerator
	@Column(name = "id_ingre", length = 36)
	private String idIngredients;
	
	@Column(name="id_food", length = 36)
	private String idFood;
	
	private String name;
	private BigDecimal price;
	private Integer unit;
	
	@Column(name = "created_at")
	private Date createdAt;
	
	@Column(name = "updated_at")
	private Date updateAt;
	public String getIdFood() {
		return idFood;
	}
	public void setIdFood(String idFood) {
		this.idFood = idFood;
	}
	public String getIdIngredients() {
		return idIngredients;
	}
	public void setIdIngredients(String idIngredients) {
		this.idIngredients = idIngredients;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public Integer getUnit() {
		return unit;
	}
	public void setUnit(Integer unit) {
		this.unit = unit;
	}
	
	
}
