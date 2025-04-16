package com.codifica.atividade.strategy;

public class EntregaTercerizadaStrategy implements EntregaStrategy {

    @Override
    public double calcularFrete(double peso) {
        return peso * 5.0;
    }
}
