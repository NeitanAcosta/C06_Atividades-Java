package pcmania;

public class Cliente {
    private String nome;
    private String cpf;
    private Computador[] computadores;
    private int qtdPCs;

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        // Limite arbitrário de 100 PCs, já que ArrayList não é permitido
        this.computadores = new Computador[100];
        this.qtdPCs = 0;
    }

    public void addComputador(Computador c) {
        if (qtdPCs < computadores.length) {
            computadores[qtdPCs] = c;
            qtdPCs++;
        }
    }

    public float calculaTotalCompra() {
        float total = 0;
        for (int i = 0; i < qtdPCs; i++) {
            if (computadores[i] != null) {
                total += computadores[i].getPreco();
            }
        }
        return total;
    }

    public Computador[] getComputadores() {
        return computadores;
    }

    public void mostraInfo() {
        System.out.println("=== RESUMO DA COMPRA ===");
        System.out.println("Cliente: " + nome + " | CPF: " + cpf);
        System.out.println("-------------------------");
        for (int i = 0; i < qtdPCs; i++) {
            if (computadores[i] != null) {
                computadores[i].mostraPCConfigs();
            }
        }
        System.out.println("TOTAL DA COMPRA: R$ " + calculaTotalCompra());
        System.out.println("=========================");
    }
}