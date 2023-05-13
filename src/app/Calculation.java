package app;

public class Calculation {
    public double fillTheTankFull(double tankVolume, double balanceInTheTank) {
        return tankVolume - balanceInTheTank;
    }

    public double remainingFuel(double tankVolume, double fuelConsumption, double balanceInTheTank, double N) {
        return tankVolume - (balanceInTheTank - fuelConsumption * N / 100);
    }

    public double toRefuel(double fuelConsumption, double N) {
        return fuelConsumption * N / 100;
    }
}
