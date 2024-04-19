public class Moto extends Veiculo{
 
    // Atributos
    private int cilindradas;

    // Construtores 
    public Moto(int ano, int chassi, float preco, float SemParar, int cilindradas){
        super(ano, chassi, preco, SemParar);
        this.cilindradas = cilindradas;
    }

    // Getters e Setters
    public int getCilindradas() {
        return cilindradas;
    }
    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }

    // Funções
    public void PagarPedagio(){
        float saldo = this.getSemParar(); // Adicionar o valor na memória ao invés de chamar um monte de vezes
        saldo -= 10;
        if (saldo > 0){
            this.setSemParar(saldo);
            System.out.println("Dinheiro: " + saldo);
        }
        else{
            System.out.println("Moto sem dinheiro suficiente!");
        }
    }
}