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
public class Desenvolvedor extends Funcionario {

    private double salario;

    public Desenvolvedor(double salario) {
        this.salario = salario;
    }

    @Override
    public double getSalario() {
        return this.salario;
    }

    @Override
    public double getComissao() {
        return 0d;
    }

}
