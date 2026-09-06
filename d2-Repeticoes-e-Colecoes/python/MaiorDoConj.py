numeros = [1, 10,9, 4, 8, 11, 20, 1,0]

maior = numeros[0] #preciso assumir que o maior é o primeiro item***   
for i in range(len(numeros)):
    if numeros[i] > maior:
        maior = numeros[i]

print (maior)