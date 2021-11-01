package com.coverage.Code_coverage;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    App app = new App();
    
    @Test
    public void teste1() {
    	//1a, 2b, 3a, 3b, 5a, 5b, 6, 7
    	assertEquals(5, app.calcula_taxa_desconto("bronze", 50));
    }
    
    @Test
    public void teste2() {
    	//1a, 2, 7
    	assertEquals(15, app.calcula_taxa_desconto("comum", 550));
    }
    
    @Test
    public void teste3() {
    	//1a, 1b, 3a, 4, 7
    	assertEquals(10, app.calcula_taxa_desconto("prata", 50));
    }
    
    @Test
    public void teste4() {
    	//1a, 1b, 3a, 3b, 5a, 6, 7
    	assertEquals(5, app.calcula_taxa_desconto("comum", 250));
    }
    
    @Test
    public void teste5() {
    	//Teste 1a, 1b, 2, 7
    	assertEquals(15, app.calcula_taxa_desconto("ouro", 50));
    }
    
    @Test
    public void teste6() {
    	//Teste 1a, 1b, 3a, 3b, 4, 7 
    	assertEquals(10, app.calcula_taxa_desconto("comum", 450));
    }
    
    @Test
    public void teste7() {
    	//Teste 1a, 1b, 3a, 3b, 5a, 5b, 6, 7 
    	assertEquals(5, app.calcula_taxa_desconto("bronze", 50));
    }
    
    @Test
    public void teste8() {
    	//Teste 1a, 1b, 3a, 3b, 5a, 5b, 6, 7 
    	assertEquals(0, app.calcula_taxa_desconto("comum", 50));
    }
    
}
