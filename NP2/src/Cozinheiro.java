import java.util.ArrayList;

public class Cozinheiro extends Pirata{
    private ArrayList<Receita> livroDeReceitas = new ArrayList<>();

    public ArrayList<Receita> getLivroDeReceitas() {
        return livroDeReceitas;
    }
    public String prepararPrato(int index){
       try {
           System.out.println("Preparando " + livroDeReceitas.get(index).getNome());
       }catch (IndexOutOfBoundsException e){
           System.out.println("Prato não encontrado no livro de Receitas!");
       }finally {
           return ("Sussa");
       }
    }
    public void mostrarReceitas(){
        System.out.println(getLivroDeReceitas());
    }
}
