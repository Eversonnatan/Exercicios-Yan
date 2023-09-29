// Tabuada
//Peça ao usuário para inserir um número e
// exiba a tabuada desse número de 1 a 10.

import java.util.Scanner;

public class Exo7 {
    public static void main(String[] args) {
        Scanner grava = new Scanner(System.in);
        int n;
        int result = 0;
        int mult = 0;
        System.out.println("***Tabuada de 0 a 10 ***");
        System.out.print("Informe o valor desejado: ");
        n = grava.nextInt();
        for (int i = 0; i < 10; i ++){
            result = n * ++mult;
            System.out.println(n + " x " + mult + " = " +result);

        }
    }
}
