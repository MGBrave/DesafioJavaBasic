package br.com.dio.Exception;
//fazer a divisão de 2 valores inteiros

import javax.swing.*;

public class UncheckedException {


    public static int dividir(int a, int b){ return a /b;}

    public static void main(String[] args) {
        boolean continueLooping = true;
        do{
            String a = JOptionPane.showInputDialog("Numerador: ");
            String b = JOptionPane.showInputDialog("Denominador: ");
            try {
                int resultado = dividir(Integer.parseInt(a), Integer.parseInt(b));
                System.out.println("Resultado: " + resultado);
                continueLooping = false;

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null,"Entrada inválida, Informe um número inteiro!" + e.getMessage()
                );
                //e.printStackTrace();
            }catch (ArithmeticException e){
                JOptionPane.showMessageDialog(null,"Impossível dividir um número por 0!");e.printStackTrace();
        }finally {
                System.out.println("Chegou no finnally!");
            }
        }while (continueLooping);

        System.out.println("O código  continua...");
    }
}
