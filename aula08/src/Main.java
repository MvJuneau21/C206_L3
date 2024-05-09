import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        Item item = new Item(900, "Guitarra");
        Item item2 = new Item(600, "Baixo");
        Estoque estoque = new Estoque();
        ArrayList<Item> nuevo = new ArrayList<>();
        nuevo.add(new Item(900, "Cajon"));
        nuevo.add(new Item(200, "Ukulele"));
        estoque.adicionarArray(item);
        estoque.adicionarArray(item2);
        estoque.adicionarArray(new Item(1000,"Bateria"));
        estoque.adicionarArray(new Item(400,"Violão"));
        estoque.getItensArray().addAll(nuevo);
        Collections.sort(estoque.getItensArray());
        System.out.println(estoque.getItensArray());
        estoque.deletar(1);
        estoque.modificar(0, item2);
        System.out.println(estoque.buscar(0));
        Collections.sort(estoque.getItensArray());
        System.out.println(estoque.getItensArray());
        System.out.println(Collections.max(estoque.getItensArray()));
        System.out.println(Collections.min(estoque.getItensArray()));
        Collections.sort(estoque.getItensArray(), Collections.reverseOrder());
        System.out.println(estoque.getItensArray());
        System.out.println(estoque.getItensArray().size());
        System.out.println(estoque.getItensArray().isEmpty());
        System.out.println(estoque.getItensArray().contains(item2));
        System.out.println(estoque.getItensArray().indexOf(item2));
        System.out.println(estoque.getItensArray().lastIndexOf(item2));
        estoque.getItensArray().removeAll(estoque.getItensArray());
        System.out.println(estoque.getItensArray().isEmpty());
        estoque.getItensMap().put("K", item);
        estoque.getItensMap().put("M", item2);
        estoque.MostrarMap();
    }
}