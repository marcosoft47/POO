public class Radio{
    private String estacao;
    private int canal;
    private int volume;

    // Construtores
    public Radio(){}

    public Radio(String estacao){
        this.estacao = estacao;
        if (estacao.compareTo("AM") == 0)
            canal = 20;
        else if (estacao.compareTo("FM") == 0)
            canal = 80;
    }

    // Getters e Setter
    public int getCanal() {
        return canal;
    }
    public void setCanal(int canal) {
        this.canal = canal;
    }

    public String getEstacao() {
        return estacao;
    }
    public void setEstacao(String estacao) {
        this.estacao = estacao;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
    public int getVolume() {
        return volume;
    }

    // Funções
    public void AumentarVolume(){
        if (this.volume<100)
            this.volume += 10;
    }

    public void DiminuirVolume(){
        if (this.volume > 0)
            this.volume -= 10;
    }
}