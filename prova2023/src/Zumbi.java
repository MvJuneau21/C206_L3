public class Zumbi extends Monstro{
    private int nCerebrosComidos = 0;

    public int getnCerebrosComidos() {
        System.out.println("Cerebros comidos por zumbi: ");
        return nCerebrosComidos;
    }

    void atacarComMordida(Monstro monstroAlvo){
        monstroAlvo.setVida(monstroAlvo.getVida()-10);
        setEnergia(getEnergia()-10);
        nCerebrosComidos++;
    }
}
