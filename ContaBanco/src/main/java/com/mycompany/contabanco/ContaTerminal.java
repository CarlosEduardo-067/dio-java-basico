/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.contabanco;

import java.util.Scanner;

/**
 *
 * @author carlo
 */
public class ContaTerminal {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
         
        System.out.println("Informe o número da conta");
        int numero = ler.nextInt();
               
        System.out.println("Informe o nome da agência");
        String agencia = ler.next();
        
        System.out.println("Informe o nome do proprietário da conta");
        String nomeCliente = ler.next();
        
        System.out.println("Informe o saldo da conta");
        double saldo = ler.nextDouble();
        
        
        System.out.println("Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+ agencia +","
                + " conta "+ numero +" e seu saldo "+ saldo +" já está disponível para saque");
        
    }
}
