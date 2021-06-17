package currency;

public class Euro extends Currency{
    public Euro(double kursNBU){
        super(kursNBU);

    }

    @Override
    String getCurrencyName() {
        return "EUR";
    }
}
