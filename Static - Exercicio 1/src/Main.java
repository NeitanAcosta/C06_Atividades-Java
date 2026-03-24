import Inimigo.Asteroide;
import Jogador.Nave;

public class Main {

    public static void main(String[] args) {

        Nave minhaNave = new Nave("Nave Jonas", 100.0, "Tiro Explosivo");

        System.out.println("Jogo Iniciando");

        Asteroide meteoro1 = new Asteroide("Meteoro Gigante", "Rocha");
        Asteroide meteoro2 = new Asteroide("Meteoro Pequeno", "Gelo");

        //colocando o alvo na nave
        minhaNave.atirar(meteoro1);

        System.out.println("Fim do turno");

        //atirando em outro asteroide
        minhaNave.atirar(meteoro2);
    }
}
