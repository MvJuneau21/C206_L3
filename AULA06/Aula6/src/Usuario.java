public abstract class Usuario {
    private int id;
    private int senha;
    public void logar(){
        System.out.println("Logando...");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }
}
