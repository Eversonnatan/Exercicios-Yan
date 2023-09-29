// Verificar Número Par ou Ímpar
//Peça ao usuário para inserir um número e determine se é par ou ímpar.

import java.util.Scanner;
public class Ex02 {
    public static void main(String[] args) {
     Scanner grava = new Scanner(System.in);
     int n;
     System.out.println("Descubra se o valor digitado é Par ou impar");
     System.out.print("Digite o valor desejado: ");
     n = grava.nextInt();

    if (n % 2 == 0){
        System.out.print("O número digitado é Par");
    }
    else{
        System.out.print("O numero digitado é impar");
        }
    }
}
