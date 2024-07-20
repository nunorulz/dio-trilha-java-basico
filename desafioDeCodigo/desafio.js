function main() {
    const prompt = require('prompt-sync')();

    // Lê os valores de Entrada:
    const valorSalario = parseFloat(prompt("Digite o valor do salário: "));
    const valorBeneficios = parseFloat(prompt("Digite o valor dos benefícios: "));

    let valorImposto = 0;
    if (valorSalario >= 0 && valorSalario <= 1100) {
        // Atribui a alíquota de 5% mediante o salário:
        valorImposto = 0.05 * valorSalario;
    } else if (valorSalario >= 1100.01 && valorSalario <= 2500) {
        // Atribui a alíquota de 10% mediante o salário:
        valorImposto = 0.10 * valorSalario;
    } else {
        // Atribui a alíquota de 15% mediante o salário:
        valorImposto = 0.15 * valorSalario;
    }

    // Calcula e imprime a Saída (com 2 casas decimais)
    const saida = valorSalario - valorImposto + valorBeneficios;
    console.log(saida.toFixed(2));
}

main();
