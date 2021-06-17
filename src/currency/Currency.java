package currency;

abstract public class Currency {
    private double kursNBU;
    private double marga = 0.1;

    public Currency(double kursNBUEx){
        this.kursNBU = kursNBUEx;
    }

    public  double getKursNBU(){
        return  kursNBU;
    }

    public void setKursNBU(double kursNBU) {
        this.kursNBU = kursNBU;
    }

    public double getMarga() {
        return marga;
    }

    public void setMarga(double marga) {
        this.marga = marga;
    }



    public double exchangeGrnToCurrency(int numberOfGrn){
        double kursBuy = kursNBU * (1 + marga);
        double tempResult = numberOfGrn / kursBuy;
        System.out.println(String.format("For  %s UaH you got %s %s by kurs %s "
                , numberOfGrn, tempResult, getCurrencyName(), kursBuy));
        return tempResult;
    }
    public double exchangeCurrencyToGrn(int numberOfCurrency){
        double kurSell = kursNBU * (1 - marga);
        double tempResult = numberOfCurrency * kurSell;
        System.out.println(String.format("For  %s %s  you got %s UaH by kurs %s "
                , numberOfCurrency, getCurrencyName(), tempResult, kurSell));
        return tempResult;
    }

    abstract String getCurrencyName();
}
