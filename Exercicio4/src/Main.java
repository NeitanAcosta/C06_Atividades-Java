import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        //entrada de dados
        Scanner entrada = new Scanner(System.in);

        System.out.println("Entre com o número de alunos: ");
        int numAlunos = entrada.nextInt();

        switch (numAlunos){
            case 10,20:
                System.out.println("Sala I-16");
                break;
            case 30:
                System.out.println("Sala I-22");
                break;

        }

        entrada.close();
    }

}