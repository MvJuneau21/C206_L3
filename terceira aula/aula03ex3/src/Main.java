import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Cliente cliente = new Cliente();
    Conta conta = new Conta();
    Cliente cliente2 = new Cliente();
    Conta conta2 = new Conta();
    Scanner entrada = new Scanner(System.in);
    Scanner dinheiro = new Scanner(System.in);
    int opcao;
    String cpf;
    String nome;
    double grana;
    double saldo;
    double limite;
    boolean saque;
    boolean transfere;
    boolean credito;
    cliente.setConta(conta);
    cliente2.setConta(conta2);
    cliente2.setNome("Lucas Vinícius da Silva");
    cliente2.setCpf("666-666-666.66");
    conta2.setSaldo(2000);
    conta2.setLimite(5000);
    System.out.println("Entre com seu nome: ");
    nome = entrada.next();
    cliente.setNome(nome);
    System.out.println("Entre com seu CPF: ");
    cpf = entrada.next();
    cliente.setCpf(cpf);
    System.out.println("insira o saldo e o limite de sua conta, respectivamente: ");
    saldo = entrada.nextDouble();
    limite = entrada.nextDouble();
    conta.setSaldo(saldo);
    conta.setLimite(limite);
    System.out.println("Quer um saque(1), um deposito(2), uma transferencia(3) ou uma compra com credito(4)?");
    opcao = entrada.nextInt();
        switch (opcao){
            case 1:
                System.out.println("Entre com o valor: ");
                grana = dinheiro.nextDouble();
                saque = cliente.sacarDinheiro(grana);
                if(saque == true){
                    System.out.println(cliente.toString());
                }
                else System.out.println("Saldo insuficiente!");
                break;
            case 2:
                System.out.println("Entre com o valor: ");
                grana = dinheiro.nextDouble();
                cliente.depositarDinheiro(grana);
                break;
            case 3:
                System.out.println("Entre com o valor: ");
                grana = dinheiro.nextDouble();
                transfere = cliente.transferir(conta2, grana);
                if(transfere == true){
                    System.out.println(cliente2.toString());
                }
                else System.out.println("Saldo insuficiente!");
                break;
            case 4:
                System.out.println("Entre com o valor: ");
                grana = dinheiro.nextDouble();
                credito = cliente.comprarComCredito(grana);
                if(credito == true){
                    System.out.println(cliente.toString());
                }
                else System.out.println("Credito insuficiente!");
                break;
            default: break;
        }
    }
}