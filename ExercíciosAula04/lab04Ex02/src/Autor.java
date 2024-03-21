public class Autor {
    private String nome;
    private Saga sagas[] = new Saga[10];

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Saga[] getSagas() {
        return sagas;
    }

    public void setSagas(Saga[] sagas) {
        this.sagas = sagas;
    }

    public void listarSagas(){
        for (int i = 0; i < sagas.length; i++) {
        if(sagas[i] != null){
            sagas[i].listarLivros();
            System.out.println("Nota da saga: " + sagas[i].getNota());
        }
        }
    }
    public void adicionarSagas(Saga saga){
        for (int i = 0; i < sagas.length; i++) {
        if(sagas[i] == null){
            sagas[i] = saga;
            break;
        }
        }
    }
}
