class Darts {
    private final double x;
    private final double y;

    private static final double INNER_CIRCLE_RADIUS = 1;
    private static final double MIDDLE_CIRCLE_RADIUS = 5;
    private static final double OUTER_CIRCLE_RADIUS = 10;

    Darts(double x, double y) {
        this.x = x;
        this.y = y;
    }

    int score() {
        double dartRadius = Math.sqrt(x*x+y*y);
        if (dartRadius <= INNER_CIRCLE_RADIUS) {
            return 10;
        } else if (dartRadius <= MIDDLE_CIRCLE_RADIUS) {
            return 5;
        } else if (dartRadius <= OUTER_CIRCLE_RADIUS) {
            return 1;
        } else {
            return 0;
        }
    }

}
