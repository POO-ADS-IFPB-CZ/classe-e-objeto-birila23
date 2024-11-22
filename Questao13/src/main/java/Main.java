//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ContaBancariaSimplificada c1 = new ContaBancariaSimplificada("João", 500);
        ContaBancariaSimplificada c2 = new ContaBancariaSimplificada("Maria", 500);

        if(c1.transfere(c1, c2, 200)){
            System.out.println("Transferencia feito com sucesso, o saldo de " + c1.getNomeDoCorrentista() + " é: "+ c1.getSaldo());
            System.out.println(c2.getNomeDoCorrentista() + " está com o valor de: " + c2.getSaldo());
        }
        else {
            System.out.println("Falha na transferência.");
        }
    }
}