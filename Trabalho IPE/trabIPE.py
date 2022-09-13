n = int(input("Digite um número positivo e maior que dois: "))

while n < 0 or n < 2:
    n = int(input("Não são aceitos números negativos ou menores que dois, digite novamente: "))

if n == 2:
    print("O número 2 é o primeiro número primo.")

primos = []
numeros = []

if n > 2:
    for i in range (2, n+1):
        numeros.append(i)

    for numero in numeros:
        if numero % numero == 1:
            primos.append(numero)
        if numero % 1 == numero:
            primos.append(numero)

print(f"Os números primos nesse intervalo são {primos}")
