package br.com.dio.exercicios.testes;

/*

 QUESTÃO
 Domingo é dia de feira. Logo de manhã muitas pessoas se deslocam para o
 parque da Redenção, onde acontece uma feira, conhecida por ser a
 maior da cidade. Na feira da Redenção você pode encontrar de tudo.
 Todos os domingos, Paula faz compras na feira. Ela sempre marca com seu
 amigo Jonas de se encontrarem no terminal de ônibus da Redenção às 8h,
 para irem juntos comprar na feira. Porém, muitas vezes jonas acorda muito
 tarde e se atrasa para o encontro com seu amigo.
 Sabendo que Jonas leva de 30 a 60 minutos para chegar ao terminal. Diga o
 atraso máximo de Jonas.

 ENTRADA
 A entrada consiste em múltiplos casos teste. Cada caso de tese contém uma
 única linha contendo um horário H (5:00 <= H <= 9:00) que Bino acordou. A
 entrada termina com final de arquivo (EOF).

 SAÍDA
 Para cada caso de teste, imprima "Atraso maximo: X" (sem aspas), X indica
 o atraso maximo (em minutos) de Bino no encontro com Cino.

*/

import java.io.IOException;
import java.util.Scanner;

public class Feira {

public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        while (leitor.hasNext()) {
        String[] relogio = leitor.nextLine().split(":");
        int hora = Integer.parseInt(relogio[0]);
        int min = Integer.parseInt(relogio[1]);
        switch (hora) {
        case(7): System.out.println("Atraso maximo: " + min); break;
        case(8): System.out.println("Atraso maximo: " + (60 + min)); break;
        case(9): System.out.println("Atraso maximo: " + (120 + min)); break;
default: System.out.println("Atraso maximo: 0");
        }
        }
        }

}
