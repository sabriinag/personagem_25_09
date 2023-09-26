public class Personagem {
    //variáveis de instância 
    //instância é sinônimo de objeto 
    String nome;
    int energia;
    int fome;
    int sono;
    String poder;
    

    //tipo de retorno
    //nome
    //lista de parâmetros
    //corpo

    void cacar(){
        if(energia >= 2){
            energia -= 2 ;
            System.out.println(nome + " caçando"); 
        }else{
            System.out.println(nome + " sem energia para caçar x_x");
        }

        fome  = Math.min(fome + 1, 10);
        sono = sono + 1 > 10 ? 10 : sono + 1;
    }

    void comer(){
        if(fome >= 1){
            --fome;
            energia = energia + 1 > 10 ? 10 : energia + 1;
            System.out.printf("%s está comendo\n", nome);
        }else{
            System.out.println(" está sem fome para comer ");
        }
    }

    void dormir(){
        if(sono >= 1){
            --sono;
            energia = energia + 1 > 10 ? 10 : energia + 1;
            System.out.print(nome + " foi dormir -.- zzz\n");
        }else{
            System.out.println(" está sem sono *_*\n");
        }
    }

    void exibirEstado(){
        System.out.printf(
            "%s : e: %d, f: %d, s: %d\n",
            nome,
            energia,
            fome,
            sono
        );
    }

}
    