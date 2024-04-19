public class Veiculo{
    
    // Atributos
    private int ano;
    private int chassi;
    private float preco;
    private float semParar;


    // Construtores
    public Veiculo(int ano, int chassi, float preco, float semParar){
        this.ano = ano;
        this.chassi = chassi;
        this.preco = preco;
        this.semParar = semParar;
    }
    
    // Getters e Setters

    public int getAno() {
        return this.ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getChassi() {
        return chassi;
    }
    public void setChassi(int chassi) {
        this.chassi = chassi;
    }

    public float getPreco() {
        return preco;
    }
    public void setPreco(float preco) {
        this.preco = preco;
    }

    public float getSemParar() {
        return semParar;
    }
    public void setSemParar(float semParar) {
        this.semParar = semParar;
    }
    

    // Funções

    /** Paga pedagio do veiculo */
    public void PagarPedagio(){ 
        //Este método será sobrescrito nas subclasses

        // Sinto que eu poderia reutilizar essa função nas outras classes
        // A função Pagar Pedagio nas outras classes poderia só chamar essa classe e fazer a mesma operação
        // Criar um atributo com o nome e só concatenar ele na mensagem de erro
        // System.out.println(this.nome + "sem dinheiro suficiente!");
    }

    
}