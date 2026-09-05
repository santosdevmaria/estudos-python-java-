n1 = int(input("Insira primeiro número: "))
n2 = int(input("Insira segundo número: "))
operacao = input("Insira a operação que será feita: ")

if operacao == '+':
    print(n1 + n2)
elif operacao == '*':
    print(n1 * n2)
elif operacao == '/':
    if n1 == 0 or n2 == 0:
        print("Erro: divisão de 0")
    else:
        print(n1 / n2)
elif operacao == '-':
    print(n1 - n2)