package com.test.postpro.service;

import com.test.postpro.beans.FoodsDTO;
import com.test.postpro.model.Ingredients;

public interface IIngredientsService {

	
	public Ingredients saveIngredients(FoodsDTO dto);
}
