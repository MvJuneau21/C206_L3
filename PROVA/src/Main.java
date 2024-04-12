public class Main {
    public static void main(String[] args) {
        Robo[] robos = new Robo[10];
        Robo robot = new Robo();
        Empilhador robo1 = new Empilhador();
        BracoArticulado robo2 = new BracoArticulado();
        BracoArticulado robo3 = new BracoArticulado();
        robos[0] = robo1;
        robos[1] = robo2;
        robos[2] = robo3;
        robo1.setEnergia(500);
        robo1.setNome("CARLOS");
        robo1.setEnergiaMaxima(1000);
        robo1.setPesoMaximo(2000);
        robo2.setEnergia(200);
        robo2.setNome("MIGUEL");
        robo2.setEnergiaMaxima(1200);
        robo2.setNumeroDeArticulacoes(100);
        robo2.setCamera(new Camera(100));
        robo2.setGarra(new Garra(800));
        robo3.setEnergia(900);
        robo3.setNumeroDeArticulacoes(800);
        robo3.setNome("LURCA");
        robo3.setEnergiaMaxima(1700);
        robo3.setGarra(new Garra(300));
        robo1.adicionaPacote(2000);
        robo1.adicionaPacote(3000);
        robo1.adicionaPacote(1000);
        robo1.adicionaPacote(500);
        robo1.removePacote(0);
        robo1.mostraPacotes();
        robo1.trabalhar();
        robo1.trocarEnergia(robo2);
        robo1.recarregar(1100);
        robo2.trabalhar();
        robo3.trabalhar();
        robo1.trocarEnergia(robo3);
        System.out.println(robo2.getEnergia());
        System.out.println(robo1.getEnergia());
        System.out.println(robo3.getEnergia());
        for (int i = 0; i < 10; i++) {
            if(robos[i] != null){
                robot.setTotalDeRobos(i + 1);
            }

        }
        System.out.println("Total de robos: " + robot.getTotalDeRobos());
    }
}