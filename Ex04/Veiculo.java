public class Veiculo{
    
    // Atributos
    private int ano;
    private int chassi;
    private float preco;
    private float semParar;
    private String nome;


    // Construtores
    public Veiculo(int ano, int chassi, float preco, float semParar){
        this.ano = ano;
        this.chassi = chassi;
        this.preco = preco;
        this.semParar = semParar;
        this.nome = "Veiculo";
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
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    

    // Funções

    /** Paga pedagio do veiculo */
    public void veiculo_pagarPedagio(float gasto){
        // Sinto que eu poderia reutilizar essa função nas outras classes
        // A função Pagar Pedagio nas outras classes poderia só chamar essa classe e fazer a mesma operação
        // Criar um atributo com o nome e só concatenar ele na mensagem de erro
        // Sim eu criei atributo do nada, contudo, ficou mais organizado e mais fácil para futuros veiculos (que não vão existir)

        float saldo = this.getSemParar(); // Adicionar o valor na memória ao invés de chamar um monte de vezes
        saldo -= gasto;
        if (saldo > 0){
            this.setSemParar(saldo);
            System.out.println("Dinheiro: " + saldo);
        }
        else{
            System.out.println(this.getNome() + " sem dinheiro suficiente!");
        }
    }

    
}