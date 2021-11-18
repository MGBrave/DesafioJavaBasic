package br.com.dio.exercicios.estruturasderepeticao.arrays;
//Escreva um programa Java para somar valores de uma matriz.
public class Ex13 {
    public static void main(String[] args) {
        int my_array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;

        for (int i : my_array)
            sum += i;
        System.out.println("A soma é  " + sum);
    }
}
