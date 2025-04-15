import java.util.Scanner;

public class Subtracao implements Operacao {
    public void calcular(Scanner scanner) {

        double subtracao = 0;
        double num1 = 0;
       

        while(true) {

            System.out.println("Digite o número: ");
            num1 = scanner.nextDouble();
            System.out.println("Digite o outro número: ");
            num2 = scanner.nextDouble();

        if (num1==0) { 
            break;
        }
            subtracao =  num1 - num2;

            System.out.printf("A subtração de %f e %f, é: %f", num1, num2, subtracao);

        }