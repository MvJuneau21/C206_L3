public class Main {
    public static void main(String[] args) {

        Bruxa ranni = new Bruxa();
        Vampiro vladmir = new Vampiro();
        Zumbi wesker = new Zumbi();
        ranni.aprenderFeitico("Moonveil", 350);
        ranni.aprenderFeitico("Lunar Ray", 250);
        ranni.aprenderFeitico("DeathBlow", 600);
        ranni.esquecerFeitico(1);
        ranni.setEnergia(350);
        ranni.setVida(400);
        ranni.setIdade(18);
        vladmir.setEnergia(500);
        vladmir.setVida(400);
        vladmir.setIdade(24);
        vladmir.transformar();
        wesker.setEnergia(200);
        wesker.setVida(200);
        wesker.setIdade(40);
        wesker.atacarComMordida(ranni);
        wesker.atacarComMordida(vladmir);
        vladmir.atacarComMordida(wesker);
        ranni.lancarFeitico(vladmir, 0);
        vladmir.recuperarVida();
        System.out.println(wesker.getVida());
        System.out.println(wesker.getIdade());
        System.out.println(wesker.getEnergia());
        System.out.println(wesker.getnCerebrosComidos());
        System.out.println(vladmir.getVida());
        System.out.println(vladmir.getEnergia());
        System.out.println(vladmir.getIdade());
        System.out.println(ranni.getVida());
        System.out.println(ranni.getEnergia());
        System.out.println(ranni.getIdade());
        ranni.listarFeiticos();
        vladmir.assustar(ranni);
    }
}