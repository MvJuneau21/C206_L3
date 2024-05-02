public class Main {
    public static void main(String[] args) {

       Equipe ferrari = new Equipe();
       Piloto hamilton = new Piloto();
       Piloto leclerc = new Piloto();
       hamilton.setId(1);
       hamilton.setNome("Lewis Hamilton");
       hamilton.setIdade(39);
       hamilton.setNacionalidade("Ingles");
       leclerc.setId(2);
       leclerc.setNome("Charles LeClerc");
       leclerc.setNacionalidade("Monegasco");
       leclerc.setIdade(26);
       ferrari.setNome("Ferrari");
       ferrari.adicionarPiloto(hamilton);
       ferrari.adicionarPiloto(leclerc);
       ferrari.constroiCarro(1, 600,true);
       ferrari.pitStop(2,2);
       System.out.println(ferrari.getPilotoAtual().getNome());
       ferrari.pitStop(4,1);
       System.out.println(ferrari.getPilotoAtual().getNome());
       ferrari.retirarPiloto(2);
       System.out.println(ferrari.getPilotoAtual().getNome());
       ferrari.getPilotoAtual().correr(ferrari.getCarro());
    }
}