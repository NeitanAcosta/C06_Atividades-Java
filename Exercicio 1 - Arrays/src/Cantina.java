public class Cantina {


    String nome;
    Salgado[] salgados = new Salgado[5];

    void addSalgado(Salgado novoSalgado){

        for(int i=0;i<salgados.length;i++){ //varredno a array de salgado
            if(salgados[i]==null){ //verifica se existe ou não salgado
                salgados[i]=novoSalgado;
                break; // adiciona e sai do metodo
            }
        }
    }



    void mostraInfo(){
        System.out.println(nome);
        for (Salgado salgado : salgados){
            if(salgado!=null){
                System.out.println(salgado.nome);
            }
        }
    }
}




