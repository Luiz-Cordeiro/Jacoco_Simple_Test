package com.coverage.Code_coverage;

/**
 * Hello world!
 *
 */
public class App 
{
    public int calcula_taxa_desconto(String tipo_cliente, double valor_compra) {
    	int taxa = 0;
    	
    	if(valor_compra >= 500 || tipo_cliente == "ouro")
    		taxa = 15;
    	else
    		if(valor_compra >= 400 || tipo_cliente == "prata")
    			taxa = 10;
    		else
    			if(valor_compra>=200 || tipo_cliente == "bronze")
    				taxa = 5;
    
    	return taxa;
    }
}
