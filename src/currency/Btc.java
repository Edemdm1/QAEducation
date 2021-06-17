package currency;

public class Btc extends Currency{
    public Btc(double kursNBUEx) {
        super(kursNBUEx);
    }


    @Override
    public double exchangeGrnToCurrency(int numberOfGrn){
        System.out.println("Операция запрещена нацбанком");
        System.out.println(numberOfGrn);
        return numberOfGrn;
    }

    @Override
    String getCurrencyName() {
        return "BTC";
    }
}
