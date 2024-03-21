public class Main {
    public static void main(String[] args) {

        Autor autor = new Autor();
        autor.adicionarSagas(new Saga(10));
        autor.adicionarSagas(new Saga(15));
        autor.getSagas()[0].adicionarLivro(new Livro("O Exorcista", 333));
        autor.getSagas()[0].adicionarLivro(new Livro("Legião", 304));
        autor.getSagas()[1].adicionarLivro(new Livro("Carrie", 199));
        autor.getSagas()[1].adicionarLivro(new Livro("A hora do vampiro", 516));
        autor.getSagas()[1].adicionarLivro(new Livro("O Iluminado", 497));
        autor.listarSagas();
    }
}