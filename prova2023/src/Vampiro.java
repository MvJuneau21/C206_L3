public class Vampiro extends Monstro{
    private int medidorDeSangue;
    private boolean formaDeMorcego = false;

    void transformar(){
        System.out.println("Transformando em morcego...");
        formaDeMorcego = true;
    }
    void recuperarVida(){
    super.setVida(getVida() + medidorDeSangue);
    }
    void atacarComMordida(Monstro monstroAlvo){
    monstroAlvo.setVida(monstroAlvo.getVida()- 20);
    setEnergia(getEnergia()- 20);
    medidorDeSangue = monstroAlvo.getVida();
    }
}
