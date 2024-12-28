package chapter14;

public class Line {
    private int slope;
    private int yIntercept;

    public Line(int slope, int yIntercept) {
        this.slope = slope;
        this.yIntercept = yIntercept;
    }

    public int getSlope() {
        return slope;
    }

    public int getyIntercept() {
        return yIntercept;
    }

    public static int getXIntersect(Line line1, Line line2)
    {
        try {
            return (line2.getyIntercept() - line1.getyIntercept()) /
                    (line1.getSlope() - line2.getSlope());
        } catch (ArithmeticException e) {
            throw new ParallelLinesException("The lines are parallel");
        }

    }
}
