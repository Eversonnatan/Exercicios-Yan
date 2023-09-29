//4: Fatorial de um Número
//Peça ao usuário para inserir um número
// e calcule o fatorial desse número.

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner grava = new Scanner(System.in);
        int n , i = 1 ;
        long fatorial = 1;
        System.out.println("Calculo do Fatorial");
        System.out.print("Digite o Valor Desejado: ");
        n = grava.nextInt();

        while (i <= n){
            fatorial = fatorial * i;
            i++;
        }
        System.out.println("o fatorial de "+ n + " é " +fatorial);
    }
}


