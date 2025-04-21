import java.util.Scanner;

public class Adicao implements Operacao {
    public void calcular(Scanner scanner) {

        double soma = 0; // Armazena a soma acumulada dos números digitados
        double num;      // Armazena o número digitado pelo usuário

        while (true) {  // Loop infinito até o usuário digitar 0

            System.out.println("Digite um número (0 para sair): ");

            // Tentando ler um número digitado pelo usuário
            try {
                num = scanner.nextDouble();  // Lê o número digitado

                if (num == 0) {  // Se o número for 0, sai do loop
                    break;
                }

                soma += num;  // Soma o número atual à variável acumuladora
                System.out.println("Resultado parcial: " + soma);  // Mostra o resultado até agora

            } catch (Exception e) {
                // Se o usuário digitar algo que não seja número, essa exceção é capturada
                System.out.println("Entrada inválida. Por favor, digite um número.");
                scanner.nextLine();  // Limpa o buffer para evitar loop infinito de erro
            }
        }
    }
}
