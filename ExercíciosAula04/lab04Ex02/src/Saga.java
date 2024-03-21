public class Saga {
    private int nota;
    private Livro[] livros = new Livro[10];

    public Saga(int nota) {
        this.nota = nota;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public Livro[] getLivros() {
        return livros;
    }

    public void setLivros(Livro[] livros) {
        this.livros = livros;
    }

    public void listarLivros(){
        for (int i = 0; i < livros.length; i++) {
            if(livros[i] != null){
                System.out.println(livros[i].getTitulo());
                System.out.println("Paginas: " + livros[i].getPaginas());
            }
        }
    }
    public void adicionarLivro(Livro livro){
        for (int i = 0; i < livros.length; i++) {
            if(livros[i] == null){
            livros[i] = livro;
            break;
            }
        }
    }
}
