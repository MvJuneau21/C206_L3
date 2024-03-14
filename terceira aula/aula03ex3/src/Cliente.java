public class Cliente {
    private String nome;
    private String cpf;
    private Conta conta = new Conta();
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }
    boolean sacarDinheiro(double valor){
        if(valor <= conta.getSaldo()){
            double saldo = conta.getSaldo();
            saldo -= valor;
            conta.setSaldo(saldo);
            return true;
        }
        else return false;
    }
   void depositarDinheiro(double valor){
        valor += conta.getSaldo();
        conta.setSaldo(valor);
       System.out.println("Saldo atual: ");
       System.out.println(conta.getSaldo());
   }
   boolean comprarComCredito(double valor){
        if(valor <= conta.getLimite()){
            double limite = conta.getLimite();
            limite -= valor;
            conta.setLimite(limite);
            return true;
        }
        else return false;
   }
   boolean transferir(Conta contaParaReceber, double valor){
        if(valor <= conta.getSaldo()) {
            double saldo = contaParaReceber.getSaldo();
            saldo += valor;
            contaParaReceber.setSaldo(saldo);
            return true;
        }
        else return false;
   }

    @Override
    public String toString() {
        return("Nome do titular: " + this.nome + "\n" + "CPF: " + this.cpf + "\n" + "Saldo atual: " + conta.getSaldo()
        + "\n" + "Limite atual: " + conta.getLimite());
    }
}
