//Calculadora Simples
//Crie uma calculadora que permita aos
// usuários realizar operações de adição, subtração, multiplicação e divisão.

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner  grava = new Scanner(System.in);
        double n1, n2;
        double soma, subtracao, multiplicacao, divisao;
        int op;
        System.out.print("Digite o primeiro valor: ");
        n1 = grava.nextDouble();
        System.out.print("Digite o segundo valor: ");
        n2 = grava.nextDouble();

        System.out.println("***SELECIONE UMA OPERAÇÃO***");
        System.out.println("[1] - SOMA");
        System.out.println("[2] - SUBTRAÇÃO");
        System.out.println("[3] - MULTIPLICAÇÃO");
        System.out.println("[4] - DIVISAÕ");
        System.out.print("--------> Digite sua opção: ");
        op = grava.nextInt();

        switch (op){
            case 1:
                soma = n1 + n2;
                System.out.println("A soma é: "+soma);
                break;
            case 2:
                subtracao = n1 - n2;
                System.out.println("A Subtração é: "+subtracao);
                break;
            case 3:
                multiplicacao = n1 * n2;
                System.out.println("A Multiplicação é: "+multiplicacao);
                break;
            case  4:
                if(n1<n2){
                    System.out.println("Impossivel de realizar o calculo");

                }
                else {
                    divisao = n1 / n2;
                    System.out.println("A Divisão é: "+divisao);
                }
                break;

            default:
                System.out.println("OPERAÇÃO INVÁLIDA! TENTE NOVAMENTE");
        }


    }
}


