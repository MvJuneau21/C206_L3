public class Garra {
    private int pressao;

    public Garra(int pressao) {
        this.pressao = pressao;
    }

    public int getPressao() {
        return pressao;
    }

    public void setPressao(int pressao) {
        this.pressao = pressao;
    }
    public void agarrarPeca(){
        System.out.println("Agarrando peca padrao");
    }
    public void agarrarPeca(int posicao){
        System.out.println("Agarrando peca na posicao: " + posicao);
    }
}
