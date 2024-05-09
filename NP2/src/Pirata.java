public abstract class Pirata {
    private String nome;
    private String comidaFavorita;
    private int poder;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getComidaFavorita() {
        return comidaFavorita;
    }

    public void setComidaFavorita(String comidaFavorita) {
        this.comidaFavorita = comidaFavorita;
    }

    public int getPoder() {
        return poder;
    }

    public void setPoder(int poder) {
        this.poder = poder;
    }
    public Pirata lutar(Pirata pirata){
        if (poder > pirata.getPoder()){
            System.out.println(nome + " Venceu o duelo!");
            return this;
        }
        else if (pirata.getPoder() > poder){
            System.out.println(pirata.getNome() + " Venceu o duelo!");
            return pirata;
        }
        else System.out.println("Empate!");
        return pirata;
    }
    public void Comer(Cozinheiro cozinheiro, int index){
        System.out.println("Cozinheiro " + cozinheiro.getNome() + " fará o prato");
        cozinheiro.prepararPrato(index);
        if(cozinheiro.getLivroDeReceitas().get(index).getNome() == comidaFavorita){
            System.out.println("Hmmm que delícia|!");
            poder = poder + 100;
            System.out.println("Poder aumentado para: " + poder);
        }
        else {
            poder = poder + 50;
            System.out.println("Poder aumentado para: " + poder);
        }
    }
}
