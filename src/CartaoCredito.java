public class CartaoCredito extends Pagamento{
    @Override
    public void processar(double valor){
        double taxa = valor * 0.3;
        System.out.println("Cartão de Crédito - Valor Final com taxa: "+(valor+taxa));
    }
}
