package pcmania;

public class Computador {
    private String marca;
    private float preco;
    private HardwareBasico[] hardwares;
    private SistemaOperacional os;
    private MemoriaUSB musb;
    private int qtdHardware;

    public Computador(String marca, float preco, String osNome, int osTipo) {
        this.marca = marca;
        this.preco = preco;
        // Composição: OS e array de Hardware criados junto com o PC
        this.os = new SistemaOperacional(osNome, osTipo);
        this.hardwares = new HardwareBasico[5];
        this.qtdHardware = 0;
    }

    public float getPreco() { return preco; }

    public void addHardware(String nome, float capacidade) {
        if (qtdHardware < hardwares.length) {
            // Composição: HardwareBasico instanciado por Computador
            hardwares[qtdHardware] = new HardwareBasico(nome, capacidade);
            qtdHardware++;
        }
    }

    // Agregação: MemoriaUSB instanciada fora e adicionada ao Computador
    public void addMemoriaUSB(MemoriaUSB musb) {
        this.musb = musb;
    }

    public void mostraPCConfigs() {
        System.out.println("Marca: " + marca);
        System.out.println("Preço: R$ " + preco);
        System.out.println("Hardware Básico:");
        for (int i = 0; i < qtdHardware; i++) {
            if (hardwares[i] != null) {
                // Formatação simples para exibir Gb ou Mhz conforme o valor
                String unidade = (hardwares[i].getCapacidade() >= 1000 && hardwares[i].getNome().contains("Pentium")) ? " Mhz" : " Gb";
                System.out.println(" - " + hardwares[i].getNome() + ": " + hardwares[i].getCapacidade() + unidade);
            }
        }
        System.out.println("Sistema Operacional: " + os.getNome() + " (" + os.getTipo() + " bits)");
        if (musb != null) {
            System.out.println("Acompanha: " + musb.getNome() + " de " + musb.getCapacidade() + " Gb");
        }
        System.out.println("-------------------------");
    }
}