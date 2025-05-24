import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Pagamento pagamento;

        System.out.print("Informe o valor total: ");
        double valor = scanner.nextDouble();

        pagamento = new CartaoCredito();
        pagamento.processar(valor);

        pagamento = new Boleto();
        pagamento.processar(valor);

        pagamento = new Pix();
        pagamento.processar(valor);
    }
}