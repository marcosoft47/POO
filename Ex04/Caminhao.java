public class Caminhao extends Veiculo{

    // Atributos
    private int capacidadeTotal;
    private int capacidadeAtual;

    public Caminhao( int ano, int chassi, float preco, float semParar, int capacidadeTotal){
        super(ano, chassi, preco, semParar);
        this.capacidadeTotal = capacidadeTotal;
        setCapacidadeAtual(0); // ad hoc
    }
    
    // Getters e Setters
    public int getCapacidadeAtual() {
        return capacidadeAtual;
    }
    public void setCapacidadeAtual(int capacidadeAtual) {
        if (capacidadeAtual <= this.capacidadeTotal)
            this.capacidadeAtual = capacidadeAtual;
        else
            System.out.println("Carga excedida!");
    }
    
    public int getCapacidadeTotal() {
        return capacidadeTotal;
    }
    public void setCapacidadeTotal(int capacidadeTotal) {
        this.capacidadeTotal = capacidadeTotal;
    }

    // Funções
    public void PagarPedagio(){
        float saldo = this.getSemParar(); // Adicionar o valor na memória ao invés de chamar um monte de vezes
        saldo -= 40;
        if (saldo > 0){
            this.setSemParar(saldo);
            System.out.println("Dinheiro: " + saldo);
        }
        else{
            System.out.println("Caminhão sem dinheiro suficiente!");
        }
    }
}