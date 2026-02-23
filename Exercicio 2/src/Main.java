import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Entre com a NP1: ");
        float NP1 = entrada.nextInt();
        System.out.println("Entre com a NP2: ");
        float NP2 = entrada.nextInt();

        float total = NP1+NP2;
        float media = total / 2;


        if(media >= 60)
        {
            System.out.println("Aluno Aprovado!");
        }
        else{
            System.out.println("Aluno de NP3!");
            System.out.println("Qual a nota da NP3?");
            float NP3 = entrada.nextFloat();
            float NFA = (NP3+media)/2;
            if(NFA >= 50)
            {
                System.out.println("Aluno aprovado!");
            }
            else {
                System.out.println("Aluno Reprovado!");
            }
        }

        entrada.close();
    }


}