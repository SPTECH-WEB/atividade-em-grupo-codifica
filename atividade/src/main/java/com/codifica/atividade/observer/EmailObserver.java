package com.codifica.atividade.observer;

import org.springframework.stereotype.Component;

@Component
public class EmailObserver implements PedidoObserver{

    public EmailObserver() {}

    @Override
    public void notificar(String mensagem) {
        System.out.println("Email enviado: " + mensagem);
    }
}