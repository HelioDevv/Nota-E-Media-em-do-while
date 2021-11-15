package br.com.dio.exercicios.loops;

import java.util.Scanner;

public class Ex3_MaiorEMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num; // Variável que irá receber o número digitado;
        int maior =0; //Variável para receber o maior número digitado;
        int soma =0; //Variável para receber a soma entre os números digitados;

        int cont = 0; //Variável auxiliar para contagem, realizando o loop;
        do{                     //Estrutura "do" de repetição para operações maiores;
            System.out.println("Digite um número: ");
            num = scan.nextInt();

            soma = soma + num;

            if (num > maior) maior = num;

            cont = cont + 1;
            System.out.println("O maior n° até o momento é: " + maior);
        }while(cont < 5);
        System.out.println("###");
        System.out.println("O maior número digitado no loop foi: " + maior);
        System.out.println("A média dos n° digitados é: " + (soma/5));
    }
}
