package app;

public class Car {
    private double tankVolume;
    private double balanceInTheTank;
    private double fuelConsumption;

    public double getTankVolume() {
        return tankVolume;
    }

    public void setTankVolume(double tankVolume) {
        this.tankVolume = tankVolume;
    }

    public double getBalanceInTheTank() {
        return balanceInTheTank;
    }

    public void setBalanceInTheTank(double balanceInTheTank) {
        this.balanceInTheTank = balanceInTheTank;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }
}
