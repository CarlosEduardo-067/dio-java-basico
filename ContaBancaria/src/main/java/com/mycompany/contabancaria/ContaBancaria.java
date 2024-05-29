/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.contabancaria;

import com.mycompany.contabancaria.Cliente.Cliente;
import com.mycompany.contabancaria.Conta.Conta;
import com.mycompany.contabancaria.Conta.ContaCorrente;
import com.mycompany.contabancaria.Conta.ContaPoupanca;

/**
 *
 * @author carlo
 */

public class ContaBancaria {

	public static void main(String[] args) {
		Cliente venilton = new Cliente();
		venilton.setNome("Venilton");
		
		Conta cc = new ContaCorrente(venilton);
		Conta poupanca = new ContaPoupanca(venilton);
                
		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
                
	}

}  