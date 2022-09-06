import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.stream.IntStream;

public class ExercicioQuatro {
    public static void call(Scanner scanner) {
        System.out.println("=== EXERCÍCIOS - LISTA 4 ===");

        //1) Crie um programa que questione a quantidade de notas a ser informada, receba as notas e calcule a média. 
        //2) Crie um programa que imprima um arrays com Foreach. 
        //3) Crie um programa que leia 10 valores double e salve em um array, depois imprima esses valores. 
        //4) Crie um programa que leia 10 valores int e salve em um array, depois imprima se esses valores são pares ou ímpares. 
        //5) Crie um programa que possua uma collection que represente as 52 cartas do baralho, imrpima elas. 
        //6) Crie um programa que una duas listas de inteiros. 
        //7) Crie um programa que simule a fila de atendimento de um banco. 
        //8) Crie um programa que receba a temperatura média de cada mês do ano e após exiba a temperatura média do ano. 
        //9) Crie dois arrays de 10 posições e depois gere um terceiro array com os valores intercalados desses dois arrays, ao final, imprima os 3. 
        //10) Crie um programa que leia 20 valores, calcule a média aritmética desses valores e imprima os valores que são inferiores a esta média.

        System.out.println("+-------------------------------------------------------+");
        System.out.println("| 1 -  Calculo de Media                                 |");
        System.out.println("| 2 -  Array com Forech                                 |");
        System.out.println("| 3 -  Imprimir Array                                   |");
        System.out.println("| 4 -  Pares ou Impares                                 |");
        System.out.println("| 5 -  Cartas do Baralho com Collection                 |");
        System.out.println("| 6 -  Unindo duas listas                               |");
        System.out.println("| 7 -  Fila de Atendimento Banco                        |");
        System.out.println("| 8 -  Temperatura Media Anual                          |");
        System.out.println("| 9 -  Criação de Array intercalado                     |");
        System.out.println("| 10 - Valores inferiores a média                       |");
        System.out.println("| 11 - DESAFIO                                          |");
        System.out.println("+-------------------------------------------------------+");

        int menu = 0;
        try {
            menu = scanner.nextInt();
        } catch (Exception e) {
            System.err.println(e.getMessage());
            menu = 0;
        }

        switch (menu) {
            // 1) Crie um programa que questione a quantidade de notas a ser informada, receba as notas e calcule a média.
            case 1:
                System.out.println("Qual a quantidade de notas a ser informada?");
                int quantidadeNotas = scanner.nextInt();

                double[] notas = new double[quantidadeNotas];

                for (int i = 0; i < quantidadeNotas; i++) {
                    System.out.println("Informe a nota " + (i + 1));
                    notas[i] = scanner.nextDouble();
                }

                System.out.println("A média das notas é: " + calculaMedia(notas));
                break;
            // 2) Crie um programa que imprima um arrays com Foreach.
            case 2:
                printArray(new String[]{ "Teste", "imprimir", "foreach" });
                break;
            // 3) Crie um programa que leia 10 valores double e salve em um array, depois imprima esses valores.
            case 3:
                double[] valoresDouble = new double[10];

                for (int i = 0; i < valoresDouble.length; i++) {
                    System.out.println("Informe o valor " + (i + 1));
                    valoresDouble[i] = scanner.nextDouble();
                }

                dezValores(valoresDouble);
                break;
            // 4) Crie um programa que leia 10 valores int e salve em um array, depois imprima se esses valores são pares ou ímpares.
            case 4:
                int valoresInt[] = new int[10];

                for (int i = 0; i < valoresInt.length; i++) {
                    System.out.println("Informe o valor " + (i + 1));
                    valoresInt[i] = scanner.nextInt();
                }

                dezValoresInt(valoresInt);
                break;
            // 5) Crie um programa que possua uma collection que represente as 52 cartas do baralho, imrpima elas.
            case 5:
                System.out.println("Cartas do Baralho");
                baralho();
                break;
            // 6) Crie um programa que una duas listas de inteiros.
            case 6:

                System.out.println("Informe a quantidade de valores para a lista 1");
                int quantidadeLista1 = scanner.nextInt();
                int[] listaUm = new int[quantidadeLista1];

                System.out.println("Informe a quantidade de valores para a lista 2");
                int quantidadeLista2 = scanner.nextInt();
                int[] listaDois = new int[quantidadeLista2];

                for (int i = 0; i < listaUm.length; i++) {
                    System.out.println("Informe o valor " + (i + 1) + " da lista 1");
                    listaUm[i] = scanner.nextInt();
                }

                for (int i = 0; i < listaDois.length; i++) {
                    System.out.println("Informe o valor " + (i + 1) + " da lista 1");
                    listaDois[i] = scanner.nextInt();
                }
                
                System.out.println("Lista 1: " + Arrays.toString(listaUm));
                System.out.println("Lista 2: " + Arrays.toString(listaDois));
                System.out.println("Listas Unidas: " + Arrays.toString(mergeIntList(listaUm, listaDois)));
                
                break;
            // 7) Crie um programa que simule a fila de atendimento de um banco.
            /*
             - Atendimento normal
             - Atendimento preferencial 
             */
            case 7:    
                
                // filaBanco();
                break;
            // 8) Crie um programa que receba a temperatura média de cada mês do ano e após exiba a temperatura média do ano.
            case 8:
                double[] temperaturas = new double[12];

                for (int i = 0; i < temperaturas.length; i++) {
                    System.out.println("Informe a temperatura média do mês " + (i + 1));
                    temperaturas[i] = scanner.nextDouble();
                }

                System.out.println("A temperatura média do ano é: " + temperaturaMedia(temperaturas));
                break;
            // 9) Crie dois arrays de 10 posições e depois gere um terceiro array com os valores intercalados desses dois arrays, ao final, imprima os 3.
            case 9:
                int[] arrayUm = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
                int[] arrayDois = new int[] { 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };

                System.out.println("Array 1: " + Arrays.toString(arrayUm));
                System.out.println("Array 2: " + Arrays.toString(arrayDois));
                System.out.println("Array 3: " + Arrays.toString(alternarArray(arrayUm, arrayDois)));

                break;
            // 10) Crie um programa que leia 20 valores, calcule a média aritmética desses valores e imprima os valores que são inferiores a esta média.
            case 10:
                int[] valores = new int[20];

                for (int i = 0; i < valores.length; i++) {
                    System.out.println("Informe o valor " + (i + 1));
                    valores[i] = scanner.nextInt();
                }
                mediaVinte(valores);
                break;
            // DESAFIO
            case 11:
                // detetive();
                break;
        
            default:
                System.out.println("Operação inválida");
                break;
        }
    }   

