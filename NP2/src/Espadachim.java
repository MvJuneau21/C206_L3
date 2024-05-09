public class Espadachim extends Pirata implements Comandar{
    private String nomeDaEspada;

    public String getNomeDaEspada() {
        return nomeDaEspada;
    }

    public void setNomeDaEspada(String nomeDaEspada) {
        this.nomeDaEspada = nomeDaEspada;
    }

    @Override
    public void darOrdens() {
        System.out.println("O Imediato esta ordenando os tripulantes");
    }

    @Override
    public void mudarRota() {
        System.out.println("O Imediato está mudando a rota");
    }
}
