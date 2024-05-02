public class Equipe {
    private Carro carro;
    private Piloto[] pilotos = new Piloto[4];
    private Piloto pilotoAtual = new Piloto();
    private String nome;
    private boolean trocarPilotoAtual(int pilotoId){
        for (int i = 0; i < pilotos.length; i++) {
            if (pilotos[i].getId() == pilotoId){
                pilotoAtual = pilotos[i];
                break;
            }
        }
        return true;
    }
    private boolean trocarPneu(int tipoDePneu){
        carro.setTipoDePneu(tipoDePneu);
        return true;
    }
    void pitStop(int tipoDePneu, int pilotoId){
    trocarPneu(tipoDePneu);
    trocarPilotoAtual(pilotoId);
    }
    boolean adicionarPiloto(Piloto piloto){
        for (int i = 0; i < pilotos.length; i++) {
            if(pilotos[i] == null){
                pilotos[i] = new Piloto();
                pilotos[i] = piloto;
                break;
            }
        }
        return true;
    }
    boolean retirarPiloto(int pilotoId){
        for (int i = 0; i < pilotos.length; i++) {
            if (pilotos[i].getId() == pilotoId && pilotoId != pilotoAtual.getId()){
                pilotos[i] = null;
                break;
            }
        }
        return true;
    }
    void constroiCarro(int tipoDePneu, int potencia, boolean turbo){
        carro = new Carro();
        carro.setTipoDePneu(tipoDePneu);
        carro.setMotor(new Motor(potencia, turbo));
    }

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public Piloto[] getPilotos() {
        return pilotos;
    }

    public void setPilotos(Piloto[] pilotos) {
        this.pilotos = pilotos;
    }

    public Piloto getPilotoAtual() {
        return pilotoAtual;
    }

    public void setPilotoAtual(Piloto pilotoAtual) {
        this.pilotoAtual = pilotoAtual;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
