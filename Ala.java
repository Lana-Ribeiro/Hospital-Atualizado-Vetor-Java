public class Ala {

    private String[] quartos;
    private int ala;
    public String adicionaQuarto;

    public Ala (int capacidadeAla){
        this.quartos = new String[capacidadeAla];
        this.ala =0;
    }

    public void adicionaQuarto(String quartos) throws Exception{ // método para adicionar o quartos na ala
        this.aumentaQuartonaAla();
        if(this.ala < this.quartos.length){
            this.quartos[this.ala] = quartos;
            this.ala++;
        } else{
            throw new Exception("Ala Cheia!!");
        }
    }

    public int ala(){
        return this.ala;
    }

    
    @Override
    public String toString(){  //método toString
        StringBuilder s= new StringBuilder();
        s.append("[");

        for(int i=0;i<this.ala-1;i++){
            s.append(this.quartos[i]);
            s.append(",");
        }
        if(this.ala > 0){
            s.append(this.quartos[this.ala-1]);
        }

        s.append("]");


        return s.toString();

    }

    public String buscaQuarto(int numquarto) throws Exception{ //método para fazer a busca dos quartos
        if(numquarto >= 0 && numquarto < ala){
            return quartos[numquarto];
        }   else {
            throw new Exception("Número do Quarto");
        }
    }

    public int quarto1(String quarto){
        for(int i=0; i<ala;i++){
            if(quartos[i].equals(quarto)){
                return i;
            }
        }
        return -1;
    }

    public boolean adicionaQuarto (int numquarto, String quartos) throws Exception{ //Método adicionar quarto buscando o seu numero e ver se eles existe
        this.aumentaQuartonaAla();
        if(numquarto >=0 && numquarto < ala){
            for(int i = this.ala-1; i>numquarto; i++){
                this.quartos[i+1] = this.quartos[i];
            }
            this.quartos[numquarto]= quartos;
            this.ala++;
        } else {
            throw new Exception("Número do Quarto Inválido");
        }

        return true;
    }

    public void aumentaQuartonaAla(){ //Com a Ala nova e reformada dobrou o número de quartos, então fiz um método para receber esses quartos novos aumentando a array antiga
        if(this.ala == this.quartos.length){
            String [] quartosNovos = new String[this.quartos.length * 2];

            for( int  i=0; i<this.quartos.length; i++){
                quartosNovos[i] = this.quartos[i];
            }
            this.quartos = quartosNovos;
        }
    }

    public void removerQuarto(int numquarto) throws Exception{ // Método para mostrar qual quarto esta ocupado e automaticamente indisponivel

        if(numquarto >= 0 && numquarto <ala){
            for(int i = numquarto; i<this.ala-1;i++){
                this.quartos[i]= this.quartos[i+1];
            }
            this.ala--;
        } else {
            throw new Exception("Quarto Inválido!!");
        }
    }
 
}
