public class Pix extends Pagamento{
    @Override
    public void processar(double valor){
        double taxa = valor * 0.04;
        System.out.println("Valor final no PIX: "+(valor+taxa));
    }
}
