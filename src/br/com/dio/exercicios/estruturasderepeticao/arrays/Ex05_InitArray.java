package br.com.dio.exercicios.estruturasderepeticao.arrays;

public class Ex05_InitArray {
    public static void main(String[] args) {

        int array[];

        array = new int[10];

        System.out.printf("%s%s\n", "  Index  ", " Value");

        for (int counter = 0; counter < array.length; counter++)
            System.out.printf("%5d%8d\n", counter, array[counter]);

    }
}
