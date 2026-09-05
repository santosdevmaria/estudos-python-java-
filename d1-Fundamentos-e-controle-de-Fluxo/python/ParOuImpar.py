numero = int(input("Digite o número para verificação: ")) # Lembrar de converter o tipo de entrada

resto = numero % 2 

if (resto == 0):
    print("O número escolhido é par")
elif (resto == 1):
    print("O número escolhido é ímpar")

