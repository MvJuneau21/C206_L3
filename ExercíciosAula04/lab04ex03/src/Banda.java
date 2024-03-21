public class Banda {
    private Musica musicas[] = new Musica[10];
    private String nome;
    private int numeroDeIntegrantes;

    public Musica[] getMusicas() {
        return musicas;
    }

    public void setMusicas(Musica[] musicas) {
        this.musicas = musicas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroDeIntegrantes() {
        return numeroDeIntegrantes;
    }

    public void setNumeroDeIntegrantes(int numeroDeIntegrantes) {
        this.numeroDeIntegrantes = numeroDeIntegrantes;
    }
    public void tocarMusica(int posicao){
        System.out.println("Tocando: " + musicas[posicao].getNome());
        System.out.println("Banda: " + nome);
        System.out.println("Integrantes: " + numeroDeIntegrantes);
        System.out.println("Album: " + musicas[posicao].getAlbum());
    }
    public void tocarShow(){
        System.out.println("O show do " + nome + " vai começar!! Setlist: ");
        for (int i = 0; i < musicas.length; i++) {
            if(musicas[i] != null){
                System.out.println(musicas[i].getNome());
            }
        }
    }
    public boolean adicionarMusica(Musica musica){
        for (int i = 0; i < musicas.length; i++) {
            if (musicas[i] == null){
                musicas[i] = musica;
                break;
            }
        }
        return true;
    }
    public boolean deletarMusica(String nome){
        for (int i = 0; i < musicas.length; i++) {
            if(musicas[i] != null) {
                if (nome == musicas[i].getNome()) {
                    System.out.println("Retirando a musica escolhida...");
                    musicas[i] = null;
                }
            }
        }
        return true;
    }

    public Banda(String nome, int numeroDeIntegrantes) {
        this.nome = nome;
        this.numeroDeIntegrantes = numeroDeIntegrantes;
    }
}
