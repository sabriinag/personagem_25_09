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
        System.out.println(nome + " caçando ");
        
    }

    void comer(){
        System.out.printf("%s está comendo o %s\n", nome);
    }

    void dormir(){
        System.out.print(nome + " dormindo\n");
    }



}
    