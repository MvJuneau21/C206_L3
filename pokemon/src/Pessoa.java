public abstract class Pessoa {
    private String nome;
    private String pokemonAce;
    private String idade;

    public Pessoa(String nome, String pokemonAce, String idade) {
        this.nome = nome;
        this.pokemonAce = pokemonAce;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPokemonAce() {
        return pokemonAce;
    }

    public void setPokemonAce(String pokemonAce) {
        this.pokemonAce = pokemonAce;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }
}
