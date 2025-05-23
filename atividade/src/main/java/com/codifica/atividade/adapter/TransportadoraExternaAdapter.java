package com.codifica.atividade.adapter;

import com.codifica.atividade.external.TransportadoraExternaAPI;

public class TransportadoraExternaAdapter {

    private TransportadoraExternaAPI apiExterna;

    public TransportadoraExternaAdapter(TransportadoraExternaAPI apiExterna) {
        this.apiExterna = apiExterna;
    }

    public double calcularFrete(double peso){
        return apiExterna.calcularFrete(peso);
    }
}