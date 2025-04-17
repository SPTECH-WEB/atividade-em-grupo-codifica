package com.codifica.atividade.observer;

import org.springframework.stereotype.Component;

@Component
public class SmsObserver implements PedidoObserver {

    public SmsObserver(){}

    @Override
    public void notificar(String mensagem){
        System.out.println("SMS enviado: " + mensagem);
    }
}