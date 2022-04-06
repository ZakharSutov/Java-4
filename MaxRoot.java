public class MaxRoot {
    private SquareTrinomial obj;

    public MaxRoot(SquareTrinomial obj) {
        this.obj = obj;
    }

    public double maxRoot() {
        double[] arr = obj.answer();
        if (arr.length == 0) {
            throw new IllegalArgumentException("no roots");
        }
        double max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
