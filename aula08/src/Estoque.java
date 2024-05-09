import java.util.ArrayList;
import java.util.HashMap;

public class Estoque {
    private ArrayList<Item> itensArray = new ArrayList<>();
    private HashMap<String, Item> itensMap = new HashMap<>();

    public HashMap<String, Item> getItensMap() { return itensMap; }

    public ArrayList<Item> getItensArray(){
        return itensArray;
    }
    public void MostrarMap(){
        itensMap.forEach((k, v) -> {
            if (k != null){
                System.out.println("[Chave: " + k + " Valor: " + v.getValor() + " Nome: " + v.getNome() + "]");
            }
        }
        );
    }
    public void adicionarArray(Item item){
        itensArray.add(item);
    }
    public Item buscar(int posicao){ return itensArray.get(posicao); }
    public void deletar(int posicao){
        itensArray.remove(posicao);
    }
    public void modificar(int posicao, Item item){
        itensArray.set(posicao, item);
    }
}
