import os
import json
import random


def ExibirMenu():
    print('''
<>--------------------------------------------------------<>
                        SysAcademia
<>--------------------------------------------------------<>
    Digite a opção desejada:
    1. Cadastrar aluno
    2. Exibir lista de alunos
    3. Buscar aluno pelo id
    4. Exibir alunos com IMC > 30
    5. Salvar dados e sair
<>--------------------------------------------------------<>
    Opção: ''', end='')


def LimpaTela():
    input("Digite 'ENTER' para continuar: ")
    if os.name == 'nt':
        os.system('cls')
    else:
        os.system('clear')


def cadastrarAluno(id):
    aluno = {'nome': '', 'id': 0, 'telefone': '', 'peso': 0.0,
             'altura': 0.0, 'mensalidade': 0.0, 'sexo': ''}
    for chave in aluno:
        if chave == 'id':
            aluno['id'] = random.randint(1, 10000)

        elif chave == 'nome':
            aluno['nome'] = input('Digite o nome do aluno: ')

        elif chave == 'telefone':
            aluno['telefone'] = input('Informe o telefone do aluno: ')

        elif chave == 'peso':
            aluno['peso'] = float(input('Informe o peso do aluno: '))

        elif chave == 'altura':
            aluno['altura'] = float(input('Informe a altura do aluno: '))

        elif chave == 'mensalidade':
            aluno['mensalidade'] = float(input('Informe a mensalidade: '))

        elif chave == 'sexo':
            aluno['sexo'] = input(
                'Informe o sexo do aluno: (M)Masculino/(F)Feminino: ')
            aluno['sexo'] = aluno['sexo'].upper()

    print('Cadastro concluído!')
    return aluno


def carregarAluno():
    alunos = []

    try:
        ler = open("Alunos.json", "r")
        alunos = json.load(ler)
    except:
        print("Ainda não existem alunos cadastrados!")

    for aluno in alunos:
        print(aluno['nome'])
    return alunos


def buscarId():
    alunos = []
    idBuscar = int(input('Informe o ID que deseja buscar: '))
    read = open('Alunos.json', 'r')
    alunos = json.load(read)
    for aluno in alunos:
        if aluno['id'] == idBuscar:
            print(aluno['nome'], aluno['telefone'], aluno['peso'],
                  aluno['altura'], aluno['mensalidade'], aluno['sexo'])


def imc():
    alunos = []
    imc30 = []
    read = open('Alunos.json', 'r')
    alunos = json.load(read)
    for aluno in alunos:
        imc = aluno['peso']/(aluno['altura'] * aluno['altura'])
    if imc > 30:
        imc30.append(aluno['nome'])
        print(f'Alunos com IMC maior que 30: {imc30}')


def salvarAlunos(alunos):
    esc = open('Alunos.json', 'w')
    json.dump(alunos, esc)
    esc.close()