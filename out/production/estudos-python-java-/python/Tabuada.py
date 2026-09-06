numero = int(input("Digite o número para ver sua Tabuada: "))

print(f"A tabuada de {numero} é: ")
for i in range(0,11):
    print(f"{i}x{numero} = {i*numero}")