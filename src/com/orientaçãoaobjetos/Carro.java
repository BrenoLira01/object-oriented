package com.orientaçãoaobjetos;

public class Carro implements CarroInterface {

    protected String nome ;
    protected int velocidade = 0;

    @Override
    public void setNome(String nome) {
    this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    @Override
    public void setVelocidade(int incremento) {
        this.velocidade += incremento;
    }

    public int getVelocidade(){
        return velocidade;
    }
}
