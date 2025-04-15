import java.util.Scanner;

public class Subtração implements Operacao {
    public void calcular(Scanner scanner) {

        double num1 = 0;
        double num2 = 0;
        String resposta = "S";

    while(true) {

            System.out.println("Digite o número: ");
            num1 = scanner.nextDouble();
            System.out.println("Digite o outro número: ");
            num2 = scanner.nextDouble();
            num1 -= num2;

            System.out.printf("O resultado da subtração é: " + num1);

            System.out.printf("Deseja continuar ? S ou N");
            resposta = scanner.nextLine();

            if(resposta.equalsIgnoreCase("S")) {

                System.out.printf("Digite o próximo número");
                double num3 = scanner.nextDouble();
                num1 = num1 -num3;
                System.out.printf("O resultado da subtração é: " + num1);

            } else if  (resposta.equalsIgnoreCase("N")) { 
                    break;

            } else {

                    System.out.printf("bobinho");
            }      
        }
    }