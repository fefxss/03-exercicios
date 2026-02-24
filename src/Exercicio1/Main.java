package Exercicio1;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Random rd = new Random();
        Conta conta = new Conta();
        double valor;

        System.out.println("Nome do correntista: ");
        conta.correntista = entrada.next();
        conta.numero = rd.nextInt(1000,9999);

        System.out.println("Saldo inicial: R$" + conta.saldo);

        //depósito
        System.out.println("Informe o valor para depósito: R$");
        valor = entrada.nextDouble();
        conta.depositar(valor);

        //saque
        System.out.print("Informe o valor para saque: R$ ");
        valor = entrada.nextDouble();
        conta.sacar(valor);
        System.out.println("Saldo atual: R$" + conta.saldo);
    }
}
