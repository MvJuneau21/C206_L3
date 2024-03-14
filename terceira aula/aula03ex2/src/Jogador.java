public class Jogador {
    private Arma arma = new Arma();
    private int energia;
    private int vida;

    public Arma getArma() {
        return arma;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }
    public void atacar(Jogador alvo){
        if(this.energia >= arma.getCustoDeEnergia()){
            alvo.vida = alvo.vida - this.arma.getDano();
            this.energia = this.energia - this.arma.getCustoDeEnergia();
        }
        else System.out.println("Energia insuficiente");
    }

    @Override
    public String toString() {
        return("Vida: " + this.vida + "\n"
        + "Energia: " + this.energia);
    }
}
