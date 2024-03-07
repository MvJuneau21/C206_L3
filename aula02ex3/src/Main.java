import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Gato gato = new Gato();
        Rato rato = new Rato();
        boolean posicaoRato;
        System.out.printf("O rato está escondido (1) ou procurando comida (2)? ");
        int alternativa = entrada.nextInt();
        if(alternativa == 1){
            rato.escondeRato(rato.escondido);
        }
        else rato.procurarComida(rato.escondido);
        gato.brincar();
        gato.velocidade = 60;
        gato.cor = "Branco";
        gato.idade = 4;
        rato.velocidade = 90;
        System.out.println(gato.toString());
        System.out.println(rato.toString());
        gato.cacaRato(rato);
    }
}