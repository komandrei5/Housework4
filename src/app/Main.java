package app;

public class Main {
    static double tankVolume;
    static double balanceInTheTank;
    static double fuelConsumption;
    static Car car;
    static Calculation calculation;
    static double totalRefuel;
    static double velum;
    static double remainder;
    static double N;
    static double firstFilling;

    public static void main(String[] args) {
        N = Constants.ODESA_KRYVE_OZERO + Constants.KRYVE_OZERO_ZHASHKIVLAIV;
        double fuelPrice = Double.parseDouble(args[0]);
        car = new Car();
        car.setTankVolume(70);
        car.setBalanceInTheTank(30);
        car.setFuelConsumption(8);
        tankVolume = car.getTankVolume();
        balanceInTheTank = car.getBalanceInTheTank();
        fuelConsumption = car.getFuelConsumption();

        calculation = new Calculation();
        firstFilling = calculation.fillTheTankFull(tankVolume, balanceInTheTank);


        car.setBalanceInTheTank(balanceInTheTank + calculation.fillTheTankFull(tankVolume, balanceInTheTank));
        balanceInTheTank = car.getBalanceInTheTank();

        totalRefuel = calculation.remainingFuel(tankVolume, fuelConsumption, balanceInTheTank, N) + firstFilling;
        velum = totalRefuel * fuelPrice;

        N = Constants.ZHASHKIVLAYIV_KYIV;
        remainder = balanceInTheTank - calculation.toRefuel(fuelConsumption, N);


        System.out.println("Потрібно долити " + totalRefuel + " л палива. Вартість його: " + velum +
                " грн, залишок " + remainder + " л.");
    }
}