    // 1) Crie um programa que questione a quantidade de notas a ser informada, receba as notas e calcule a média.
    public static double calculaMedia(double[] notas) {

        double soma = 0;
        for (int i = 0; i < notas.length; i++) {
            soma += notas[i];
        }

        double media = soma / notas.length;

        return media;
    }
    // 2) Crie um programa que imprima um arrays com Foreach.
    public static void printArray(String[] array) {
        for (String string : array) {
            System.out.println(string);
        }
    }
    // 3) Crie um programa que leia 10 valores double e salve em um array, depois imprima esses valores.
    public static void dezValores(double[] valores) {
        System.out.println("Array de dez valores double:" + Arrays.toString(valores));
    }
    // 4) Crie um programa que leia 10 valores int e salve em um array, depois imprima se esses valores são pares ou ímpares.
    public static void dezValoresInt(int[] valores) {
        for (int i = 0; i < valores.length; i++) {
            if (valores[i] % 2 == 0) {
                System.out.println("O valor " + valores[i] + " é par");
            } else {
                System.out.println("O valor " + valores[i] + " é ímpar");
            }
        }
    }
    // 5) Crie um programa que possua uma collection que represente as 52 cartas do baralho, imprima elas.
    public static SortedSet<String> baralho() {

        SortedSet<String> naipes = new TreeSet<>();
        naipes.add("Paus");
        naipes.add("Copas");
        naipes.add("Ouros");
        naipes.add("Espadas");

        SortedSet<String> cartas = new TreeSet<>();
        cartas.add("Ás");
        cartas.add("Valete");
        cartas.add("Dama");
        cartas.add("Rei");

        for (int i = 2; i <= 10; i++) {
            cartas.add(String.valueOf(i));
        }
        
        SortedSet<String> baralho = new TreeSet<>();
        for (String naipe : naipes) {
            for (String carta : cartas) {
                baralho.add(carta + " de " + naipe);
                System.out.println(carta + " de " + naipe);
            }
        }

        return baralho;
    }
    // 6) Crie um programa que una duas listas de inteiros.
    public static Integer[] mergeIntList(int[] listaUm, int[] listaDois) {

        Integer[] mergeList = new Integer[listaUm.length + listaDois.length];

        for (int i = 0; i < mergeList.length; i++) {
            if (i < listaUm.length) {
                mergeList[i] = listaUm[i];
            } else {
                mergeList[i] = listaDois[i - listaUm.length];
            }
        }

        return mergeList;
    }
    // 7) Crie um programa que simule a fila de atendimento de um banco.
    public static void filaBanco() {

    }
    // 8) Crie um programa que receba a temperatura média de cada mês do ano e após exiba a temperatura média do ano.
    public static double temperaturaMedia(double[] temperaturas) {

        double soma = 0;
        for (int i = 0; i < temperaturas.length; i++) {
            soma += temperaturas[i];
        }

        double media = soma / temperaturas.length;

        return media;
    }
    // 9) Crie dois arrays de 10 posições e depois gere um terceiro array com os valores intercalados desses dois arrays, ao final, imprima os 3.
    public static int[] alternarArray(int[] listaUm, int[] listaDois) {

        int[] arrayTres = new int[listaUm.length + listaDois.length];

        for (int i = 0; i < arrayTres.length; i++) {
            arrayTres[i] = listaUm[i];
            arrayTres[i + 1] = listaDois[i];
        }

        return arrayTres;
    }
    // 10) Crie um programa que leia 20 valores, calcule a média aritmética desses valores e imprima os valores que são inferiores a esta média.
    public static void mediaVinte(int[] valores) {
        
        int soma = 0;

        for (int i = 0; i < valores.length; i++) {
            soma += valores[i];
        }

        double media = soma / valores.length;

        for (int i = 0; i < valores.length; i++) {
            if (valores[i] < media) {
                System.out.println("O valor " + valores[i] + " é menor que a média");
            }
        }
    }

    public static void detetive() {
        
    }
}
