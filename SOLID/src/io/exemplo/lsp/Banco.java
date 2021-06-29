/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.exemplo.lsp;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class Banco {
    
     public static void main(String[] args) {
		
	List<ContaCorrenteComum> listaDeContas = new ArrayList<>();
	listaDeContas.add(new ContaCorrenteComum());
	listaDeContas.add(new ContaSalario());
		
	for (ContaCorrenteComum conta : listaDeContas) {
            conta.rende();

            System.out.println("Novo Saldo:");
            System.out.println(conta.getSaldo());
        }
    }
    
}
