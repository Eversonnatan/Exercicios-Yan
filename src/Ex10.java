//Adivinhação de Números
//Crie um jogo onde o computador escolhe um número aleatório entre 1 e 100,
// e o usuário tem que adivinhar o número.
// O programa deve dar dicas se o número é maior ou menor, até que o usuário acerte.

import java.util.Scanner;
import java.util.Random;
public class Ex10 {
    public static void main(String[] args) {
        Scanner grava = new Scanner(System.in);
        Random gerador = new Random();
        int numeroCPU ,jogadaUsuario,op;
        String nome;
        System.out.println("****Seja bem Vindo****\n Ao Desafio descubra o numero que Eu estou pensando...");
        System.out.print("Qual é seu nome? ");
        nome = grava.next();
        System.out.println("Olá "+nome+ " Quer jogar comigo? ");
        System.out.println("[ 1 ] SIM  [ 2 ] NÃO");
        System.out.print("Digite a Sua opção: ");
        op = grava.nextInt();



            if (op == 1) {
                System.out.println("Assim que Eu Gosto não corre dos Desafios !!");
                System.out.println("Irei Pensar em um Número entre 0 e 100 \n Tente Advinhar!");
                numeroCPU = gerador.nextInt(101);

                System.out.print("Pronto já Pensei , Pode arriscar seu Palpite: ");

                do {

                    jogadaUsuario = grava.nextInt();
                if (jogadaUsuario < numeroCPU) {
                    System.out.println("Pensei em um Número Maior que esse!!");
                    System.out.print("Tente novamente: ");
                    //System.out.println(numeroCPU);

                } else if (jogadaUsuario > numeroCPU) {
                    System.out.println("Pensei em um Número Menor que esse!! não Desista");
                    System.out.print("Tente novamente: ");
                    //System.out.println(numeroCPU);

                } else if (jogadaUsuario == numeroCPU) {
                    System.out.println("Acertou Eu pensei no " +numeroCPU+
                            " ! Que Orgulho!! \nAgora pode entrar no Melhor dos Mundos...");


                }
            }
            while (jogadaUsuario != numeroCPU) ;
        }
        else if (op == 2){
            System.out.println("Tudo bem "+nome+" Desculpe o incomodo.");
        }
        else {
                System.out.println("Opção Invalida!");
            }

    }
}
