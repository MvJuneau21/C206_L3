import java.util.Comparator;

public class Receita implements Comparator<Receita>{
    private String nome;
    private int dificuldade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(int dificuldade) {
        this.dificuldade = dificuldade;
    }

    @Override
    public String toString() {
        return("Nome da receita: " + nome + " - Dificulade: " + dificuldade);
    }

    @Override
    public int compare(Receita o1, Receita o2) {
        return o1.compare(o1, o2);
    }
}
