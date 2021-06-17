package currency;

public class MainClass {
    public static void main(String[] args) {
        Dollar dollar = new Dollar(28);

        System.out.println(dollar.getKursNBU());
        dollar.setKursNBU(29);
        System.out.println(dollar.getKursNBU());
        System.out.println(dollar.getMarga());

        dollar.setMarga(0.11);
        System.out.println(dollar.getMarga());

        dollar.exchangeGrnToCurrency(1000);
        dollar.setKursNBU(30);
        dollar.exchangeGrnToCurrency(1000);
        dollar.setKursNBU(40);
        dollar.exchangeGrnToCurrency(1000);

        dollar.setMarga(0.14);
        dollar.exchangeGrnToCurrency(1000);

        dollar.exchangeCurrencyToGrn(100);

        Euro euro = new Euro(35);
        euro.exchangeGrnToCurrency(1000);
        euro.exchangeCurrencyToGrn(1000);
        euro.setKursNBU(36);
        euro.setMarga(0.12);
        euro.exchangeCurrencyToGrn(1000);

        System.out.println(dollar.isFreeConv());

        Uzs uzs = new Uzs(0.0001);
        uzs.exchangeGrnToCurrency(100);
        uzs.setKursNBU(0.0026);
        uzs.exchangeGrnToCurrency(100);

        System.out.println(uzs.isFreeConv());

        Btc btc = new Btc(900000);
        btc.exchangeGrnToCurrency(100000);
        if(btc instanceof IsFreeConverted){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }





    }
}
