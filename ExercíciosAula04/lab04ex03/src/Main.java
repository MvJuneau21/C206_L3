public class Main {
    public static void main(String[] args) {
    Banda banda = new Banda("blessthefall", 4);
    Banda banda1 = new Banda("My Chemical Romance", 4);
    Banda banda2 = new Banda("Linkin Park", 6);
    banda.adicionarMusica(new Musica("To Hell and Back", "Witness"));
    banda.adicionarMusica(new Musica("40 Days...", "Awakening"));
    banda.adicionarMusica(new Musica("Sleepless in Phoenix", "Hard Feelings"));
    banda1.adicionarMusica(new Musica("Thank You for the Venom", "Three Cheers for Sweet Revenge"));
    banda1.adicionarMusica(new Musica("Famous Last Words", "The Black Parade"));
    banda1.adicionarMusica(new Musica("Drowning Lessions", "I Brought You My Bullets"));
    banda2.adicionarMusica(new Musica("Lying from You", "Meteora"));
    banda2.adicionarMusica(new Musica("Papercut", "Hybrid Theory"));
    banda2.adicionarMusica(new Musica("Pts.Of.Athrty", "Reanimation"));
    banda.tocarMusica(0);
    banda1.tocarMusica(2);
    banda2.tocarMusica(1);
    banda1.deletarMusica("Drowning Lessions");
    banda.tocarShow();
    banda1.tocarShow();
    banda2.tocarShow();
    }
}