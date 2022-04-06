public class ExpFunction implements SingleArgumentFunction{

    private double A;
    private double B;
    private double rightLimit;
    private double leftLimit;

    public ExpFunction(double a, double b, double rightLimit, double leftLimit) {
        this.A = a;
        this.B = b;
        this.rightLimit = rightLimit;
        this.leftLimit = leftLimit;
    }

    @Override
    public double getValue(double x) {
        if (x > rightLimit || x < leftLimit) {
            throw new IllegalArgumentException();
        }
        return A * Math.exp(x) + B;
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
