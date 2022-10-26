from modulo import *

id = 0
alunos = []

opc = 0
while opc != 5:
    ExibirMenu()
    opc = int(input())
   
    if opc == 1:
        alunos.append(cadastrarAluno(id))
        LimpaTela()

    elif opc == 2:
        carregarAluno()
        LimpaTela()

    elif opc == 3:
        buscarId()
        LimpaTela()

    elif opc == 4:
        imc()
        LimpaTela()

    elif opc == 5:
        salvarAlunos(alunos)
        LimpaTela()

    else:
        print('Opção Inválida')
        LimpaTela()
