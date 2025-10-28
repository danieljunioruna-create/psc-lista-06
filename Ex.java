import java.util.Scanner;

public class Ex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[5];
        int soma = 0;
        int multiplicacao = 1;
        
        System.out.println("Digite 5 números inteiros:");
        for (int i = 0; i < 5; i++) {
            vetor[i] = scanner.nextInt();
            soma += vetor[i];
            multiplicacao *= vetor[i];
        }
        
        System.out.println("Números: ");
        for (int num : vetor) {
            System.out.print(num + " ");
        }
        System.out.println("\nSoma: " + soma);
        System.out.println("Multiplicação: " + multiplicacao);
        scanner.close();
    }
}
