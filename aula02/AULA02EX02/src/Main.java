public class Main {
    public static void main(String[] args) {
        Jogador jogador = new Jogador();
        jogador.arma.dano = 999;
        jogador.arma.custoDeEnergia = 666;
        jogador.vida = 1000;
        jogador.energia = 800;
        int vidaAlvo = 999;
        atacar(jogador.arma.dano, jogador.energia, jogador.arma.custoDeEnergia, vidaAlvo);
        String cout = jogador.toString();
        System.out.println(cout);
    }
    public static void atacar(int dano, int energia, int custo, int alvo){
        if(custo > energia){
            System.out.printf("ataque não é possível");
        }
        else{
            System.out.println("Vida restante do alvo: "+ (alvo-dano));
            System.out.println("Energia restante: "+ (energia - custo));
        }
    }
}