public interface calculaSalario {
    default void calculaSalario(int X){
        float salario;
        salario = X * 100;
        System.out.println("Salario do funcionário: " + salario);
    }
}
