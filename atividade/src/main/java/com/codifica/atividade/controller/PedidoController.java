package com.codifica.atividade.controller;

import com.codifica.atividade.model.Pedido;
import com.codifica.atividade.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/pedidos")
public class PedidoController {
    @Autowired
    private PedidoService pedidoService;

    @PostMapping
    public String calcularFrete(@RequestBody Pedido pedido) {

        double valorFrete = pedidoService.calcularFrete(pedido.getPeso(), pedido.getTipoEntrega());
        pedidoService.concluirEntrega();

        return "Frete calculado: " + valorFrete;
    }
}
