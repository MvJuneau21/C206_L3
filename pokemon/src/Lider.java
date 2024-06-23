public class Lider extends Pessoa {
    private String nomeCidade;

    public Lider(String nome, String pokemonAce, String idade, String nomeCidade) {
        super(nome, pokemonAce, idade);
        this.nomeCidade = nomeCidade;
    }

    public String getNomeCidade() {
        return nomeCidade;
    }

    public void setNomeCidade(String nomeCidade) {
        this.nomeCidade = nomeCidade;
    }
}
