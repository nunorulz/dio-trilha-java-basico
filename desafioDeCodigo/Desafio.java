import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        // Lê os valores de Entrada:
        Scanner leitorDeEntradas = new Scanner(System.in);
        System.out.println("Digite o valor do salário:");
        float valorSalario = leitorDeEntradas.nextFloat();
        System.out.println("Digite o valor dos benefícios:");
        float valorBeneficios = leitorDeEntradas.nextFloat();
        leitorDeEntradas.close();

        float valorImposto = 0;
        if (valorSalario >= 0 && valorSalario <= 1100) {
            // Atribui a aliquota de 5% mediante o salário:
            valorImposto = 0.05F * valorSalario;
        } else if (valorSalario >= 1100.01 && valorSalario <= 2500) {
            // Atribui a aliquota de 10% mediante o salário:
            valorImposto = 0.10F * valorSalario;
        } else {
            // Atribui a aliquota de 15% mediante o salário:
            valorImposto = 0.15F * valorSalario;
        }

        // Calcula e imprime a Saída (com 2 casas decimais)
        float saida = valorSalario - valorImposto + valorBeneficios;
        System.out.println("O valor final do salário já com os descontos é de R$ " + String.format("%.2f", saida));
    }
}
