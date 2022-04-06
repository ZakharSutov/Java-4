public class SquareTrinomial {
    private double a;
    private double b;
    private double c;

    public SquareTrinomial(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double[] answer() {
        double d;
        double x1;
        double x2;
        double[] arrAns;
        d = Math.pow(b, 2) - (4 * a * c);
        if (Math.abs(a - 0) < 1e-9) {
            throw new IllegalArgumentException("not a quadratic equation");
        } else if (d < 0) {
            throw new IllegalArgumentException("no real roots");
        } else if (Math.abs(b - 0) < 1e-9){
            x1 = Math.sqrt((-1 * c) / a);
            arrAns = new double[]{x1, -1 * x1};
        } else if (d > 0) {
            x1 = ((-1) * b + Math.sqrt(d)) / 2 * a;
            x2 = ((-1) * b - Math.sqrt(d)) / 2 * a;
            arrAns = new double[]{x1, x2};
        } else {
            x1 = ((-1) * b) / 2 * a;
            arrAns = new double[]{x1};
        }
        return arrAns;
    }
}
