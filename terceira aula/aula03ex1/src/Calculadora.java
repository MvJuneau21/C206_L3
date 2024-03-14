public class Calculadora {
private static float PI = 3.14f;
    public float getPI() {
        return PI;
    }
    public static double circunferencia(double raio){
        return(PI*(raio*raio));
    }
    public static double volumeEsfera(double raio){
        return ((4/3)*PI*(raio*raio*raio));
    }
    public static double volumeCilindro(double raio, double h){
        return ((raio*raio)*PI*h);
    }

}
