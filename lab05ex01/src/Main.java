public class Main {
    public static void main(String[] args) {

        Produto dreamcast = new Console(1000, "Dreamcast", "Geração 2000", "Sega");
        Produto nitro5 = new Notebook(4000, "Nitro 5", "i5", "8gb");
        dreamcast.mostraInfo();
        nitro5.mostraInfo();
    }
}