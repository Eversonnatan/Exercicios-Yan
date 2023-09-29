//1: Soma de Dois Números
//Peça ao usuário para inserir dois números e exiba a soma deles.

import java.util.Scanner;

public class Ex01 {
    public static void main(String[]args){
        Scanner grava = new Scanner(System.in);
        int n1,n2,soma;
        System.out.println("Faça a somatório de dois numeros");
        System.out.print("Digite o primeiro valor: ");
        n1 = grava.nextInt();
        System.out.print("Digite o segundo valor: ");
        n2 = grava.nextInt();
        soma = n1 + n2;
        System.out.print("A soma entre "+n1+" e "+n2+" é : "+soma);
    }
}
