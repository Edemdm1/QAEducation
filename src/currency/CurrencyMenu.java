package currency;

public class CurrencyMenu extends Menu{
    public static void printCurrencyMenu() {
        System.out.println("");
        System.out.println("Choose currency:");
        System.out.println("1. Dollar");
        System.out.println("2. Euro");
        System.out.println("3. Btc");
        System.out.println("100: for Exit");
        System.out.println("Enter you choice: ");
    }

    public static Currency setCurrency(int currencyNumber) {
        Currency tempCurrency;
        switch (currencyNumber)
        {
            case 1:
                tempCurrency = ListOfCurrency.getCurrencyHashMap().get("USD");
//                System.out.println("Dollar");
                break;
            case 2:
                tempCurrency = ListOfCurrency.getCurrencyHashMap().get("EUR");
//                System.out.println("Euro");
                break;
            case 3:
                tempCurrency = ListOfCurrency.getCurrencyHashMap().get("BTC");
                break;
            default:
//                System.out.println("Dollar");
                System.out.println("Default currency : Dollar");
                tempCurrency = ListOfCurrency.getCurrencyHashMap().get("USD");

        }
        return  tempCurrency;
    }
}
