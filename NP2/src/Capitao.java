public class Capitao extends Pirata implements Comandar{
    private int numeroDeSeguidores;

    public int getNumeroDeSeguidores() {
        return numeroDeSeguidores;
    }

    public void setNumeroDeSeguidores(int numeroDeSeguidores) {
        this.numeroDeSeguidores = numeroDeSeguidores;
    }

    @Override
    public void darOrdens() {
        System.out.println("O capitão está ordenando X tripulantes");
    }

    @Override
    public void mudarRota() {
        System.out.println("O capitão está mudando a rota");
    }
    public void conquistarNovoSeguidor(Pirata pirata){
        if(pirata.getPoder() > this.getPoder()){
            System.out.println(pirata.getNome() + " foi recrutado!");
            numeroDeSeguidores++;
            System.out.println("Numero de seguidores: " + numeroDeSeguidores);
        }
        else System.out.println("Não está apto!");
    }
}
