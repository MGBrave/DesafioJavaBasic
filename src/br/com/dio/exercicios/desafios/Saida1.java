package br.com.dio.exercicios.desafios;
/*/*

 QUESTÃO
 O seu professor de programação gostaria de fazer uma tela com as seguintes características:
 1. Ter 39 traços (-) na primeira linha;
 2. Ter uma | embaixo do primeiro traço e do trigésimo nono traço da primeira linha,
 embaixo do 2o traço deve começar a escrever "x = 35" e o restante preencher com espaço em branco;

 3. Ter uma | embaixo do primeiro traço e do trigésimo nono traço da primeira linha, preencher no
 meio com espaço em branco;

 4. Ter uma | embaixo do primeiro traço e do trigésimo nono traço da primeira linha, embaixo do
 17o traço deve começar a escrever "x = 35" e o restante preencher com espaço em branco;

 5. Repita o procedimento 3;
 6. Ter uma | embaixo do primeiro traço e do trigésimo nono traço da primeira linha,
 embaixo do 33o traço deve começar a escrever "x = 35" e o restante preencher no meio com espaço em branco;

 7. Repita o procedimento 1.
 No final deve ficar igual a imagem a seguir:
 --------------------------------------- (39 traços)
 |x = 35                               |
 |                                     |
 |               x = 35                |
 |                                     |
 |                               x = 35|
 --------------------------------------- (39 traços)

 ENTRADA
 Não há.

 SAÍDA
 A saída será impresso conforme a figura acima.*/

/*
import java.io.IOException;

public class Saida1{

public static void main(String[] args) throws IOException {
        for (int i = 1; i <= 7; i++) {
        for (int j = 1; j <= 39; j++) {

        if (i == 1 || i == 7)
        System.out.print("-");

        else if (j == 1 || j == 39)
        System.out.print("|");

        else if (i == 2) {
        if (j == 2)
        System.out.print("x = 35");
        else if (j > 7)
        System.out.print(" ");
        }

        else if (i == 4) {
        if (j == 17)
        System.out.print("x = 35");
        else if (j < 17 || j > 22)
        System.out.print(" ");
        }

        else if (i == 6) {
        if (j == 33)
        System.out.print("x = 35");
        else if (j < 33)
        System.out.print(" ");
        }

        else
        System.out.print(" ");

        }
        System.out.print("\n");
        }
        }

        }
/*
O seu instrutor de lógica de programação, Damilson Bonetti, quer que você desenvolva
uma tela com as seguintes características:

        Conter 39 traços horizontais ( - ) na primeira linha;
        Conter um traço vertical ( | ) embaixo do primeiro traço e do trigésimo nono traço da primeira linha, preencher no meio com espaço em branco;
        Repita o procedimento 2 quatro vezes;
        Repita o procedimento 1.
        No final deve ficar igual a imagem a seguir:

        --------------------------------------- (39 traços)

        |                                     |

        |                                     |

        |                                     |

        |                                     |

        |                                     |

        --------------------------------------- (39 traços)

        Entrada
        Não há.

        Saída
        A saída será impresso conforme a figura acima.


        Exemplo de Entrada	Exemplo de Saída

        ---------------------------------------

        |                                     |

        |                                     |

        |                                     |

        |                                     |

        |                                     |

        ---------------------------------------
import java.io.IOException;

public class Saida1{

    public static void main(String[] args) throws IOException {
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 39; j++) {

                if (i == 1 || i == 7)
                    System.out.print("-");

                else if (j == 1 || j == 39)
                    System.out.print("|");



            }
            System.out.print("\n");
        }
    }

}*/
/*import java.io.IOException;

public class Saida1{

   /* public static void main(String[] args) throws IOException {
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 39; j++) {

                if (i == 1 || i == 7)
                    System.out.print("-");

                else if (j == 1 || j == 39)
                    System.out.print("|");

                else if (j == 2 || j == 38){
                    System.out.print(" ");

                }

                else
                    System.out.print(" ");

            }
            System.out.print("\n");
        }
    }

} */
import java.io.IOException;

public class Saida1{

public static void main(String[] args) throws IOException {
        for (int i = 1; i <= 7; i++) {
        for (int j = 1; j <= 39; j++) {
        if (i == 1 || i == 7)
        System.out.print("-");
        else if (j == 1 || j == 39)
        System.out.print("|");
        else
        System.out.print(" ");
        }
        System.out.print("\n");
        }
        }
}
//apenas 1 teste passou, faltou 1.