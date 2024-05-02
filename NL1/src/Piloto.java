public class Piloto {
    private String nome;
    private int idade;
    private String nacionalidade;
    static int idGeral;
    private int id;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public static int getIdGeral() {
        return idGeral;
    }

    public static void setIdGeral(int idGeral) {
        Piloto.idGeral = idGeral;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void correr(Carro carro){
        carro.correr();
    }
}
