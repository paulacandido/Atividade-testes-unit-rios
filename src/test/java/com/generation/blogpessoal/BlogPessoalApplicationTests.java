package com.generation.blogpessoal;


import javax.validation.ConstraintViolationException;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)   
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)

public class BlogPessoalApplicationTests {

	
	@Autowired
	private TestRestTemplate testRestTemplate;
	
	
	
	@Test
	public void deveTodasPostagens() {
		ResponseEntity<String> resposta = testRestTemplate.exchange("/postagens/",HttpMethod.GET,null, String.class);
		Assert.assertEquals(HttpStatus.OK, resposta.getStatusCode());
	}
	
	
	 
	

	
}