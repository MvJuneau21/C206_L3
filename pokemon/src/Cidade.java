public class Cidade {
    private String nomeCidade;
    private String regiaoCidade;
    private int populacaoCidade;

    public Cidade(String nomeCidade, String regiaoCidade, int populacaoCidade) {
        this.nomeCidade = nomeCidade;
        this.regiaoCidade = regiaoCidade;
        this.populacaoCidade = populacaoCidade;
    }

    public String getNomeCidade() {
        return nomeCidade;
    }

    public void setNomeCidade(String nomeCidade) {
        this.nomeCidade = nomeCidade;
    }

    public String getRegiaoCidade() {
        return regiaoCidade;
    }

    public void setRegiaoCidade(String regiaoCidade) {
        this.regiaoCidade = regiaoCidade;
    }

    public int getPopulacaoCidade() {
        return populacaoCidade;
    }

    public void setPopulacaoCidade(int populacaoCidade) {
        this.populacaoCidade = populacaoCidade;
    }
}