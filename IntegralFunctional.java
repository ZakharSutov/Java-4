public class IntegralFunctional<T extends SingleArgumentFunction> implements Functional<T> {

    private double rightLimit;
    private double leftLimit;

    public IntegralFunctional(double rightLimit, double leftLimit) {
        this.rightLimit = rightLimit;
        this.leftLimit = leftLimit;
    }

    @Override
    public double getResult(T f) throws IllegalArgumentException{
        if (leftLimit < f.getLeftLimit() || rightLimit > f.getRightLimit()) {
            throw new IllegalArgumentException();
        }
        int n = 100;
        double result = 0;
        double d = Math.abs(rightLimit - leftLimit) / n;
        for (int i = 0; i < n; i++) {
            result += f.getValue(leftLimit + i * d + d / 2) * d;
        }
        return result;
    }
}
