package Jogador;

import Inimigo.Asteroide;

public class Nave       {

    //atributos privados
    private String nome;
    private double vida;
    private String tipoTiro;

    //construtor publico
    public Nave(String nome, double vida, String tipoTiro) {
        this.nome = nome;
        this.vida = vida;
        this.tipoTiro = tipoTiro;

        //print com nome e vida da nave
        System.out.println("A Nave " + this.nome + " com vida " + this.vida + " esta pronta!");
    }

    //metodo publico
    public void atirar(Asteroide ast){
        System.out.println("A nave " + this.nome + " disparou " + this.tipoTiro + " contra " + ast.getNome() );

        ast.destruir();
    }





}
