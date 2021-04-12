package com.generation.blogpessoal;

import javax.validation.ConstraintViolationException;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;
@RunWith(SpringRunner.class) 
@DataJpaTest //melhor testador de JPA
 
public class BlogPessoalApolicationTestsModel {
	private TemaModel tema; 
	@Autowired 
	private TemaRepository temaRepository; 
	@Before 
	public void start() { 
	tema = new TemaModel(null,5); } 
	 
	
	@Rule 
	public ExpectedException esperadaExcecao = ExpectedException.none(); 
	@Test 
	public void salvarDescricaoNulo() throws Exception { 
	esperadaExcecao.expect(ConstraintViolationException.class); esperadaExcecao.expectMessage("Sem Descricao"); 
	tema.setDescricao(null); 
	temaRepository.save(tema); 
	} 
}
