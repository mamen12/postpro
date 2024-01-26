package com.test.postpro.model;

import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

import org.hibernate.annotations.UuidGenerator;

import com.test.postpro.beans.FoodsDTO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tbl_food")
public class Food implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@UuidGenerator
	@Column(name = "id_food", length = 36)
	private String idFood;
	private String name;
	
	@Column(name ="tutorial_link")
	private String tutorialLink;
	private String area;
	private String description;
	
	@Column(name = "created_at")
	private Date createdAt;
	
	@Column(name = "updated_at")
	private Date updateAt;
	
	
	public Food(String idFood, String name, String tutorialLink, String area, String description, Date createdAt,
			Date updateAt) {
		super();
		this.idFood = idFood;
		this.name = name;
		this.tutorialLink = tutorialLink;
		this.area = area;
		this.description = description;
		this.createdAt = createdAt;
		this.updateAt = updateAt;
	}
	
	public Food() {
		super();
	}
	
	public Food(FoodsDTO dto) {
		this.idFood = UUID.randomUUID().toString();
		this.name = dto.getName();
		this.tutorialLink = dto.getTutorialLink();
		this.area = dto.getArea();
		this.description = dto.getDescriptions();
		this.createdAt = new Date();
	}


	public String getIdFood() {
		return idFood;
	}
	public void setIdFood(String idFood) {
		this.idFood = idFood;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTutorialLink() {
		return tutorialLink;
	}
	public void setTutorialLink(String tutorialLink) {
		this.tutorialLink = tutorialLink;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public Date getUpdateAt() {
		return updateAt;
	}
	public void setUpdateAt(Date updateAt) {
		this.updateAt = updateAt;
	}
	
}
