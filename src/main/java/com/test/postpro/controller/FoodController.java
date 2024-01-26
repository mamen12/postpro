package com.test.postpro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.test.postpro.beans.FoodsDTO;
import com.test.postpro.beans.Request;
import com.test.postpro.beans.Response;

@RestController
public class FoodController {

	
	@Autowired

	
    @RequestMapping(value = "/foods", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public Response<FoodsDTO> addFoods(@RequestBody Request<FoodsDTO> rq){
		return null;
    }
	
}
