public class Item implements Comparable<Item>{
    private int valor;
    private String nome;

    public Item(int valor, String nome) {
        this.valor = valor;
        this.nome = nome;
    }

    public int getValor() {
        return valor;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        try {
            return("Item: " + nome + " Preço: " + valor);
        }   catch (NullPointerException e){
            return("Erro: " + e);
        }
    }

    @Override
    public int compareTo(Item o) {
        return o.nome.compareTo(this.nome);
    }
}
