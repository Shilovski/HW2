
public class Car {

    //ch2: ex 9
    private double x;
    private double gas;
    private double maxGas;
    private double efficiency;

    public Car(double x, double gas, double maxGas, double efficiency) {
        this.x = x;
        this.gas = gas;
        this.maxGas = maxGas;
        this.efficiency = efficiency;
    }

    public double getX() {
        return x;
    }

    public double getGas() {
        return gas;
    }

    public double getMaxGas() {
        return maxGas;
    }

    public double getEfficiency() {
        return efficiency;
    }

    public void drive(double s) {
        double eps = 1.0E-5;
        if (gas <= eps)
            System.out.println("need to refuel");

        if (s / efficiency <= gas) {
            System.out.println("let's go " + s + " miles");
            this.x += s;
            this.gas -= s / efficiency;
        }
        else {
            double tmp = this.x + s;
            this.x += gas * efficiency;
            this.gas = 0;
            System.out.println((tmp - this.x) + " miles short");
        }

    }

    public void addGas(double gas) {
        if (this.gas + gas > maxGas) {
            this.gas = maxGas;
            System.out.println("tank full - " + maxGas + " gallons in gas tank");
        }
        if (this.gas + gas < maxGas) {
            this.gas += gas;
            System.out.println((maxGas - this.gas) + " left to full tank");
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "x= " + x +
                ", gas= " + gas +
                ", maxGas= " + maxGas +
                ", efficiency= " + efficiency +
                '}';
    }
}
