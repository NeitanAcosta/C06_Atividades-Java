package pcmania;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Dados estáticos conforme exigido no PDF
        float matricula = 690.0f;
        Cliente cliente = new Cliente("Neymar da Silva Santos Júnior", "123.456.789-00");

        int opcao;

        do {
            System.out.println("\n===== MENU PC MANIA =====");
            System.out.println("1 - Promoção 1 (Apple)   - R$ " + matricula);
            System.out.println("2 - Promoção 2 (Samsung) - R$ " + (matricula + 1234));
            System.out.println("3 - Promoção 3 (Dell)    - R$ " + (matricula + 5678));
            System.out.println("0 - Finalizar Compra");
            System.out.println("-------------------------");
            // Aqui chamamos o método do cliente para pegar o valor parcial!
            System.out.println("Total no carrinho: R$ " + cliente.calculaTotalCompra());
            System.out.println("-------------------------");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    Computador pc1 = new Computador("Apple", matricula, "macOS Sequoia", 64);
                    pc1.addHardware("Pentium Core i3", 2200);
                    pc1.addHardware("Memória RAM", 8);
                    pc1.addHardware("HD", 500);
                    pc1.addMemoriaUSB(new MemoriaUSB("Pendrive", 16));
                    cliente.addComputador(pc1);
                    System.out.println("> Promoção 1 adicionada ao carrinho!");
                    break;
                case 2:
                    Computador pc2 = new Computador("Samsung", matricula + 1234, "Windows 8", 64);
                    pc2.addHardware("Pentium Core i5", 3370);
                    pc2.addHardware("Memória RAM", 16);
                    pc2.addHardware("HD", 1000); // 1Tb = 1000Gb
                    pc2.addMemoriaUSB(new MemoriaUSB("Pen-drive", 32));
                    cliente.addComputador(pc2);
                    System.out.println("> Promoção 2 adicionada ao carrinho!");
                    break;
                case 3:
                    Computador pc3 = new Computador("Dell", matricula + 5678, "Windows 10", 64);
                    pc3.addHardware("Pentium Core i7", 4500);
                    pc3.addHardware("Memória RAM", 32);
                    pc3.addHardware("HD", 2000); // 2Tb = 2000Gb
                    pc3.addMemoriaUSB(new MemoriaUSB("HD Externo", 1000)); // 1Tb = 1000Gb
                    cliente.addComputador(pc3);
                    System.out.println("> Promoção 3 adicionada ao carrinho!");
                    break;
                case 0:
                    System.out.println("Finalizando o atendimento...\n");
                    break;
                default:
                    System.out.println("> Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);

        // Impressão final e processamento do pedido
        cliente.mostraInfo();
        ProcessarPedido.processar(cliente.getComputadores());

        sc.close();
    }
}