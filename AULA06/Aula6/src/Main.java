public class Main {
    public static void main(String[] args) {
     Professor Jarbas = new Professor();
     Estagiario Gerard = new Estagiario();
     Aluno Juneau = new Aluno();
     Jarbas.setId(666);
     Jarbas.setSenha(999);
     Jarbas.setNumDeAulas(16);
     Gerard.setId(2000);
     Gerard.setSenha(4444);
     Gerard.setNumDeHorasTrabalhadas(50);
     Juneau.setId(211);
     Juneau.setSenha(244);
     Juneau.addNota(100, 0);
     Juneau.addNota(80, 1);
     Juneau.addNota(60, 2);
     Juneau.addNota(90, 3);
     Jarbas.calculaSalario(Jarbas.getNumDeAulas());
     Gerard.calculaSalario(Gerard.getNumDeHorasTrabalhadas());
     Juneau.mostraNota();
    }
}