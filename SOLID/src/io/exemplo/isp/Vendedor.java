/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.exemplo.isp;

/**
 *
 * @author Usuario
 */
public class Vendedor extends Funcionario {

    private double salario;
    private int totalVendas;

    public Vendedor(double salario, int totalVendas) {
        this.salario = salario;
        this.totalVendas = totalVendas;
    }

    @Override
    public double getSalario() {
        return this.salario + this.getComissao();
    }

    @Override
    public double getComissao() {
        return this.totalVendas * 0.2;
    }

}
