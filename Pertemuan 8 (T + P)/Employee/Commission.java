public class Commission extends Hourly{
    private double totalSales;
    private double commisionRate;

    public Commission(String eName, String eAddress, String ePhone, String socSecNumber, double rate, double commisionRate) {
        super(eName, eAddress, ePhone, socSecNumber, rate);
        this.commisionRate = commisionRate;
        totalSales = 0;
    }

    public void addSales(double totalSales){
        this.totalSales += totalSales;
    }

    @Override
    public double pay() {
        double payment = super.pay() + (this.totalSales * commisionRate);
        totalSales = 0;
        return payment;
    }

    @Override
    public String toString() {
        return super.toString() + "\ntotal sales : " + totalSales;
    }
}
