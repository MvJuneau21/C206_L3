public interface Comandar {
    public default void darOrdens(){
        System.out.println("Dando ordens...");
    }
    public default void mudarRota(){
        System.out.println("Mudança de rota ira ocorrer...");
    }
}
