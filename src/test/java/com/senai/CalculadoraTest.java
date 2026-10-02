package com.senai;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculadoraTest {
    // Cria uma anotação Test
    @Test
    void testarSoma(){
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.somar(3, 2);
        // metodo para comparar o resultado
        assertEquals(5,resultado);
    }

    // Função para testar a multiplicação
    @Test 
    void testarMult(){
        Calculadora calc = new Calculadora();
        int res = calc.multiplicacao(3, 2);
        assertEquals(6, res);

    }
}
