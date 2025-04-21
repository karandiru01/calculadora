import java.util.Scanner;

public class Subtracao implements Operacao {
    public void calcular(Scanner scanner) {

        double num1 = 0;
        double num2 = 0;
        String resposta = "S";

        System.out.println("Digite o número: ");
        num1 = scanner.nextDouble(); // primeiro número
        scanner.nextLine(); // consome o enter

        while(true) {
            System.out.println("Digite o outro número: ");
            num2 = scanner.nextDouble();
            scanner.nextLine(); // consome o enter

            num1 -= num2;  // Subtrai o número

            System.out.printf("O resultado da subtração é: %.2f\n", num1);

            // Pergunta se o usuário quer continuar
            System.out.printf("Deseja continuar? Digite 'S' para continuar, 'N' para começar um novo número ou '0' para sair.\n");
            resposta = scanner.nextLine();

            if(resposta.equalsIgnoreCase("S")) {
                // Continuar com o número atual
            } else if (resposta.equalsIgnoreCase("N")) {
                // Reiniciar com um novo número
                System.out.println("Digite um novo número para começar a subtração: ");
                num1 = scanner.nextDouble();  // Lê um novo número
                scanner.nextLine(); // consome o enter
            } else if (resposta.equals("0")) {
                // Sair do programa
                System.out.println("Saindo do programa...");
                break;
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
