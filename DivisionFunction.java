public class DivisionFunction implements SingleArgumentFunction {

    private double A;
    private double B;
    private double C;
    private double D;
    private double rightLimit;
    private double leftLimit;

    public DivisionFunction(double a, double b, double c, double d, double rightLimit, double leftLimit) {
        this.A = a;
        this.B = b;
        this.C = c;
        this.D = d;
        this.rightLimit = rightLimit;
        this.leftLimit = leftLimit;
    }

    @Override
    public double getValue(double x) throws IllegalArgumentException{
        if (x > rightLimit || x < leftLimit || ((Math.abs(C - 0) < 1e-9) && Math.abs(D - 0) < 1e-9)) {
            throw new IllegalArgumentException();
        }
        return (A * x + B) / (C * x + D);
    }

    @Override
    public double getRightLimit() {
        return rightLimit;
    }

    @Override
    public double getLeftLimit() {
        return leftLimit;
    }
}
