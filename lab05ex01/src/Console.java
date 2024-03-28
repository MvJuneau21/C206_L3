public class Console extends Produto{
    public Console(double valor, String nome, String geracao, String marca) {
        super(valor, nome);
        this.geracao = geracao;
        this.marca = marca;
    }

    public String getGeracao() {
        return geracao;
    }

    public void setGeracao(String geracao) {
        this.geracao = geracao;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    private String geracao;
    private String marca;
    public void jogar(){
        System.out.println("Jogando...");
    }

    @Override
    public void mostraInfo() {
        jogar();
        super.mostraInfo();
        System.out.println(marca);
        System.out.println(geracao);
    }
}
