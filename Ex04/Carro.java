public class Carro extends Veiculo{
    Radio frequencia = new Radio("FM");
    Radio amplitude = new Radio("AM");
    private boolean automatico;

    // Construtores
    public Carro(int ano, int chassi, float preco, float semParar, boolean automatico){
        super(ano, chassi, preco, semParar);
        this.automatico = automatico;
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
        float saldo = this.getSemParar(); // Adicionar o valor na memória ao invés de chamar um monte de vezes
        saldo -= 20;
        if (saldo > 0){
            this.setSemParar(saldo);
            System.out.println("Dinheiro: " + saldo);
        }
        else{
            System.out.println("Carro sem dinheiro suficiente!");
        }
    }
}