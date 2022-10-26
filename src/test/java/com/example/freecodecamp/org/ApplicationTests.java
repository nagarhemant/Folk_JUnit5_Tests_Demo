package com.example.freecodecamp.org;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class ApplicationTests {

	private Calculator c=new Calculator();
	@Test
	void contextLoads() {
	}

	@Test
	void testSum(){
		int expectedResult=21;
		int actualResult=c.doSum(6,6,9);

		assertThat(actualResult).isEqualTo(expectedResult);
	}

	@Test
	void testProduct(){
		int expectedResult=36;
		int actualResult=c.doProduct(4,9);
		assertThat(actualResult).isEqualTo(expectedResult);
	}

	@Test
	void compareTwoNumbers(){

		Boolean actualResult=c.compareTwoNumbers(9,18);
		assertThat(actualResult).isTrue();

	}


}
