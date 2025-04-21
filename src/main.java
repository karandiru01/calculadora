import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Scanner para entrada do usuário
        Operacao operacao = null; // Interface para operações, instanciada conforme a escolha do usuário
        String opcao;

        while (true) {  // Loop principal da calculadora
            System.out.println("\n=== CALCULADORA ===");
            System.out.println("Escolha a operação:");
            System.out.println("1 - Adição");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            System.out.println("5 - Potência");
            System.out.println("6 - Raiz Quadrada");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");
            opcao = scanner.nextLine(); // Lê a opção digitada pelo usuário //

            // Seleciona a operação com base na opção digitada
            switch (opcao) {
                case "1":
                    operacao = new Adicao(); // Cria um objeto da classe Adicao
                    break;
                case "2":
                    operacao = new Subtracao(); // Cria um objeto da classe Subtracao
                    break;
                case "3":
                    operacao = new Multiplicacao(); // Cria um objeto da classe Multiplicacao
                    break;
                case "4":
                    operacao = new Divisao(); // Cria um objeto da classe Divisao
                    break;
                case "5":
                    operacao = new Potencia(); // Cria um objeto da classe Potencia
                    break;
                case "6":
                    operacao = new Raiz(); // Cria um objeto da classe Raiz
                    break;
                case "0":
                    System.out.println("Encerrando a calculadora. Até mais!");
                    scanner.close(); // Fecha o scanner
                    return; // Encerra o programa
                default:
                    System.out.println("Opção inválida. Tente novamente."); // Opção não reconhecida
                    continue;
            }

            operacao.calcular(scanner); // Executa a operação escolhida
        }
    }
}
