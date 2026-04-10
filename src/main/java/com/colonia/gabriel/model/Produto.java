package com.colonia.gabriel.model;

public abstract class Produto {
    protected int id;
    protected String nome;
    protected float preço;



    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public float getPreço() {
        return preço;
    }
    public void setPreço(float preço) {
        this.preço = preço;
    }


    
}
