package com.test.postpro.service.impl;

import org.springframework.stereotype.Service;

import com.test.postpro.beans.FoodsDTO;
import com.test.postpro.model.Food;
import com.test.postpro.service.IFoodsService;

@Service
public class FoodsServiceImpl  implements IFoodsService{

	@Override
	public Food saveFood(FoodsDTO dto) {
		Food food = new Food(dto);
		return food;
	}
}
