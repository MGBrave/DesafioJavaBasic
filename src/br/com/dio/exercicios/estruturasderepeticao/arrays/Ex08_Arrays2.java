package br.com.dio.exercicios.estruturasderepeticao.arrays;

public class Ex08_Arrays2 {
    public static void main(String[] args) {
        int num = 5, count = 1;
        do {
            num += count;
            System.out.println(num);
        } while (count <= 3);
    }
}
