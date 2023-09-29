// Conversor de Temperatura
//Crie um programa que converta a temperatura de Celsius para Fahrenheit
// ou vice-versa, dependendo da escolha do usuário.

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner grava = new Scanner(System.in);
        double celsius , fahrenheit;
        int op;
        System.out.println("====* Digite a operação desejada *===");
        System.out.println("[ 1 ] Celsius para Fahrenheit");
        System.out.println("[ 2 ] Fahrenheit para Celsius");
        System.out.print("  Digite a sua opção: ");
        op = grava.nextInt();

    if(op==1) {
        System.out.print("Digite a temperatura em Celsius: ");
        celsius = grava.nextDouble();
        fahrenheit = (celsius * 1.8) + 32;
        System.out.println("Sua temperatura em Fahrenheit é "+fahrenheit+"F");
    } else if (op == 2) {
        System.out.print("Digite a temperatura em Fahreneit: ");
        fahrenheit = grava.nextDouble();
        celsius = ((fahrenheit - 32)*5 )/9;
        System.out.println("Sua temperatura em Celsius é: "+celsius);
    }
    else{
        System.out.println("Opção invalida ! tente Novamente");
    }
    }
}
