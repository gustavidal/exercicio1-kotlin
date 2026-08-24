/*****************************************
 * Objetivo: Realizar exercícios de Kotlin
 * Data: 24/08/2026 (segunda-feira)
 * Autor: Gustavo Vidal de Abreu
*****************************************/

fun main() {
    // 1 -) Crie uma variável numérica e diga se o número é par ou (resto da divisão por 2 = 0) ímpar (resto da divisão por 2 = 1)
    println("PAR OU ÍMPAR?")
    print("Digite um número: ")
    val num = readln().toInt()
    val status = if (num % 2 == 0) "PAR" else "ÍMPAR"
    println("$num é $status!")

    // 2 -) Crie uma variável numérica e exiba se o número é positivo, negativo ou zero
    // 3 -) Crie uma variável idade e diga "Criança" caso seja menor de 12, "Adolescente" entre 12 e 17, "Adulto" entre 18 e 59 e "Idoso" se 60 ou mais
    // 4 -) Crie uma variável numérica e exiba sua tabuada de 1 a 10
    // 5 -) Dado um array de números, calcule a soma de todos eles (ex: [1,2,3,4] → 10)
    // 6 -) Encontre o maior número dentro de um array (ex: [5,8,2,10,3] → 10)
    // 7 -) Crie uma variável numérica e exiba uma contagem regressiva até zero
    // 8 -) Dado um array de números, calcule somente a soma dos números pares (ex: [1,2,3,4] → 6)
    // 9 -) Crie uma função que receba um número e retorne o dobro dele
    // 10 -) Faça uma função que receba 3 notas e retorne a média do aluno
    // 11 -) Faça uma função que receba uma temperatura Celsius (ponto flutuante) e retorne o valor em Fahrenheit (fórmula: F = C x 1.8 + 32)
}