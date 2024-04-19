public class Moto extends Veiculo{
 
    // Atributos
    private int cilindradas;

    // Construtores 
    public Moto(int ano, int chassi, float preco, float SemParar, int cilindradas){
        super(ano, chassi, preco, SemParar);
        this.cilindradas = cilindradas;
        setNome("Moto");
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
        this.veiculo_pagarPedagio(10);
    }
}