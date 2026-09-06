listaNum= [15, 28, 42, 9, 33, 51, 18]
soma = 0

for i in range (0, len(listaNum)):
    soma += listaNum[i] # posso substituir por media = sum(listaNum) / len(listaNum)
media = soma / len(listaNum)

print(f"A média dos valores é: {media}")