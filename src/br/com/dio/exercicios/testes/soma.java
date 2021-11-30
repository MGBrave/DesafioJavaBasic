package br.com.dio.exercicios.testes;
import java.util.Scanner;
// leia dois números inteiros e imprima a solução
public class soma {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // lê duas variáveis inteiras
        int a = in.nextInt();
        int b = in.nextInt();

        // escreve o resultado
        if (a > b)
            System.out.printf("%d\n", a);
        else
            System.out.printf("%d\n", b);
    }
}