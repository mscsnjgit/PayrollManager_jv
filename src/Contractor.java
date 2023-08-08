public class Contractor implements Payable{

    private String name;
    private int hoursWorked;
    private double partsCost;
    public Contractor(String n, int hours, double parts){

        name = n;
        hoursWorked = hours;
        partsCost = parts;
    }

    @Override
    public double calculatePay() {
        return this.hoursWorked * partsCost;
    }

    private int getPayRate() {
        return 0;
    }

    // Invoice
    @Override
    public String generatePayStub() {
        return null;
    }
}
