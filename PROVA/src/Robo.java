public class Robo {
    private int energia;
    private String nome;
    private static int totalDeRobos;
    private int energiaMaxima;

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTotalDeRobos() {
        return totalDeRobos;
    }

    public void setTotalDeRobos(int totalDeRobos) {
        this.totalDeRobos = totalDeRobos;
    }

    public int getEnergiaMaxima() {
        return energiaMaxima;
    }

    public void setEnergiaMaxima(int energiaMaxima) {
        this.energiaMaxima = energiaMaxima;
    }

    public void trabalhar(){
    energia -= 100;
    }
    public void trocarEnergia(Robo roboAlvo){
    if(roboAlvo.energia + energia <= roboAlvo.energiaMaxima) {
        roboAlvo.energia += energia;
        energia -= energia;
    }
    else if(roboAlvo.energia + energia > roboAlvo.energiaMaxima){
        roboAlvo.energia = roboAlvo.energiaMaxima;
        if(energia - roboAlvo.energia >= 0) {
            energia -= roboAlvo.energia;
        }
        else if(energia - roboAlvo.energia < 0){
            energia = 0;
        }
    }
    }
    public void recarregar(int horas){
        System.out.println("Recarregando energia de " + nome);
        if(energia + horas <= energiaMaxima){
            energia += horas;
        }
        else if(energia + horas > energiaMaxima){
            energia = energiaMaxima;
        }
        System.out.println("Energia atual: " + energia);
    }
}
