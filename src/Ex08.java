//Verificar Palíndromo
//Peça ao usuário para inserir uma palavra e determine se
// é um palíndromo
// (se pode ser lida da mesma forma da esquerda para a
// direita e vice-versa).

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner grava = new Scanner(System.in);
        String palavra;
        String reverse = "";
        System.out.println("Programa Sobre Palíndromo");
        System.out.print("Digite uma Frase: ");
        palavra = grava.nextLine().replace(" ","");

        for (int i = (palavra.length() - 1); i >= 0; i --){
                reverse += palavra.charAt(i);
        }


        if (reverse.toLowerCase().equals(palavra.toLowerCase())){
            System.out.println("É uma palavra Palíndroma");
        }else {
            System.out.println("Não é Palíndromo");
        }
        System.out.println("Palavra em Ordem: "+palavra);
        System.out.println("Palavra Reversa: "+reverse);
    }
}
