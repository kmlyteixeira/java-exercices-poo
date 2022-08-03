import java.util.Scanner;

public class ExercicioUm {

    public static void call(Scanner scanner) {
        System.out.println("=== EXERCÍCIOS - LISTA 1 ===");

        System.out.println("+-------------------------------------------------------+");
        System.out.println("| 1 - Calcule a Média                                   |");
        System.out.println("| 2 - Calcule a Área                                    |");
        System.out.println("| 3 - Calcule o Volume                                  |");
        System.out.println("| 4 - Valor é maior que o dobro de outro valor          |");
        System.out.println("| 5 - Cálculo de Bhaskara                               |");
        System.out.println("| 6 - Velocidade Média                                  |");
        System.out.println("| 7 - Percentual de Imposto                             |");
        System.out.println("| 8 - Valor é par ou ímpar                              |");
        System.out.println("| 9 - Comparar dois valores de String                   |");
        System.out.println("| 10 - Valor double em string e convertido para inteiro |");
        System.out.println("| 11 - Imposto de renda de um salário                   |");
        System.out.println("| 12 - DESAFIO                                          |");
        System.out.println("+-------------------------------------------------------+");

        int menu = 0;
        try {
            menu = scanner.nextInt();
        } catch (Exception e) {
            System.err.println(e.getMessage());
            menu = 0;
        }

        switch (menu) {
            // 1) Crie um programa que calcule a média (`(nota1 + nota2 + nota3 / 3)`)
            case 1:
                
                double notaUm = 1.5;
                double notaDois = 5.0;
                double notaTres = 10;

                double media = media(notaUm, notaDois, notaTres);

                System.out.println(media);

                break;
            // 2) Crie um programa que calcule a área (`lado1 * lado2`)
            case 2:
                double ladoUm = 5;
                double ladoDois = 2;

                double area = area(ladoUm, ladoDois);

                System.out.println(area);
                
                break;
            // 3) Crie um programa que calcule o volume (`largura * altura * profundidade`)
            case 3:
                double largura = 10;
                double altura = 5;
                double profundidade = 3;

                double volume = volume(largura, altura, profundidade);

                System.out.println(volume);

                break;
            // 4) Crie um programa que avalie se um valor é maior do que o dobro de outro valor
            case 4:
                double base = 10;
                double verificar = 35;
                
                boolean result = valorMaiorQueDobro(base, verificar);

                System.out.println(result);
                
                break;
            // 5) Crie um programa que calcule _bhaskara_
            case 5:
                int a = 6;
                int b = 2;
                int c = 0;

                System.out.println(bhaskara(a, b, c));

                break;
            // 6) Crie um programa que calcule a velocidade média de uma viagem (`distancia (km) / tempo (h)`)
            case 6:
                double distancia = 180;
                double tempo = 5;

                double mediaViagem = mediaViagem(distancia, tempo);

                System.out.println(mediaViagem);

                break;
            // 7) Crie um programa que calcule o percentual de imposto pago (`faturamento \ qtd imposto`)
            case 7:
                double faturamento = 1000;
                double qtdImposto = 50;

                double percImposto = percentualImposto(faturamento, qtdImposto);

                System.out.println(percImposto);

                break;
            // 8) Crie um programa que teste se um valor é par ou ímpar
            case 8:
                int valor = 4;

                boolean parOuImpar = parOuImpar(valor);

                if (parOuImpar==false) {
                    System.out.println("É impar");
                } else {
                    System.out.println("É par");
                }

                break;
            // 9) Crie um programa que compare dois valores Strings
            case 9:
                String stringUm = "Java";
                String stringDois = "JavaScript";

                boolean compareString = compareString(stringUm, stringDois);

                if (compareString==true) {
                    System.out.println("São iguais!");
                } else {
                    System.out.println("Não são iguais!");
                }

                break;
            // 10) Crie um programa que tenha uma variável com ponto em String e converta seu valor para inteiro
            case 10:
                String valorString = "10.5";
                
                int valorInt = convertString(valorString);

                System.out.println("Valor convertido:" + valorInt);
                
                break;
            // 11) Crie um programa que receba o salário e diga o valor de imposto de renda conforme abaixo:
            // Base                     | Alíquota
            // ---------                | ------
            // Até 1.903,98             | Isento
            // De 1.903,99 até 2.826,65 | 7,5%
            // De 2.826,66 até 3.751,05 | 15%
            // De 3.751,06 até 4.664,68 | 22,5%
            // Acima de 4.664,68        | 27,5%
            case 11:
                Scanner sc = new Scanner(System.in);

                double salario = sc.nextDouble();
                double valorImposto = percentualImpostoSalario(salario);

                System.out.println(valorImposto);

                break;
            // DESAFIO - Crie um programa que teste se um número é primo
            case 12:
                int valorVerificar = 5;

                boolean testePrimo = testePrimo(valorVerificar);

                if (testePrimo==true) {
                    System.out.println("É primo");
                } else {
                    System.out.println("Não é primo");
                }
                
                break;
            default:
                System.out.println("Operação inválida");
                break;
        }
    }

    public static double media(double notaUm, double notaDois, double notaTres) {
        
        double media = (notaUm + notaDois + notaTres)/3;
        return media;
    }

    public static double area(double ladoUm, double ladoDois) {

        double area = ladoUm*ladoDois;        
        return area;
    }

    public static double volume(double largura, double altura, double profundidade) {

        double volume = largura*altura*profundidade;
        return volume;
    }

    public static boolean valorMaiorQueDobro(double base, double verificar) {

        double dobroBase = base*2;

        if (verificar > dobroBase) 
            return true;
         else 
            return false;
    }

    public static double[] bhaskara(int a, int b, int c) {
        
        double delta = (b*b) - (4*a*c);
        double raiz = Math.sqrt(delta);

        double[] x = new double[2];

        x[0] = ((b*(-1)) + raiz)/(2*a);
        x[1] = ((b*(-1)) - raiz)/(2*a);

        return x; 
    }

    public static double mediaViagem(double distancia, double tempo) {
        double velocidadeMedia = distancia/tempo;

        return velocidadeMedia;
    }

    public static double percentualImposto(double faturamento, double qtdImposto) {
        double percImposto = faturamento/qtdImposto;

        return percImposto;
    }

    public static boolean parOuImpar(int valor) {
        if ((valor%2)==0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean compareString(String stringUm, String stringDois) {

        if (stringUm.equals(stringDois)) {
            return true;
        } else {
            return false;
        }
    }

    public static int convertString(String valor) {

        int valorDouble = Integer.parseInt(valor);

        return valorDouble;
    }

    public static double percentualImpostoSalario(double salario) {

        double imposto = 0;

        if (salario <= 1903.98) {
            imposto =  0.0;
        } else if (salario >= 1903.99 && salario <= 2826.65){
            imposto = salario*0.075;
        } else if (salario >= 2826.66 && salario <= 3751.05) {
            imposto = salario*0.15;
        } else if (salario >= 3751.06 && salario <= 4664.68) {
            imposto = salario*0.225;
        } else if (salario >= 4664.68) {
            imposto = salario*0.275;
        }

        return imposto;
    }

    public static boolean testePrimo(int valor) {
        int count = 0;
        for (int i = 1; i <= valor; i++) {
            if (valor%i==0) {
                count++;
            }
        }

        if (count == 2) {
            return true;
        } else {
            return false;
        }
    }
}