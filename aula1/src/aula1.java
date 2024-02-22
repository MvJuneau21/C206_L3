import java.util.Scanner;

public class aula1 {
    public static int fatorial(int n){
        for (int i = n-1; i > 0; i--) {
            n *= i;
        }
        return n;
    }
    public static void mostraPares(int n){
        for(int i = n; i >=0; i--){
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n;
        System.out.println("Entre com um numero: ");
        n = entrada.nextInt();
        int fat;
        fat = fatorial(n);
        System.out.println("Fatorial de N: ");
        System.out.println(fat);
        System.out.println("Pares de 0 a N: ");
        mostraPares(n);
    }
}