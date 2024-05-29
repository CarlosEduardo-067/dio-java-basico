/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.contabancaria.Conta;

import com.mycompany.contabancaria.Cliente.Cliente;
import java.util.Scanner;

/**
 *
 * @author carlo
 */

public abstract class Conta implements IConta {
	
	
	private static int SEQUENCIAL = 1;

	protected int agencia;
	protected int numero;
	protected double saldo;
	protected Cliente cliente;
        protected String instituicao;
        protected double limiteSaquePorDia;
        
        
        Scanner ler = new Scanner(System.in);

	public Conta(Cliente cliente) {
                this.agencia = gerarAgencia();
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
	}

	@Override
	public void sacar(double valor) {
		saldo -= valor;
	}

	@Override
	public void depositar(double valor) {
		saldo += valor;
	}

	@Override
	public void transferir(double valor, IConta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
	}

	public int getAgencia() {
		return agencia;
	}
        
        public String getInstituicao() {
                return instituicao;
        }

	public int getNumero() {
		return numero;
	}

        protected void setInstituicao(String instituicao) {
                this.instituicao = instituicao;
        }

	public double getSaldo() {
		return saldo;
	}

	protected void imprimirInfosComuns() {
		System.out.println(String.format("Titular: %s", this.cliente.getNome()));
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Numero: %d", this.numero));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
		System.out.println(String.format("Instituição: %s", this.instituicao));
		System.out.println(String.format("Limite de Saque: %.2f", this.limiteSaquePorDia));
	}

        private int gerarAgencia() {
       
        System.out.println("Digite o nome da instituição");
        String instituicao = ler.next();
        setInstituicao(instituicao); // Definindo a instituição
        
        switch (instituicao) {
            case "Nubank":
                agencia = 55;
                limiteSaquePorDia = 1000;
                break;
            case "Picpay":
                agencia = 44;
                limiteSaquePorDia = 2000;
                break;
            case "Inter":
                agencia = 33;
                limiteSaquePorDia = 1500;
                break;
            default:
                System.out.println("Agencia não existente!");
        }
        
        return this.agencia;
    }
}