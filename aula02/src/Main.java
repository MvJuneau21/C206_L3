import java.util.Scanner;

public class Main{

    public static int calculaNP3(int media, int np3){
        return((np3 + media)/2);
    }
    public static int calculaMedia(int np1, int np2){
    int md;
    md = (np1 + np2)/2;
    return md;
}

    public static void main() {
    Scanner entrada = new Scanner(System.in);
    Aluno aluno = new Aluno();
    aluno.nome = "Marcus";
    aluno.matricula = 296;
    aluno.periodo = 4;
    System.out.println("Entre com as 2 notas: ");
    aluno.np1 = entrada.nextInt();
    aluno.np2 = entrada.nextInt();
    String cout = aluno.toString();
    int media;
    media = calculaMedia(aluno.np1, aluno.np2);
    if(media >= 60){
        System.out.println(cout);
        System.out.println("Aprovado");
    }
    else{
        System.out.println("Insira a nota de np3: ");
        int np3 = entrada.nextInt();
        int mediaFinal = calculaNP3(np3, media);
        if(mediaFinal >= 50){
            System.out.println(cout);
            System.out.println("Aprovado na NP3");
        }
        else{
            System.out.println(cout);
            System.out.println("Reprovado");
        }
    }
}
}