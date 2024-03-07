public class Jogador {
    int vida;
    int energia;
    Arma arma = new Arma();
    public String toString() {
        return ("Vida do jogador: "+ vida+ " // Dano da arma: "+ arma.dano + " // Energia do jogador: " + energia + " // Custo da arma: " + arma.custoDeEnergia);
    }
}
