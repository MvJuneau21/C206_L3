public class Notebook extends Produto{
    public Notebook(double valor, String nome, String processador, String memoria) {
        super(valor, nome);
        this.processador = processador;
        this.memoria = memoria;
    }

    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }

    public String getMemoria() {
        return memoria;
    }

    public void setMemoria(String memoria) {
        this.memoria = memoria;
    }

    private String processador;
    private String memoria;
    public void instalarAplicativo(){
        System.out.println("Instalando APP...");
    }

    @Override
    public void mostraInfo() {
        instalarAplicativo();
        super.mostraInfo();
        System.out.println(processador);
        System.out.println(memoria);
    }
}
