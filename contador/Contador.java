import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Receber o 1º número
            System.out.print("Digite o primeiro número: ");
            int primeiroNumero = scanner.nextInt();

            // Receber o 2º número
            System.out.print("Digite o segundo número: ");
            int segundoNumero = scanner.nextInt();

            // Verificar se o segundo número é maior que o primeiro
            if (segundoNumero <= primeiroNumero) {
                throw new IllegalArgumentException("O segundo número deve ser maior que o primeiro.");
            }

            // Calcular a subtração
            int diferenca = segundoNumero - primeiroNumero;

            // Usar a diferença no laço FOR
            for (int i = 0; i < diferenca; i++) {
                System.out.println("Contando... " + (i + 1));
            }
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
            scanner.close();
    }
}

