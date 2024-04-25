public class Professor extends Usuario implements calculaSalario{
    private int numDeAulas;
    public int getNumDeAulas() {
        return numDeAulas;
    }

    public void setNumDeAulas(int numDeAulas) {
        this.numDeAulas = numDeAulas;
    }
}
