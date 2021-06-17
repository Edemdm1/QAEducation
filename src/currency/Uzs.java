package currency;

public class Uzs extends Currency implements IsFreeConverted{

    public Uzs(double kursNBUEx) {
        super(kursNBUEx);
    }

    @Override
    String getCurrencyName() {
        return "UZS";
    }

    @Override
    public boolean isFreeConv() {
        return false;
    }
}
