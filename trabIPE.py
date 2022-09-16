'''
Luiz Filipe Alvares de Carvalho - G541790
João Pedro 
'''

n = int(input("Digite um número positivo e maior que dois: "))

while n < 0 or n < 2:
    n = int(input(
        "Não são aceitos números negativos ou menores que dois, digite novamente: "))

if n == 2:
    print("O número 2 é o primeiro número primo.")

'''
Foram feitos dois loops: Um para iterar 2 ao valor de n
E outro para verificar se os números do intervalo são primos ou não.
'''
for i in range(2, n + 1):
    '''
    Para todos os números maiores que 1, dentro do intervalo especificado é verificado
    se ele é dividido por algum outro número além de 1 e ele mesmo.
    '''
    for j in range(2, i):
        if i % j == 0:
            break
            '''
                Caso o número seja divisivel por mais algum número além de 1 e ele mesmo,
                o loop para.
                '''
    else:
        print(i)  # Imprime os números primos que passaram pelo loop anterior.