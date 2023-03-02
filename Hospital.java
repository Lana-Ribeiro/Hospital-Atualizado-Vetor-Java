// Projeto Hospital LANA RIBEIRO;
// Manipulação de Arrays;
// Projeto consiste em uma Ala de hospital que entrou em reforma e aumentou o seu número de Quartos
// Onde a capacidade inicial era de 10 quartos na Ala mas com a reforma dobrou o número;
// Ao decorrer do programa tem suas especificações detalhadas sobre suas funções;
// O usuário pode manipular Consultando quantos quartos tem na ala, disponibilidade, indisponibilidade, busca de quartos e adiconar quartos com a nova reforma;

public class Hospital {

    public static void main(String[] args) {
      
        Ala ala = new Ala(10); //Construtor (capacidade inicial da ala é de 10 quartos)


     try{
           ala.adicionaQuarto("Quarto 01");
           ala.adicionaQuarto("Quarto 02");
           ala.adicionaQuarto("Quarto 03");
           ala.adicionaQuarto("Quarto 04");
           ala.adicionaQuarto("Quarto 05");
           ala.adicionaQuarto("Quarto 06");
           ala.adicionaQuarto("Quarto 07");
           ala.adicionaQuarto("Quarto 08");
           ala.adicionaQuarto("Quarto 09");
           ala.adicionaQuarto("Quarto 10");
           ala.adicionaQuarto("Quarto 18"); //adicionando quarto 18
           ala.adicionaQuarto("Quarto 19"); //adicionando quarto 19
       } catch(Exception e){
           e.printStackTrace();
        }

        System.out.println("\nO numero de quartos que tem na Ala A é de:\n" +ala.ala());

        System.out.print("\nQuartos Disponiveis na Ala A:\n"+ala.toString());
        
       try {
        ala.removerQuarto(0); //remover Quarto 1
    } catch (Exception e) {

        e.printStackTrace();
    }

    System.out.println();

    System.out.println("\nQuarto 1 foi ocupado e está Indisponível!\nPortanto os seguintes quartos Diponíveis são:\n" +ala.toString());

        try {
        System.out.println("\nBuscar Quinto Quarto : " +ala.buscaQuarto(3)); // metodo de buscar o quarto 5
        } catch (Exception e){
            e.printStackTrace();
        }

        
    }
    
}
