pares = []
for i in range(0, 1501): #economizaria tempo fazendo o range(0, 1501, 2) por que já pegaria os pares, mas aí eu não usaria o append
    if (i % 2) == 0:
        pares.append(i)

print(pares)
print(len(pares))