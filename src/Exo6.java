// Média de Números
//Peça ao usuário para inserir uma série de
// números e calcule a média deles.

import java.util.Scanner;

public class Exo6 {
    public static void main(String[] args) {
        Scanner grava = new Scanner(System.in);
        double n1, n2,n3,n4 , media;
        System.out.println("Programa de Calculo de media escolar");
        System.out.print("Informe a primeira nota do aluno:  ");
        n1 = grava.nextDouble();
        System.out.print("Informe a Segunda nota do aluno: ");
        n2 = grava.nextDouble();
        System.out.print("infrome a Terceira nota do aluno: ");
        n3 = grava.nextDouble();
        System.out.print("informe  a Quarta nota do aluno: ");
        n4 = grava.nextDouble();
        media = (n1+n2+n3+n4) / 4;
        System.out.println("Com a nota de "+n1+" e "+n2+" e "+n3+ " e "+n4+"\n a média do aluno sera: "+media);
    }
}
