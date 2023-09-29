// Contagem Regressiva
//Peça ao usuário para inserir um número e faça
// uma contagem regressiva a partir desse número até 1.
import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
    Scanner grava = new Scanner(System.in);
    int n;
        System.out.println("****Programa de Contagem Regressiva****");
    System.out.print("Digite o numero para executar a contagem: ");
    n = grava.nextInt();
    for(int i = n; i >= 0; i--)
        {
            System.out.print(i + " ");
        }

    }

}
