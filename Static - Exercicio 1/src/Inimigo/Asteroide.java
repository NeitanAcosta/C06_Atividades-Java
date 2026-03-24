package Inimigo;

public class Asteroide {

    //atributos privados
    private String nome;
    private String tipoAsteroide;

    //construtor
    public Asteroide(String nome, String tipoAsteroide) {
        this.nome = nome;
        this.tipoAsteroide = tipoAsteroide;
        //Print para mostrar que nasceu um asteroide
        System.out.println("--> Um Asteroide do tipo '" + this.tipoAsteroide + "' chamado '" + this.nome + "' apareceu!");
    }

    //metodo destruir

    public void destruir(){
        System.out.println("-> O Asteroide " + this.nome + " Foi destruido");
    }

    //getter para printar na main
    public String getNome() {
        return nome;
    }
}
