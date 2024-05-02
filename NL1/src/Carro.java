public class Carro {
    private Motor motor;
    private int tipoDePneu;

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public int getTipoDePneu() {
        return tipoDePneu;
    }

    public void setTipoDePneu(int tipoDePneu) {
        this.tipoDePneu = tipoDePneu;
    }

    public void correr(){
        System.out.println("Correndo...");
        System.out.println("Tipo de pneu: " + tipoDePneu);
        System.out.println("Potencia: " + motor.getPotencia() + "cv");
        if (motor.isTurbo() == true){
            System.out.println("Motor Turbo");
        }
    }
}
