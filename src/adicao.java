import java.util.Scanner;

public class Adicao implements Operacao {
    public void calcular(Scanner scanner) {

    double soma = 0; 
    double num = 0;
     
        while (true){  // Enquanto o número for diferente de zero for VERDEIRO, o loop continua.
                                                        
            System.out.println("Digite um número: ");       // Usuária digita um número
            num = scanner.nextDouble();                     // variavel NUM armazena scaneia o número digitado pelo usuário através e salva o valor em NUM               
            
        if (num==0){                                       // Se o número digitado for igual a zero, o loop para.
            break;                                         // O loop para e o programa continua.
        }
            soma += num;                                   // Se o número for diferente de zero a variavel SOMA recebe o valor de NUM e continua a receber. 
        }

        System.out.println("Resultado: " + soma);
    }
}
