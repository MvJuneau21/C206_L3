public class Bruxa extends Monstro{
    private Feitico[] feiticos = new Feitico[10];

    boolean aprenderFeitico(String nome, int poder){
        for (int i = 0; i < 10; i++) {
            if(feiticos[i] == null){
                feiticos[i] = new Feitico();
                feiticos[i].setNome(nome);
                feiticos[i].setPoder(poder);
                break;
            }
        }
        return true;
    }
    void listarFeiticos(){
        for (int i = 0; i < 10; i++) {
            if(feiticos[i] != null){
                System.out.println("Nome do feitiço: " + feiticos[i].getNome());
                System.out.println("Poder: " + feiticos[i].getPoder());
            }
        }
    }
    void esquecerFeitico(int posicao){
        if(feiticos[posicao] != null){
            feiticos[posicao] = null;
        }
    }
    void lancarFeitico(Monstro monstroAlvo, int posicao){
        monstroAlvo.setVida(monstroAlvo.getVida() - feiticos[posicao].getPoder());
        setEnergia(getEnergia() - 30);
    }
}
