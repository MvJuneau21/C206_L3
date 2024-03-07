public class Rato {
    float velocidade;
    boolean escondido;
    public void escondeRato(boolean esconde){
        esconde = true;
        System.out.println("O rato esta escondido");
    }
    public void procurarComida(boolean esconde){
        esconde = false;
        System.out.println("O Rato foi procurar comida");
    }
    public String toString() {
        return ("Velocidade do rato: " + velocidade);
    }
}
