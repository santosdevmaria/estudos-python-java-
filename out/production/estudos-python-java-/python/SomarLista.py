lista = [5, 9, 0, 6, 8, 4, 8, 0]

soma = 0  #estava esquecendo de inicializar ela antes do for

for i in range(0, len(lista)):
    soma += lista[i]
print(soma)

'''
Mais coisas de lista
append(item) - adiciona item no final da lista
insert(indice, item) - adiciona item na posição do indice inserido
extend([itens...]) - adiciona os itens no final da lista
pop(indice) - remove e retorna o valor do item retirado
remove(valor) - remove o a primeira ocorrencia de um certo valor
clear() - limpa a lista
sort() reverse() - ordenam a lista (crescente ou decrescente)
index() - retorna o index de onde a primeira ocorrencia esta
count() - conta quantas vezes o valor aparece na lista
'''