public class Empilhador extends Robo{
    private int pesoMaximo;
    private Pacote[] pacotes = new Pacote[10];

    public int getPesoMaximo() {
        return pesoMaximo;
    }

    public void setPesoMaximo(int pesoMaximo) {
        this.pesoMaximo = pesoMaximo;
    }

    public Pacote[] getPacotes() {
        return pacotes;
    }

    public void setPacotes(Pacote[] pacotes) {
        this.pacotes = pacotes;
    }

    public void adicionaPacote(int peso){
        if(peso > pesoMaximo){
            System.out.println("Peso maximo excedido, operacao cancelada");
        }
        else
        for (int i = 0; i < 10; i++) {
            if(pacotes[i] == null){
                pacotes[i] = new Pacote();
                pacotes[i].setPeso(peso);
                break;
            }
        }
    }
    public void removePacote(int posicao){
        if(pacotes[posicao] != null){
                pacotes[posicao] = null;
        }
    }
    public void mostraPacotes(){
        for (int i = 0; i < 10; i++) {
            if(pacotes[i] != null){
                System.out.println("Peso do pacote " + i + ": "+ pacotes[i].getPeso());
            }

        }
    }
}
