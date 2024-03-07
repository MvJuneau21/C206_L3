public class Gato {
    String cor;
    int idade;
    int velocidade;
    Rato rat = new Rato();
    @Override
    public String toString() {
        return ("Cor do gato: " + cor + " // Idade do gato: " + idade + " Velocidade do gato: " + velocidade);
    }
    public void brincar(){
        System.out.println("Brincando com gato!");
    }
    public void cacaRato(Rato rat){
        if(rat.velocidade > velocidade){
            System.out.println("Rato fugiu!");
        }
        else
            System.out.printf("Rato pego!");
    }
}
