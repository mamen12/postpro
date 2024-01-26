package com.test.postpro.beans;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class FoodsDTO {
	
	@JsonProperty(value = "id")
	private String idFood;
	
	@JsonProperty(value = "name")
	private String name;
	@JsonProperty(value = "tutorialLink")
	private String tutorialLink;
	@JsonProperty(value = "area")
	private String area;
	@JsonProperty(value = "descriptions")
	private String descriptions;
	
	@JsonProperty(value = "ingredients")
	private List<IngredientsRequest> ingredients;

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

	public String getDescriptions() {
		return descriptions;
	}

	public void setDescriptions(String descriptions) {
		this.descriptions = descriptions;
	}

	public List<IngredientsRequest> getIngredients() {
		return ingredients;
	}

	public void setIngredients(List<IngredientsRequest> ingredients) {
		this.ingredients = ingredients;
	}
	
	
	
}
