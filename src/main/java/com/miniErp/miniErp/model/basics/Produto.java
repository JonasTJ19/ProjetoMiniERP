package com.miniErp.miniErp.model.basics;

import jakarta.persistence.*;

@Entity
@Table (name= "produto")
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nomeProduto;
    private double precoCompra;
    private double precoVenda;
    private int quantidadeProduto;
    private String codigoInterno;
    private String tipo;
    private int estoqueAtual;
    private int estoqueMinimo;

    public Produto(){}

    public Produto(String nomeProduto, double precoCompra, double precoVenda, int quantidadeProduto, String codigoInterno, String tipo, int estoqueAtual, int estoqueMinimo){
        this.nomeProduto = nomeProduto;
        this.precoCompra = precoCompra;
        this.precoVenda = precoVenda;
        this.quantidadeProduto = quantidadeProduto;
        this.codigoInterno = codigoInterno;
        this.tipo = tipo;
        this.estoqueAtual = estoqueAtual;
        this.estoqueMinimo = estoqueMinimo;
    }

    public Produto(Produto produto) {
        this.nomeProduto = produto.getNomeProduto();
        this.precoCompra = produto.getPrecoCompra();
        this.precoVenda = produto.getPrecoVenda();
        this.quantidadeProduto = produto.getQuantidadeProduto();
        this.codigoInterno = produto.getCodigoInterno();
        this.tipo = produto.getTipo();
        this.estoqueAtual = produto.getEstoqueAtual();
        this.estoqueMinimo = produto.getEstoqueMinimo();
    }

    public String getNomeProduto(){
        return nomeProduto;
    }
    public void setNomeProduto(String nomeProduto){
        this.nomeProduto = nomeProduto;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setPrecoCompra(double precoCompra) {
        this.precoCompra = precoCompra;
    }

    public void setPrecoVenda(double precoVenda) {
        this.precoVenda = precoVenda;
    }

    public void setQuantidadeProduto(int quantidadeProduto) {
        this.quantidadeProduto = quantidadeProduto;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setCodigoInterno(String codigoInterno) {
        this.codigoInterno = codigoInterno;
    }

    public void setEstoqueAtual(int estoqueAtual) {
        this.estoqueAtual = estoqueAtual;
    }

    public void setEstoqueMinimo(int estoqueMinimo) {
        this.estoqueMinimo = estoqueMinimo;
    }

    public int getEstoqueMinimo() {
        return estoqueMinimo;
    }

    public String getTipo() {
        return tipo;
    }

    public int getEstoqueAtual() {
        return estoqueAtual;
    }

    public String getCodigoInterno() {
        return codigoInterno;
    }

    public int getQuantidadeProduto() {
        return quantidadeProduto;
    }

    public double getPrecoVenda() {
        return precoVenda;
    }

    public double getPrecoCompra() {
        return precoCompra;
    }

    public Integer getId() {
        return id;
    }
}
