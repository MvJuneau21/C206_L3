public class Main {
    public static void main(String[] args) {
    Calculadora calculadora = new Calculadora();
    double esfera;
    double cilindro;
    double circunferencia;
    double raio = 8.00;
    double h = 9.00;
    circunferencia = calculadora.circunferencia(raio);
    cilindro = calculadora.volumeCilindro(raio, h);
    esfera = calculadora.volumeEsfera(raio);
        System.out.println(circunferencia);
        System.out.println(cilindro);
        System.out.println(esfera);
    }
}