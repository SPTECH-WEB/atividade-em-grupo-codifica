package com.codifica.atividade.strategy;

public class EntregaExpressaStrategy implements EntregaStrategy {

    @Override
    public double calcularFrete(double peso) {
        return peso * 3.0;
    }
}
