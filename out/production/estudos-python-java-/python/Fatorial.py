numero = int(input("Digite um valor para ver seu fatorial: "))
fatorial = 1 # -> Se começar com 0 ele vai transformar todos os resultados em 0

for i in range (numero, 0, -1):
    fatorial *= i

print(f"{numero}! = {fatorial}")

#por agora vou fazer desse jeito mais simples e depois implemento o fatorial