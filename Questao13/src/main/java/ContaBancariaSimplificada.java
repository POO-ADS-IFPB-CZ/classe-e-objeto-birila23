public class ContaBancariaSimplificada {

    private String nomeDoCorrentista;
    private double saldo;
    private boolean contaEspecial;

    public ContaBancariaSimplificada(String nomeDoCorrentista, double saldo){
        this.nomeDoCorrentista = nomeDoCorrentista;
        this.saldo = saldo;
        this.contaEspecial = contaEspecial;
    }
    public String getNomeDoCorrentista() {
        return nomeDoCorrentista;
    }
    public void setNomeDoCorrentista(String nomeDoCorrentista) {
        this.nomeDoCorrentista = nomeDoCorrentista;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    private void abreContaSimples(String nomeDoCorrentista){
        saldo = 0;
        contaEspecial = false;
    }
    private void deposita(double valor){
        saldo = saldo + valor;
    }
    private boolean retira (double valor){
        if (contaEspecial == false){
            if(valor <= saldo){
                saldo = saldo - valor;
                return true;
            }
            else{
                return false;
            }
        }
        else{
            saldo = saldo - valor;
            return true;
        }
    }

    private void mostraDados(){
        System.out.println("Nome: " + nomeDoCorrentista);
        System.out.println("Saldo: " + saldo);
        if(contaEspecial){
            System.out.println("Conta Especial");
        }
        else{
            System.out.println("Conta é simples");
        }
    }
    public boolean transfere(ContaBancariaSimplificada remetente, ContaBancariaSimplificada destino, float valor){
        if (remetente.getSaldo() >= valor) {
            remetente.setSaldo(remetente.getSaldo() - valor);
            destino.setSaldo(destino.getSaldo() + valor);
            return true;
        }
        else {
            return false;
        }
    }
}
