import java.util.Random;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        //entrada de dados
        Scanner entrada = new Scanner(System.in);

        Random rand = new Random();
        int x = rand.nextInt(10) + 1;

        System.out.println("Adivinhe o numero: ");
        int n = entrada.nextInt();

        //loop para o usuario
        while(n != x)
        {
            System.out.println("Errou! Tente novamente: ");
            n = entrada.nextInt();
        }

        System.out.println("Você acertou o numero!: " +n );

        entrada.close();
    }
}
