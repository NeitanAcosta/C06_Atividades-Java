public class Main  {

    public void main(String[] args){
        Zumbi z1 = new Zumbi();
        Zumbi z2 = new Zumbi();

        z1.nome = "Chris";
        z2.nome =  "Pizzoni";

        z1.vida = 200;
        z2.vida = 200;

        System.out.println("Vida Inicial: " + z1.vida);
        System.out.println("Vida Inicial: " + z2.vida);

        z1.tranferirVida(z2, 50);
        System.out.println("Vida Final: " + z1.vida);
        System.out.println("Vida Final: " + z2.vida);
    }

}