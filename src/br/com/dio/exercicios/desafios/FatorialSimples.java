package br.com.dio.exercicios.desafios;
/* Ler um valor N. Calcular e escrever seu respectivo fatorial.
Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.

Entrada: A entrada contém um valor inteiro N (0 < N < 13).

Saída: A saída contém um valor inteiro, correspondente ao fatorial de N.


Exemplo de Entrada	                   Exemplo de Saída
4                                              24

Agradecimentos a Cassio F. */
import java.util.Scanner;

public class FatorialSimples {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int N = leitor.nextInt();
        int fat = 1;
        for (int i = 1; i <= N; i++) {
            fat *= i;
        }
        System.out.println(fat);

    }
}