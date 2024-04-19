public class Carro extends Veiculo{
    Radio frequencia = new Radio("FM");
    Radio amplitude = new Radio("AM");
    private boolean automatico;

    // Construtores
    public Carro(int ano, int chassi, float preco, float semParar, boolean automatico){
        super(ano, chassi, preco, semParar);
        this.automatico = automatico;
        this.setNome("Carro");
    }

    // Getters e Setters
    public boolean getAutomatico(){
        return this.automatico;
    }
    public void setAutomatico(boolean automatico) {
        this.automatico = automatico;
    }

    // Funções
    public void PagarPedagio(){
        this.veiculo_pagarPedagio(20);
    }
}