package com.orientaçãoaobjetos;

public class Main {
    public static void main(String[] args) {

        Carro carro = new Carro();
        carro.setNome("Fusquinha");
        carro.setVelocidade(160);
        System.out.println(carro.getNome()+" está andando a "+carro.getVelocidade()+"km/h");

        CarroEletrico carroEletrico = new CarroEletrico();
        carroEletrico.setNome("Tesla");
        carroEletrico.setVelocidade(300);
        System.out.println(carroEletrico.getNome()+" está andando a "+carroEletrico.getVelocidade()+"km/h");

    }
}