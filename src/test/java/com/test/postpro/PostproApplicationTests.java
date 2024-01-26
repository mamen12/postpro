package com.test.postpro;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.test.postpro.constant.ApiResponse;

@SpringBootTest
class PostproApplicationTests {

	@Test
	void contextLoads() {
		
		ApiResponse rs = ApiResponse.valueOfErrorCode(1000);
		System.out.println(rs.getReason());
		
	}

}
