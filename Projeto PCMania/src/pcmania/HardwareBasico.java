package pcmania;

public class HardwareBasico {
    private String nome;
    private float capacidade;

    public HardwareBasico(String nome, float capacidade) {
        this.nome = nome;
        this.capacidade = capacidade;
    }

    // Getters necessários para exibir as informações posteriormente
    public String getNome() { return nome; }
    public float getCapacidade() { return capacidade; }
}