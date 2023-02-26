public class Convert {

    public static void main(String[] args) {
        System.out.println("Dollar = " + convertEuroToUsd(50.00, 1.06));
    }

    public static double convertEuroToUsd(double eur, double exchangeRate) {
        eur = 50.00;
        exchangeRate = 1.06;
        double dol;
        dol = (double) (eur * exchangeRate);
        return dol;
    }
}
