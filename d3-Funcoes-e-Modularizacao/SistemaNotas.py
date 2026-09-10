def ver_Media(lista): #como que ele sabe o que é esse parametro aqui
    media = sum(lista) / len(lista)
    return media

def add_Nota(lista, nota):
    lista.append(nota)

def situacao_View(lista):
    SituMedia = ver_Media(lista)
    if SituMedia >= 6:
        return "aprovado"
    else: 
        return "reprovado"

listaNotas = []
executando = True

while executando:
    print("Escolha uma das opcoes: ")
    print("1 - Inserir nota")
    print("2 - Ver media")
    print("3 - Ver situacao")
    print("4 - Sair")
    
    menuOpcao = int(input())
    match menuOpcao:
        case 1:
            nota = int(input("Insira nota: "))
            add_Nota(listaNotas, nota)
            print()
        case 2:
            media = ver_Media(listaNotas)
            print(f"Sua média atual é: {media}")
            print()
        case 3:
            situacao = situacao_View(listaNotas)
            print(f"O aluno está {situacao}")
            print()
        case 4:
            print("Saindo...")
            executando = False
        