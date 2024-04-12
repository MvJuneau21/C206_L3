public class BracoArticulado extends Robo{
    private int numeroDeArticulacoes;
    private Garra garra = new Garra(200);
    private Camera camera;

    public int getNumeroDeArticulacoes() {
        return numeroDeArticulacoes;
    }

    public void setNumeroDeArticulacoes(int numeroDeArticulacoes) {
        this.numeroDeArticulacoes = numeroDeArticulacoes;
    }

    public Garra getGarra() {
        return garra;
    }

    public void setGarra(Garra garra) {
        this.garra = garra;
    }

    public Camera getCamera() {
        return camera;
    }

    public void setCamera(Camera camera) {
        this.camera = camera;
    }
    public void trabalhar(){
    setEnergia(getEnergia() - 100);
        System.out.println(getNome() + " esta: ");
    if(camera != null) {
        garra.agarrarPeca(camera.acharPecas());
    }
    else garra.agarrarPeca();
    }
}
