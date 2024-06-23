import java.util.Objects;

public class Ginasio {
    private String tipoGinasio;
    private String insigniaGinasio;
    private String liderNomeLider;
    private String cidadeNomeCidade;
    public Ginasio(String tipoGinasio, String insigniaGinasio, String liderNomeLider, String cidadeNomeCidade) {
        this.tipoGinasio = tipoGinasio;
        this.insigniaGinasio = insigniaGinasio;
        this.liderNomeLider = liderNomeLider;
        this.cidadeNomeCidade = cidadeNomeCidade;
    }
    public String getTipoGinasio() {
        return tipoGinasio;
    }

    public void setTipoGinasio(String tipoGinasio) {
        this.tipoGinasio = tipoGinasio;
    }

    public String getInsigniaGinasio() {
        return insigniaGinasio;
    }

    public void setInsigniaGinasio(String insigniaGinasio) {
        this.insigniaGinasio = insigniaGinasio;
    }

    public String getLiderNomeLider() {
        return liderNomeLider;
    }

    public void setLiderNomeLider(String liderNomeLider) {
        this.liderNomeLider = liderNomeLider;
    }

    public String getCidadeNomeCidade() {
        return cidadeNomeCidade;
    }

    public void setCidadeNomeCidade(String cidadeNomeCidade) {
        this.cidadeNomeCidade = cidadeNomeCidade;
    }
}
