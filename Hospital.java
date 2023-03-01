public class Hospital {


    /**
     * @param args
     */
    public static void main(String[] args) {
        
        Ala ala = new Ala(6);

        try{
            ala.adicionaQuarto("Quarto 01");
            ala.adicionaQuarto("Quarto 02");
            ala.adicionaQuarto("Quarto 03");
            ala.adicionaQuarto("Quarto 04");
            ala.adicionaQuarto("Quarto 05");
            ala.adicionaQuarto("Quarto 06");
        } catch(Exception e){
            e.printStackTrace();
        }

        System.out.println("O numero de quartos que tem na Ala A é de: " +ala.ala());

        System.out.print("\nQuartos Novos e Disponiveis na Ala A:  "+ala.toString());
        
        try {
            System.out.println("Quarto 6 removido com Sucesso! " ala.removerQuarto());

        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
        System.out.println("\nBuscar Quinto Quarto : " +ala.buscaQuarto(4));
        } catch (Exception e){
            e.printStackTrace();
        }

        System.out.println(("Primeiro Quarto: " +ala.quarto1(null)));


    }


    
}
