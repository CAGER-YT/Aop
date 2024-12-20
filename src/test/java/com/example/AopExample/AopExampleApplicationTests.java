package com.example.AopExample;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AopExampleApplicationTests {

	@Autowired
	UserController us;
	@Test
	void contextLoads() {
	}

	@Test
	void testUserController(){
		String result = us.getName("John123", 25);
		System.out.println(result);

	}
}
