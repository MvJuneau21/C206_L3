import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
    Espadachim Vergil = new Espadachim();
    Capitao Falcon = new Capitao();
    Cozinheiro Sanji = new Cozinheiro();
    Receita macarrao = new Receita();
    Receita frango = new Receita();
    Receita pizza = new Receita();
    pizza.setNome("Pizza");
    pizza.setDificuldade(60);
    frango.setDificuldade(10);
    frango.setNome("Frango");
    macarrao.setNome("Macarrão");
    macarrao.setDificuldade(30);
    Sanji.setNome("Sanji");
    Sanji.setPoder(6000);
    Sanji.setComidaFavorita("Macarrão"); //nunca vi one piece ent n sei qual é :(
    Falcon.setNome("Captain Falcon");
    Falcon.setPoder(5000);
    Falcon.setComidaFavorita("Tofu");
    Falcon.setNumeroDeSeguidores(200);
    Vergil.setNome("Vergil");
    Vergil.setNomeDaEspada("Yamato");
    Vergil.setPoder(6666);
    Vergil.setComidaFavorita("Pizza");
    Falcon.conquistarNovoSeguidor(Vergil);
    Vergil.lutar(Falcon);
    Vergil.mudarRota();
    Vergil.darOrdens();
    Falcon.darOrdens();
    Falcon.mudarRota();
    Sanji.getLivroDeReceitas().add(macarrao);
    Sanji.getLivroDeReceitas().add(frango);
    Sanji.getLivroDeReceitas().add(pizza);
    Sanji.prepararPrato(0);
    Sanji.prepararPrato(1);
    Sanji.prepararPrato(2);
    Sanji.prepararPrato(3);
    Sanji.mostrarReceitas();
    Vergil.Comer(Sanji, 2);
    }
}