public class Aluno extends Usuario{
    private int[] notas = new int[4];
    public void addNota(int x, int n){
        notas[n] = x;
    }
    public void mostraNota(){
        for (int i = 0; i < notas.length; i++) {
                System.out.println(notas[i]);
        }
    }
}
