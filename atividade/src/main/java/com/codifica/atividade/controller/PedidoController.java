package com.codifica.atividade.controller;

import com.codifica.atividade.model.Pedido;
import com.codifica.atividade.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/pedidos")
public class PedidoController {
    @Autowired
    private PedidoService pedidoService;

    @GetMapping
    public String calcularFrete(@RequestBody Pedido pedido) {

        double valorFrete = pedido.calcularFrete(pedido.getPeso(), pedido.getTransportadora());
        pedidoService.concluirEntrega();

        return "Frete calculado: " + valorFrete;
    }
}
