package com.codifica.atividade.model;

public class Pedido {

    private String nome;
    private String produto;
    private Double peso;
    private String tipoEntrega;

    public Pedido(String nome, String produto, Double peso, String tipoEntrega) {
        this.nome = nome;
        this.produto = produto;
        this.peso = peso;
        this.tipoEntrega = tipoEntrega;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public String getTipoEntrega() {
        return tipoEntrega;
    }

    public void setTipoEntrega(String tipoEntrega) {
        this.tipoEntrega = tipoEntrega;
    }
}
