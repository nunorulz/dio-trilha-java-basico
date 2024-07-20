def main():
    # Lê os valores de Entrada:
    valor_salario = float(input("Digite o valor do salário: "))
    valor_beneficios = float(input("Digite o valor dos benefícios: "))

    valor_imposto = 0
    if 0 <= valor_salario <= 1100:
        # Atribui a alíquota de 5% mediante o salário:
        valor_imposto = 0.05 * valor_salario
    elif 1100.01 <= valor_salario <= 2500:
        # Atribui a alíquota de 10% mediante o salário:
        valor_imposto = 0.10 * valor_salario
    else:
        # Atribui a alíquota de 15% mediante o salário:
        valor_imposto = 0.15 * valor_salario

    # Calcula e imprime a Saída (com 2 casas decimais)
    saida = valor_salario - valor_imposto + valor_beneficios
    print(f"{saida:.2f}")

if __name__ == "__main__":
    main()
