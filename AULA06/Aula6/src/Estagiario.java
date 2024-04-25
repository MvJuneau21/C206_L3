public class Estagiario extends Usuario implements calculaSalario{
    private int numDeHorasTrabalhadas;
    public int getNumDeHorasTrabalhadas() {
        return numDeHorasTrabalhadas;
    }

    public void setNumDeHorasTrabalhadas(int numDeHorasTrabalhadas) {
        this.numDeHorasTrabalhadas = numDeHorasTrabalhadas;
    }
}
