public class Main {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador();
        Jogador jogador2 = new Jogador();
        Arma arma = new Arma();
        jogador1.setVida(900);
        jogador2.setVida(700);
        jogador1.setArma(arma);
        jogador2.setArma(arma);
        jogador1.setEnergia(800);
        jogador2.setEnergia(600);
        arma.setCustoDeEnergia(700);
        arma.setDano(700);
        jogador1.atacar(jogador2);
        System.out.println(jogador1.toString());
        System.out.println(jogador2.toString());
    }
}