public class Zumbi {

    String nome;
    double vida;
    float quantia;


    void tranferirVida(Zumbi z2, float quantia){
        vida -= quantia;
        z2.vida += quantia;
    }

}