public class Boleto extends Pagamento {
    @Override
    public void processar(double valor){
        double desconto = valor * 0.04;
        System.out.println("Boleto com desconto: "+(valor-desconto));
    }
}
