/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.exemplo.ocp;

import io.solid.ocp.Frete;
import io.solid.ocp.Produto;
import io.solid.ocp.TabelaDePrecoAPrazo;
import io.solid.ocp.TabelaDePrecoAVista;

/**
 *
 * @author Usuario
 */
public class CalculadoraDePreco {
    
     public double calcula(Produto produto) {

        Frete frete = new Frete();
        double desconto = 0d;
        
        int regra = 1;
        
        switch(regra) {
	        case 1:
	        	System.out.println("Venda à vista");
	        	TabelaDePrecoAVista tabela1 = new TabelaDePrecoAVista();
	        	desconto = tabela1.calculaDesconto(produto.getValor());
	        	break;
	        case 2:
	        	System.out.println("Venda à prazo");
	        	TabelaDePrecoAPrazo tabela2 = new TabelaDePrecoAPrazo();
	        	desconto = tabela2.calculaDesconto(produto.getValor());
	        	break;
        }
        
        double valorFrete = frete.calculaFrete(produto.getEstado());
        return produto.getValor() * (1 - desconto) + valorFrete;
    }
    
}
